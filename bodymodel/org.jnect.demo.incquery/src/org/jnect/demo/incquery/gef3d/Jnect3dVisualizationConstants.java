package org.jnect.demo.incquery.gef3d;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public interface Jnect3dVisualizationConstants {
    
    // scene center coordinates
    public final static float sceneCenterX = 250f;
    public final static float sceneCenterY = 250f;
    public final static float sceneCenterZ = 250f;
    // scene bounds
    public final static float sceneWidth = sceneCenterX*2.0f;
    public final static float sceneHeight = sceneCenterY*2.0f;
    public final static float sceneDepth = sceneCenterZ*2.0f;
    // kinect->gef3d coordinate conversion multiplier
    public final static float kinectMultiplierX = -100f;
    public final static float kinectMultiplierY = -100f;
    public final static float kinectMultiplierZ = 100f; // it looks like Z axis doesn't need flipping
    // body positionedelement size
    public final static float peDim=5.0f;
    public final static float peHeadDim=12.0f;
    // body mumanlink width 
    public final static float hlWidth=2.0f;
    // body elements color
    public final static Color peColor = Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
    public final static Color hlColor = Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
    public final static Color hiliteColor = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
    
    
    
    

}
