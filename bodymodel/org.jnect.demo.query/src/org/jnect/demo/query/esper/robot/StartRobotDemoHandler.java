package org.jnect.demo.query.esper.robot;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.jnect.core.KinectManager;
import org.jnect.demo.query.esper.EsperManager;
import org.jnect.demo.query.esper.events.PatternMatchEvent;
import org.jnect.demo.query.esper.events.PatternMatchEventType;
import org.jnect.demo.query.views.YMCADemoView;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StartRobotDemoHandler extends AbstractHandler {

	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
			
//			try {
//				Notifier km = KinectManager.INSTANCE.getSkeletonModel();
//				
//				// adapters for the powerpoint robot demo
//				new EsperAdapter(FSMatcher.factory().getMatcher(km));
//				new EsperAdapter(FEMatcher.factory().getMatcher(km));
//				new EsperAdapter(BSMatcher.factory().getMatcher(km));
//				new EsperAdapter(BEMatcher.factory().getMatcher(km));
//				
//				
//			} catch (IncQueryException e) {
//				e.printStackTrace();
//			}
			
        	EsperManager.getInstance().registerRobotListeners();

//		    try {
//	            Thread t = new Thread(new Runnable() {
//
//	                @Override
//	                public void run() {
//	                    try {
//	                        //samplingTestRobot();
//	                    } catch (Exception e) {
//	                        e.printStackTrace();
//	                    }
//	                   
//	                }
//
//
//	                
//	            }, "Esper Robot Debug");
//	            t.start();
//	            
//	        } catch (Exception e) {
//	            throw new ExecutionException(e.getLocalizedMessage(), e);
//	        }

		} else {
			System.out.println("Start skeleton simulator first!");
		}
		return null;
	}
	
	
	
	
	/**
     * Another test-case for the sampling processing mode.
     * 
     * @throws InterruptedException
     */
    private void samplingTestRobot() throws InterruptedException {
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        Thread.sleep(1000l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        Thread.sleep(700l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        Thread.sleep(400l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FS");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FS", PatternMatchEventType.LOST));

        Thread.sleep(5500l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FE");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.LOST));

        Thread.sleep(700l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FE");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.LOST));

        Thread.sleep(400l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("FE");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "FE", PatternMatchEventType.LOST));
        
    }

}
