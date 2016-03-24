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
import java.util.Collections
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.query.testing.core.ModelLoadHelper
import org.eclipse.viatra.query.testing.core.TestExecutor
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.viatra.query.testing.snapshot.QuerySnapshot
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import school.Student

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
class RecursionSchoolTest extends SchoolTestsBase {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
  
	override queryInputVQLURI() {
		"school.incquery/school/recursiveQueries.vql"
	}
	override queryInputDependencyURIs() {
		Collections.singletonList("school.incquery/school/simpleSchoolQueries.eiq")
	}
  
  	@Test
	def staticRecursionTest(){
		val sns = loadExpectedResultsFromUri("school.tests/model/tests_recursion_chainRec.eiqsnapshot") as QuerySnapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
    }
    
  	@Test
	def staticTCTest(){
		val sns = loadExpectedResultsFromUri("school.tests/model/tests_recursion_chainTC.eiqsnapshot") as QuerySnapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
    }
  
	@Test
	def createFriendshipTC(){
		createFriendshipTest(
			"school.tests/model/tests_recursion_chainTC.eiqsnapshot", 
			"school.tests/model/tests_recursion_friendshipAdded_chainTC.eiqsnapshot"
		)
	}
	
	@Test
	def createFriendshipRecursion(){
		createFriendshipTest(
			"school.tests/model/tests_recursion_chainRec.eiqsnapshot", 
			"school.tests/model/tests_recursion_friendshipAdded_chainRec.eiqsnapshot"
		)
	}
	
	def createFriendshipTest(String initialSnsURI, String modifiedSnsURI) {
		val sns = loadExpectedResultsFromUri(initialSnsURI) as QuerySnapshot
		val pm = queryInput
		pm.assertMatchResults(sns)
		
		// MODEL MODIFICATION HERE
		// add frienship from Student "Istvan Rath" to "Zoltan Ujhelyi"
		var Student istvan = null
		var Student uzi = null
		val treeIter = sns.eResource.resourceSet.allContents
		while ((istvan==null || uzi==null) && treeIter.hasNext) {
			val nextNotifier = treeIter.next
			if (nextNotifier instanceof Student) {
				val student = nextNotifier as Student
				if (student.name == "Istvan Rath")
					istvan = student
				if (student.name == "Zoltan Ujhelyi")
					uzi = student
			}
		}
		Assert::assertNotNull(istvan)
		Assert::assertNotNull(uzi)
		istvan.friendsWith += uzi
		
		val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri(modifiedSnsURI)
		pm.assertMatchResults(newSns)
	}
	
	@Test
	def crazyRecursiveQueryCompiles(){
		val sns = loadExpectedResultsFromUri("school.tests/model/tests_recursion_chainTC.eiqsnapshot") as QuerySnapshot
		val pm = queryInput
		val engine = ViatraQueryEngine::on(new EMFScope(sns.getModelRoots().get(0)));
		val matcher = pm.initializeMatcherFromModel(engine,"school.friendOfClassMember")
		Assert::assertNotNull(matcher)
		Assert::assertNotNull(matcher.allMatches)
		Assert::assertTrue("nonempty match set", !matcher.allMatches.empty)
    }
	
}