package school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface School extends EObject {
	/**
	 * @model
	 */
	String getName();
	
	/**
	 * Sets the value of the '{@link school.School#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link school.School#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * @model containment="true" opposite="school"
	 */
	EList<Year> getYears();

	/**
	 * @model containment="true" opposite="school"
	 */
	EList<Teacher> getTeachers();

	/**
	 * @model containment="true" opposite="school"
	 */
	EList<Course> getCourses();
}
