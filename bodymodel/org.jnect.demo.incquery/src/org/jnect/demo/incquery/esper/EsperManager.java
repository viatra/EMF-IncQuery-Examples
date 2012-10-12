package org.jnect.demo.incquery.esper;

import static org.jnect.demo.incquery.esper.utils.Logger.log;

import java.awt.event.KeyEvent;

import org.jnect.demo.incquery.esper.filters.atomic.AtomicPatternFilter;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterNoWindow;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterWithWindow;
import org.jnect.demo.incquery.esper.robot.RobotPatternListener;
import org.jnect.demo.incquery.esper.robot.StartEndEventPatternWithWindow;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

/**
 * Singleton manager class responsible for instantiating and managing the Esper engine.
 * 
 * @author idavid
 */
public class EsperManager {

	private static EsperManager instance = new EsperManager("esperengine");

	public static EsperManager getInstance() {
		return instance;
	}

	private final String engineURI;
	private EPServiceProvider epService;
	
	private EsperManager(String engineURI) {
		this.engineURI = engineURI;
		try {
			connectToEngine();
		} catch (Exception ex) {
			log("ESPERMANAGER: unable to initialize");
			ex.printStackTrace();
		}
	}

	public void connectToEngine() throws Exception {
		log("ESPERMANAGER: Getting Provider");
		log("ESPERMANAGER: Connecting to the Runtime");

		// enabling event type name usage in EPL queries
		Configuration config = new Configuration();
		config.addEventTypeAutoName("org.jnect.demo.incquery.esper.events");

		epService = EPServiceProviderManager.getProvider(engineURI, config);
		EPServiceProviderManager.getProvider(engineURI).getEPRuntime();

		log("ESPERMANAGER: Got the Provider and successfully connected to the Runtime");

		//registerFiltersAndListeners();
	}

	
	public void registerYMCAListeners() {
	    EPAdministrator admin = epService.getEPAdministrator();
	    
	    // complex event filters
	    
		//IQFilterNoWindow iqFilter = new IQFilterNoWindow(admin);
		//iqFilter.addListener(new EsperPatternListener("IQ_NW"));
		
		IQFilterWithWindow iqFilterW = new IQFilterWithWindow(admin);
		iqFilterW.addListener(new EsperPatternListener("IQ_W"));
		
		// atomic event filters
		
		// ymca example
		
		AtomicPatternFilter iFilter = new AtomicPatternFilter(admin, "I");
		iFilter.addListener(new EsperPatternListener("I"));
		
		AtomicPatternFilter qFilter = new AtomicPatternFilter(admin, "Q");
        qFilter.addListener(new EsperPatternListener("Q"));
        
        AtomicPatternFilter yFilter = new AtomicPatternFilter(admin, "Y");
        yFilter.addListener(new EsperPatternListener("Y"));
        
        AtomicPatternFilter mFilter = new AtomicPatternFilter(admin, "M");
        mFilter.addListener(new EsperPatternListener("M"));
        
        AtomicPatternFilter cFilter = new AtomicPatternFilter(admin, "C");
        cFilter.addListener(new EsperPatternListener("C"));
        
        AtomicPatternFilter aFilter = new AtomicPatternFilter(admin, "A");
        aFilter.addListener(new EsperPatternListener("A"));
        
          
	}
	
	private StartEndEventPatternWithWindow forwardFilter;
	private RobotPatternListener forwardListener;
	private StartEndEventPatternWithWindow backwardFilter;
	private RobotPatternListener backwardListener;
	
	
	public void registerRobotListeners() {
		 EPAdministrator admin = epService.getEPAdministrator();
		if (admin!=null) {
			// powerpoint robot example
	        forwardFilter = new StartEndEventPatternWithWindow(admin, "FS", "FE", "1 sec");
	        forwardListener = new RobotPatternListener("F", KeyEvent.VK_RIGHT);
	        forwardFilter.addListener(forwardListener);
	        
	        backwardFilter = new StartEndEventPatternWithWindow(admin, "BS", "BE", "1 sec");
	        backwardListener = new RobotPatternListener("B", KeyEvent.VK_LEFT);
	        backwardFilter.addListener(backwardListener);
		}
	}
	
	public void unregisterRobotListeners() {
		if (forwardFilter!=null) {
			forwardFilter.removeListener(forwardListener);
		}
		if (backwardFilter!=null) {
			backwardFilter.removeListener(backwardListener);
		}
	}

	public void sendEvent(Object event) {
		log("ESPERMANAGER: Sending event [" + event.toString() + "]");
		epService.getEPRuntime().sendEvent(event);
	}
}