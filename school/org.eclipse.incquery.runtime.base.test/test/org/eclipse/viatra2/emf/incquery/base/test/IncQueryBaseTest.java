package org.eclipse.viatra2.emf.incquery.base.test;

import org.eclipse.incquery.runtime.base.api.IncQueryBaseFactory;
import org.eclipse.incquery.runtime.base.api.NavigationHelper;
import org.eclipse.incquery.runtime.base.exception.IncQueryBaseException;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.After;
import org.junit.Before;

public abstract class IncQueryBaseTest {

	protected NavigationHelper navigationHelper;
	
	@After
	public void dispose() {
		navigationHelper.dispose();
	}
	
	@Before
	public void init() {
		try {
			navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(ResourceAccess.getResource(), true, null);
		} 
		catch (IncQueryBaseException e) {
			e.printStackTrace();
		}
	}
	
}
