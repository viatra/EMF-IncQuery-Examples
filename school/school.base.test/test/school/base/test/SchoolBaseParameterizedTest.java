package school.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import school.base.test.util.ModelManager;

/**
 * This class is the super class of all EMF-IncQuery-Base test cases for persisted EMF models. 
 * It is parameterized and operates on the first school model (all three {@link Notifier} types). 
 * 
 * @author Tamas Szabo
 *
 */
@RunWith(Parameterized.class)
public abstract class SchoolBaseParameterizedTest extends SchoolBaseTest {
	
	public SchoolBaseParameterizedTest(Notifier notifier) {
		super(notifier);
	}

	public SchoolBaseParameterizedTest(Notifier notifier, boolean wildcardMode, boolean isDynamicModel) {
		super(notifier, wildcardMode, isDynamicModel);
	}
	
	@Parameters
	public static Collection<Notifier[]> initializeParameters() {
		return Arrays.asList(new Notifier[][] {
		                 { ModelManager.getModel() },
		                 { ModelManager.getModel().getResources().get(0) },
		                 { ModelManager.getModel().getResources().get(0).getContents().get(0) }
		});
	}
}
