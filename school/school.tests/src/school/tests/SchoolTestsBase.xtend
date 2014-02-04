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
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.incquery.testing.core.base.CommonStaticQueryTester
import com.google.inject.Injector

/**
 * Base class for IncQuery tests concerning the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */

class SchoolTestsBase extends CommonStaticQueryTester {

	@Inject extension ModelLoadHelper
	@Inject var Injector injector

	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	override queryInputEIQURI() { // Creates new resource set
		"school.incquery/src/school/simpleSchoolQueries.eiq"
	}

	def queryInputEIQ() { // Creates new resource set
		return queryInputEIQURI.loadPatternModelFromUri(injector) as PatternModel

	}
	override snapshotURI() {
		return "school.tests/model/tests.eiqsnapshot"
	}




}