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
import com.google.inject.Injector
import java.util.Collections
import org.eclipse.viatra.query.testing.core.base.CommonStaticQueryTester

/**
 * Base class for IncQuery tests concerning the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */

class SchoolTestsBase extends CommonStaticQueryTester {

	@Inject var Injector injector

	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	override queryInputVQLURI() { // Creates new resource set
		"school.incquery/school/simpleSchoolQueries.vql"
	}
	
	override queryInputDependencyURIs() {Collections.emptyList}
	override snapshotURI() {
		return "school.tests/model/tests.eiqsnapshot"
	}




}