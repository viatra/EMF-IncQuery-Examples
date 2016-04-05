/*******************************************************************************
 * Copyright (c) 2010-2014, Abel Hegedus, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Abel Hegedus - initial API and implementation
 *******************************************************************************/
package school.tests

import org.eclipse.viatra.query.testing.core.ModelLoadHelper
import org.eclipse.viatra.query.testing.core.SnapshotHelper
import org.eclipse.viatra.query.testing.core.TestExecutor
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.junit.Test
import org.eclipse.viatra.query.testing.snapshot.IncQuerySnapshot

/**
 * @author Abel Hegedus
 *
 */
class AnonymousVariablesSchoolTest {

  @Test
  def void anonymousVariablesTest(){
  	ViatraQueryTest.test(AnonymousVariablesQuerySpecification.instance).
  	with("school.tests/model/tests_anonymous_ref.eiqsnapshot").with(new ReteBackendFactory).assertEquals
  }
}