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
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import school.School
import school.SchoolFactory
import org.junit.Assert
import school.Teacher
import org.eclipse.viatra2.emf.incquery.runtime.api.GenericPatternMatch
import school.Course
import school.SchoolClass
import school.Year

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
class SchoolTestsModelManipulation extends SchoolTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
		
	@Test
	def testModelModification(){
		val sns = snapshot
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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
		val pm = queryInputEIQ
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

				
}