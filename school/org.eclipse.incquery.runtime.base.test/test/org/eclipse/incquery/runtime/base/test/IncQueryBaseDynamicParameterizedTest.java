package org.eclipse.incquery.runtime.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceModel;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This class is the super class of all EMF-IncQuery Base Getter test cases (except the scope tests). It is
 * parameterized and operates on the first school model (all three {@link Notifier} types).
 * 
 * @author Tamas Szabo
 * 
 */
@RunWith(Parameterized.class)
public abstract class IncQueryBaseDynamicParameterizedTest extends IncQueryBaseTest {

    public IncQueryBaseDynamicParameterizedTest(Notifier notifier) {
        super(notifier, true, true);
    }

    public IncQueryBaseDynamicParameterizedTest(Notifier notifier, boolean wildcardMode) {
        super(notifier, wildcardMode, true);
    }

    @Parameters
    public static Collection<Notifier[]> initializeParameters() {
        DynamicResourceModel model = new DynamicResourceModel();
        return Arrays.asList(new Notifier[][] { { model.school } });
    }
}
