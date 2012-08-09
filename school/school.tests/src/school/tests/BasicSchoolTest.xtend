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
import org.eclipse.viatra2.emf.incquery.testing.core.TestExecutor
import org.eclipse.viatra2.emf.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.junit.Ignore
import school.schools.SchoolsMatcherFactory
import school.teachers.TeachersMatcherFactory
import school.teachersofschool.TeachersOfSchoolMatcherFactory
import school.coursesofteacher.CoursesOfTeacherMatcherFactory
import school.classesofteacher.ClassesOfTeacherMatcherFactory
import school.teacherwithoutclass.TeacherWithoutClassMatcherFactory
import school.studentofschool.StudentOfSchoolMatcherFactory
import school.coursewithweightthirty.CourseWithWeightThirtyMatcherFactory
import school.coursewithnamelongerthanweight.CourseWithNameLongerThanWeightMatcherFactory
import school.coursewithprimeweight.CourseWithPrimeWeightMatcherFactory
import school.teachesmoreclasses.TeachesMoreClassesMatcherFactory
import school.teachesthemostcourses.TeachesTheMostCoursesMatcherFactory
import school.friendlyto.FriendlyToMatcherFactory
import school.inthecircleoffriends.InTheCircleOfFriendsMatcherFactory
import school.morefriendsthan.MoreFriendsThanMatcherFactory
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatcherFactory
import school.finalpattern.FinalPatternMatcherFactory

/**
 * Basic test set for testing IncQuery with the school example.
 * These tests just perform a simple match set check against all the queries in the School example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class BasicSchoolTest extends SchoolTestsBase {
	
	@Inject extension TestExecutor
	
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesXMI(){
		assertMatchResults(queryInputXMI, snapshot)
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test@Ignore("Not working on the build as eiq files are not packaged into jar.")
	def testAllQueriesEIQ(){
		assertMatchResults(queryInputEIQ, snapshot)
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
	
	@Test def mfTestSchools() { testQuery(SchoolsMatcherFactory::instance) }
	@Test def mfTestTeachers() { testQuery(TeachersMatcherFactory::instance) }
	@Test def mfTestTeachersOfSchool() { testQuery(TeachersOfSchoolMatcherFactory::instance) }
	@Test def mfTestCoursesOfTeacher() { testQuery(CoursesOfTeacherMatcherFactory::instance) }
	@Test def mfTestClassesOfTeacher() { testQuery(ClassesOfTeacherMatcherFactory::instance) }
	@Test def mfTestTeacherWithoutClass() { testQuery(TeacherWithoutClassMatcherFactory::instance) }
	@Test def mfTestStudentOfSchool() { testQuery(StudentOfSchoolMatcherFactory::instance) }
	@Test def mfTestCourseWithWeightThirty() { testQuery(CourseWithWeightThirtyMatcherFactory::instance) }
	@Test def mfTestCourseWithNameLongerThanWeight() { testQuery(CourseWithNameLongerThanWeightMatcherFactory::instance) }
	@Test def mfTestCourseWithPrimeWeight() { testQuery(CourseWithPrimeWeightMatcherFactory::instance) }
	@Test def mfTestTeachesMoreClasses() { testQuery(TeachesMoreClassesMatcherFactory::instance) }
	@Test def mfTestTeachesTheMostCourses() { testQuery(TeachesTheMostCoursesMatcherFactory::instance) }
	@Test def mfTestFriendlyTo() { testQuery(FriendlyToMatcherFactory::instance) }
	@Test def mfTestInTheCircleOfFriends() { testQuery(InTheCircleOfFriendsMatcherFactory::instance) }
	@Test def mfTestMoreFriendsThan() { testQuery(MoreFriendsThanMatcherFactory::instance) }
	@Test def mfTestTheOnesWithTheBiggestCircle() { testQuery(TheOnesWithTheBiggestCircleMatcherFactory::instance) }
	@Test def mfTestFinalPattern() { testQuery(FinalPatternMatcherFactory::instance) }	
	
}