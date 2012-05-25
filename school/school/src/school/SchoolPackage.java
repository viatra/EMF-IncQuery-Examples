/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see school.SchoolFactory
 * @model kind="package"
 * @generated
 */
public interface SchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "school";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://school.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "school";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolPackage eINSTANCE = school.impl.SchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link school.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.CourseImpl
	 * @see school.impl.SchoolPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SCHOOL = 2;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TEACHER = 3;

	/**
	 * The feature id for the '<em><b>School Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SCHOOL_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link school.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.SchoolImpl
	 * @see school.impl.SchoolPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__YEARS = 2;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__TEACHERS = 3;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__COURSES = 4;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link school.impl.SchoolClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.SchoolClassImpl
	 * @see school.impl.SchoolPackageImpl#getSchoolClass()
	 * @generated
	 */
	int SCHOOL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS__CODE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS__STUDENTS = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS__COURSES = 3;

	/**
	 * The feature id for the '<em><b>Homeroom Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS__HOMEROOM_TEACHER = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_CLASS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link school.impl.SpecialisationCourseImpl <em>Specialisation Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.SpecialisationCourseImpl
	 * @see school.impl.SchoolPackageImpl#getSpecialisationCourse()
	 * @generated
	 */
	int SPECIALISATION_COURSE = 3;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__SUBJECT = COURSE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__WEIGHT = COURSE__WEIGHT;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__SCHOOL = COURSE__SCHOOL;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__TEACHER = COURSE__TEACHER;

	/**
	 * The feature id for the '<em><b>School Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__SCHOOL_CLASS = COURSE__SCHOOL_CLASS;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE__SPECIALISATION = COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialisation Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_COURSE_FEATURE_COUNT = COURSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link school.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.StudentImpl
	 * @see school.impl.SchoolPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>School Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SCHOOL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Friends With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FRIENDS_WITH = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link school.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.TeacherImpl
	 * @see school.impl.SchoolPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Homeroomed Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__HOMEROOMED_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link school.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.YearImpl
	 * @see school.impl.SchoolPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 6;

	/**
	 * The feature id for the '<em><b>Starting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__STARTING_DATE = 0;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>School Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SCHOOL_CLASSES = 2;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link school.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see school.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link school.Course#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see school.Course#getSubject()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Subject();

	/**
	 * Returns the meta object for the attribute '{@link school.Course#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see school.Course#getWeight()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Weight();

	/**
	 * Returns the meta object for the container reference '{@link school.Course#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see school.Course#getSchool()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_School();

	/**
	 * Returns the meta object for the reference '{@link school.Course#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teacher</em>'.
	 * @see school.Course#getTeacher()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Teacher();

	/**
	 * Returns the meta object for the reference '{@link school.Course#getSchoolClass <em>School Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>School Class</em>'.
	 * @see school.Course#getSchoolClass()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_SchoolClass();

	/**
	 * Returns the meta object for class '{@link school.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see school.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the attribute '{@link school.School#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.School#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for the attribute '{@link school.School#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see school.School#getAddress()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Years</em>'.
	 * @see school.School#getYears()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Years();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teachers</em>'.
	 * @see school.School#getTeachers()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Teachers();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see school.School#getCourses()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Courses();

	/**
	 * Returns the meta object for class '{@link school.SchoolClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see school.SchoolClass
	 * @generated
	 */
	EClass getSchoolClass();

	/**
	 * Returns the meta object for the attribute '{@link school.SchoolClass#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see school.SchoolClass#getCode()
	 * @see #getSchoolClass()
	 * @generated
	 */
	EAttribute getSchoolClass_Code();

	/**
	 * Returns the meta object for the container reference '{@link school.SchoolClass#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Year</em>'.
	 * @see school.SchoolClass#getYear()
	 * @see #getSchoolClass()
	 * @generated
	 */
	EReference getSchoolClass_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link school.SchoolClass#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see school.SchoolClass#getStudents()
	 * @see #getSchoolClass()
	 * @generated
	 */
	EReference getSchoolClass_Students();

	/**
	 * Returns the meta object for the reference list '{@link school.SchoolClass#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see school.SchoolClass#getCourses()
	 * @see #getSchoolClass()
	 * @generated
	 */
	EReference getSchoolClass_Courses();

	/**
	 * Returns the meta object for the reference '{@link school.SchoolClass#getHomeroomTeacher <em>Homeroom Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Homeroom Teacher</em>'.
	 * @see school.SchoolClass#getHomeroomTeacher()
	 * @see #getSchoolClass()
	 * @generated
	 */
	EReference getSchoolClass_HomeroomTeacher();

	/**
	 * Returns the meta object for class '{@link school.SpecialisationCourse <em>Specialisation Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation Course</em>'.
	 * @see school.SpecialisationCourse
	 * @generated
	 */
	EClass getSpecialisationCourse();

	/**
	 * Returns the meta object for the attribute '{@link school.SpecialisationCourse#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialisation</em>'.
	 * @see school.SpecialisationCourse#getSpecialisation()
	 * @see #getSpecialisationCourse()
	 * @generated
	 */
	EAttribute getSpecialisationCourse_Specialisation();

	/**
	 * Returns the meta object for class '{@link school.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see school.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link school.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the container reference '{@link school.Student#getSchoolClass <em>School Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School Class</em>'.
	 * @see school.Student#getSchoolClass()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_SchoolClass();

	/**
	 * Returns the meta object for the reference list '{@link school.Student#getFriendsWith <em>Friends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends With</em>'.
	 * @see school.Student#getFriendsWith()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_FriendsWith();

	/**
	 * Returns the meta object for class '{@link school.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see school.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link school.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for the container reference '{@link school.Teacher#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see school.Teacher#getSchool()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_School();

	/**
	 * Returns the meta object for the reference list '{@link school.Teacher#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see school.Teacher#getCourses()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Courses();

	/**
	 * Returns the meta object for the reference '{@link school.Teacher#getHomeroomedClass <em>Homeroomed Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Homeroomed Class</em>'.
	 * @see school.Teacher#getHomeroomedClass()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_HomeroomedClass();

	/**
	 * Returns the meta object for class '{@link school.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see school.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link school.Year#getStartingDate <em>Starting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Date</em>'.
	 * @see school.Year#getStartingDate()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_StartingDate();

	/**
	 * Returns the meta object for the container reference '{@link school.Year#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see school.Year#getSchool()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_School();

	/**
	 * Returns the meta object for the containment reference list '{@link school.Year#getSchoolClasses <em>School Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>School Classes</em>'.
	 * @see school.Year#getSchoolClasses()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_SchoolClasses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link school.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.CourseImpl
		 * @see school.impl.SchoolPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SUBJECT = eINSTANCE.getCourse_Subject();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__WEIGHT = eINSTANCE.getCourse_Weight();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__SCHOOL = eINSTANCE.getCourse_School();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TEACHER = eINSTANCE.getCourse_Teacher();

		/**
		 * The meta object literal for the '<em><b>School Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__SCHOOL_CLASS = eINSTANCE.getCourse_SchoolClass();

		/**
		 * The meta object literal for the '{@link school.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.SchoolImpl
		 * @see school.impl.SchoolPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__ADDRESS = eINSTANCE.getSchool_Address();

		/**
		 * The meta object literal for the '<em><b>Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__YEARS = eINSTANCE.getSchool_Years();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__TEACHERS = eINSTANCE.getSchool_Teachers();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__COURSES = eINSTANCE.getSchool_Courses();

		/**
		 * The meta object literal for the '{@link school.impl.SchoolClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.SchoolClassImpl
		 * @see school.impl.SchoolPackageImpl#getSchoolClass()
		 * @generated
		 */
		EClass SCHOOL_CLASS = eINSTANCE.getSchoolClass();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL_CLASS__CODE = eINSTANCE.getSchoolClass_Code();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_CLASS__YEAR = eINSTANCE.getSchoolClass_Year();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_CLASS__STUDENTS = eINSTANCE.getSchoolClass_Students();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_CLASS__COURSES = eINSTANCE.getSchoolClass_Courses();

		/**
		 * The meta object literal for the '<em><b>Homeroom Teacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_CLASS__HOMEROOM_TEACHER = eINSTANCE.getSchoolClass_HomeroomTeacher();

		/**
		 * The meta object literal for the '{@link school.impl.SpecialisationCourseImpl <em>Specialisation Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.SpecialisationCourseImpl
		 * @see school.impl.SchoolPackageImpl#getSpecialisationCourse()
		 * @generated
		 */
		EClass SPECIALISATION_COURSE = eINSTANCE.getSpecialisationCourse();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION_COURSE__SPECIALISATION = eINSTANCE.getSpecialisationCourse_Specialisation();

		/**
		 * The meta object literal for the '{@link school.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.StudentImpl
		 * @see school.impl.SchoolPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>School Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__SCHOOL_CLASS = eINSTANCE.getStudent_SchoolClass();

		/**
		 * The meta object literal for the '<em><b>Friends With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__FRIENDS_WITH = eINSTANCE.getStudent_FriendsWith();

		/**
		 * The meta object literal for the '{@link school.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.TeacherImpl
		 * @see school.impl.SchoolPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__SCHOOL = eINSTANCE.getTeacher_School();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__COURSES = eINSTANCE.getTeacher_Courses();

		/**
		 * The meta object literal for the '<em><b>Homeroomed Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__HOMEROOMED_CLASS = eINSTANCE.getTeacher_HomeroomedClass();

		/**
		 * The meta object literal for the '{@link school.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.YearImpl
		 * @see school.impl.SchoolPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Starting Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__STARTING_DATE = eINSTANCE.getYear_StartingDate();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SCHOOL = eINSTANCE.getYear_School();

		/**
		 * The meta object literal for the '<em><b>School Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SCHOOL_CLASSES = eINSTANCE.getYear_SchoolClasses();

	}

} //SchoolPackage
