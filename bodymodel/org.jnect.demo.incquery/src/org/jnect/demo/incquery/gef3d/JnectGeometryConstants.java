package org.jnect.demo.incquery.gef3d;

public interface JnectGeometryConstants {
    
    // scene center coordinates
    public final static float sceneCenterX = 250f;
    public final static float sceneCenterY = 250f;
    public final static float sceneCenterZ = 250f;
    // scene bounds
    public final static float sceneWidth = sceneCenterX*2.0f;
    public final static float sceneHeight = sceneCenterY*2.0f;
    public final static float sceneDepth = sceneCenterZ*2.0f;
    // kinect->gef3d coordinate conversion multiplier
    public final static float kinectMultiplier = -100f;

}
