/*******************************************************************************
 * Copyright (c) 2010-2012, Gabor Bergmann, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package school.tests

import com.google.inject.Inject
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.testing.core.SnapshotHelper
import org.eclipse.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import school.ClassesOfTeacherMatcher
import school.util.ClassesOfTeacherQuerySpecification

/**
 * API test set for testing IncQuery with the school example.
 * These are miscellaneous tests where the generated and / or generic matcher API is exercised in various ways. 
 * 
 * @author Istvan Rath
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class APISchoolTest extends SchoolTestsBase {
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper

	@Test()
	def resultMatchImmutableGeneric(){
		val sns = snapshot
		val pm = queryInput
		
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfTeacher")
		val match = matcher.oneArbitraryMatch
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertNotNull(match.get(i))		
		Assert::assertFalse(match.mutable)
	}

	@Test()
	def matchToArrayGeneric(){
		val sns = snapshot
		val pm = queryInput
		
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfTeacher")
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		
		val sampleMatchAsArray = sampleMatch.toArray
		Assert::assertNotNull(sampleMatchAsArray)
		Assert::assertEquals(sampleMatchAsArray.size, sampleMatch.parameterNames.size)
		for (int i : 0..sampleMatchAsArray.size-1) 
			Assert::assertEquals(sampleMatchAsArray.get(i), sampleMatch.get(i))		
	}
	
	@Test()
	def newMatchImmutableGeneric(){
		val sns = snapshot
		val pm = queryInput
		
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfTeacher")
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		
		val sampleMatchAsArray = sampleMatch.toArray
		Assert::assertNotNull(sampleMatchAsArray)

		val match = matcher.newMatch(sampleMatchAsArray)
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertEquals(match.get(i), sampleMatch.get(i))		
		Assert::assertFalse(match.mutable)
	}

	@Test()
	def newMatchMutableGeneric(){
		val sns = snapshot
		val pm = queryInput
		
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfTeacher")

		val match = matcher.newEmptyMatch()
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertNull(match.get(i))		
		Assert::assertTrue(match.mutable)
		
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		for (int i : 0..match.parameterNames.size-1) {
			match.set(i, sampleMatch.get(i));
			Assert::assertEquals(match.get(i), sampleMatch.get(i))	
		}			
	}

	@Test(expected=typeof(UnsupportedOperationException))
	def void immutableModificationExpectedExceptionGeneric (){
		val sns = snapshot
		val pm = queryInput
		
		val matcher = pm.initializeMatcherFromModel(sns.EMFRootForSnapshot, "school.classesOfTeacher")
		val match = matcher.newMatch(null, null)
		Assert::assertNotNull(match)
		match.set(0,null);
	}





	@Test()
	def resultMatchImmutableGenerated(){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)
		val match = matcher.oneArbitraryMatch
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertNotNull(match.get(i))		
		Assert::assertNotNull(match.SC)		
		Assert::assertNotNull(match.t)		
		Assert::assertFalse(match.mutable)
	}

	@Test()
	def matchToArrayGenerated(){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		
		val sampleMatchAsArray = sampleMatch.toArray
		Assert::assertNotNull(sampleMatchAsArray)
		Assert::assertEquals(sampleMatchAsArray.size, sampleMatch.parameterNames.size)
		for (int i : 0..sampleMatchAsArray.size-1) 
			Assert::assertEquals(sampleMatchAsArray.get(i), sampleMatch.get(i))		
	}

	@Test()
	def newMatchImmutableGenerated(){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		
		val match = matcher.newMatch(sampleMatch.t, sampleMatch.SC)
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertEquals(match.get(i), sampleMatch.get(i))		
		Assert::assertEquals(match.t, sampleMatch.get(0))		
		Assert::assertEquals(match.SC, sampleMatch.get(1))		
		Assert::assertFalse(match.mutable)
	}

	@Test()
	def newMatchMutableGenerated(){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)

		val match = matcher.newEmptyMatch()
		Assert::assertNotNull(match)
		Assert::assertEquals(match.specification,matcher.specification)
		Assert::assertArrayEquals(match.parameterNames,matcher.parameterNames)
		for (int i : 0..match.parameterNames.size-1) 
			Assert::assertNull(match.get(i))		
		Assert::assertNull(match.t)
		Assert::assertNull(match.SC)
		Assert::assertTrue(match.mutable)
		
		val sampleMatch = matcher.oneArbitraryMatch
		Assert::assertNotNull(sampleMatch)
		for (int i : 0..match.parameterNames.size-1) {
			match.set(i, sampleMatch.get(i));
			Assert::assertEquals(match.get(i), sampleMatch.get(i))	
		}
		Assert::assertEquals(match.t, sampleMatch.get(0))
		Assert::assertEquals(match.SC, sampleMatch.get(1))
		
		match.t = null;
		Assert::assertNull(match.get(0))
		Assert::assertNull(match.t)
		match.SC = null;		
		Assert::assertNull(match.get(1))
		Assert::assertNull(match.SC)
	}

	@Test(expected=typeof(UnsupportedOperationException))
	def void immutableModification1ExpectedExceptionGenerated (){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)
		val match = matcher.newMatch(null, null)
		Assert::assertNotNull(match)
		match.set(0,null);
	}
	@Test(expected=typeof(UnsupportedOperationException))
	def void immutableModification2ExpectedExceptionGenerated (){
		val sns = snapshot
		
		val matcher = new ClassesOfTeacherMatcher(sns.EMFRootForSnapshot)
		val match = matcher.newMatch(null, null)
		Assert::assertNotNull(match)
		match.SC = null;
	}

	@Test
	def void immutablePBodyUsage() {
		val instance = ClassesOfTeacherQuerySpecification.instance
		instance.internalQueryRepresentation.disjunctBodies.bodies.forEach[Assert::assertFalse(it.mutable)]
	}
}


