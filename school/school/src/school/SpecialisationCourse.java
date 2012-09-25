/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.SpecialisationCourse#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getSpecialisationCourse()
 * @model
 * @generated
 */
public interface SpecialisationCourse extends Course {
	/**
     * Returns the value of the '<em><b>Specialisation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Specialisation</em>' attribute.
     * @see #setSpecialisation(String)
     * @see school.SchoolPackage#getSpecialisationCourse_Specialisation()
     * @model
     * @generated
     */
	String getSpecialisation();

	/**
     * Sets the value of the '{@link school.SpecialisationCourse#getSpecialisation <em>Specialisation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specialisation</em>' attribute.
     * @see #getSpecialisation()
     * @generated
     */
	void setSpecialisation(String value);

} // SpecialisationCourse
