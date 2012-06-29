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
import org.eclipse.viatra2.emf.incquery.snapshot.EIQSnapshot.IncQuerySnapshot
import org.eclipse.viatra2.emf.incquery.testing.core.ModelLoadHelper
import org.eclipse.viatra2.patternlanguage.eMFPatternLanguage.PatternModel

/**
 * Base class for IncQuery tests concerning the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */

class SchoolTestsBase {
	
	@Inject extension ModelLoadHelper
	
	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInputXMI() { // Creates new resource set
		return "school.incquery/queries/globalEiqModel.xmi".loadPatternModelFromUri as PatternModel
	}
	
	def queryInputEIQ() { // Creates new resource set
		return "school.incquery/src/school/schoolqueries.eiq".loadPatternModelFromUri as PatternModel
	}
		
	def snapshot() { // Creates new resource set
		return "school.tests/model/tests.eiqsnapshot".loadExpectedResultsFromUri as IncQuerySnapshot
	}

		
	
	
}