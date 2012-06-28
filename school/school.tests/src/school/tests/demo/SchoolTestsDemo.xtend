/*******************************************************************************
 * Copyright (c) 2010-2012, Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Abel Hegedus - initial API and implementation
 *******************************************************************************/

package school.tests.demo

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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class SchoolTestsDemo {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
	
	@Inject
	ParseHelper parseHelper
	
	def coursesInput() {
		parseHelper.parse('
			package school

			import "http://school.ecore"
			
			pattern teachers(T) = {
			 	Teacher(T);
			}

			pattern coursesOfTeacher(T:Teacher, C:Course) = {
			  Teacher.courses(T,C);
 			} 
			 
			pattern classesOfTeacher(T:Teacher, SC:SchoolClass) = {
		 	  find coursesOfTeacher(T,C);
		 	  Course.schoolClass(C,SC);
            }
		') as PatternModel
	}	
	// parse pattern from text, load expected from URI, assertMatchResults, CORRECT 
	@Test
	def simpleCorrectTest(){
		val patternModel = parseHelper.parse('
			package school

			import "http://school.ecore"

			pattern teachers(T) = {
			 	Teacher(T);
			 }
		') as PatternModel
		patternModel.assertMatchResults("school.tests/model/demo/correct.eiqsnapshot")
	}
	
	// parse pattern from text, load expected from URI, assertMatchResults with partial match, CORRECT
	@Test
	def simpleFilteredTest(){
		val patternModel = coursesInput
		patternModel.assertMatchResults("school.tests/model/demo/correct.eiqsnapshot")
	}
	// parse pattern from text, load expected from URI, assertMatchResults, FAIL
	// reason of failure: snapshot contents is not consistent with actual model
	// in this case: unexpected matches
	@Test
	def simpleFailedTest(){
		val patternModel = coursesInput
		patternModel.assertMatchResults("school.tests/model/demo/faulty.eiqsnapshot")
	}
	
	// parse pattern from text, load expected from URI, assertMatchResults, error
	// error should be an exception (parser exception)
	@Test
	def simpleErrorTest(){
		val patternModel = parseHelper.parse('
			package school

			import "http://school.ecore"

			pattern coursesOfTeacher(T:Teacher, C:Course) = {
			  Teacher.courses(T,C);
 			} 
			 
			pattern classesOfTeacher(T:Teacher, SC:SchoolClass) = {
		 	  find coursesOfTeacher(T,C);
		 	  ExceptionCourse.schoolClass(C,SC);
            }
		') as PatternModel
		patternModel.assertMatchResults("school.tests/model/demo/correct.eiqsnapshot")
	}
	
	// parse pattern from text, load expected from URI, assertMatchResults, exception
	@Test(expected=typeof(NullPointerException))
	def simpleExceptionTest(){
		val patternModel = parseHelper.parse('
			package school

			import "http://school.ecore"

			pattern coursesOfTeacher(T:Teacher, C:Course) = {
			  Teacher.courses(T,C);
 			} 
			 
			pattern classesOfTeacher(T:Teacher, SC:SchoolClass) = {
		 	  find coursesOfTeacher(T,C);
		 	  ExceptionCourse.schoolClass(C,SC);
            }
		') as PatternModel
		patternModel.assertMatchResults("school.tests/model/demo/correct.eiqsnapshot")
	}
	
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def simpleXMIUriTest(){
		assertMatchResults("school.incquery/queries/globalEiqModel.xmi", "school.tests/model/demo/correct.eiqsnapshot")
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test
	def simpleEIQURITest(){
		assertMatchResults("school.incquery/src/school/schoolqueries.eiq", "school.tests/model/demo/correct.eiqsnapshot")
	}
	
	// parse pattern from text, load expected from URI, call compare methods, CORRECT
	@Test
	def buildYourOwnTest(){
		val patternModel = coursesInput
		val snapshot = "school.tests/model/demo/correct.eiqsnapshot".loadExpectedResultsFromUri
		val expected = snapshot.getMatchSetRecordForPattern("school.teachers")
		val matcher = patternModel.initializeMatcherFromModel(snapshot.EMFRootForSnapshot, "school.teachers")
		val results = matcher.compareResultSets(expected)
		assertArrayEquals(newHashSet,results)
	}
	
	// parse pattern from text, load expected from URI, call compare methods, FAIL
	// see simpleFailedTest for details
	@Test
	def buildYourOwnFailedTest(){
		val patternModel = coursesInput
		val matcher = patternModel.initializeMatcherFromModel(patternModel, "school.classesOfTeacher")
		val expected = "school.tests/model/demo/faulty.eiqsnapshot".loadExpectedResultsFromUri.getMatchSetRecordForPattern("school.classesOfTeacher")
		val results = matcher.compareResultSets(expected)
		assertArrayEquals(newHashSet,results)
	}
	
	// use queries to compare expected match set with actual one
	@Test
	def compareAsRecordsTest(){
		val patternModel = coursesInput
		val snapshot = "school.tests/model/demo/correct.eiqsnapshot".loadExpectedResultsFromUri
		val expected = snapshot.getMatchSetRecordsForPattern("school.classesOfTeacher")
		val matcher = patternModel.initializeMatcherFromModel(snapshot.EMFRootForSnapshot, "school.classesOfTeacher")
		expected.forEach()[
			val results = matcher.compareResultSetsAsRecords(it)
			assertArrayEquals(newHashSet,results)
		]
	}
}