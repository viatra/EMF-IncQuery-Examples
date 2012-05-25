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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import school.SchoolClass;
import school.SchoolPackage;
import school.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.StudentImpl#getSchoolClass <em>School Class</em>}</li>
 *   <li>{@link school.impl.StudentImpl#getFriendsWith <em>Friends With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentImpl extends EObjectImpl implements Student {
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
	 * The cached value of the '{@link #getFriendsWith() <em>Friends With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendsWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> friendsWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.STUDENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolClass getSchoolClass() {
		if (eContainerFeatureID() != SchoolPackage.STUDENT__SCHOOL_CLASS) return null;
		return (SchoolClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchoolClass(SchoolClass newSchoolClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchoolClass, SchoolPackage.STUDENT__SCHOOL_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchoolClass(SchoolClass newSchoolClass) {
		if (newSchoolClass != eInternalContainer() || (eContainerFeatureID() != SchoolPackage.STUDENT__SCHOOL_CLASS && newSchoolClass != null)) {
			if (EcoreUtil.isAncestor(this, newSchoolClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchoolClass != null)
				msgs = ((InternalEObject)newSchoolClass).eInverseAdd(this, SchoolPackage.SCHOOL_CLASS__STUDENTS, SchoolClass.class, msgs);
			msgs = basicSetSchoolClass(newSchoolClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__SCHOOL_CLASS, newSchoolClass, newSchoolClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getFriendsWith() {
		if (friendsWith == null) {
			friendsWith = new EObjectResolvingEList<Student>(Student.class, this, SchoolPackage.STUDENT__FRIENDS_WITH);
		}
		return friendsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
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
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				return eInternalContainer().eInverseRemove(this, SchoolPackage.SCHOOL_CLASS__STUDENTS, SchoolClass.class, msgs);
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
			case SchoolPackage.STUDENT__NAME:
				return getName();
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				return getSchoolClass();
			case SchoolPackage.STUDENT__FRIENDS_WITH:
				return getFriendsWith();
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
			case SchoolPackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				setSchoolClass((SchoolClass)newValue);
				return;
			case SchoolPackage.STUDENT__FRIENDS_WITH:
				getFriendsWith().clear();
				getFriendsWith().addAll((Collection<? extends Student>)newValue);
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
			case SchoolPackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				setSchoolClass((SchoolClass)null);
				return;
			case SchoolPackage.STUDENT__FRIENDS_WITH:
				getFriendsWith().clear();
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
			case SchoolPackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.STUDENT__SCHOOL_CLASS:
				return getSchoolClass() != null;
			case SchoolPackage.STUDENT__FRIENDS_WITH:
				return friendsWith != null && !friendsWith.isEmpty();
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

} //StudentImpl
