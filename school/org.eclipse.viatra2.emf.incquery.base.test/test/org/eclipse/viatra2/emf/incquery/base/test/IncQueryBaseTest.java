package org.eclipse.viatra2.emf.incquery.base.test;

import org.eclipse.viatra2.emf.incquery.base.api.IncQueryBaseFactory;
import org.eclipse.viatra2.emf.incquery.base.api.NavigationHelper;
import org.eclipse.viatra2.emf.incquery.base.exception.IncQueryBaseException;
import org.eclipse.viatra2.emf.incquery.base.test.util.ResourceAccess;
import org.junit.After;
import org.junit.Before;

public abstract class IncQueryBaseTest {

	protected NavigationHelper navigationHelper;
	protected boolean isInWildcardMode;
	
	public IncQueryBaseTest() {
		this(true);
	}
	
	public IncQueryBaseTest(boolean isInWildcardMode) {
		this.isInWildcardMode = isInWildcardMode;
	}
	
	@After
	public void dispose() {
		navigationHelper.dispose();
	}
	
	@Before
	public void init() {
		try {
			navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(ResourceAccess.getSchool(), isInWildcardMode, null);
		} 
		catch (IncQueryBaseException e) {
			e.printStackTrace();
		}
	}
	
}
