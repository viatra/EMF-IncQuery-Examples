package org.jnect.demo.incquery.gef3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.ui.parts.GraphicalEditor3DWithFlyoutPalette;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.jnect.core.IKinectUpdateListener;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.gef3d.camera.CustomCameraTool;

/**
 * GEF3D Editor for the Jnect demo.
 * @author istvanrath
 *
 */
public class Jnect3DEditor extends GraphicalEditor3DWithFlyoutPalette implements IKinectUpdateListener {
    
    public Jnect3DEditor() {
        setEditDomain(new DefaultEditDomain(this));
        KinectManager.INSTANCE.addKinectUpdateListener(this);
    }
    
    @Override
    protected void configureGraphicalViewer() {
        super.configureGraphicalViewer();
        GraphicalViewer3DImpl bodyViewer = (GraphicalViewer3DImpl) getGraphicalViewer();
        
        bodyViewer.setEditPartFactory(new Jnect3DEditpartFactory());
        bodyViewer.setFigureFactory(new Jnect3DFigureFactory());
        
        //bodyViewer.getControl().setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
        //bodyViewer.getLightweightSystem3D().setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
        //bodyViewer.getLightweightSystem3D().setDrawAxes(false);
        //bodyViewer.getLightweightSystem3D().getRootFigure().setBackgroundColor(ColorConstants.white);
        
        //the following lines make connections appear :)
        ScalableFreeformRootEditPart root =
                new ScalableFreeformRootEditPart3D();
        bodyViewer.setRootEditPart(root);
    }


    @Override
    protected PaletteRoot getPaletteRoot() {
        PaletteRoot root = new PaletteRoot();
        PaletteGroup controls = new PaletteGroup("Controls");
        root.add(controls);
        //controls.add(new SelectionToolEntry());
        ToolEntry cameraToolEntry = new ToolEntry("Camera", "Camera Tool", null, null,
                CustomCameraTool.class) { };
        controls.add(cameraToolEntry);
        root.setDefaultEntry(cameraToolEntry);
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



    @Override
    public void kinectChangedModel() {
        // this means we have to do a big refresh
        initializeGraphicalViewer();
    }
    
    @Override
    public void dispose() {
        KinectManager.INSTANCE.removeKinectUpdateListener(this);
        super.dispose();
    }

}
