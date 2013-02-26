package org.jnect.demo.incquery.gef3d.figures;

import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.Shape;
import org.jnect.demo.incquery.gef3d.Jnect3dVisualizationConstants;

/**
 * Figure class for 3D PositionedElements.
 * @author istvanrath
 *
 */
public class PE3DFigure extends ShapeFigure3D {

    @Override
    protected Shape createShape() {
        return new CuboidFigureShape(this, false);
    }
    
    
    public PE3DFigure(boolean isHead) {
        this.setBackgroundColor(Jnect3dVisualizationConstants.peColor);
        this.setAlpha(0xBB);
        // set initial size
        Vector3f size3d = new Vector3fImpl();
        float dim = isHead?Jnect3dVisualizationConstants.peHeadDim:Jnect3dVisualizationConstants.peDim;
        size3d.setX(dim);
        size3d.setY(dim);
        size3d.setZ(dim);
        this.getPosition3D().setSize3D(size3d);
    }

}
