package school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Year extends EObject {

	/**
	 * @model
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
	 * @model opposite="years"
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
	 * @model containment="true" opposite="year"
	 */
	EList<SchoolClass> getSchoolClasses();
	
}
