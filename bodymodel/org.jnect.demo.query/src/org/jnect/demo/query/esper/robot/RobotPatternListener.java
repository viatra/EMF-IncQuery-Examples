package org.jnect.demo.query.esper.robot;

import static org.jnect.demo.query.esper.utils.Logger.log;

import java.awt.AWTException;
import java.awt.Robot;

import org.jnect.demo.query.esper.EsperPatternListener;

import com.espertech.esper.client.EventBean;

/**
 * An Esper listener for the awt.Robot example that translates Esper events to OS-level keypresses.
 * 
 * @author istvanrath
 */
public class RobotPatternListener extends EsperPatternListener {
	
    private Robot robot;
    
    private int keyCode;
    
	public RobotPatternListener(String pName, int _keyCode) {
        super(pName);
        this.keyCode = _keyCode;
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            log("ROBOT :"+e.getMessage());//printStackTrace();
        }
    }

    @Override
	protected void logEvent(EventBean event) {
		super.logEvent(event);
		robot.keyPress(this.keyCode);
		robot.keyRelease(this.keyCode);
	}
}