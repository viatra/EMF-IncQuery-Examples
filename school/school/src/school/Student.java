package school;

import org.eclipse.emf.common.util.EList;
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
}
