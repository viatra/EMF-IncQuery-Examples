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

import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import org.eclipse.viatra.query.testing.core.api.ViatraQueryTest
import org.junit.Test
import school.util.AnonymousVariablesQuerySpecification
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory

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