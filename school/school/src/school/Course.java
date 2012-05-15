package school;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Course extends EObject {

	/**
	 * @model
	 */
	String getSubject();
	
	/**
	 * Sets the value of the '{@link school.Course#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * @model
	 */
	int getWeight();		
	
	/**
	 * Sets the value of the '{@link school.Course#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * @model opposite="courses"
	 */
	School getSchool();	
	
	/**
	 * Sets the value of the '{@link school.Course#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

	/**
	 * @model opposite="courses"
	 */
	Teacher getTeacher();		

	/**
	 * Sets the value of the '{@link school.Course#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Teacher value);

	/**
	 * @model opposite="courses"
	 */
	SchoolClass getSchoolClass();

	/**
	 * Sets the value of the '{@link school.Course#getSchoolClass <em>School Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School Class</em>' reference.
	 * @see #getSchoolClass()
	 * @generated
	 */
	void setSchoolClass(SchoolClass value);		
	
}
