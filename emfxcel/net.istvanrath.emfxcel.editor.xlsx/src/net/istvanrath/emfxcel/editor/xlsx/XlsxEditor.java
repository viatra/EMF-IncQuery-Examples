package net.istvanrath.emfxcel.editor.xlsx;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import net.istvanrath.emfxcel.BooleanCell;
import net.istvanrath.emfxcel.EmfxcelFactory;
import net.istvanrath.emfxcel.NumericCell;
import net.istvanrath.emfxcel.StringCell;
import net.istvanrath.emfxcel.Workbook;
import net.istvanrath.emfxcel.Worksheet;
import net.istvanrath.emfxcel.presentation.EmfxcelEditor;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IFileEditorInput;

public class XlsxEditor extends EmfxcelEditor {

	private Resource resource;
	private IResourceChangeListener rListener;

	private void populateResource(InputStream is) {
		// Get the workbook instance for XLS file
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(is);
			Workbook wb = EmfxcelFactory.eINSTANCE.createWorkbook();
			wb.setName(resource.getURI().path());
	
			// Get first sheet from the workbook
			for (int s = 0; s < workbook.getNumberOfSheets(); s++) {
				XSSFSheet sheet = workbook.getSheetAt(s);
				Worksheet ws = EmfxcelFactory.eINSTANCE.createWorksheet();
				ws.setName(sheet.getSheetName());
				wb.getSheets().add(ws);
				// Get iterator to all the rows in current sheet
				Iterator<Row> rowIterator = sheet.iterator();
				while (rowIterator.hasNext()) {
					Row row = rowIterator.next();
					net.istvanrath.emfxcel.Row eRow = EmfxcelFactory.eINSTANCE.createRow();
					eRow.setRowNum(row.getRowNum());
					// Get iterator to all cells of current row
					Iterator<Cell> cellIterator = row.cellIterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						net.istvanrath.emfxcel.Cell eCell;
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_BOOLEAN: 
							eCell = EmfxcelFactory.eINSTANCE.createBooleanCell();
							((BooleanCell)eCell).setBoolValue(cell.getBooleanCellValue());
							break;
						default: case Cell.CELL_TYPE_STRING:
							eCell = EmfxcelFactory.eINSTANCE.createStringCell();
							((StringCell)eCell).setStringValue(cell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							eCell = EmfxcelFactory.eINSTANCE.createNumericCell();
							((NumericCell)eCell).setNumericValue(cell.getNumericCellValue());
							break;
						}
						eCell.setColumnIndex( cell.getColumnIndex() );
						eCell.setRowIndex( cell.getRowIndex() );
						eRow.getCells().add(eCell);
					}
					ws.getRows().add(eRow);
				}
			}
			resource.getContents().add(wb);
		} catch (IOException e) {
			// TODO better error handling
			e.printStackTrace();
		}

	}
	
	private void registerResourceChangeListener(final IFile res) {
		rListener = (new IResourceChangeListener() {
			
			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				try {
					event.getDelta().accept(new IResourceDeltaVisitor() {
						
						@Override
						public boolean visit(IResourceDelta delta) throws CoreException {
							if (delta.getResource().equals(res)) {
								resource.getContents().clear();
								populateResource(res.getContents());
								return false;
							}
							return true;
						}
					});
				} catch (CoreException e) {
					// TODO better error handling
					e.printStackTrace();
				}
			}
		});
		res.getWorkspace().addResourceChangeListener(rListener, IResourceChangeEvent.POST_CHANGE);
	}
	
	@Override
	public void createModel() {
		try {
			// super.createModel();
			IFileEditorInput ie = (IFileEditorInput) getEditorInput();
			if (ie.exists()) {
				resource = getEditingDomain().createResource(ie.getFile().getName());
				populateResource(ie.getFile().getContents(true));
				registerResourceChangeListener(ie.getFile());
			}
		} catch (CoreException e) {
			// TODO better error handling
			e.printStackTrace();
		}
	}
	
	@Override
	public void dispose() {
		if (rListener!=null) {
			((IFileEditorInput)getEditorInput()).getFile().getWorkspace().removeResourceChangeListener(rListener);
		}
		super.dispose();
	}

}
