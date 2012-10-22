package org.jnect.demo.incquery.gef3d.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef3d.editparts.AbstractGraphicalEditPartEx;
import org.eclipse.gef3d.editpolicies.XY3DLayoutPolicy;
import org.eclipse.gef3d.tools.DragEditPartsTracker3D;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.EditorPart;
import org.jnect.bodymodel.Body;
import org.jnect.core.IKinectUpdateListener;
import org.jnect.core.KinectManager;

/**
 * 3D editpart for Body ("background").
 * 
 * @author istvanrath
 * 
 */
public class Body3DPart extends AbstractGraphicalEditPartEx implements IKinectUpdateListener {

    @Override
    protected void createEditPolicies() {
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new XY3DLayoutPolicy() {
            
            @Override
            protected Command getCreateCommand(CreateRequest request) {
                // TODO Auto-generated method stub
                return null;
            }
        });
    }

    @Override
    protected List getModelChildren() {
        Body opd = (Body) getModel();
        ArrayList<EObject> ret = new ArrayList<EObject>();
        ret.add(opd.getHead());
        ret.add(opd.getCenterShoulder());
        ret.add(opd.getCenterHip());
        ret.add(opd.getSpine());

        ret.add(opd.getLeftAnkle());
        ret.add(opd.getLeftElbow());
        ret.add(opd.getLeftFoot());
        ret.add(opd.getLeftHand());
        ret.add(opd.getLeftHip());
        ret.add(opd.getLeftKnee());
        ret.add(opd.getLeftShoulder());
        ret.add(opd.getLeftWrist());

        ret.add(opd.getRightAnkle());
        ret.add(opd.getRightElbow());
        ret.add(opd.getRightFoot());
        ret.add(opd.getRightHand());
        ret.add(opd.getRightHip());
        ret.add(opd.getRightKnee());
        ret.add(opd.getRightShoulder());
        ret.add(opd.getRightWrist());
        return ret;
    }    
    
    @Override
    public void setModel(Object model) {
    	super.setModel(model);
    	// register this as a kinect update listener
    	KinectManager.INSTANCE.addKinectUpdateListener(this);
    }

	@Override
	public void kinectReveivedFrame() {
		// update entire editpart hierarchy
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				for (Object o : getChildren()) {
					((EditPart)o).refresh();
				}
						
			}
			
		});
		
	}

    @Override
    public void kinectChangedModel() {
        // we do not react to this
        
    }
    
    @Override
    public void deactivate() {
        KinectManager.INSTANCE.removeKinectUpdateListener(this);
        super.deactivate();
    }

}
