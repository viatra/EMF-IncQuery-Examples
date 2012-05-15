package school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface SchoolClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(char)
	 * @see school.SchoolPackage#getSchoolClass_Code()
	 * @model
	 * @generated
	 */
	char getCode();
	/**
	 * Sets the value of the '{@link school.SchoolClass#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(char value);
	/**
	 * @model opposite="schoolClasses"
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link school.SchoolClass#getYear <em>Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' container reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);
	/**
	 * @model containment="true" opposite="schoolClass"
	 */
	EList<Student> getStudents();
	
	/**
	 * @model containment="true" opposite="schoolClass"
	 */
	EList<Course> getCourses();
	/**
	 * Returns the value of the '<em><b>Homeroom Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Homeroom Teacher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homeroom Teacher</em>' reference.
	 * @see #setHomeroomTeacher(Teacher)
	 * @see school.SchoolPackage#getSchoolClass_HomeroomTeacher()
	 * @model
	 * @generated
	 */
	Teacher getHomeroomTeacher();
	/**
	 * Sets the value of the '{@link school.SchoolClass#getHomeroomTeacher <em>Homeroom Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homeroom Teacher</em>' reference.
	 * @see #getHomeroomTeacher()
	 * @generated
	 */
	void setHomeroomTeacher(Teacher value);	
}
