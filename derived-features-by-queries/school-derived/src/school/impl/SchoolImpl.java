/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.School;
import school.SchoolPackage;
import school.Teacher;
import school.Year;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.SchoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getYears <em>Years</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getNumberOfTeachers <em>Number Of Teachers</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getTeachersWithMostCourses <em>Teachers With Most Courses</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getLastYear <em>Last Year</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getCurrentYear <em>Current Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchoolImpl extends EObjectImpl implements School {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> years;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getNumberOfTeachers() <em>Number Of Teachers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTeachers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TEACHERS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCurrentYear() <em>Current Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentYear()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentYear() <em>Current Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentYear()
	 * @generated
	 * @ordered
	 */
	protected int currentYear = CURRENT_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentWithInverseEList<Year>(Year.class, this, SchoolPackage.SCHOOL__YEARS, SchoolPackage.YEAR__SCHOOL);
		}
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectContainmentWithInverseEList<Teacher>(Teacher.class, this, SchoolPackage.SCHOOL__TEACHERS, SchoolPackage.TEACHER__SCHOOL);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<Course>(Course.class, this, SchoolPackage.SCHOOL__COURSES, SchoolPackage.COURSE__SCHOOL);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTeachersGen() {
		// TODO: implement this method to return the 'Number Of Teachers' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeachersWithMostCoursesGen() {
		// TODO: implement this method to return the 'Teachers With Most Courses' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getLastYear() {
		Year lastYear = basicGetLastYear();
		return lastYear != null && lastYear.eIsProxy() ? (Year)eResolveProxy((InternalEObject)lastYear) : lastYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year basicGetLastYearGen() {
		// TODO: implement this method to return the 'Last Year' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentYear(int newCurrentYear) {
		int oldCurrentYear = currentYear;
		currentYear = newCurrentYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL__CURRENT_YEAR, oldCurrentYear, currentYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__YEARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getYears()).basicAdd(otherEnd, msgs);
			case SchoolPackage.SCHOOL__TEACHERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeachers()).basicAdd(otherEnd, msgs);
			case SchoolPackage.SCHOOL__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__YEARS:
				return ((InternalEList<?>)getYears()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__NAME:
				return getName();
			case SchoolPackage.SCHOOL__ADDRESS:
				return getAddress();
			case SchoolPackage.SCHOOL__YEARS:
				return getYears();
			case SchoolPackage.SCHOOL__TEACHERS:
				return getTeachers();
			case SchoolPackage.SCHOOL__COURSES:
				return getCourses();
			case SchoolPackage.SCHOOL__NUMBER_OF_TEACHERS:
				return getNumberOfTeachers();
			case SchoolPackage.SCHOOL__TEACHERS_WITH_MOST_COURSES:
				return getTeachersWithMostCourses();
			case SchoolPackage.SCHOOL__LAST_YEAR:
				if (resolve) return getLastYear();
				return basicGetLastYear();
			case SchoolPackage.SCHOOL__CURRENT_YEAR:
				return getCurrentYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.SCHOOL__ADDRESS:
				setAddress((String)newValue);
				return;
			case SchoolPackage.SCHOOL__YEARS:
				getYears().clear();
				getYears().addAll((Collection<? extends Year>)newValue);
				return;
			case SchoolPackage.SCHOOL__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Teacher>)newValue);
				return;
			case SchoolPackage.SCHOOL__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.SCHOOL__CURRENT_YEAR:
				setCurrentYear((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.SCHOOL__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case SchoolPackage.SCHOOL__YEARS:
				getYears().clear();
				return;
			case SchoolPackage.SCHOOL__TEACHERS:
				getTeachers().clear();
				return;
			case SchoolPackage.SCHOOL__COURSES:
				getCourses().clear();
				return;
			case SchoolPackage.SCHOOL__CURRENT_YEAR:
				setCurrentYear(CURRENT_YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.SCHOOL__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case SchoolPackage.SCHOOL__YEARS:
				return years != null && !years.isEmpty();
			case SchoolPackage.SCHOOL__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case SchoolPackage.SCHOOL__COURSES:
				return courses != null && !courses.isEmpty();
			case SchoolPackage.SCHOOL__NUMBER_OF_TEACHERS:
				return getNumberOfTeachers() != NUMBER_OF_TEACHERS_EDEFAULT;
			case SchoolPackage.SCHOOL__TEACHERS_WITH_MOST_COURSES:
				return !getTeachersWithMostCourses().isEmpty();
			case SchoolPackage.SCHOOL__LAST_YEAR:
				return basicGetLastYear() != null;
			case SchoolPackage.SCHOOL__CURRENT_YEAR:
				return currentYear != CURRENT_YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", currentYear: ");
		result.append(currentYear);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for derived feature numberOfTeachers
	 */
	private IncqueryFeatureHandler numberOfTeachersHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-InccQuery for derived feature numberOfTeachers
	 */
	public int getNumberOfTeachers() {
		if (numberOfTeachersHandler != null) {
			return numberOfTeachersHandler.getIntValue();
		} else {
			numberOfTeachersHandler = IncqueryFeatureHelper.createHandler(this,
					SchoolPackageImpl.Literals.SCHOOL__NUMBER_OF_TEACHERS,
					"teachers", "School", null, FeatureKind.COUNTER);
			if (numberOfTeachersHandler != null) {
				return numberOfTeachersHandler.getIntValue();
			}
		}
		return 0;
	}

	/**
	 * EMF-IncQuery handler for derived feature teachersWithMostCourses
	 */
	private IncqueryFeatureHandler teachersWithMostCoursesHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-InccQuery for derived feature teachersWithMostCourses
	 */
	public EList<Teacher> getTeachersWithMostCourses() {
		if (teachersWithMostCoursesHandler == null) {
			teachersWithMostCoursesHandler = IncqueryFeatureHelper
					.createHandler(
							this,
							SchoolPackageImpl.Literals.SCHOOL__TEACHERS_WITH_MOST_COURSES,
							"teacherWithMostCourses", "School", "Teacher",
							FeatureKind.MANY_REFERENCE, true);
		}
		return IncqueryFeatureHelper.getManyReferenceValueForHandler(
				teachersWithMostCoursesHandler, this,
				SchoolPackageImpl.Literals.SCHOOL__TEACHERS_WITH_MOST_COURSES);
	}

	/**
	 * EMF-IncQuery handler for derived feature lastYear
	 */
	private IncqueryFeatureHandler lastYearHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-InccQuery for derived feature lastYear
	 */
	public Year basicGetLastYear() {
		if (lastYearHandler != null) {
			return (school.Year) lastYearHandler.getSingleReferenceValue();
		} else {
			lastYearHandler = IncqueryFeatureHelper.createHandler(this,
					SchoolPackageImpl.Literals.SCHOOL__LAST_YEAR, "lastYear",
					"School", "Year", FeatureKind.SINGLE_REFERENCE, true);
			if (lastYearHandler != null) {
				return (school.Year) lastYearHandler.getSingleReferenceValue();
			}
		}
		return null;
	}

} //SchoolImpl
