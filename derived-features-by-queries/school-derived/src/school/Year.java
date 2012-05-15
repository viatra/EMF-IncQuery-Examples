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
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.Year#getStartingDate <em>Starting Date</em>}</li>
 *   <li>{@link school.Year#getSchool <em>School</em>}</li>
 *   <li>{@link school.Year#getSchoolClasses <em>School Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Date</em>' attribute.
	 * @see #setStartingDate(int)
	 * @see school.SchoolPackage#getYear_StartingDate()
	 * @model
	 * @generated
	 */
	int getStartingDate();

	/**
	 * Sets the value of the '{@link school.Year#getStartingDate <em>Starting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Date</em>' attribute.
	 * @see #getStartingDate()
	 * @generated
	 */
	void setStartingDate(int value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link school.School#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see school.SchoolPackage#getYear_School()
	 * @see school.School#getYears
	 * @model opposite="years"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link school.Year#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

	/**
	 * Returns the value of the '<em><b>School Classes</b></em>' containment reference list.
	 * The list contents are of type {@link school.SchoolClass}.
	 * It is bidirectional and its opposite is '{@link school.SchoolClass#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Classes</em>' containment reference list.
	 * @see school.SchoolPackage#getYear_SchoolClasses()
	 * @see school.SchoolClass#getYear
	 * @model opposite="year" containment="true"
	 * @generated
	 */
	EList<SchoolClass> getSchoolClasses();

} // Year
