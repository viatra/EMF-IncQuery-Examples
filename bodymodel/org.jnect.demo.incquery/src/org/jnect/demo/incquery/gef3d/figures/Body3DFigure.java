package org.jnect.demo.incquery.gef3d.figures;

import org.eclipse.draw3d.FreeformLayer3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class Body3DFigure extends FreeformLayer3D {

    public Body3DFigure() {
        getPosition3D().setLocation3D(IVector3f.NULLVEC3f);
        Vector3fImpl size = new Vector3fImpl(getPosition3D().getSize3D());
        size.set(400, 300, 20);
        getPosition3D().setSize3D(size);
        
        Color bgColor = new Color(Display.getCurrent(), 0xFF, 0xFF, 0xFF);
        setBackgroundColor(bgColor);
        setAlpha((byte) 0x44);
    }
    
}
