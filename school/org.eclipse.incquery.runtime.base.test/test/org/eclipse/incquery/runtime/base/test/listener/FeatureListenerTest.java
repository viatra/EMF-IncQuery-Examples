package org.eclipse.incquery.runtime.base.test.listener;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.base.api.FeatureListener;

import school.SchoolPackage;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * {@link FeatureListener} based test of EMF-IncQuery Base.
 * 
 * @author Tamas Szabo
 *
 */
public class FeatureListenerTest extends IncQueryBaseListenerTest {

	private Set<EStructuralFeature> features;
	private FeatureListener featureListener;
	
	private Multiset<EStructuralFeature> receivedInsert = HashMultiset.create();
	private Multiset<EStructuralFeature> receivedDelete = HashMultiset.create();
	
	public FeatureListenerTest(Notifier notifier) {
		super(notifier, false);
		
		features = new HashSet<EStructuralFeature>();
		features.add(SchoolPackage.eINSTANCE.getCourse_Subject());
		features.add(SchoolPackage.eINSTANCE.getCourse_Weight());

		//the listener asserts the notifications after a new course has been added
		featureListener = new FeatureListener() {

			@Override
			public void featureInserted(EObject host, EStructuralFeature feature, Object value) {
				receivedInsert.add(feature);
				assertTrue(host.equals(newCourse));
				assertTrue(
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Subject()) && 
						value.equals(newCourseSubject) ||
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Weight()) && 
						value.equals(preExistingCourseWeight));
			}

			@Override
			public void featureDeleted(EObject host, EStructuralFeature feature, Object value) {
				receivedDelete.add(feature);
				assertTrue(host.equals(newCourse));
				assertTrue(
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Subject()) && 
						value.equals(newCourseSubject) ||
						feature.equals(SchoolPackage.eINSTANCE.getCourse_Weight()) && 
						value.equals(preExistingCourseWeight));
			}
		};
	}

	@Override
	public void registerListener() {
		navigationHelper.registerEStructuralFeatures(features);
		navigationHelper.addFeatureListener(features, featureListener);
	}

	@Override
	public void unregisterListener() {
		navigationHelper.removeFeatureListener(features, featureListener);
		navigationHelper.unregisterEStructuralFeatures(features);
		
		assertTrue(2 == receivedInsert.size());
		assertTrue(1 == receivedInsert.count(SchoolPackage.eINSTANCE.getCourse_Subject()));
		assertTrue(1 == receivedInsert.count(SchoolPackage.eINSTANCE.getCourse_Weight()));
		assertTrue(receivedInsert.equals(receivedDelete));
	}
	
}
