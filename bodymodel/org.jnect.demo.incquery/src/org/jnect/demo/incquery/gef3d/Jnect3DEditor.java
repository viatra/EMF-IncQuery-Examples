package org.jnect.demo.incquery.gef3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.editpolicies.Handles3DEditPolicy;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.gef3d.ui.parts.GraphicalEditor3DWithFlyoutPalette;
import org.eclipse.gef3d.ui.parts.GraphicalEditor3DWithPalette;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.gef3d.camera.CustomCameraTool;

/**
 * GEF3D Editor for the Jnect demo.
 * @author istvanrath
 *
 */
public class Jnect3DEditor extends GraphicalEditor3DWithFlyoutPalette {
    
    public Jnect3DEditor() {
        setEditDomain(new DefaultEditDomain(this));
    }
    
    @Override
    protected void configureGraphicalViewer() {
        super.configureGraphicalViewer();
        GraphicalViewer3DImpl bodyViewer = (GraphicalViewer3DImpl) getGraphicalViewer();
        
        bodyViewer.setEditPartFactory(new Jnect3DEditpartFactory());
        bodyViewer.setFigureFactory(new Jnect3DFigureFactory());
        
        //bodyViewer.getControl().setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
        bodyViewer.getLightweightSystem3D().setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
        bodyViewer.getLightweightSystem3D().setDrawAxes(false);
       
    }


    @Override
    protected PaletteRoot getPaletteRoot() {
        PaletteRoot root = new PaletteRoot();
        PaletteGroup controls = new PaletteGroup("Controls");
        root.add(controls);
        //controls.add(new SelectionToolEntry());
        controls.add(new ToolEntry("Camera", "Camera Tool", null, null,
            CustomCameraTool.class) {
        });
//        controls.add(new CreationToolEntry("Vertex", "Create Vertex",
//            new SimpleFactory(Vertex.class), null, null));
//        controls.add(new ConnectionCreationToolEntry("Edge", "Create Edge",
//            new SimpleFactory(Edge.class), null, null));
        return root;
    }

    @Override
    protected void initializeGraphicalViewer() {
        getGraphicalViewer().setContents(KinectManager.INSTANCE.getSkeletonModel());
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        // intentionally empty
        
    }

}
