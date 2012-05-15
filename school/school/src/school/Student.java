package school;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Student extends EObject {
	/**
	 * @model
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
	 * @model opposite="students"
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
}
