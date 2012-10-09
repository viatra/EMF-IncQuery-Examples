package org.jnect.demo.incquery.esper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;


/**
 * Singleton manager class responsible for instantiating and managing the Esper engine.
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
		epService = EPServiceProviderManager.getProvider(engineURI);
		runtime = EPServiceProviderManager.getProvider(engineURI).getEPRuntime();
		System.out.println("ESPERMANAGER: Got the Provider and successfully connected to the Runtime");
		registerFilters();
	}

	public void sendEvent(Object event) {
		System.out.println("ESPERMANAGER: Sending event [" + event.toString()+"]");
		epService.getEPRuntime().sendEvent(event);
	}

	
	void registerFilters() {
		// TODO
	}
	
	/**
	 * TODO:átírni
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws DOMException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws IllegalArgumentException
	 */
	// public void registerFilters() throws Exception {
	// System.out.println("ESPERMANAGER: Registering filters.");
	// CriticalCPULoadFilter filter1 = new CriticalCPULoadFilter(
	// epService.getEPAdministrator());
	// filter1.addListener(new CriticalCPULoadListener());
	// }

	/*
	public void registerFilters() throws ParserConfigurationException,
			SAXException, IOException, SecurityException,
			NoSuchMethodException, DOMException, ClassNotFoundException,
			IllegalArgumentException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		ClassLoader classLoader = EsperManager.class.getClassLoader();

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File("esper-filters.xml"));

		doc.getDocumentElement().normalize();

		NodeList filterList = doc.getElementsByTagName("filter");

		for (int i = 0; i < filterList.getLength(); i++) {
			Node filterNode = filterList.item(i);
			if (filterNode.getNodeType() == Node.ELEMENT_NODE) {
				Element filterElement = (Element) filterNode;

				NodeList filterNameNode = filterElement
						.getElementsByTagName("filter-name");
				Element filterNameElement = (Element) filterNameNode.item(0);
//				System.out.println(filterNameElement.getChildNodes().item(0)
//						.getNodeValue());

				NodeList filterClassNode = filterElement
						.getElementsByTagName("filter-class");
				Element filterClassElement = (Element) filterClassNode.item(0);
//				System.out.println(filterClassElement.getChildNodes().item(0)
//						.getNodeValue());

				Class FilterClass = Class.forName(filterClassElement
						.getChildNodes().item(0).getNodeValue());
				Class constructorParam = com.espertech.esper.client.EPAdministrator.class;
				Constructor constructor = FilterClass
						.getConstructor(constructorParam);
//				System.out.println(constructor.toString());

				Object arg = epService.getEPAdministrator();
				if (arg == null) {
					System.out.println("arg==null!!!");
				} else {
					System.out.println(arg.toString());
				}
				Object retobj = constructor.newInstance(arg);
				IEventFilter filter = (IEventFilter) retobj;

				NodeList listenerList = filterElement
						.getElementsByTagName("listeners");
				for (int j = 0; j < listenerList.getLength(); j++) {
					Node listenerNode = listenerList.item(j);
					if (listenerNode.getNodeType() == Node.ELEMENT_NODE) {
						Element listenerElement = (Element) listenerNode;

						NodeList listenerClassNode = listenerElement
								.getElementsByTagName("listener-class");
						Element listenerClassElement = (Element) listenerClassNode
								.item(0);
//						System.out.println(listenerClassElement.getChildNodes()
//								.item(0).getNodeValue());

						Class ListenerClass = Class
								.forName(listenerClassElement.getChildNodes()
										.item(0).getNodeValue());
						filter.addListener(ListenerClass.newInstance());
//						System.out.println(filter.toString());
					}
				}
			}
		}
	}
	*/
}
