/*******************************************************************************
 * Copyright (c) 2004-2013 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package hu.bme.mit.ocl2iq.mapping.test;

import hu.bme.mit.ocl2iq.mapping.api.OCL2IQ;
import hu.bme.mit.ocl2iq.mapping.api.OCLParseControl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCLExpression;
import org.junit.Test;

import school.SchoolPackage;

/**
 * @author Bergmann Gabor
 *
 */
public class SimpleSchoolTests {

	private static final SchoolPackage SCHOOL = SchoolPackage.eINSTANCE;
	private void testCode(final String oclCode, final EClass context)
			throws ParserException {
		System.out.println("\n// *** generating output for context " + context.getName() + ": ");
		System.out.println("// "+ oclCode);
		final OCLExpression exp = new OCLParseControl().parse(context, oclCode);
		final String patternCode = new OCL2IQ(context, exp, "translated").gen().toString(); 
		System.out.println(patternCode);
	}

	@Test
	public void parseTest() throws ParserException {
		final OCLExpression exp = new OCLParseControl().parse(
				SCHOOL.getSchool(), 
				"self.years.schoolClasses.homeroomTeacher");
	}
	
	@Test
	public void translateTest001() throws ParserException {
		final String oclCode = "self.years";
		final EClass context = SCHOOL.getSchool();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest002() throws ParserException {
		final String oclCode = "self.teacher.name";
		final EClass context = SCHOOL.getCourse();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest003() throws ParserException {
		final String oclCode = "self.teacher.homeroomedClass.year.school";
		final EClass context = SCHOOL.getCourse();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest004() throws ParserException {
		final String oclCode = "let myName : String = self.teacher.name in myName";
		final EClass context = SCHOOL.getCourse();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest005() throws ParserException {
		final String oclCode = "let myClass : SchoolClass = self.teacher.homeroomedClass in myClass.year.school";
		final EClass context = SCHOOL.getCourse();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest006() throws ParserException {
		final String oclCode = "self.teachers.name";
		final EClass context = SCHOOL.getSchool();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest007() throws ParserException {
		final String oclCode = "let myText : String = 'almafa' in let myNumber: Real = 3.14 in let myBool: Boolean = false in self";
		final EClass context = SCHOOL.getSchool();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest008() throws ParserException {
		final String oclCode = "self.teachers->select(true)->reject(false).name";
		final EClass context = SCHOOL.getSchool();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest009() throws ParserException {
		final String oclCode = "let myNumber: Real = -5 + 3.14 / 2 in let myBool: Boolean = not false and true in self";
		final EClass context = SCHOOL.getSchool();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest010() throws ParserException {
		final String oclCode = "students->collect(s1 | self.students->select(s2 | s2.name = s1.name and s1 <> s2)->" + 
				"collect(s2 | s2.name ))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest011() throws ParserException {
		final String oclCode = "students->select(s1 | s1.name = 'almafa')";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest012() throws ParserException {
		final String oclCode = "students->reject(s1 | s1.name = 'almafa')";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest013() throws ParserException {
		final String oclCode = "Tuple{apple = 1, orange = -4, pear = 'fun'}.orange";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	
	@Test
	public void translateTest014() throws ParserException {
		final String oclCode = "students->collect(s1 | self.students->select(s2 | s2.name = s1.name and s1 <> s2)->" + 
				"collect(s2 | Tuple{student1 = s1, student2 = s2, name = s1.name}))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	
	@Test
	public void translateTest015() throws ParserException {
		final String oclCode = "students->collect(if (name = 'Istvan Rath') then 'almafa' else name endif)";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest016() throws ParserException {
		final String oclCode = "courses->reject(oclIsKindOf(LimitedCapacityCourse))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest017() throws ParserException {
		final String oclCode = "courses->reject(c | LimitedCapacityCourse.allInstances()->includes(c))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest018() throws ParserException {
		final String oclCode = "courses->reject(c | Course.allInstances()->includes(c))->isEmpty()";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest019() throws ParserException {
		final String oclCode = "courses->reject(oclIsKindOf(LimitedCapacityCourse))->notEmpty()";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest020() throws ParserException {
		final String oclCode = "courses->exists(oclIsKindOf(LimitedCapacityCourse))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest021() throws ParserException {
		final String oclCode = "courses->forAll(oclIsKindOf(LimitedCapacityCourse))";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest022() throws ParserException {
		final String oclCode = "Set{1,2,3,4}";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}
	@Test
	public void translateTest023() throws ParserException {
		final String oclCode = "year->notEmpty()";
		final EClass context = SCHOOL.getSchoolClass();
		testCode(oclCode, context);
	}

	
}
