package org.eclipse.incquery.runtime.base.test.scope;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.base.test.IncQueryBaseTest;
import org.eclipse.incquery.runtime.base.test.util.ResourceAccess;
import org.junit.Test;

import school.School;
import school.SchoolPackage;

/**
 * Scope test based on the {@link School} root {@link EObject} of the first model.
 * 
 * @author Tamas Szabo
 *
 */
public class EObjectScopeTest extends IncQueryBaseTest {

	public EObjectScopeTest() {
		super(ResourceAccess.getFirstSchool());
	}

	@Test
	public void instancesOfTeacherTest() {		
		Collection<EObject> teachers = navigationHelper.getDirectInstances(SchoolPackage.Literals.TEACHER);
		
		//there are 4 teachers in the first school model
		assertTrue(teachers.size() == 4);
	}
	
}
