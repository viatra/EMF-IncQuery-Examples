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
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.Student#getName <em>Name</em>}</li>
 *   <li>{@link school.Student#getSchoolClass <em>School Class</em>}</li>
 *   <li>{@link school.Student#getFriendsWith <em>Friends With</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
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
	 * @see school.SchoolPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>School Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link school.SchoolClass#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Class</em>' container reference.
	 * @see #setSchoolClass(SchoolClass)
	 * @see school.SchoolPackage#getStudent_SchoolClass()
	 * @see school.SchoolClass#getStudents
	 * @model opposite="students"
	 * @generated
	 */
	SchoolClass getSchoolClass();

	/**
	 * Sets the value of the '{@link school.Student#getSchoolClass <em>School Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School Class</em>' container reference.
	 * @see #getSchoolClass()
	 * @generated
	 */
	void setSchoolClass(SchoolClass value);

	/**
	 * Returns the value of the '<em><b>Friends With</b></em>' reference list.
	 * The list contents are of type {@link school.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends With</em>' reference list.
	 * @see school.SchoolPackage#getStudent_FriendsWith()
	 * @model
	 * @generated
	 */
	EList<Student> getFriendsWith();

} // Student
