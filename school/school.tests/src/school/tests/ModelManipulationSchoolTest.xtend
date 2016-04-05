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
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.testing.core.ModelLoadHelper
import org.eclipse.viatra.query.testing.core.SnapshotHelper
import org.eclipse.viatra.query.testing.core.TestExecutor
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.viatra.query.testing.core.ModelLoadHelper
import org.eclipse.viatra.query.testing.core.SnapshotHelper
import org.eclipse.viatra.query.testing.core.TestExecutor
import org.eclipse.viatra.query.testing.core.api.ViatraQueryTest
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import school.Course
import school.RecursiveQueries
import school.School
import school.SchoolClass
import school.SchoolFactory
import school.SchoolValidationRules
import school.SimpleSchoolQueries
import school.Student
import school.Teacher
import school.UnnamedVariables
import school.Year
import school.util.TeachersOfSchoolQuerySpecification
import school.util.TeachersQuerySpecification
import school.util.SchoolsNamesQuerySpecification
import school.util.TeachersNamesQuerySpecification
import org.eclipse.emf.ecore.util.EcoreUtil
import school.util.CoursesOfTeacherNamesQuerySpecification

/**
 * Basic test set for testing IncQuery with the school example.
 * These are model manipulation tests where
 *  * first, the basic match set testing is performed
 *  * then, the instance model is manipulated programmatically
 *  * finally, a match set test against the modified model (and a specially prepared snapshot) is performed
 * 
 * @author Istvan Rath
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class ModelManipulationSchoolTest extends SchoolTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
	
	val snapshotpath = "school.tests/model/tests.eiqsnapshot"
  
	@Test
	def void testModelModification(){
		ViatraQueryTest.test(TeachersOfSchoolQuerySpecification.instance).and(TeachersQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
			modify(School, [true], [
				// MODEL MODIFICATION HERE
				// add a new Teacher "New Teacher" to the first (only) School in the model
				val t = SchoolFactory::eINSTANCE.createTeacher
				t.setName("New Teacher")
				t.setSchool(it)
			]).
		with("school.tests/model/tests_manipulated.eiqsnapshot").assertEquals		
	}
	
	@Test
	def void changeSchoolName(){
		ViatraQueryTest.test(SchoolsNamesQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
			modify(School, [name == "Budapest University of Technology and Economics"], [
				// MODEL MODIFICATION HERE
				// change the School "Budapest University of Technology and Economics" name to "BME"
				it.name = "BME"
			]).
		with("school.tests/model/tests_changeSchoolName.eiqsnapshot").assertEquals		
	}
	
	
	@Test
	def	void changeNameModelModification(){
		ViatraQueryTest.test(TeachersNamesQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
			modify(Teacher, [name == "Andras Pataricza"], [
				// MODEL MODIFICATION HERE
				// change the Teacher "Andras Pataricza" name to "Dr. Andras Pataricza"
				it.name = "Dr. Andras Pataricza"
			]).
		with("school.tests/model/tests_changeName.eiqsnapshot").assertEquals			
	}
	
	@Test
	def	deleteTeacher(){
		ViatraQueryTest.test(TeachersNamesQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
		modify(Teacher, [name == "Istvan Majzik"], [
			// MODEL MODIFICATION HERE
			// delete the Teacher "Istvan Majzik"
			EcoreUtil::delete(it)
		]).with("school.tests/model/tests_deleteTeacher.eiqsnapshot").assertEquals		
	}	
	
	@Test
	def	deleteCourse(){
		ViatraQueryTest.test(CoursesOfTeacherNamesQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
		modify(Course, [subject == "Prolog programming"], [
			// MODEL MODIFICATION HERE
			// delete the Course "Prolog programming"
			EcoreUtil::delete(it)
		]).with("school.tests/model/tests_deleteCourse.eiqsnapshot").assertEquals	
	}
	
	
	@Test
	def	createCourse(){
		ViatraQueryTest.test(CoursesOfTeacherNamesQuerySpecification.instance).
		with(new ReteBackendFactory).with(snapshotpath).assumeInputs.assertEqualsThen.
		modify(Teacher, [name == "Daniel Varro"], [
			// MODEL MODIFICATION HERE
			// add a new Course "System Integration" to Teacher "Daniel Varro"
			val c = SchoolFactory::eINSTANCE.createCourse
			c.setSchool(it.school)
			c.setSubject("System Integration")	
			c.setWeight(30)		
			c.setTeacher(it)
		]).with("school.tests/model/tests_createCourse.eiqsnapshot").assertEquals			
	}
	
	@Test
	def	changeCourseTeacher(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change a Teacher "Istvan Majzik" course to Course "Formal methods"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {			
			val courses = s.courses
			for(Course c : courses){
				if(c.subject == "Formal methods"){
					val teachers = s.teachers
					for(Teacher t : teachers){
						if(t.name == "Istvan Majzik"){				
							c.setTeacher(t)		
						}
					}				
				}					
			}					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_changeCourseTeacher.eiqsnapshot")
			pm.assertMatchResults(newSns)						
		}
												
	}
	
	
	@Test
	def	changeCourseClass(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// set the Course "Formal method" class to Class "A"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		val matcher2 = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfSchool")
		val schoolClasses = matcher2.allMatches
		Assert::assertNotNull(s)
		if (s!=null) {			
			val courses = s.courses
			for(Course c : courses){
				if(c.subject == "Formal methods"){
					
					for(IPatternMatch g : schoolClasses){
						val schoolClass = g.get("SC") as SchoolClass			
						Assert::assertNotNull(schoolClass)
						if(schoolClass!=null){	
							if(schoolClass.code == 'A'.charAt(0)){
								c.setSchoolClass(schoolClass)							
							}
						}
					}				
				}					
			}					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_changeCourseClass.eiqsnapshot")
			pm.assertMatchResults(newSns)						
		}
												
	}
	
	@Test
	def createStudent(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new Student "New Student" to the SchoolClass "C"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {					
			val years = s.years
			for(Year y : years){
				if(y.startingDate == 2012){
					val classes = y.schoolClasses
					for(SchoolClass c : classes){						
						if(c.code == 'C'.charAt(0)){
							//c.setCode(string.charAt(0))
							val student = SchoolFactory::eINSTANCE.createStudent						
							student.setSchoolClass(c)	
							student.setName("New Student")															
						}
					}
				}
			}							
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createStudent.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
	}
	
	@Test
	def createStudentWithFriend(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new Student "David Nagy" to Year "2011", SchoolClass "A" with a friend Student "Istvan Rath"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {					
			val years = s.years
			for(Year y : years){
				if(y.startingDate == 2011){
					val classes = y.schoolClasses
					for(SchoolClass c : classes){						
						if(c.code == 'A'.charAt(0)){
							val student = SchoolFactory::eINSTANCE.createStudent						
							student.setSchoolClass(c)	
							
							val matcher2 = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.studentOfSchool")
							val students = matcher2.allMatches
							Assert::assertNotNull(students)
							if(students != null){
								for(IPatternMatch g :students){
									val friend = g.get("S") as Student
									Assert::assertNotNull(friend)
									if(friend!=null){	
										if(friend.name == "Istvan Rath"){
											student.friendsWith.add(friend)	
										}

									}
									
								}
							}
							
							student.setName("David Nagy")
																					
						}
					}
				}
			}							
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createStudentWithFriend.eiqsnapshot")
			val newSns2 = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_biggestCircleName.eiqsnapshot")
			pm.assertMatchResults(newSns)
			pm.assertMatchResults(newSns2)
		}
	}
	
	
	@Test
	def	deleteYear(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete the Year "2012" from the model
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			
			val list = s.years	
			val i = list.iterator();
			while (i.hasNext()) {
			   val y = i.next();
			   if(y.startingDate == 2012){
			   	i.remove();			   	
			   }
			}			
						
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteYear.eiqsnapshot")
			pm.assertMatchResults(newSns)											
		}				
	}
	
	@Test
	def	deleteSchoolClass(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete the SchoolClass "C" from the model
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {					
			val years = s.years
			for(Year y : years){
				if(y.startingDate == 2012){
					val list = y.schoolClasses	
					val i = list.iterator();
					while (i.hasNext()) {
					   val c = i.next();
					   if(c.code == 'C'.charAt(0) || c.code == 'D'.charAt(0)){
					   	i.remove();			   	
					   }
					}																
				}	
			}
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteSchoolClass.eiqsnapshot")
			pm.assertMatchResults(newSns)				
		}
	}
	
	@Test
	def	createCourseWeight2(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new Course "System Integration" to Teacher "Daniel Varro"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {
			val teachers = s.teachers
			
			for(Teacher t : teachers)
			{					
				if(t.name == "Daniel Varro")
				{
					val c = SchoolFactory::eINSTANCE.createCourse
					c.setSchool(s)
					c.setSubject("NewCourse")	
					c.setWeight(2)		
					c.setTeacher(t)									
				}
			}			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createCourse_2.eiqsnapshot")
					pm.assertMatchResults(newSns)													
		}				
	}
	
	@Test
	def	createCourseWeight43(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new Course "System Integration" to Teacher "Daniel Varro"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {
			val teachers = s.teachers
			
			for(Teacher t : teachers)
			{					
				if(t.name == "Daniel Varro")
				{
					val c = SchoolFactory::eINSTANCE.createCourse
					c.setSchool(s)
					c.setSubject("NewCourse")	
					c.setWeight(43)		
					c.setTeacher(t)									
				}
			}			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createCourse_43.eiqsnapshot")
					pm.assertMatchResults(newSns)													
		}				
	}
	
		@Test
	def	deleteTeacher2(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete the Teacher "Daniel Varro"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			val ts = s.teachers		
			val iterator = ts.iterator
			while(iterator.hasNext()){
				val item = iterator.next
				if(item.name == "Daniel Varro")
	        		iterator.remove();
			}	
			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteTeacherVarro.eiqsnapshot")
			pm.assertMatchResults(newSns)				
						
		}
				
	}
	
	@Test
	def	deleteAllYear(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete all Year from the model
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			s.years.clear					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteAllYear.eiqsnapshot")
			pm.assertMatchResults(newSns)								
		}				
	}
	
	@Test
	def	deleteAllTeacher(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete all Teacher
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			s.teachers.clear					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteAllTeacher.eiqsnapshot")
			pm.assertMatchResults(newSns)								
		}				
	}
	
	@Test
	def	deleteAllClass(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete all SchoolClass in Year "2012"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			val years = s.years
			for(Year y : years){
				if(y.startingDate == 2012){
					y.schoolClasses.clear													
			    }
			}					
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteAllClass.eiqsnapshot")
			pm.assertMatchResults(newSns)								
		}				
	}
	
	@Test
	def	createYearClassStudent(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// create
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			//new year			
			val newYear = SchoolFactory::eINSTANCE.createYear
			newYear.setSchool(s)
			newYear.setStartingDate(2010)
			
			//new class
			val newClass = SchoolFactory::eINSTANCE.createSchoolClass
			newClass.setCode('W'.charAt(0))
			newClass.setYear(newYear)
			
			//set homeroom teacher
			val teachers = s.teachers			
			for(Teacher t : teachers){					
				if(t.name == "Daniel Varro"){
					newClass.setHomeroomTeacher(t)
				}				
			}
			
			// add a student
			val student = SchoolFactory::eINSTANCE.createStudent						
			student.setSchoolClass(newClass)	
			
			// add friends
			val matcher2 = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.studentOfSchool")
			val students = matcher2.allMatches
			Assert::assertNotNull(students)
			if(students != null){
				for(IPatternMatch g :students){
					val friend = g.get("S") as Student
					Assert::assertNotNull(friend)
					if(friend!=null){	
						if(friend.name == "Abel Hegedus"
							|| friend.name == "Akos Horvath"
							|| friend.name == "Gabor Bergmann"
							|| friend.name == "Istvan Rath"
							|| friend.name == "Zoltan Ujhelyi"
						){
							student.friendsWith.add(friend)	
						}
					}
				}
			}
			
			student.setName("Istvan Szabo")
											
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createYearClassStudentFriends.eiqsnapshot")
			pm.assertMatchResults(newSns)								
		}				
	}
	
	
		@Test
	def	deleteTeacherCourses(){
		val sns = snapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete Teacher Daniel Varro's courses
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			for(Teacher teacher : s.teachers){
				if(teacher.name == "Daniel Varro"){
					teacher.courses.clear
				}
			}	
			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteTeacherCourse.eiqsnapshot")
			pm.assertMatchResults(newSns)				
						
		}
				
	}
			
	@Test
  def createSpecCourse(){
    
    val sns = snapshot
    val pm = queryInput
    pm.assertMatchResults(sns)
    
    // MODEL MODIFICATION HERE
    // add a new Specialization Course "Visitor theory"
    val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
    val s = matcher.oneArbitraryMatch.get("Sch") as School
    Assert::assertNotNull(s)
    if (s!=null) {
      val c = SchoolFactory::eINSTANCE.createSpecialisationCourse
      c.setSubject("Visitor theory")
      c.setSchool(s)
      val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createSpecCourse.eiqsnapshot")
          pm.assertMatchResults(newSns)                         
    }       
  }	
}