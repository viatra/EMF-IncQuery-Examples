package org.eclipse.incquery.runtime.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This class is the super class of all EMF-IncQuery Base Getter test cases 
 * (except the scope tests). It is parameterized and operates on the 
 * first school model (all three {@link Notifier} types). 
 * 
 * @author Tamas Szabo
 *
 */
@RunWith(Parameterized.class)
public abstract class IncQueryBaseParameterizedTest extends IncQueryBaseTest {
	
	public IncQueryBaseParameterizedTest(Notifier notifier) {
		super(notifier);
	}

	public IncQueryBaseParameterizedTest(Notifier notifier, boolean wildcardMode, boolean isDynamicModel) {
		super(notifier, wildcardMode, isDynamicModel);
	}
	
	@Parameters
	public static Collection<Notifier[]> initializeParameters() {
		return Arrays.asList(new Notifier[][] {
		                 { ResourceAccess.getResourceSet() },
		                 { ResourceAccess.getResourceOfFirstSchool() },
		                 { ResourceAccess.getFirstSchool() }
		});
	}
}
