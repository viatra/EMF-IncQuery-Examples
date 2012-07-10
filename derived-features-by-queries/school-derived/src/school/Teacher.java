/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.Teacher#getName <em>Name</em>}</li>
 *   <li>{@link school.Teacher#getSchool <em>School</em>}</li>
 *   <li>{@link school.Teacher#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.Teacher#getHomeroomedClass <em>Homeroomed Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends EObject {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see school.SchoolPackage#getTeacher_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link school.Teacher#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>School</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link school.School#getTeachers <em>Teachers</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>School</em>' container reference.
   * @see #setSchool(School)
   * @see school.SchoolPackage#getTeacher_School()
   * @see school.School#getTeachers
   * @model opposite="teachers"
   * @generated
   */
	School getSchool();

	/**
   * Sets the value of the '{@link school.Teacher#getSchool <em>School</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>School</em>' container reference.
   * @see #getSchool()
   * @generated
   */
	void setSchool(School value);

	/**
   * Returns the value of the '<em><b>Courses</b></em>' reference list.
   * The list contents are of type {@link school.Course}.
   * It is bidirectional and its opposite is '{@link school.Course#getTeacher <em>Teacher</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Courses</em>' reference list.
   * @see school.SchoolPackage#getTeacher_Courses()
   * @see school.Course#getTeacher
   * @model opposite="teacher" resolveProxies="false"
   * @generated
   */
	EList<Course> getCourses();

	/**
   * Returns the value of the '<em><b>Homeroomed Class</b></em>' reference.
   * It is bidirectional and its opposite is '{@link school.SchoolClass#getHomeroomTeacher <em>Homeroom Teacher</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Homeroomed Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Homeroomed Class</em>' reference.
   * @see #setHomeroomedClass(SchoolClass)
   * @see school.SchoolPackage#getTeacher_HomeroomedClass()
   * @see school.SchoolClass#getHomeroomTeacher
   * @model opposite="homeroomTeacher"
   * @generated
   */
	SchoolClass getHomeroomedClass();

	/**
   * Sets the value of the '{@link school.Teacher#getHomeroomedClass <em>Homeroomed Class</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Homeroomed Class</em>' reference.
   * @see #getHomeroomedClass()
   * @generated
   */
	void setHomeroomedClass(SchoolClass value);

} // Teacher
