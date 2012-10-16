package org.jnect.demo.incquery.gef3d.figures;

import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.draw3d.shapes.SphereFigureShape;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * Figure class for 3D PositionedElements.
 * @author istvanrath
 *
 */
public class PE3DFigure extends ShapeFigure3D {

    @Override
    protected Shape createShape() {
        return new SphereFigureShape(this, 5);
    }
    
    
    public PE3DFigure() {
        Color c = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
        this.setBackgroundColor(c);
        this.setAlpha(0xBB);
        // set initial size
        Vector3f size3d = new Vector3fImpl();
        size3d.setX(1.0f);
        size3d.setY(1.0f);
        size3d.setZ(1.0f);
        this.getPosition3D().setSize3D(size3d);
    }

}
