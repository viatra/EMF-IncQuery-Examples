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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.SchoolClass;
import school.SchoolPackage;
import school.Student;
import school.Teacher;
import school.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.SchoolClassImpl#getCode <em>Code</em>}</li>
 *   <li>{@link school.impl.SchoolClassImpl#getYear <em>Year</em>}</li>
 *   <li>{@link school.impl.SchoolClassImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link school.impl.SchoolClassImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.impl.SchoolClassImpl#getHomeroomTeacher <em>Homeroom Teacher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchoolClassImpl extends EObjectImpl implements SchoolClass {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final char CODE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected char code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getHomeroomTeacher() <em>Homeroom Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeroomTeacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher homeroomTeacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.SCHOOL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(char newCode) {
		char oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_CLASS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getYear() {
		if (eContainerFeatureID() != SchoolPackage.SCHOOL_CLASS__YEAR) return null;
		return (Year)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYear, SchoolPackage.SCHOOL_CLASS__YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Year newYear) {
		if (newYear != eInternalContainer() || (eContainerFeatureID() != SchoolPackage.SCHOOL_CLASS__YEAR && newYear != null)) {
			if (EcoreUtil.isAncestor(this, newYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, SchoolPackage.YEAR__SCHOOL_CLASSES, Year.class, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_CLASS__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentWithInverseEList<Student>(Student.class, this, SchoolPackage.SCHOOL_CLASS__STUDENTS, SchoolPackage.STUDENT__SCHOOL_CLASS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectWithInverseEList<Course>(Course.class, this, SchoolPackage.SCHOOL_CLASS__COURSES, SchoolPackage.COURSE__SCHOOL_CLASS);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getHomeroomTeacher() {
		if (homeroomTeacher != null && homeroomTeacher.eIsProxy()) {
			InternalEObject oldHomeroomTeacher = (InternalEObject)homeroomTeacher;
			homeroomTeacher = (Teacher)eResolveProxy(oldHomeroomTeacher);
			if (homeroomTeacher != oldHomeroomTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, oldHomeroomTeacher, homeroomTeacher));
			}
		}
		return homeroomTeacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetHomeroomTeacher() {
		return homeroomTeacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeroomTeacher(Teacher newHomeroomTeacher, NotificationChain msgs) {
		Teacher oldHomeroomTeacher = homeroomTeacher;
		homeroomTeacher = newHomeroomTeacher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, oldHomeroomTeacher, newHomeroomTeacher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeroomTeacher(Teacher newHomeroomTeacher) {
		if (newHomeroomTeacher != homeroomTeacher) {
			NotificationChain msgs = null;
			if (homeroomTeacher != null)
				msgs = ((InternalEObject)homeroomTeacher).eInverseRemove(this, SchoolPackage.TEACHER__HOMEROOMED_CLASS, Teacher.class, msgs);
			if (newHomeroomTeacher != null)
				msgs = ((InternalEObject)newHomeroomTeacher).eInverseAdd(this, SchoolPackage.TEACHER__HOMEROOMED_CLASS, Teacher.class, msgs);
			msgs = basicSetHomeroomTeacher(newHomeroomTeacher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, newHomeroomTeacher, newHomeroomTeacher));
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
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYear((Year)otherEnd, msgs);
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				if (homeroomTeacher != null)
					msgs = ((InternalEObject)homeroomTeacher).eInverseRemove(this, SchoolPackage.TEACHER__HOMEROOMED_CLASS, Teacher.class, msgs);
				return basicSetHomeroomTeacher((Teacher)otherEnd, msgs);
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
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				return basicSetYear(null, msgs);
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				return basicSetHomeroomTeacher(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				return eInternalContainer().eInverseRemove(this, SchoolPackage.YEAR__SCHOOL_CLASSES, Year.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolPackage.SCHOOL_CLASS__CODE:
				return getCode();
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				return getYear();
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				return getStudents();
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				return getCourses();
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				if (resolve) return getHomeroomTeacher();
				return basicGetHomeroomTeacher();
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
			case SchoolPackage.SCHOOL_CLASS__CODE:
				setCode((Character)newValue);
				return;
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				setYear((Year)newValue);
				return;
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				setHomeroomTeacher((Teacher)newValue);
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
			case SchoolPackage.SCHOOL_CLASS__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				setYear((Year)null);
				return;
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				getStudents().clear();
				return;
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				getCourses().clear();
				return;
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				setHomeroomTeacher((Teacher)null);
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
			case SchoolPackage.SCHOOL_CLASS__CODE:
				return code != CODE_EDEFAULT;
			case SchoolPackage.SCHOOL_CLASS__YEAR:
				return getYear() != null;
			case SchoolPackage.SCHOOL_CLASS__STUDENTS:
				return students != null && !students.isEmpty();
			case SchoolPackage.SCHOOL_CLASS__COURSES:
				return courses != null && !courses.isEmpty();
			case SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER:
				return homeroomTeacher != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //SchoolClassImpl
