package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.base.api.InstanceListener;

import school.SchoolPackage;

/**
 * {@link InstanceListener} based test of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class InstanceListenerTest extends IncQueryBaseListenerTest {

	private Set<EClass> classes;
	private InstanceListener instanceListener;
	
	public InstanceListenerTest(Notifier notifier) {
		super(notifier, false);
		
		classes = new HashSet<EClass>();
		classes.add(SchoolPackage.eINSTANCE.getCourse());
		
		//the listener asserts the notifications after a new course has been added
		instanceListener = new InstanceListener() {
			
			@Override
			public void instanceInserted(EClass clazz, EObject instance) {
				assertTrue(clazz.equals(SchoolPackage.eINSTANCE.getCourse()) && 
						instance.equals(newCourse));
			}
			
			@Override
			public void instanceDeleted(EClass clazz, EObject instance) {
				assertTrue(clazz.equals(SchoolPackage.eINSTANCE.getCourse()) && 
						instance.equals(newCourse));
			}
		};
	}

	@Override
	public void registerListener() {
		navigationHelper.registerEClasses(classes);
		navigationHelper.addInstanceListener(classes, instanceListener);
	}

	@Override
	public void unregisterListener() {
		navigationHelper.removeInstanceListener(classes, instanceListener);
		navigationHelper.unregisterEClasses(classes);
	}
}
