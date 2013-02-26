# Jnect IncQuery Demo

This is a demo to be used with the [Jnect framework](http://code.google.com/a/eclipselabs.org/p/jnect/). It demonstrates the usage of EMF-IncQuery graph patterns as "standing queries" (live queries) over a live EMF model (called BodyModel) that is maintained in sync with the user's body by the Kinect sensor. IncQuery queries may be used for real-time gesture recognition (using delta monitors).

## Howto

### Jnect modifications

For the IncQuery demo, some modifications to Jnect are required. 
*TODO* details and patch soon to follow 

A quick summary of necessary changes:
 - modify bodymodel.ecore (links should be a containment)
 - modify plugin.xml, fix genmodel reference
 - fix GEF demo: HumanContainerEditpart

My additions:
 - new commands to stop GEF demo, save body model snapshot
 - a new Body Provider that sets up coordinates properly
 - a demo Kinect Manager impl class
  - provides dummy implementations for Kinectless development
  - handles the simulation loop 
  
### Trying the demo

General advice: use the Quick Access bar in Eclipse, as all user actions are to be invoked through Eclipse Commands.

Commands
 - the first command to issue is "Start Kinect GEF demo": be sure to have opened a(n empty) .humanbodymodel file beforehand (this will open the Kinect GEF Demo Editor)
  - this command will load the default body into the system, as well as start the simulation loop
 - "Start Kinect IncQuery Raw Output": this will initialize the live queries of the YMCA example on the live body model, showing the raw output from the IncQuery engine 
  - (e.g. a "Y;" means that the body has reached the state defined by the Y pattern)
 - "Start Kinect IncQuery Esper Output": this will initialize Esper temporal complex event queries on the IncQuery raw output. The resulting complex patterns will be shown in the Esper text area.
  - (e.g. a "[Y]" means that a timewindow-constrained Y has been detected. "[YMCA]" means that the user has performed the complete Y-M-C-A sequence in the good order.)

 - "Start Kinect IncQuery Esper YMCA Demo": to start the YMCA demo, enhanced with Esper CEP technology.
 - "Stop Kinect IncQuery Esper YMCA Demo": to stop the Esper-enhanced YMCA demo.

 - "Start Kinect IncQuery Esper Robot Demo": to start the Robot demo which will allow you to inject Keyboard.LEFTARROW and Keyboard.RIGHTARROW events into your operating system
 - "Stop Kinect IncQuery Esper Robot Demo": to stop the Robot demo.

 - "IDDQD Start Kinect IncQuery Esper YMCA Demo (Combined)": same as "Start ... Esper Output" + "Start ... Esper YMCA Demo"
 - "IDKFA Start Kinect IncQuery Robot YMCA Demo (Combined)": same as "Start ... Esper Output" + "Start ... Esper Robot Demo"

 - "Save Kinect Body model" (CTRL-SHIFT-Q): for debugging purposes, this will save a demomodel.xmi file into the bodymodel.incquery project in your workspace (overriding anything that may be there already)
 - "Load Kinect Body model" (CTRL-SHIFT-L): make sure to have an open GEF editor first. After model has been loaded, issue an "Refresh Kinect GEF Demo" command to see changes.
 - "Stop Kinect GEF demo": stop the simulation loop
 
Useful command sequences
 - to try the raw IncQuery YMCA demo: "Start Kinect GEF demo", "Start Kinect IncQuery Raw Output"
 - to try the Esper YMCA demo: "Start Kinect GEF demo", "IDDQD ..."
 - to try the Esper Robot demo: "Start Kinect GEF demo", "IDKFA ..."


### Robot Gestures

- Forward: start with straight right arm, and bend it to at least 90' (in a timewindow of 2 seconds)
 - important to start with a straight arm!
- Backward: start with straight left arm, and bend it to at least 90' (in a timewindow of 2 seconds)
 - important to start with a straight arm!


### YMCA Gestures
 

The YMCA Example is about detecting some letters of the alphabet as gestures. The following letters are supported:
- Y: both arms stretched above the head, the upper arms enclosing an angle of about 60 degrees
- M: both arms bent (at about a right angle, that is 90 degrees), both hands below the head, the hands at a considerable distance from each other
- C: both arms bent, left hand above the head while right hand below (you should attempt to perform this gesture quickly, as the Kinect sensor may have some difficulty in tracking this gesture)
- A: both arms bent above the head with the hands touching
- I: right arm streched straight above the head
- Q: both arms bent below the head with the hands touching, the feet at a considerable distance from each other   
 
<img width="700px" src="https://raw.github.com/ujhelyiz/EMF-IncQuery-Examples/master/bodymodel/YMCA_Gestures.png" alt="YMCA Gestures overview'/>


## How it works

Coming soon. 