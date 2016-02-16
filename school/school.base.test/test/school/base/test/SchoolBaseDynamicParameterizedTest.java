package school.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import school.base.test.util.ModelManager;

/**
 * This class is the super class of all EMF-IncQuery-Base test cases for dynamic EMF models.
 * 
 * @author Tamas Szabo
 * 
 */
@RunWith(Parameterized.class)
public abstract class SchoolBaseDynamicParameterizedTest extends SchoolBaseTest {

    public SchoolBaseDynamicParameterizedTest(Notifier notifier) {
    	this(notifier, true, true);
    }

    public SchoolBaseDynamicParameterizedTest(Notifier notifier, boolean wildcardMode) {
        this(notifier, wildcardMode, true);
    }
    
    public SchoolBaseDynamicParameterizedTest(Notifier notifier, boolean wildcardMode, boolean isDynamicMode) {
        super(notifier, wildcardMode, isDynamicMode);
    }

    @Parameters
    public static Collection<Notifier[]> initializeParameters() {
        return Arrays.asList(new Notifier[][] { { ModelManager.getDynamicModel() } });
    }
}
