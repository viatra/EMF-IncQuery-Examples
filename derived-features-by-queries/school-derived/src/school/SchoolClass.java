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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.SchoolClass#getCode <em>Code</em>}</li>
 *   <li>{@link school.SchoolClass#getYear <em>Year</em>}</li>
 *   <li>{@link school.SchoolClass#getStudents <em>Students</em>}</li>
 *   <li>{@link school.SchoolClass#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.SchoolClass#getHomeroomTeacher <em>Homeroom Teacher</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getSchoolClass()
 * @model
 * @generated
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
	 * Returns the value of the '<em><b>Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link school.Year#getSchoolClasses <em>School Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' container reference.
	 * @see #setYear(Year)
	 * @see school.SchoolPackage#getSchoolClass_Year()
	 * @see school.Year#getSchoolClasses
	 * @model opposite="schoolClasses"
	 * @generated
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
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link school.Student}.
	 * It is bidirectional and its opposite is '{@link school.Student#getSchoolClass <em>School Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see school.SchoolPackage#getSchoolClass_Students()
	 * @see school.Student#getSchoolClass
	 * @model opposite="schoolClass" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link school.Course}.
	 * It is bidirectional and its opposite is '{@link school.Course#getSchoolClass <em>School Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see school.SchoolPackage#getSchoolClass_Courses()
	 * @see school.Course#getSchoolClass
	 * @model opposite="schoolClass" resolveProxies="false"
	 * @generated
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

} // SchoolClass
