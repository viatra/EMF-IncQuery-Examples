package org.jnect.demo.incquery.gef3d.figures;

import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw3d.FreeformLayer3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.jnect.demo.incquery.gef3d.Jnect3dVisualizationConstants;

public class Body3DFigure extends FreeformLayer3D {

    
    public Body3DFigure() {
        Vector3fImpl size = new Vector3fImpl(getPosition3D().getSize3D());
        size.set(
                Jnect3dVisualizationConstants.sceneWidth, 
                Jnect3dVisualizationConstants.sceneHeight, 
                Jnect3dVisualizationConstants.sceneDepth);
        getPosition3D().setSize3D(size);
        
        //Color bgColor = Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
        Color bgColor = new Color(Display.getCurrent(), 0xFF, 0xFF, 0xFF);
        setBackgroundColor(bgColor);
        setAlpha((byte) 0x44);
        setBorder(new LineBorder(2));
        setOpaque(true);
    }
        
}
