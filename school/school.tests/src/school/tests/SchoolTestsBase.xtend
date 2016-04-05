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
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.query.testing.core.ModelLoadHelper
import org.eclipse.viatra.query.testing.core.SnapshotHelper
import org.eclipse.viatra.query.testing.core.TestExecutor
import org.eclipse.viatra.query.testing.snapshot.QuerySnapshot

import static org.junit.Assert.*

/**
 * Base class for IncQuery tests concerning the school example.
 * See https://viatra.inf.mit.bme.hu/incquery/new/examples/school for details on the example.
 * @author Istvan Rath
 */

class SchoolTestsBase {

	@Inject extension ModelLoadHelper
	@Inject extension TestExecutor
	@Inject extension SnapshotHelper
	@Inject var Injector injector

	def testQuery(String queryFQN){
		val sns = snapshot
		val engine = getEngine(sns.EMFRootForSnapshot)
		val ViatraQueryMatcher matcher = queryInput.initializeMatcherFromModel(engine, queryFQN)
		val results = matcher.compareResultSets(sns.getMatchSetRecordForPattern(queryFQN))
		assertArrayEquals(results.logDifference,newHashSet,results)
	}

	def testQuery(IQuerySpecification queryMF){
		val sns = snapshot
		val engine = getEngine(sns.EMFRootForSnapshot)
		testQuery(engine, sns, queryMF)
	}

	def testQuery(ViatraQueryEngine engine, QuerySnapshot sns, IQuerySpecification queryMF){
		val ViatraQueryMatcher matcher = engine.getMatcher(queryMF)
		val results = matcher.compareResultSets(sns.getMatchSetRecordForPattern(queryMF.fullyQualifiedName))
		assertArrayEquals(results.logDifference,newHashSet,results)
	}

	def getEngine(Notifier root) {
		return ViatraQueryEngine::on(new EMFScope(root))
	}

	def snapshot() { // Creates new resource set
		return snapshotURI.loadExpectedResultsFromUri as QuerySnapshot
	}
	def queryInput() { // Creates new resource set
		return queryInputVQLURI.loadPatternModelFromUri(injector, queryInputDependencyURIs) as PatternModel
	}

	/*
	 * Use the XMI-serialized version of the school queries for this test set
	 */
	def queryInputVQLURI() { // Creates new resource set
		"school.query/school/simpleSchoolQueries.vql"
	}
	
	def Iterable<String> queryInputDependencyURIs() {Collections.emptyList}
	
	def snapshotURI() {
		return "school.tests/model/tests.snapshot"
	}




}