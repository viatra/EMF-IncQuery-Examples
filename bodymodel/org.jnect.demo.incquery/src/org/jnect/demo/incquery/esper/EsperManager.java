package org.jnect.demo.incquery.esper;

import static org.jnect.demo.incquery.esper.utils.Logger.log;

import java.awt.event.KeyEvent;

import org.jnect.demo.incquery.esper.filters.atomic.AtomicPatternFilter;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterWithWindow;
import org.jnect.demo.incquery.esper.filters.complex.YMCAFilterWithWindow;
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

	private IQFilterWithWindow iqFilterW;
	private YMCAFilterWithWindow ymcaFilterW;
	private AtomicPatternFilter iFilter;
	private AtomicPatternFilter qFilter;
	private AtomicPatternFilter yFilter;
	private AtomicPatternFilter mFilter;
	private AtomicPatternFilter cFilter;
	private AtomicPatternFilter aFilter;
	private EsperPatternListener iqListener;
	private EsperPatternListener ymcaListener;
	private EsperPatternListener iListener;
	private EsperPatternListener qListener;
	private EsperPatternListener yListener;
	private EsperPatternListener mListener;
	private EsperPatternListener cListener;
	private EsperPatternListener aListener;
	
	
	
	public void registerYMCAListeners() {
	    EPAdministrator admin = epService.getEPAdministrator();
	    
	    // complex event filters
		//IQFilterNoWindow iqFilter = new IQFilterNoWindow(admin);
		//iqFilter.addListener(new EsperPatternListener("IQ_NW"));
		iqFilterW = new IQFilterWithWindow(admin);
		iqListener = new EsperPatternListener("IQ");
		iqFilterW.addListener(iqListener);
		ymcaFilterW = new YMCAFilterWithWindow(admin);
		ymcaListener = new EsperPatternListener("YMCA");
		ymcaFilterW.addListener(ymcaListener);
		
		// atomic event filters
		iFilter = new AtomicPatternFilter(admin, "I");
		iListener = new EsperPatternListener("I");
		iFilter.addListener(iListener);
		qFilter = new AtomicPatternFilter(admin, "Q");
		qListener = new EsperPatternListener("Q");
		qFilter.addListener(qListener);
        yFilter = new AtomicPatternFilter(admin, "Y");
        yListener = new EsperPatternListener("Y");
		yFilter.addListener(yListener);
        mFilter = new AtomicPatternFilter(admin, "M");
        mListener = new EsperPatternListener("M");
		mFilter.addListener(mListener);
        cFilter = new AtomicPatternFilter(admin, "C");
        cListener = new EsperPatternListener("C");
		cFilter.addListener(cListener);
        aFilter = new AtomicPatternFilter(admin, "A");
        aListener = new EsperPatternListener("A");
		aFilter.addListener(aListener);
	}
	
	public void unregisterYMCAListeners() {
		if (iqFilterW!=null) {
			iqFilterW.removeListener(iqListener);
		}
		if (ymcaFilterW!=null) {
			ymcaFilterW.removeListener(ymcaListener);
		}
		if (iFilter!=null) {
			iFilter.removeListener(iListener);
		}
		if (qFilter!=null) {
			qFilter.removeListener(qListener);
		}
		if (yFilter!=null) {
			yFilter.removeListener(yListener);
		}
		if (mFilter!=null) {
			mFilter.removeListener(mListener);
		}
		if (cFilter!=null) {
			cFilter.removeListener(cListener);
		}
		if (aFilter!=null) {
			aFilter.removeListener(aListener);
		}
	}
	
	private StartEndEventPatternWithWindow forwardFilter;
	private RobotPatternListener forwardListener;
	private StartEndEventPatternWithWindow backwardFilter;
	private RobotPatternListener backwardListener;

	
	
	public void registerRobotListeners() {
		EPAdministrator admin = epService.getEPAdministrator();
		if (admin!=null) {
			// powerpoint robot example
	        forwardFilter = new StartEndEventPatternWithWindow(admin, "FS", "FE", "2 sec");
	        forwardListener = new RobotPatternListener("F", KeyEvent.VK_RIGHT);
	        forwardFilter.addListener(forwardListener);
	        
	        backwardFilter = new StartEndEventPatternWithWindow(admin, "BS", "BE", "2 sec");
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