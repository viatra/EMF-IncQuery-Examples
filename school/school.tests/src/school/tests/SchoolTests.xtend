/*******************************************************************************
 * Copyright (c) 2010-2012, Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Abel Hegedus - initial API and implementation
 *   Istvan Rath - extensions, first real test set
 *******************************************************************************/

package school.tests

import com.google.inject.Inject
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.emf.incquery.testing.core.SnapshotHelper
import org.eclipse.viatra2.emf.incquery.testing.core.TestExecutor
import org.eclipse.viatra2.emf.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipse.viatra2.emf.incquery.snapshot.EIQSnapshot.IncQuerySnapshot
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner

/**
 * Basic test set for testing IncQuery with the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class SchoolTests {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
	
	//@Inject	ParseHelper parseHelper
	
	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInputXMI() { // Creates new resource set
		return "school.incquery/queries/globalEiqModel.xmi".loadPatternModelFromUri as PatternModel
	}
	
	def queryInputEIQ() { // Creates new resource set
		return "school.incquery/src/school/schoolqueries.eiq".loadPatternModelFromUri as PatternModel
	}
		
	def snapshot() { // Creates new resource set
		return "school.tests/model/tests.eiqsnapshot".loadExpectedResultsFromUri as IncQuerySnapshot
	}

		
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesXMI(){
		assertMatchResults(queryInputXMI, snapshot)
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesEIQ(){
		assertMatchResults(queryInputEIQ, snapshot)
	}
	
	
	def testQuery(String queryFQN){
		val sns = snapshot
		val matcher = queryInputXMI.initializeMatcherFromModel(sns.EMFRootForSnapshot, queryFQN)
		val results = matcher.compareResultSets(sns.getMatchSetRecordForPattern(queryFQN))
		assertArrayEquals(newHashSet,results)
	}
	
	def testModelModification(String queryFQN){
		val sns = snapshot
		val pm = queryInputEIQ
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// TODO
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("snapshot/for/modified/results")
		pm.assertMatchResults(newSns)
		
	}
	
	// simple test cases, for each query of the school example
	
	@Test def testSchools() { testQuery("school.schools") }
	@Test def testTeachers() { testQuery("school.teachers") }
	@Test def testTeachersOfSchool() { testQuery("school.teachersOfSchool") }
	@Test def testCoursesOfTeacher() { testQuery("school.coursesOfTeacher") }
	@Test def testClassesOfTeacher() { testQuery("school.classesOfTeacher") }
	@Test def testTeacherWithoutClass() { testQuery("school.teacherWithoutClass") }
	@Test def testStudentOfSchool() { testQuery("school.studentOfSchool") }
	@Test def testCourseWithWeightThirty() { testQuery("school.courseWithWeightThirty") }
	@Test def testCourseWithNameLongerThanWeight() { testQuery("school.courseWithNameLongerThanWeight") }
	@Test def testCourseWithPrimeWeight() { testQuery("school.courseWithPrimeWeight") }
	@Test def testTeachesMoreClasses() { testQuery("school.teachesMoreClasses") }
	@Test def testTeachesTheMostCourses() { testQuery("school.teachesTheMostCourses") }
	@Test def testFriendlyTo() { testQuery("school.friendlyTo") }
	@Test def testInTheCircleOfFriends() { testQuery("school.inTheCircleOfFriends") }
	@Test def testMoreFriendsThan() { testQuery("school.moreFriendsThan") }
	@Test def testTheOnesWithTheBiggestCircle() { testQuery("school.theOnesWithTheBiggestCircle") }
	@Test def testFinalPattern() { testQuery("school.finalPattern") }
	
	
	
	
	
	
	
	
	
	
}