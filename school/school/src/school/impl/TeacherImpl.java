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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.School;
import school.SchoolClass;
import school.SchoolPackage;
import school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.TeacherImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.TeacherImpl#getSchool <em>School</em>}</li>
 *   <li>{@link school.impl.TeacherImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link school.impl.TeacherImpl#getHomeroomedClass <em>Homeroomed Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeacherImpl extends EObjectImpl implements Teacher {
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
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getHomeroomedClass() <em>Homeroomed Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeroomedClass()
	 * @generated
	 * @ordered
	 */
	protected SchoolClass homeroomedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.TEACHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.TEACHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School getSchool() {
		if (eContainerFeatureID() != SchoolPackage.TEACHER__SCHOOL) return null;
		return (School)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, SchoolPackage.TEACHER__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != SchoolPackage.TEACHER__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, SchoolPackage.SCHOOL__TEACHERS, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.TEACHER__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectWithInverseEList<Course>(Course.class, this, SchoolPackage.TEACHER__COURSES, SchoolPackage.COURSE__TEACHER);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolClass getHomeroomedClass() {
		if (homeroomedClass != null && homeroomedClass.eIsProxy()) {
			InternalEObject oldHomeroomedClass = (InternalEObject)homeroomedClass;
			homeroomedClass = (SchoolClass)eResolveProxy(oldHomeroomedClass);
			if (homeroomedClass != oldHomeroomedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.TEACHER__HOMEROOMED_CLASS, oldHomeroomedClass, homeroomedClass));
			}
		}
		return homeroomedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolClass basicGetHomeroomedClass() {
		return homeroomedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeroomedClass(SchoolClass newHomeroomedClass, NotificationChain msgs) {
		SchoolClass oldHomeroomedClass = homeroomedClass;
		homeroomedClass = newHomeroomedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.TEACHER__HOMEROOMED_CLASS, oldHomeroomedClass, newHomeroomedClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeroomedClass(SchoolClass newHomeroomedClass) {
		if (newHomeroomedClass != homeroomedClass) {
			NotificationChain msgs = null;
			if (homeroomedClass != null)
				msgs = ((InternalEObject)homeroomedClass).eInverseRemove(this, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, SchoolClass.class, msgs);
			if (newHomeroomedClass != null)
				msgs = ((InternalEObject)newHomeroomedClass).eInverseAdd(this, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, SchoolClass.class, msgs);
			msgs = basicSetHomeroomedClass(newHomeroomedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.TEACHER__HOMEROOMED_CLASS, newHomeroomedClass, newHomeroomedClass));
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
			case SchoolPackage.TEACHER__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((School)otherEnd, msgs);
			case SchoolPackage.TEACHER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				if (homeroomedClass != null)
					msgs = ((InternalEObject)homeroomedClass).eInverseRemove(this, SchoolPackage.SCHOOL_CLASS__HOMEROOM_TEACHER, SchoolClass.class, msgs);
				return basicSetHomeroomedClass((SchoolClass)otherEnd, msgs);
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
			case SchoolPackage.TEACHER__SCHOOL:
				return basicSetSchool(null, msgs);
			case SchoolPackage.TEACHER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				return basicSetHomeroomedClass(null, msgs);
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
			case SchoolPackage.TEACHER__SCHOOL:
				return eInternalContainer().eInverseRemove(this, SchoolPackage.SCHOOL__TEACHERS, School.class, msgs);
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
			case SchoolPackage.TEACHER__NAME:
				return getName();
			case SchoolPackage.TEACHER__SCHOOL:
				return getSchool();
			case SchoolPackage.TEACHER__COURSES:
				return getCourses();
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				if (resolve) return getHomeroomedClass();
				return basicGetHomeroomedClass();
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
			case SchoolPackage.TEACHER__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.TEACHER__SCHOOL:
				setSchool((School)newValue);
				return;
			case SchoolPackage.TEACHER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				setHomeroomedClass((SchoolClass)newValue);
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
			case SchoolPackage.TEACHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.TEACHER__SCHOOL:
				setSchool((School)null);
				return;
			case SchoolPackage.TEACHER__COURSES:
				getCourses().clear();
				return;
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				setHomeroomedClass((SchoolClass)null);
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
			case SchoolPackage.TEACHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.TEACHER__SCHOOL:
				return getSchool() != null;
			case SchoolPackage.TEACHER__COURSES:
				return courses != null && !courses.isEmpty();
			case SchoolPackage.TEACHER__HOMEROOMED_CLASS:
				return homeroomedClass != null;
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
		result.append(')');
		return result.toString();
	}

} //TeacherImpl
