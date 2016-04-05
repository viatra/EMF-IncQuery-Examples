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

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.viatra.query.testing.core.api.ViatraQueryTest
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
	
	val snapshot = "school.tests/model/tests.snapshot"
	
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueries(){
		SimpleSchoolQueries.instance.specifications.forEach[
			ViatraQueryTest.test(it as IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>)
				.with(snapshot).with(new ReteBackendFactory).assumeInputs.assertEquals
		]
	}
			
	// simple test cases, for each query of the school example
	
	@Test def testSchools() { ViatraQueryTest.test("school.schools").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTeachers() { ViatraQueryTest.test("school.teachers").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTeachersOfSchool() { ViatraQueryTest.test("school.teachersOfSchool").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testCoursesOfTeacher() { ViatraQueryTest.test("school.coursesOfTeacher").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testClassesOfTeacher() { ViatraQueryTest.test("school.classesOfTeacher").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTeacherWithoutClass() { ViatraQueryTest.test("school.teacherWithoutClass").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testStudentOfSchool() { ViatraQueryTest.test("school.studentOfSchool").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testCourseWithWeightThirty() { ViatraQueryTest.test("school.courseWithWeightThirty").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testCourseWithNameLongerThanWeight() { ViatraQueryTest.test("school.courseWithNameLongerThanWeight").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testCourseWithPrimeWeight() { ViatraQueryTest.test("school.courseWithPrimeWeight").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTeachesMoreClasses() { ViatraQueryTest.test("school.teachesMoreClasses").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTeachesTheMostCourses() { ViatraQueryTest.test("school.teachesTheMostCourses").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testFriendlyTo() { ViatraQueryTest.test("school.friendlyTo").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testInTheCircleOfFriends() { ViatraQueryTest.test("school.inTheCircleOfFriends").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testMoreFriendsThan() { ViatraQueryTest.test("school.moreFriendsThan").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testTheOnesWithTheBiggestCircle() { ViatraQueryTest.test("school.theOnesWithTheBiggestCircle").with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def testFinalPattern() { ViatraQueryTest.test("school.finalPattern").with(snapshot).with(new ReteBackendFactory).assertEquals }	
	
	@Test def mfTestSchools() { ViatraQueryTest.test(SchoolsQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTeachers() { ViatraQueryTest.test(TeachersQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTeachersOfSchool() { ViatraQueryTest.test(TeachersOfSchoolQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestCoursesOfTeacher() { ViatraQueryTest.test(CoursesOfTeacherQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestClassesOfTeacher() { ViatraQueryTest.test(ClassesOfTeacherQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTeacherWithoutClass() { ViatraQueryTest.test(TeacherWithoutClassQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestStudentOfSchool() { ViatraQueryTest.test(StudentOfSchoolQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestCourseWithWeightThirty() { ViatraQueryTest.test(CourseWithWeightThirtyQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestCourseWithNameLongerThanWeight() { ViatraQueryTest.test(CourseWithNameLongerThanWeightQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestCourseWithPrimeWeight() { ViatraQueryTest.test(CourseWithPrimeWeightQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTeachesMoreClasses() { ViatraQueryTest.test(TeachesMoreClassesQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTeachesTheMostCourses() { ViatraQueryTest.test(TeachesTheMostCoursesQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestFriendlyTo() { ViatraQueryTest.test(FriendlyToQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestInTheCircleOfFriends() { ViatraQueryTest.test(InTheCircleOfFriendsQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestMoreFriendsThan() { ViatraQueryTest.test(MoreFriendsThanQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestTheOnesWithTheBiggestCircle() { ViatraQueryTest.test(TheOnesWithTheBiggestCircleQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }
	@Test def mfTestFinalPattern() { ViatraQueryTest.test(FinalPatternQuerySpecification::instance).with(snapshot).with(new ReteBackendFactory).assertEquals }	
	
}