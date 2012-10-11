package org.jnect.demo.incquery.esper;

import static org.jnect.demo.incquery.esper.utils.Logger.log;

import org.jnect.demo.incquery.esper.filters.atomic.IFilter;
import org.jnect.demo.incquery.esper.filters.atomic.QFilter;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterNoWindow;
import org.jnect.demo.incquery.esper.filters.complex.IQFilterWithWindow;
import org.jnect.demo.incquery.esper.listeners.atomic.IListener;
import org.jnect.demo.incquery.esper.listeners.atomic.QListener;
import org.jnect.demo.incquery.esper.listeners.complex.IQListenerNoWindow;
import org.jnect.demo.incquery.esper.listeners.complex.IQListenerWithWindow;

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
		IQFilterNoWindow iqFilter = new IQFilterNoWindow(epService.getEPAdministrator());
		iqFilter.addListener(new IQListenerNoWindow());
		
		IQFilterWithWindow iqFilterW = new IQFilterWithWindow(epService.getEPAdministrator());
		iqFilterW.addListener(new IQListenerWithWindow());
		
		IFilter iFilter = new IFilter(epService.getEPAdministrator());
		iFilter.addListener(new IListener());
		
		QFilter qFilter = new QFilter(epService.getEPAdministrator());
		qFilter.addListener(new QListener());
	}

	public void sendEvent(Object event) {
		log("ESPERMANAGER: Sending event [" + event.toString() + "]");
		epService.getEPRuntime().sendEvent(event);
	}
}