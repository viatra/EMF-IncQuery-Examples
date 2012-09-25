/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import school.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoolFactoryImpl extends EFactoryImpl implements SchoolFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SchoolFactory init() {
        try {
            SchoolFactory theSchoolFactory = (SchoolFactory)EPackage.Registry.INSTANCE.getEFactory("http://school.ecore"); 
            if (theSchoolFactory != null) {
                return theSchoolFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SchoolFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchoolFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SchoolPackage.COURSE: return createCourse();
            case SchoolPackage.SCHOOL: return createSchool();
            case SchoolPackage.SCHOOL_CLASS: return createSchoolClass();
            case SchoolPackage.SPECIALISATION_COURSE: return createSpecialisationCourse();
            case SchoolPackage.STUDENT: return createStudent();
            case SchoolPackage.TEACHER: return createTeacher();
            case SchoolPackage.YEAR: return createYear();
            case SchoolPackage.LIMITED_CAPACITY_COURSE: return createLimitedCapacityCourse();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Course createCourse() {
        CourseImpl course = new CourseImpl();
        return course;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public School createSchool() {
        SchoolImpl school = new SchoolImpl();
        return school;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchoolClass createSchoolClass() {
        SchoolClassImpl schoolClass = new SchoolClassImpl();
        return schoolClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpecialisationCourse createSpecialisationCourse() {
        SpecialisationCourseImpl specialisationCourse = new SpecialisationCourseImpl();
        return specialisationCourse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Student createStudent() {
        StudentImpl student = new StudentImpl();
        return student;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Teacher createTeacher() {
        TeacherImpl teacher = new TeacherImpl();
        return teacher;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Year createYear() {
        YearImpl year = new YearImpl();
        return year;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LimitedCapacityCourse createLimitedCapacityCourse() {
        LimitedCapacityCourseImpl limitedCapacityCourse = new LimitedCapacityCourseImpl();
        return limitedCapacityCourse;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchoolPackage getSchoolPackage() {
        return (SchoolPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static SchoolPackage getPackage() {
        return SchoolPackage.eINSTANCE;
    }

} //SchoolFactoryImpl
