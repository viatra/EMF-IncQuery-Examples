/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import school.Course;
import school.School;
import school.SchoolClass;
import school.SchoolPackage;
import school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.CourseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getSchool <em>School</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getSchoolClass <em>School Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseImpl extends EObjectImpl implements Course {
	/**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
	protected String subject = SUBJECT_EDEFAULT;

	/**
     * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
	protected int weight = WEIGHT_EDEFAULT;

	/**
     * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTeacher()
     * @generated
     * @ordered
     */
	protected Teacher teacher;

	/**
     * The cached value of the '{@link #getSchoolClass() <em>School Class</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchoolClass()
     * @generated
     * @ordered
     */
	protected SchoolClass schoolClass;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CourseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SchoolPackage.Literals.COURSE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSubject() {
        return subject;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSubject(String newSubject) {
        String oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__SUBJECT, oldSubject, subject));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getWeight() {
        return weight;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWeight(int newWeight) {
        int oldWeight = weight;
        weight = newWeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__WEIGHT, oldWeight, weight));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public School getSchool() {
        if (eContainerFeatureID() != SchoolPackage.COURSE__SCHOOL) return null;
        return (School)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSchool, SchoolPackage.COURSE__SCHOOL, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchool(School newSchool) {
        if (newSchool != eInternalContainer() || (eContainerFeatureID() != SchoolPackage.COURSE__SCHOOL && newSchool != null)) {
            if (EcoreUtil.isAncestor(this, newSchool))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSchool != null)
                msgs = ((InternalEObject)newSchool).eInverseAdd(this, SchoolPackage.SCHOOL__COURSES, School.class, msgs);
            msgs = basicSetSchool(newSchool, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__SCHOOL, newSchool, newSchool));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Teacher getTeacher() {
        if (teacher != null && teacher.eIsProxy()) {
            InternalEObject oldTeacher = (InternalEObject)teacher;
            teacher = (Teacher)eResolveProxy(oldTeacher);
            if (teacher != oldTeacher) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.COURSE__TEACHER, oldTeacher, teacher));
            }
        }
        return teacher;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Teacher basicGetTeacher() {
        return teacher;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTeacher(Teacher newTeacher, NotificationChain msgs) {
        Teacher oldTeacher = teacher;
        teacher = newTeacher;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__TEACHER, oldTeacher, newTeacher);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTeacher(Teacher newTeacher) {
        if (newTeacher != teacher) {
            NotificationChain msgs = null;
            if (teacher != null)
                msgs = ((InternalEObject)teacher).eInverseRemove(this, SchoolPackage.TEACHER__COURSES, Teacher.class, msgs);
            if (newTeacher != null)
                msgs = ((InternalEObject)newTeacher).eInverseAdd(this, SchoolPackage.TEACHER__COURSES, Teacher.class, msgs);
            msgs = basicSetTeacher(newTeacher, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__TEACHER, newTeacher, newTeacher));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchoolClass getSchoolClass() {
        if (schoolClass != null && schoolClass.eIsProxy()) {
            InternalEObject oldSchoolClass = (InternalEObject)schoolClass;
            schoolClass = (SchoolClass)eResolveProxy(oldSchoolClass);
            if (schoolClass != oldSchoolClass) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.COURSE__SCHOOL_CLASS, oldSchoolClass, schoolClass));
            }
        }
        return schoolClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SchoolClass basicGetSchoolClass() {
        return schoolClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSchoolClass(SchoolClass newSchoolClass, NotificationChain msgs) {
        SchoolClass oldSchoolClass = schoolClass;
        schoolClass = newSchoolClass;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__SCHOOL_CLASS, oldSchoolClass, newSchoolClass);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchoolClass(SchoolClass newSchoolClass) {
        if (newSchoolClass != schoolClass) {
            NotificationChain msgs = null;
            if (schoolClass != null)
                msgs = ((InternalEObject)schoolClass).eInverseRemove(this, SchoolPackage.SCHOOL_CLASS__COURSES, SchoolClass.class, msgs);
            if (newSchoolClass != null)
                msgs = ((InternalEObject)newSchoolClass).eInverseAdd(this, SchoolPackage.SCHOOL_CLASS__COURSES, SchoolClass.class, msgs);
            msgs = basicSetSchoolClass(newSchoolClass, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__SCHOOL_CLASS, newSchoolClass, newSchoolClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SchoolPackage.COURSE__SCHOOL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSchool((School)otherEnd, msgs);
            case SchoolPackage.COURSE__TEACHER:
                if (teacher != null)
                    msgs = ((InternalEObject)teacher).eInverseRemove(this, SchoolPackage.TEACHER__COURSES, Teacher.class, msgs);
                return basicSetTeacher((Teacher)otherEnd, msgs);
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                if (schoolClass != null)
                    msgs = ((InternalEObject)schoolClass).eInverseRemove(this, SchoolPackage.SCHOOL_CLASS__COURSES, SchoolClass.class, msgs);
                return basicSetSchoolClass((SchoolClass)otherEnd, msgs);
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
            case SchoolPackage.COURSE__SCHOOL:
                return basicSetSchool(null, msgs);
            case SchoolPackage.COURSE__TEACHER:
                return basicSetTeacher(null, msgs);
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                return basicSetSchoolClass(null, msgs);
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
            case SchoolPackage.COURSE__SCHOOL:
                return eInternalContainer().eInverseRemove(this, SchoolPackage.SCHOOL__COURSES, School.class, msgs);
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
            case SchoolPackage.COURSE__SUBJECT:
                return getSubject();
            case SchoolPackage.COURSE__WEIGHT:
                return getWeight();
            case SchoolPackage.COURSE__SCHOOL:
                return getSchool();
            case SchoolPackage.COURSE__TEACHER:
                if (resolve) return getTeacher();
                return basicGetTeacher();
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                if (resolve) return getSchoolClass();
                return basicGetSchoolClass();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SchoolPackage.COURSE__SUBJECT:
                setSubject((String)newValue);
                return;
            case SchoolPackage.COURSE__WEIGHT:
                setWeight((Integer)newValue);
                return;
            case SchoolPackage.COURSE__SCHOOL:
                setSchool((School)newValue);
                return;
            case SchoolPackage.COURSE__TEACHER:
                setTeacher((Teacher)newValue);
                return;
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                setSchoolClass((SchoolClass)newValue);
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
            case SchoolPackage.COURSE__SUBJECT:
                setSubject(SUBJECT_EDEFAULT);
                return;
            case SchoolPackage.COURSE__WEIGHT:
                setWeight(WEIGHT_EDEFAULT);
                return;
            case SchoolPackage.COURSE__SCHOOL:
                setSchool((School)null);
                return;
            case SchoolPackage.COURSE__TEACHER:
                setTeacher((Teacher)null);
                return;
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                setSchoolClass((SchoolClass)null);
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
            case SchoolPackage.COURSE__SUBJECT:
                return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
            case SchoolPackage.COURSE__WEIGHT:
                return weight != WEIGHT_EDEFAULT;
            case SchoolPackage.COURSE__SCHOOL:
                return getSchool() != null;
            case SchoolPackage.COURSE__TEACHER:
                return teacher != null;
            case SchoolPackage.COURSE__SCHOOL_CLASS:
                return schoolClass != null;
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
        result.append(" (subject: ");
        result.append(subject);
        result.append(", weight: ");
        result.append(weight);
        result.append(')');
        return result.toString();
    }

} //CourseImpl
