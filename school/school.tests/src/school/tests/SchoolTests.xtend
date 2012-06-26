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
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * Basic test set for testing IncQuery with the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class SchoolTests {
	
	@Inject extension TestExecutor
	@Inject extension ModelLoadHelper
	@Inject extension SnapshotHelper
	
	@Inject
	ParseHelper parseHelper
	
	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInput() {
		return "school.incquery/queries/globalEiqModel.xmi".loadPatternModelFromUri as PatternModel
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
		patternModel.assertMatchResults("school.tests/model/correct.eiqsnapshot")
	}
	
		
	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def simpleXMIUriTest(){
		assertMatchResults("school.incquery/queries/globalEiqModel.xmi", "school.tests/model/correct.eiqsnapshot")
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test
	def simpleEIQURITest(){
		assertMatchResults("school.incquery/src/school/schoolqueries.eiq", "school.tests/model/correct.eiqsnapshot")
	}
	
	
}