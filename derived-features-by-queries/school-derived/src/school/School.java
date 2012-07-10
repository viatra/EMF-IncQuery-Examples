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
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.School#getName <em>Name</em>}</li>
 *   <li>{@link school.School#getAddress <em>Address</em>}</li>
 *   <li>{@link school.School#getYears <em>Years</em>}</li>
 *   <li>{@link school.School#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link school.School#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.School#getNumberOfTeachers <em>Number Of Teachers</em>}</li>
 *   <li>{@link school.School#getTeachersWithMostCourses <em>Teachers With Most Courses</em>}</li>
 *   <li>{@link school.School#getLastYear <em>Last Year</em>}</li>
 *   <li>{@link school.School#getCurrentYear <em>Current Year</em>}</li>
 *   <li>{@link school.School#getMinWeightInLastYear <em>Min Weight In Last Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see school.SchoolPackage#getSchool_Name()
   * @model
   * @generated
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
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see school.SchoolPackage#getSchool_Address()
   * @model
   * @generated
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
   * Returns the value of the '<em><b>Years</b></em>' containment reference list.
   * The list contents are of type {@link school.Year}.
   * It is bidirectional and its opposite is '{@link school.Year#getSchool <em>School</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Years</em>' containment reference list.
   * @see school.SchoolPackage#getSchool_Years()
   * @see school.Year#getSchool
   * @model opposite="school" containment="true"
   * @generated
   */
	EList<Year> getYears();

	/**
   * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
   * The list contents are of type {@link school.Teacher}.
   * It is bidirectional and its opposite is '{@link school.Teacher#getSchool <em>School</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teachers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Teachers</em>' containment reference list.
   * @see school.SchoolPackage#getSchool_Teachers()
   * @see school.Teacher#getSchool
   * @model opposite="school" containment="true"
   * @generated
   */
	EList<Teacher> getTeachers();

	/**
   * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
   * The list contents are of type {@link school.Course}.
   * It is bidirectional and its opposite is '{@link school.Course#getSchool <em>School</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Courses</em>' containment reference list.
   * @see school.SchoolPackage#getSchool_Courses()
   * @see school.Course#getSchool
   * @model opposite="school" containment="true"
   * @generated
   */
	EList<Course> getCourses();

	/**
   * Returns the value of the '<em><b>Number Of Teachers</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Teachers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Teachers</em>' attribute.
   * @see school.SchoolPackage#getSchool_NumberOfTeachers()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
	int getNumberOfTeachers();

	/**
   * Returns the value of the '<em><b>Teachers With Most Courses</b></em>' reference list.
   * The list contents are of type {@link school.Teacher}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teachers With Most Courses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Teachers With Most Courses</em>' reference list.
   * @see school.SchoolPackage#getSchool_TeachersWithMostCourses()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
	EList<Teacher> getTeachersWithMostCourses();

	/**
   * Returns the value of the '<em><b>Last Year</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Year</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Last Year</em>' reference.
   * @see school.SchoolPackage#getSchool_LastYear()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
	Year getLastYear();

	/**
   * Returns the value of the '<em><b>Current Year</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Current Year</em>' attribute.
   * @see #setCurrentYear(int)
   * @see school.SchoolPackage#getSchool_CurrentYear()
   * @model
   * @generated
   */
	int getCurrentYear();

	/**
   * Sets the value of the '{@link school.School#getCurrentYear <em>Current Year</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Year</em>' attribute.
   * @see #getCurrentYear()
   * @generated
   */
	void setCurrentYear(int value);

  /**
   * Returns the value of the '<em><b>Min Weight In Last Year</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Weight In Last Year</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Weight In Last Year</em>' reference.
   * @see #setMinWeightInLastYear(Course)
   * @see school.SchoolPackage#getSchool_MinWeightInLastYear()
   * @model
   * @generated
   */
  Course getMinWeightInLastYear();

  /**
   * Sets the value of the '{@link school.School#getMinWeightInLastYear <em>Min Weight In Last Year</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Weight In Last Year</em>' reference.
   * @see #getMinWeightInLastYear()
   * @generated
   */
  void setMinWeightInLastYear(Course value);

} // School
