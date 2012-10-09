package org.jnect.demo.incquery.esper;

import org.jnect.demo.incquery.esper.filters.FastIQFilter;
import org.jnect.demo.incquery.esper.filters.FastYMCAFilter;
import org.jnect.demo.incquery.esper.filters.IQFilter;
import org.jnect.demo.incquery.esper.filters.YMCAFilter;
import org.jnect.demo.incquery.esper.listeners.IQListener;
import org.jnect.demo.incquery.esper.listeners.YMCAListener;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

/**
 * Singleton manager class responsible for instantiating and managing the Esper
 * engine.
 * 
 * @author istvan david
 * 
 */
public class EsperManager {

	private static EsperManager instance = new EsperManager("esperengine");

	public static EsperManager getInstance() {
		return instance;
	}

	private final String engineURI;

	private EPServiceProvider epService;
	private EPRuntime runtime;

	private EsperManager(String engineURI) {
		this.engineURI = engineURI;
		try {
			connectToEngine();
		} catch (Exception ex) {
			System.out.println("ESPERMANAGER: unable to initialize");
			ex.printStackTrace();
		}
	}

	public void connectToEngine() throws Exception {
		System.out.println("ESPERMANAGER: Getting Provider");
		System.out.println("ESPERMANAGER: Connecting to the Runtime");

		Configuration config = new Configuration();
		config.addEventTypeAutoName("org.jnect.demo.incquery.esper.events");
		epService = EPServiceProviderManager.getProvider(engineURI, config);
		runtime = EPServiceProviderManager.getProvider(engineURI)
				.getEPRuntime();
		System.out
				.println("ESPERMANAGER: Got the Provider and successfully connected to the Runtime");
		registerFiltersAndListeners();
	}

	public void sendEvent(Object event) {
		System.out.println("ESPERMANAGER: Sending event [" + event.toString()
				+ "]");
		epService.getEPRuntime().sendEvent(event);
	}

	private void registerFiltersAndListeners() {
		//basic filters
		YMCAFilter ymcaFilter = new YMCAFilter(epService.getEPAdministrator());
		ymcaFilter.addListener(new YMCAListener());
		
		IQFilter iqFilter = new IQFilter(epService.getEPAdministrator());
		iqFilter.addListener(new IQListener());
		
		//fast filters (10 sec bound)
		FastYMCAFilter fastYmcaFilter = new FastYMCAFilter(epService.getEPAdministrator());
		fastYmcaFilter.addListener(new YMCAListener());
		
		FastIQFilter fastIqFilter = new FastIQFilter(epService.getEPAdministrator());
		fastIqFilter.addListener(new IQListener());
	}
}
