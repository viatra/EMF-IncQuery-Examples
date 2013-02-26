package org.jnect.demo.incquery.gef3d;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.editpolicies.Handles3DEditPolicy;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jnect.core.KinectManager;

/**
 * GEF3D Viewer for the Jnect demo.
 * @author istvanrath
 *
 */
public class Jnect3DView extends ViewPart {

    GraphicalViewer3DImpl bodyViewer;
    
    @Override
    public void createPartControl(Composite parent) {
        bodyViewer = new GraphicalViewer3DImpl();
        bodyViewer.createControl(parent);
        
        bodyViewer.getControl().setBackground(ColorConstants.white);
        
        bodyViewer.setEditPartFactory(new Jnect3DEditpartFactory());
        bodyViewer.setFigureFactory(new Jnect3DFigureFactory());
        
        //bodyViewer.setEditDomain(new DefaultEditDomain(null));
        

        ScalableFreeformRootEditPart root =
            new ScalableFreeformRootEditPart3D();
        
        // handles and feedback when moving or resizing a node
        root.installEditPolicy(
            Handles3DEditPolicy.CHILD_DECORATOR,
            new Handles3DEditPolicy(true));
        
        bodyViewer.setRootEditPart(root);
        
        // setContents
        bodyViewer.setContents(KinectManager.INSTANCE.getSkeletonModel());
    }

    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

}
