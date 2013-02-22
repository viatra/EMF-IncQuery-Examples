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
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.testing.core.SnapshotHelper
import org.eclipse.incquery.testing.core.TestExecutor
import org.eclipse.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import school.School
import school.SchoolFactory
import org.junit.Assert
import school.Teacher
import org.eclipse.incquery.runtime.api.GenericPatternMatch
import school.Course
import school.SchoolClass
import school.Year
import school.Student
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.junit.Ignore

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
	@Inject
  ParseHelper parseHelper
  
	@Test
	def testModelModification(){
		val sns = snapshot
		val pm = queryInputXMI
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add a new Teacher "New Teacher" to the first (only) School in the model
		// theoretically, we should use a scalar-only pattern for this purpose
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {			
			val t = SchoolFactory::eINSTANCE.createTeacher
			t.setName("New Teacher")
			t.setSchool(s)			
			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_manipulated.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
	}
	
	@Test
	def changeSchoolName(){
		val sns = snapshot
		val pm = queryInputXMI
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change the School "Budapest University of Technology and Economics" name to "BME"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {			
			if(s.name == "Budapest University of Technology and Economics"){
				s.setName("BME")
			}			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_changeSchoolName.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
	}
	
	
	@Test
	def	changeNameModelModification(){
		val sns = snapshot
		val pm = queryInputXMI
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// change the Teacher "Andras Pataricza" name to "Dr. Andras Pataricza"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.teachers")
		val match = matcher.allMatches
		
		for(GenericPatternMatch g : match){
			val t = g.get("T") as Teacher
			
			Assert::assertNotNull(t)
			if(t!=null){		
				if(t.name == "Andras Pataricza"){	
					t.setName("Dr. Andras Pataricza");
					
					val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_changeName.eiqsnapshot")
					pm.assertMatchResults(newSns)
				}
			}
		}				
	}
	
	@Test
	def	deleteTeacher(){
		val sns = snapshot
		val pm = queryInputXMI
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete the Teacher "Istvan Majzik"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			val ts = s.teachers		
			val iterator = ts.iterator
			while(iterator.hasNext()){
				val item = iterator.next
				if(item.name == "Istvan Majzik")
	        		iterator.remove();
			}	
			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteTeacher.eiqsnapshot")
			pm.assertMatchResults(newSns)				
						
		}
				
	}	
	
	@Test
	def	deleteCourse(){
		val sns = snapshot
		val pm = queryInputXMI
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// delete the Course "Prolog programming"
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.schools")
		val s = matcher.oneArbitraryMatch.get("Sch") as School
		Assert::assertNotNull(s)
		if (s!=null) {	
			val courses = s.courses	
			val i = courses.iterator();
			while (i.hasNext()) {
			   val c = i.next(); // must be called before you can call i.remove()
			   if(c.subject == "Prolog programming"){
			   	i.remove();			   	
			   }
			}			
						
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_deleteCourse.eiqsnapshot")
			pm.assertMatchResults(newSns)				
						
		}
				
	}
	
	
	@Test
	def	createCourse(){
		val sns = snapshot
		val pm = queryInputXMI
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
					c.setSubject("System Integration")	
					c.setWeight(30)		
					c.setTeacher(t)									
				}
			}			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_createCourse.eiqsnapshot")
					pm.assertMatchResults(newSns)													
		}				
	}
	
	@Test
	def	changeCourseTeacher(){
		val sns = snapshot
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
					
					for(GenericPatternMatch g : schoolClasses){
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
								for(GenericPatternMatch g :students){
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
		val pm = queryInputXMI
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
				for(GenericPatternMatch g :students){
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
		val pm = queryInputXMI
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
	@Ignore
  def createSpecCourse(){
    
    val sns = snapshot
    val pm = queryInputXMI
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