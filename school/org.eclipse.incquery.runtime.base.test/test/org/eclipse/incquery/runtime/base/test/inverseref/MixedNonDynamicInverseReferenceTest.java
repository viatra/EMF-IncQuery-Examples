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

package org.eclipse.incquery.runtime.base.test.inverseref;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.base.exception.IncQueryBaseException;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseDynamicParameterizedTest;
import org.junit.Before;
import org.junit.Test;

import school.SchoolPackage;

/**
 * Mix of {@link InverseReferenceTest} and {@link DynamicInverseReferenceTest}. 
 * Uses compiled queries on dynamic model, NOT in dynamic mode.
 * 
 * @author Bergmann Gabor
 *
 */
public class MixedNonDynamicInverseReferenceTest extends IncQueryBaseDynamicParameterizedTest {

	public MixedNonDynamicInverseReferenceTest(Notifier notifier) {
		super(notifier, true, false);
	}

	private EObject year2012;
	@SuppressWarnings("unused")
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
		expectLogMessage("EMF-IncQuery encountered an error in processing the EMF model. This happened while trying to process new metamodel elements.");
		Collection<EObject> result = navigationHelper.getInverseReferences(year2012, SchoolPackage.eINSTANCE.getSchool_Years());
		assertEquals(0, result.size()); // because different EPackage instance
	}
	
//	/**
//	 * Inverse reference resolving based on a student and a {@link Collection} of {@link EReference}s
//	 */
//	@Test
//	public void valueAndReferencesTest() {
//		List<EReference> references = new ArrayList<EReference>();
//		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getStudent_FriendsWith());
//		references.add(SchoolFactory.eINSTANCE.getSchoolPackage().getSchoolClass_Students());
//		
//		Collection<Setting> result = navigationHelper.getInverseReferences(student, references);
//		assertEquals(0, result.size()); // because different EPackage instance
//		
//		for (Setting setting : result) {
//			assertEquals(student, setting.get(false));
//		}
//	}
}
