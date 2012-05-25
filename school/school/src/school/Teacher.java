package school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Teacher extends EObject {
	/**
	 * @model
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
	 * @model opposite="teachers"
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
	 * @model containment="true" opposite="teacher"
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
}
