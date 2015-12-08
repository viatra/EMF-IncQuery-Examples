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

import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.eclipse.incquery.runtime.api.IncQueryMatcher
import org.eclipse.incquery.runtime.rete.matcher.ReteEngine
import org.eclipse.incquery.testing.core.api.EIQTest
import org.junit.Test
import school.SimpleSchoolQueries
import school.util.ClassesOfTeacherQuerySpecification
import school.util.CourseWithNameLongerThanWeightQuerySpecification
import school.util.CourseWithPrimeWeightQuerySpecification
import school.util.CourseWithWeightThirtyQuerySpecification
import school.util.CoursesOfTeacherQuerySpecification
import school.util.FinalPatternQuerySpecification
import school.util.FriendlyToQuerySpecification
import school.util.InTheCircleOfFriendsQuerySpecification
import school.util.MoreFriendsThanQuerySpecification
import school.util.SchoolsQuerySpecification
import school.util.StudentOfSchoolQuerySpecification
import school.util.TeacherWithoutClassQuerySpecification
import school.util.TeachersOfSchoolQuerySpecification
import school.util.TeachersQuerySpecification
import school.util.TeachesMoreClassesQuerySpecification
import school.util.TeachesTheMostCoursesQuerySpecification
import school.util.TheOnesWithTheBiggestCircleQuerySpecification

/**
 * Basic test set for testing IncQuery with the school example.
 * These tests just perform a simple match set check against all the queries in the School example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */
class BasicSchoolTest{
	
	val snapshot = "school.tests/model/tests.eiqsnapshot"
	
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueries(){
		SimpleSchoolQueries.instance.specifications.forEach[
			EIQTest.test(it as IQuerySpecification<IncQueryMatcher<IPatternMatch>>)
				.with(snapshot).with(ReteEngine).assertEquals
		]
	}
			
	// simple test cases, for each query of the school example
	 
	@Test def testSchools() { EIQTest.test("school.schools").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTeachers() { EIQTest.test("school.teachers").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTeachersOfSchool() { EIQTest.test("school.teachersOfSchool").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testCoursesOfTeacher() { EIQTest.test("school.coursesOfTeacher").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testClassesOfTeacher() { EIQTest.test("school.classesOfTeacher").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTeacherWithoutClass() { EIQTest.test("school.teacherWithoutClass").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testStudentOfSchool() { EIQTest.test("school.studentOfSchool").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testCourseWithWeightThirty() { EIQTest.test("school.courseWithWeightThirty").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testCourseWithNameLongerThanWeight() { EIQTest.test("school.courseWithNameLongerThanWeight").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testCourseWithPrimeWeight() { EIQTest.test("school.courseWithPrimeWeight").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTeachesMoreClasses() { EIQTest.test("school.teachesMoreClasses").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTeachesTheMostCourses() { EIQTest.test("school.teachesTheMostCourses").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testFriendlyTo() { EIQTest.test("school.friendlyTo").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testInTheCircleOfFriends() { EIQTest.test("school.inTheCircleOfFriends").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testMoreFriendsThan() { EIQTest.test("school.moreFriendsThan").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testTheOnesWithTheBiggestCircle() { EIQTest.test("school.theOnesWithTheBiggestCircle").with(snapshot).with(ReteEngine).assertEquals }
	@Test def testFinalPattern() { EIQTest.test("school.finalPattern").with(snapshot).with(ReteEngine).assertEquals }	
	
	@Test def mfTestSchools() { EIQTest.test(SchoolsQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTeachers() { EIQTest.test(TeachersQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTeachersOfSchool() { EIQTest.test(TeachersOfSchoolQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestCoursesOfTeacher() { EIQTest.test(CoursesOfTeacherQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestClassesOfTeacher() { EIQTest.test(ClassesOfTeacherQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTeacherWithoutClass() { EIQTest.test(TeacherWithoutClassQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestStudentOfSchool() { EIQTest.test(StudentOfSchoolQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestCourseWithWeightThirty() { EIQTest.test(CourseWithWeightThirtyQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestCourseWithNameLongerThanWeight() { EIQTest.test(CourseWithNameLongerThanWeightQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestCourseWithPrimeWeight() { EIQTest.test(CourseWithPrimeWeightQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTeachesMoreClasses() { EIQTest.test(TeachesMoreClassesQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTeachesTheMostCourses() { EIQTest.test(TeachesTheMostCoursesQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestFriendlyTo() { EIQTest.test(FriendlyToQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestInTheCircleOfFriends() { EIQTest.test(InTheCircleOfFriendsQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestMoreFriendsThan() { EIQTest.test(MoreFriendsThanQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestTheOnesWithTheBiggestCircle() { EIQTest.test(TheOnesWithTheBiggestCircleQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }
	@Test def mfTestFinalPattern() { EIQTest.test(FinalPatternQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals }	
	
	@Test
	def wildcardTestFinalPattern(){
    	EIQTest.test(FinalPatternQuerySpecification::instance).with(snapshot).with(ReteEngine).assertEquals
	}
	
}