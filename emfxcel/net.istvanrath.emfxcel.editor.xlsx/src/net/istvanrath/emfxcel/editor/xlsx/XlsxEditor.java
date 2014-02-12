package net.istvanrath.emfxcel.editor.xlsx;

import java.io.IOException;
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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IFileEditorInput;

public class XlsxEditor extends EmfxcelEditor {

	@Override
	public void createModel() {
		try {
			// super.createModel();
			IFileEditorInput ie = (IFileEditorInput) getEditorInput();
			// Get the workbook instance for XLS file
			XSSFWorkbook workbook = new XSSFWorkbook(ie.getFile().getContents(
					true));

			Resource resource = getEditingDomain().createResource(
					ie.getFile().getName());

			Workbook wb = EmfxcelFactory.eINSTANCE.createWorkbook();
			wb.setName(ie.getName());

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
			// TODO handle error
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
