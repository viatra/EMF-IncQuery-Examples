package org.jnect.demo.incquery.gef3d;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef3d.factories.DisplayMode;
import org.eclipse.gef3d.factories.IFigureFactory;
import org.jnect.bodymodel.Head;
import org.jnect.demo.incquery.gef3d.figures.Body3DFigure;
import org.jnect.demo.incquery.gef3d.figures.HL3DFigure;
import org.jnect.demo.incquery.gef3d.figures.PE3DFigure;
import org.jnect.demo.incquery.gef3d.parts.Body3DPart;
import org.jnect.demo.incquery.gef3d.parts.HL3DPart;
import org.jnect.demo.incquery.gef3d.parts.PE3DPart;

/**
 * 3D figure factory for visualizing Jnect models in true 3D.
 * @author istvanrath
 *
 */
public class Jnect3DFigureFactory implements IFigureFactory {

    @Override
    public DisplayMode getMode() {
        return DisplayMode.ThreeDimensional;
    }

    @Override
    public IFigure createFigure(GraphicalEditPart i_controller, Object i_hint) {
        IFigure fig = null;
        if (i_controller instanceof PE3DPart) {
            if (i_controller.getModel() instanceof Head) {
                fig = new PE3DFigure(true);
            } else {
                fig = new PE3DFigure(false);
            }
        }
        else if (i_controller instanceof Body3DPart) {
            fig = new Body3DFigure();
        }
        else if (i_controller instanceof HL3DPart) {
            fig = new HL3DFigure();
        }
        return fig;
    }

}
