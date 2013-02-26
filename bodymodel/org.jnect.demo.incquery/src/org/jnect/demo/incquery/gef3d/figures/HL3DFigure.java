package org.jnect.demo.incquery.gef3d.figures;

import org.eclipse.draw3d.PolylineConnection3D;
import org.jnect.demo.incquery.gef3d.Jnect3dVisualizationConstants;

/**
 * 3D figure for humanlinks.
 * @author istvanrath
 *
 */
public class HL3DFigure extends PolylineConnection3D {

    public HL3DFigure() {
        setLineWidth(Jnect3dVisualizationConstants.hlWidth);
        setForegroundColor(Jnect3dVisualizationConstants.hlColor);
    }
    
}
