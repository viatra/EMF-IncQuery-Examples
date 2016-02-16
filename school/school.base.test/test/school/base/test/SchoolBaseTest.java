package school.base.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.query.runtime.base.api.IncQueryBaseFactory;
import org.eclipse.viatra.query.runtime.base.api.NavigationHelper;
import org.eclipse.viatra.query.runtime.base.exception.IncQueryBaseException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

/**
 * This class is the super class of all EMF-IncQuery-Base test cases. 
 * It is used to handle the {@link NavigationHelper} registration 
 * based on the given {@link Notifier} instance and wildcard mode setting. 
 * 
 * @author Tamas Szabo
 *
 */
public abstract class SchoolBaseTest {

	protected NavigationHelper navigationHelper;
	protected Notifier notifier;
	protected boolean wildcardMode;
	protected Logger logger;
	protected AppenderSkeleton testAppender;
	protected boolean isDynamicModel;
	
	final private Map<String,Boolean> expectedLogsOccurred = new HashMap<String, Boolean>();
	
	final protected ArrayList<LoggingEvent> loggedEvents = new ArrayList<LoggingEvent>();
	
	/**
	 * wildcard mode default is true<br/>
	 * dynamic mode default is false
	 * 
	 * @param notifier
	 */
	public SchoolBaseTest(Notifier notifier) {
		this.notifier = notifier;
		this.wildcardMode = true;
		this.isDynamicModel = false;
	}
	
	public SchoolBaseTest(Notifier notifier, boolean wildcardMode, boolean isDynamicModel) {
		this.notifier = notifier;
		this.wildcardMode = wildcardMode;
		this.isDynamicModel = isDynamicModel;
	}
	
	@After
	public void dispose() {
		navigationHelper.dispose();
		logger.removeAppender(testAppender);
		
		for (LoggingEvent event : loggedEvents) {
			final String renderedMessage = event.getRenderedMessage();
			if (expectedLogsOccurred.containsKey(renderedMessage)) {
				expectedLogsOccurred.put(renderedMessage, true);
			} else {
				StringBuilder sb = new StringBuilder("IQBase logged event: ");  
				sb.append(renderedMessage);
				final ThrowableInformation throwableInfo = event.getThrowableInformation();
				if (throwableInfo != null) {
					final String[] throwableStrRep = throwableInfo.getThrowableStrRep();
					for (String line : throwableStrRep) {
						sb.append("\n");
						sb.append(line);
					}
				}
				Assert.fail(sb.toString());		
			}
		}
		loggedEvents.clear();
		
		Set<Entry<String, Boolean>> expectedEntrySet = expectedLogsOccurred.entrySet();
		for (Entry<String, Boolean> entry : expectedEntrySet) {
			if (!entry.getValue()) {
				Assert.fail("Expected log entry not found: " + entry.getKey());	
			}
		}

	}
	
	protected void expectLogMessage(String msg) {
		expectedLogsOccurred.put(msg, false);
	}
	
	@Before
	public void init() throws IncQueryBaseException {
		logger = Logger.getLogger(getClass());
		testAppender = new AppenderSkeleton() {
			
			@Override
			public boolean requiresLayout() {
				return false;
			}
			
			@Override
			public void close() {
			}
			
			@Override
			protected void append(LoggingEvent event) {
				loggedEvents.add(event);
//				StringBuilder sb = new StringBuilder("IQBase logged event: ");  
//				sb.append(event.getRenderedMessage());
//				final ThrowableInformation throwableInfo = event.getThrowableInformation();
//				if (throwableInfo != null) {
//					final String[] throwableStrRep = throwableInfo.getThrowableStrRep();
//					for (String line : throwableStrRep) {
//						sb.append("\n");
//						sb.append(line);
//					}
//				}
//				if (false) Assert.fail(sb.toString());
			}
		};
		logger.addAppender(testAppender);
		navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(notifier, wildcardMode, isDynamicModel, logger);
	}

}
