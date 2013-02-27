package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.base.api.FeatureListener;

import school.SchoolPackage;

/**
 * {@link FeatureListener} based test of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class FeatureListenerTest extends IncQueryBaseListenerTest {

	private Set<EStructuralFeature> features;
	private FeatureListener featureListener;
	
	public FeatureListenerTest(Notifier notifier) {
		super(notifier, false);
		
		features = new HashSet<EStructuralFeature>();
		features.add(SchoolPackage.eINSTANCE.getCourse_Subject());

		//the listener asserts the notifications after a new course has been added
		featureListener = new FeatureListener() {

			@Override
			public void featureInserted(EObject host, EStructuralFeature feature, Object value) {
				assertTrue(
						host.equals(newCourse) && 
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Subject()) && 
						((String)value).equals(newCourseSubject));
			}

			@Override
			public void featureDeleted(EObject host, EStructuralFeature feature, Object value) {
				assertTrue(
						host.equals(newCourse) && 
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Subject()) && 
						((String)value).equals(newCourseSubject));				
			}
		};
	}

	@Override
	public void registerListener() {
		navigationHelper.registerEStructuralFeatures(features);
		navigationHelper.registerFeatureListener(features, featureListener);
	}

	@Override
	public void unregisterListener() {
		navigationHelper.unregisterFeatureListener(features, featureListener);
		navigationHelper.unregisterEStructuralFeatures(features);
	}
	
}
