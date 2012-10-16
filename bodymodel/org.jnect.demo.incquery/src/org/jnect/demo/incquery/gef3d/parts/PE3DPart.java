package org.jnect.demo.incquery.gef3d.parts;

import java.util.List;

import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef3d.editparts.AbstractGraphicalNodeEditPart;
import org.eclipse.gef3d.factories.IConnectionAnchorFactory;
import org.eclipse.gef3d.factories.SingleAnchorConnectionAnchorFactory;
import org.eclipse.swt.widgets.Display;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.demo.incquery.gef3d.Jnect3dVisualizationConstants;
import org.jnect.demo.incquery.gef3d.figures.PE3DFigure;

/**
 * Editpart for 3D PositionedElements.
 * @author istvanrath
 *
 */
public class PE3DPart extends AbstractGraphicalNodeEditPart implements NodeEditPart {

    
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef3d.editparts.AbstractGraphicalNodeEditPart#createConnectionAnchorFactory()
     */
    @Override
    protected IConnectionAnchorFactory createConnectionAnchorFactory() {
        return new SingleAnchorConnectionAnchorFactory.ChopboxAnchor3DFactory(this);
    }
    

    @Override
    protected void createEditPolicies() {
        // TODO empty for now
//        installEditPolicy(ShowSourceFeedback3DEditPolicy.ROLE,
//                new ShowSourceFeedback3DEditPolicy());
    }
    
    
    @Override
    protected List getModelSourceConnections() {
        PositionedElement model = (PositionedElement) getModel();
        return model.getOutgoingLinks();
    }
    
    @Override
    protected List getModelTargetConnections() {
        PositionedElement model = (PositionedElement) getModel();
        return model.getIncomingLinks();
    }
    
    @Override
    protected void refreshVisuals() {
        PositionedElement pe = (PositionedElement) getModel();
        PE3DFigure pefigure = (PE3DFigure) getFigure();
        // set location
        Vector3f loc = new Vector3fImpl();
        loc.setX(Jnect3dVisualizationConstants.sceneCenterX+pe.getX()*Jnect3dVisualizationConstants.kinectMultiplierX); 
        loc.setY(Jnect3dVisualizationConstants.sceneCenterY+pe.getY()*Jnect3dVisualizationConstants.kinectMultiplierY); 
        loc.setZ(Jnect3dVisualizationConstants.sceneCenterZ+pe.getZ()*Jnect3dVisualizationConstants.kinectMultiplierZ); 
        pefigure.getPosition3D().setLocation3D(loc);
    }
    
    @Override
    public void setModel(Object model) {
        super.setModel(model);

        ((PositionedElement) model).eAdapters().add(new Adapter() {
            @Override
            public void notifyChanged(Notification notification) {
                Display.getDefault().syncExec(new Runnable() {
                    @Override
                    public void run() {
                        refreshVisuals();
                        refreshSourceConnections();
                        refreshTargetConnections();
                    }
                });
            }

            @Override
            public Notifier getTarget() {
                return (PositionedElement) getModel();
            }

            @Override
            public void setTarget(Notifier newTarget) {
            }

            @Override
            public boolean isAdapterForType(Object type) {
                return false;
            }
        });
    }

}
