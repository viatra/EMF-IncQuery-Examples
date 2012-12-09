package org.eclipse.incquery.runtime.base.test;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.base.api.IncQueryBaseFactory;
import org.eclipse.incquery.runtime.base.api.NavigationHelper;
import org.eclipse.incquery.runtime.base.exception.IncQueryBaseException;
import org.junit.After;
import org.junit.Before;

/**
 * This class is the super class of all EMF-IncQuery Base test cases. 
 * It is used to handle the {@link NavigationHelper} registration 
 * based on the given {@link Notifier} instance and wildcard mode setting. 
 * 
 * @author Tamas Szabo
 *
 */
public abstract class IncQueryBaseTest {

	protected NavigationHelper navigationHelper;
	protected Notifier notifier;
	protected boolean wildcardMode;
	
	public IncQueryBaseTest(Notifier notifier) {
		this.notifier = notifier;
		this.wildcardMode = true;
	}
	
	public IncQueryBaseTest(Notifier notifier, boolean wildcardMode) {
		this.notifier = notifier;
		this.wildcardMode = wildcardMode;
	}
	
	@After
	public void dispose() {
		navigationHelper.dispose();
	}
	
	@Before
	public void init() {
		try {
			navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(notifier, wildcardMode, null);
		} 
		catch (IncQueryBaseException e) {
			e.printStackTrace();
		}
	}

}
