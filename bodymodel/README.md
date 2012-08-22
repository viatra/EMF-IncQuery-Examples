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
 - new commands to stop GEF demo
 - a new Body Provider that sets up coordinates properly
 - a demo Kinect Manager impl class
  - provides dummy implementations for Kinectless development
  - handles the simulation loop 
  
### Trying the demo

General advice: use the Quick Access bar in Eclipse, as all user actions are to be invoked through Eclipse Commands.

Commands
 - "Start Kinect GEF demo": be sure to have opened a(n empty) .humanbodymodel file beforehand (this will open the Kinect GEF Demo Editor)
  - this command will load the default body into the system, as well as start the simulation loop
 - "Start Kinect IncQuery demo": this will initialize the live queries on the live body model
 - "Save Kinect Bodymodel": for debugging purposes, this will save a demomodel.xmi file into the bodymodel.incquery project in your workspace (overriding anything that may be there already)
 - "Stop Kinect GEF demo": stop the simulation loop  