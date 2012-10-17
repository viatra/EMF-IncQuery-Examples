package org.eclipse.viatra2.emf.incquery.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.base.api.IncQueryBaseFactory;
import org.eclipse.viatra2.emf.incquery.base.api.NavigationHelper;
import org.eclipse.viatra2.emf.incquery.base.exception.IncQueryBaseException;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
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
	
	@Parameters
	public static Collection<Notifier[]> getNotifiers() {
		return Arrays.asList(new Notifier[][] {
		                 { ResourceAccess.getResourceSet() },
		                 { ResourceAccess.getResource() },
		                 { ResourceAccess.getEObject() }
		});
	}
}
