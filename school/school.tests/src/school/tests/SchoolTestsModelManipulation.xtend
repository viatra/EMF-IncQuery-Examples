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
		if (s!=null) {
			val t = SchoolFactory::eINSTANCE.createTeacher
			t.setName("New Teacher")
			t.setSchool(s)
			
			val newSns = sns.eResource.resourceSet.loadExpectedResultsFromUri("school.tests/model/tests_manipulated.eiqsnapshot")
			pm.assertMatchResults(newSns)
		}
	}	
}