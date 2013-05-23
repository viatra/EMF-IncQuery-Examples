package hu.bme.mit.examples.uml.incquery.databinding.demo;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.databinding.runtime.collection.ObservablePatternMatchList;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import uml.emptyclass.EmptyClassDatabindingAdapter;
import uml.emptyclass.EmptyClassMatcher;

public class ClassView extends ViewPart {
    public ClassView() {
    }

    public static final String ID = "hu.bme.mit.examples.uml.incquery.databinding.demo.ClassView"; //$NON-NLS-1$
    private TableViewer tableViewer;

    /**
     * Create contents of the view part.
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new FillLayout(SWT.HORIZONTAL));

        Group grpEmptyClasses = new Group(container, SWT.NONE);
        grpEmptyClasses.setText("Empty Classes");
        grpEmptyClasses.setLayout(new FillLayout(SWT.HORIZONTAL));

        tableViewer = new TableViewer(grpEmptyClasses, SWT.BORDER | SWT.FULL_SELECTION);
        Table table = tableViewer.getTable();
        table.setLinesVisible(true);
        table.setHeaderVisible(true);

        TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnName = tableViewerColumn.getColumn();
        tblclmnName.setWidth(100);
        tblclmnName.setText("Name");

        TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnAbstract = tableViewerColumn_1.getColumn();
        tblclmnAbstract.setWidth(100);
        tblclmnAbstract.setText("Abstract");

        TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnLeaf = tableViewerColumn_2.getColumn();
        tblclmnLeaf.setWidth(100);
        tblclmnLeaf.setText("Leaf");

    }

    public void loadModel(ResourceSet resourceSet) throws IncQueryException {
        EmptyClassMatcher matcher = new EmptyClassMatcher(resourceSet);
        EmptyClassDatabindingAdapter adapter = new EmptyClassDatabindingAdapter();
        ViewerSupport.bind(
                tableViewer,
                new ObservablePatternMatchList(matcher),
                new IValueProperty[] { adapter.getProperty("Cl"), adapter.getProperty("abstract"),
                        adapter.getProperty("leaf") });
    }
    

    @Override
    public void setFocus() {
        // Set the focus
    }
}
