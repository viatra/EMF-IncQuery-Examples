package org.jnect.demo.incquery.esper;

import static org.jnect.demo.incquery.esper.utils.Logger.log;

import org.jnect.demo.incquery.esper.filters.continuous.IQFilterNoWindow;
import org.jnect.demo.incquery.esper.filters.continuous.YMCAFilterNoWindow;
import org.jnect.demo.incquery.esper.filters.sampled.IQFilterWithWindow;
import org.jnect.demo.incquery.esper.listeners.continuous.IQListenerNoWindow;
import org.jnect.demo.incquery.esper.listeners.continuous.YMCAListenerNoWindow;
import org.jnect.demo.incquery.esper.listeners.sampled.IQListenerWithWindow;

import com.espertech.esper.client.Configuration;
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

		registerFiltersAndListeners();
	}

	private void registerFiltersAndListeners() {
		//IQFilterWithWindow iqFilterSampled = new IQFilterWithWindow(epService.getEPAdministrator());
		//iqFilterSampled.addListener(new IQListenerWithWindow());

		YMCAFilterNoWindow yfnw = new YMCAFilterNoWindow(epService.getEPAdministrator());
		yfnw.addListener(new YMCAListenerNoWindow());
		
		IQFilterNoWindow iqFilter = new IQFilterNoWindow(epService.getEPAdministrator());
		iqFilter.addListener(new IQListenerNoWindow());
	}

	public void sendEvent(Object event) {
		log("ESPERMANAGER: Sending event [" + event.toString() + "]");
		epService.getEPRuntime().sendEvent(event);
	}
}