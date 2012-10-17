package org.jnect.demo.incquery.gef3d.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef3d.editparts.AbstractGraphicalEditPartEx;
import org.eclipse.gef3d.editpolicies.XY3DLayoutPolicy;
import org.eclipse.gef3d.tools.DragEditPartsTracker3D;
import org.jnect.bodymodel.Body;

/**
 * 3D editpart for Body ("background").
 * 
 * @author istvanrath
 * 
 */
public class Body3DPart extends AbstractGraphicalEditPartEx {

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

}
