/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.Course#getSubject <em>Subject</em>}</li>
 *   <li>{@link school.Course#getWeight <em>Weight</em>}</li>
 *   <li>{@link school.Course#getSchool <em>School</em>}</li>
 *   <li>{@link school.Course#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link school.Course#getSchoolClass <em>School Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see school.SchoolPackage#getCourse_Subject()
	 * @model
	 * @generated
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
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see school.SchoolPackage#getCourse_Weight()
	 * @model
	 * @generated
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
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link school.School#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see school.SchoolPackage#getCourse_School()
	 * @see school.School#getCourses
	 * @model opposite="courses"
	 * @generated
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
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link school.Teacher#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teacher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(Teacher)
	 * @see school.SchoolPackage#getCourse_Teacher()
	 * @see school.Teacher#getCourses
	 * @model opposite="courses" transient="true"
	 * @generated
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
	 * Returns the value of the '<em><b>School Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link school.SchoolClass#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Class</em>' reference.
	 * @see #setSchoolClass(SchoolClass)
	 * @see school.SchoolPackage#getCourse_SchoolClass()
	 * @see school.SchoolClass#getCourses
	 * @model opposite="courses"
	 * @generated
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

} // Course
