package org.jnect.demo.incquery.esper;

import static org.jnect.demo.incquery.esper.utils.Logger.log;

import java.awt.event.KeyEvent;

import org.jnect.demo.incquery.esper.filters.atomic.AtomicPatternFilter;
import org.jnect.demo.incquery.esper.filters.atomic.ParameterizedAtomicPatternFilter;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterWithWindow;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterWithWindowFeedback;
import org.jnect.demo.incquery.esper.filters.complex.YMCAFilterWithWindow;
import org.jnect.demo.incquery.esper.filters.complex.YMCAFilterWithWindowFeedback;
import org.jnect.demo.incquery.esper.robot.RobotPatternListener;
import org.jnect.demo.incquery.esper.robot.StartEndEventPatternWithWindow;
import org.jnect.demo.incquery.sheldon.SheldonEventPatternWithWindowFeedback;
import org.jnect.demo.incquery.sheldon.SheldonPatternListener;

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
	private IQFilterWithWindowFeedback iqFilterWFB;
	private YMCAFilterWithWindow ymcaFilterW;
	private YMCAFilterWithWindowFeedback ymcaFilterWFB;
	
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
	private EsperPatternListener iListenerFB;
	private EsperPatternListener qListenerFB;
	
	private EsperPatternListener yListener;
	private EsperPatternListener mListener;
	private EsperPatternListener cListener;
	private EsperPatternListener aListener;
	private EsperPatternListener yListenerFB;
	private EsperPatternListener mListenerFB;
	private EsperPatternListener cListenerFB;
	private EsperPatternListener aListenerFB;
	
	
	
	public void registerYMCAListeners() {
	    EPAdministrator admin = epService.getEPAdministrator();
	    
	    // complex event filters
		//iqFilterW = new IQFilterWithWindow(admin);
		//iqListener = new EsperPatternListener("IQ");
		//iqFilterW.addListener(iqListener);
		iqFilterWFB = new IQFilterWithWindowFeedback(admin);
		iqListener = new EsperPatternListener("  IQ  ");
		iqFilterWFB.addListener(iqListener);
		
		
//		ymcaFilterW = new YMCAFilterWithWindow(admin);
//		ymcaListener = new EsperPatternListener("YMCA");
//		ymcaFilterW.addListener(ymcaListener);
		ymcaFilterWFB = new YMCAFilterWithWindowFeedback(admin);
		ymcaListener = new EsperPatternListener("  YMCA  ");
		ymcaFilterWFB.addListener(ymcaListener);
		
		// atomic event filters
		iFilter = new AtomicPatternFilter(admin, "I");
		iListener = new EsperPatternListener("I");
		iListenerFB = new EsperPatternListenerFeedback("I");
		//iFilter.addListener(iListener);
		iFilter.addListener(iListenerFB);
		qFilter = new AtomicPatternFilter(admin, "Q");
		qListener = new EsperPatternListener("Q");
		qListenerFB = new EsperPatternListenerFeedback("Q");
		//qFilter.addListener(qListener);
		qFilter.addListener(qListenerFB);
        
		yFilter = new AtomicPatternFilter(admin, "Y");
        yListener = new EsperPatternListener("Y");
        yListenerFB = new EsperPatternListenerFeedback("Y");
		//yFilter.addListener(yListener);
		yFilter.addListener(yListenerFB);
        mFilter = new AtomicPatternFilter(admin, "M");
        mListener = new EsperPatternListener("M");
        mListenerFB = new EsperPatternListenerFeedback("M");
		//mFilter.addListener(mListener);
		mFilter.addListener(mListenerFB);
        cFilter = new AtomicPatternFilter(admin, "C");
        cListener = new EsperPatternListener("C");
        cListenerFB = new EsperPatternListenerFeedback("C");
		//cFilter.addListener(cListener);
		cFilter.addListener(cListenerFB);
        aFilter = new AtomicPatternFilter(admin, "A");
        aListener = new EsperPatternListener("A");
        aListenerFB = new EsperPatternListenerFeedback("A");
		//aFilter.addListener(aListener);
		aFilter.addListener(aListenerFB);
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
	
	private ParameterizedAtomicPatternFilter ssFilter, smFilter, seFilter;
	private EsperPatternListenerFeedback ssListener, smListener, seListener;
	private SheldonEventPatternWithWindowFeedback sheldonFilter;
    private SheldonPatternListener sheldonListener;
    
	public void registerSheldonListeners() {
        EPAdministrator admin = epService.getEPAdministrator();
        if (admin!=null) {
            // sheldon control example
            String wLen = "0.4 seconds"; // adjust this for more precision
            ssFilter = new ParameterizedAtomicPatternFilter(admin, "SS", wLen);
            ssListener = new EsperPatternListenerFeedback("SS");
            ssFilter.addListener(ssListener);
            
            smFilter = new ParameterizedAtomicPatternFilter(admin, "SM", wLen);
            smListener = new EsperPatternListenerFeedback("SM");
            smFilter.addListener(smListener);
            
            seFilter = new ParameterizedAtomicPatternFilter(admin, "SE", wLen);
            seListener = new EsperPatternListenerFeedback("SE");
            seFilter.addListener(seListener);
            
            
            sheldonFilter = new SheldonEventPatternWithWindowFeedback(admin, "4 sec"); // adjust this for gesture sequence speed tolerance
            sheldonListener = new SheldonPatternListener("S");
            sheldonFilter.addListener(sheldonListener);
        }
    }
    
    public void unregisterSheldonListeners() {
        if (sheldonFilter!=null) {
            sheldonFilter.removeListener(sheldonListener);
        }
        if (ssFilter!=null) {
            ssFilter.removeListener(ssListener);
        }
        if (smFilter!=null) {
            smFilter.removeListener(smListener);
        }
        if (seFilter!=null) {
            seFilter.removeListener(seListener);
        }
    }

	public void sendEvent(Object event) {
		log("ESPERMANAGER: Sending event [" + event.toString() + "]");
		epService.getEPRuntime().sendEvent(event);
	}
}