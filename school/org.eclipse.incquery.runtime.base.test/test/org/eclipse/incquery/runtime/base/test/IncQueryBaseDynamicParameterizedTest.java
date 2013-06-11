package org.eclipse.incquery.runtime.base.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.base.test.util.DynamicResourceModel;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This class is the super class of all EMF-IncQuery Base Getter test cases for dynamic EMF models.
 * 
 * @author Tamas Szabo
 * 
 */
@RunWith(Parameterized.class)
public abstract class IncQueryBaseDynamicParameterizedTest extends IncQueryBaseTest {

    public IncQueryBaseDynamicParameterizedTest(Notifier notifier) {
    	this(notifier, true, true);
    }

    public IncQueryBaseDynamicParameterizedTest(Notifier notifier, boolean wildcardMode) {
        this(notifier, wildcardMode, true);
    }
    
    public IncQueryBaseDynamicParameterizedTest(Notifier notifier, boolean wildcardMode, boolean isDynamicMode) {
        super(notifier, wildcardMode, isDynamicMode);
    }

    @Parameters
    public static Collection<Notifier[]> initializeParameters() {
        return Arrays.asList(new Notifier[][] { { DynamicResourceModel.getInstance().school } });
    }
}
