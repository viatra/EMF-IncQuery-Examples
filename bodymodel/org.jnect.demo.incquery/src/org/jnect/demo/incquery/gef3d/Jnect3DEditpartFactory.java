package org.jnect.demo.incquery.gef3d;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.HumanLink;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.demo.incquery.gef3d.parts.Body3DPart;
import org.jnect.demo.incquery.gef3d.parts.HL3DPart;
import org.jnect.demo.incquery.gef3d.parts.PE3DPart;

/**
 * 3D editpart factory for Jnect models.
 * @author istvanrath
 *
 */
public class Jnect3DEditpartFactory implements EditPartFactory {

    @Override
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = null;
        if (model instanceof Body) {
            part = new Body3DPart();
        }
        else if (model instanceof PositionedElement) {
            part = new PE3DPart();
        }
        else if (model instanceof HumanLink) {
            part = new HL3DPart();
        }
        if (part!=null) {
            part.setModel(model);
        }
        return part;
    }

}
