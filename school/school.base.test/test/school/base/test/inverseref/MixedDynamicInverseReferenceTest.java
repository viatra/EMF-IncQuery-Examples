/*******************************************************************************
 * Copyright (c) 2004-2013 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package school.base.test.inverseref;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.viatra.query.runtime.base.exception.IncQueryBaseException;
import org.junit.Before;
import org.junit.Test;

import school.SchoolFactory;
import school.SchoolPackage;
import school.base.test.SchoolBaseDynamicParameterizedTest;

/**
 * Mix of {@link InverseReferenceTest} and {@link DynamicInverseReferenceTest}. 
 * Uses compiled queries on dynamic model, in dynamic mode.
 * 
 * @author Bergmann Gabor
 *
 */
public class MixedDynamicInverseReferenceTest extends SchoolBaseDynamicParameterizedTest {

	public MixedDynamicInverseReferenceTest(Notifier notifier) {
		super(notifier, true, true);
	}

	private EObject year2012;
	private EObject student;
		
	@Override
	@Before
	public void init() throws IncQueryBaseException {
		super.init();
		year2012 =  navigationHelper.findByAttributeValue(2012).iterator().next().getEObject();
		student = navigationHelper.findByAttributeValue("Abel Hegedus").iterator().next().getEObject();
	}
	
	/**
	 * Inverse reference resolving based on a school year and a given {@link EReference} instance
	 */
	@Test
	public void valueAndReferenceTest() {		
		Collection<EObject> result = navigationHelper.getInverseReferences(year2012, SchoolPackage.eINSTANCE.getSchool_Years());
		assertEquals(1, result.size());
	}
	
	/**
	 * Inverse reference resolving based on a student and a {@link Collection} of {@link EReference}s
	 */
	@Test
	public void valueAndReferencesTest() {
		List<EReference> references = new ArrayList<EReference>();
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
		
		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
		assertEquals(3, result.size());
		
		for (Setting setting : result) {
			assertEquals(student, setting.get(false));
		}
	}
}
