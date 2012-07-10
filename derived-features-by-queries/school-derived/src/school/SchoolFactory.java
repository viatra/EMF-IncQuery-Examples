/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see school.SchoolPackage
 * @generated
 */
public interface SchoolFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SchoolFactory eINSTANCE = school.impl.SchoolFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Course</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Course</em>'.
   * @generated
   */
	Course createCourse();

	/**
   * Returns a new object of class '<em>School</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>School</em>'.
   * @generated
   */
	School createSchool();

	/**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
	SchoolClass createSchoolClass();

	/**
   * Returns a new object of class '<em>Specialisation Course</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Specialisation Course</em>'.
   * @generated
   */
	SpecialisationCourse createSpecialisationCourse();

	/**
   * Returns a new object of class '<em>Student</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Student</em>'.
   * @generated
   */
	Student createStudent();

	/**
   * Returns a new object of class '<em>Teacher</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Teacher</em>'.
   * @generated
   */
	Teacher createTeacher();

	/**
   * Returns a new object of class '<em>Year</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Year</em>'.
   * @generated
   */
	Year createYear();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	SchoolPackage getSchoolPackage();

} //SchoolFactory
