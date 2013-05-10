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

package org.eclipse.incquery.runtime.base.test.containment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.incquery.runtime.base.api.FeatureListener;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Assert;
import org.junit.Test;

import school.School;
import school.SchoolClass;
import school.SchoolFactory;
import school.SchoolPackage;
import school.Year;

/**
 * @author Bergmann Gabor
 *
 */
public class ContainmentManglingTest extends IncQueryBaseTest {

	private static final int YEAR_DATE = 2013;
	private static final char CLASS_CODE = 'X';
	private static final EClass YEAR = SchoolPackage.eINSTANCE.getYear();
	private static final EReference YEAR_SCHOOLCLASSES = SchoolPackage.eINSTANCE.getYear_SchoolClasses();
	private static final EReference SCHOOL_YEARS = SchoolPackage.eINSTANCE.getSchool_Years();
	
	/**
	 * @param notifier
	 */
	public ContainmentManglingTest() {
		super(ResourceAccess.getResourceOfFirstSchool(), true);
	}
	
	private Set<EStructuralFeature> listenerFeatures;
	private FeatureListener featureListener;
	
 	@SuppressWarnings("serial")
	public void registerListener() {
 		initListener();
		if (!navigationHelper.isInWildcardMode()) 
			navigationHelper.registerEStructuralFeatures(listenerFeatures);
		navigationHelper.addFeatureListener(listenerFeatures, featureListener);
	}

	private void initListener() {
		listenerFeatures = new HashSet<EStructuralFeature>(){{
 			add(SCHOOL_YEARS);
 			add(YEAR_SCHOOLCLASSES);
 		}};
 		featureListener = new FeatureListener() {
 			private int classDeletions = 0;
 			private int yearInsertions = 0;
 			private int classInsertions = 0;
			
			@Override
			public void featureInserted(EObject host, EStructuralFeature feature,
					Object value) {
				if (SCHOOL_YEARS.equals(feature)) {
					assertTrue(value instanceof Year);
					assertTrue(((Year)value).getStartingDate() == YEAR_DATE);
					assertEquals(1, ++yearInsertions);
				} else {
					assertTrue(YEAR_SCHOOLCLASSES.equals(feature));
					assertTrue(value instanceof SchoolClass);
					assertTrue(((SchoolClass)value).getCode() == CLASS_CODE);
					assertTrue(host instanceof Year);
					assertTrue(((Year)host).getStartingDate() == YEAR_DATE);
					assertEquals(1, ++classInsertions);
				}
			}
			
			@Override
			public void featureDeleted(EObject host, EStructuralFeature feature,
					Object value) {
				assertTrue(YEAR_SCHOOLCLASSES.equals(feature));
				assertTrue(value instanceof SchoolClass);
				assertTrue(((SchoolClass)value).getCode() == CLASS_CODE);
				assertTrue(host instanceof Year);
				assertTrue(((Year)host).getStartingDate() == YEAR_DATE);
				assertEquals(1, ++classDeletions);
			}
		};
	}

 	public void unregisterListener() {
		navigationHelper.removeFeatureListener(listenerFeatures, featureListener);
		if (!navigationHelper.isInWildcardMode()) 
			navigationHelper.unregisterEStructuralFeatures(listenerFeatures);
	}

	
	@Test
	public void containmentRootReplacer() {
		final Command command = new RecordingCommand(ResourceAccess.getTransactionalEditingDomain()) {
			@Override
			protected void doExecute() {
				try {
					final Resource resource = ResourceAccess.getResourceOfFirstSchool();
					final EList<EObject> toplevel = resource.getContents();
					
					assertEquals(1, toplevel.size());
					assertEquals(2, countYears());
					final EObject root = toplevel.get(0);
					assertTrue(root instanceof School);
					School school = ((School)root);
					
					toplevel.clear();
					assertEquals(0, toplevel.size());
					assertEquals(0, countYears());
				
					final Year tempRootYear = SchoolFactory.eINSTANCE.createYear();
					tempRootYear.setStartingDate(YEAR_DATE);
					final SchoolClass fakeSchoolClass = SchoolFactory.eINSTANCE.createSchoolClass();
					fakeSchoolClass.setCode(CLASS_CODE);
					tempRootYear.getSchoolClasses().add(fakeSchoolClass);
					toplevel.add(tempRootYear);
					assertEquals(1, toplevel.size());
					assertEquals(1, countYears());
	
					toplevel.add(school);
					assertEquals(2, toplevel.size());
					assertEquals(3, countYears());
	
					registerListener();
					try {
						school.getYears().add(tempRootYear);
						assertEquals(1, toplevel.size());
						assertEquals(3, countYears());
					} finally {
						unregisterListener();
					}
					
				} catch (RuntimeException ex) {
					Assert.fail("Exception: " + ex.getMessage());
					throw ex;
				}
			}
		};
		try {
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().execute(command);
		}
		finally {
			ResourceAccess.getTransactionalEditingDomain().getCommandStack().undo();
		}
		
	}

	private int countYears() {
		return navigationHelper.getAllInstances(YEAR).size();
	}

}
