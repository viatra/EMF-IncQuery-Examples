/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain.impl;

import domain.ApiClass;
import domain.DomainPackage;
import domain.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.MethodImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link domain.impl.MethodImpl#getApiClass <em>Api Class</em>}</li>
 *   <li>{@link domain.impl.MethodImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link domain.impl.MethodImpl#getReferencedFields <em>Referenced Fields</em>}</li>
 *   <li>{@link domain.impl.MethodImpl#getReferencedMethods <em>Referenced Methods</em>}</li>
 *   <li>{@link domain.impl.MethodImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends CodeElementImpl implements Method {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected Boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedFields() <em>Referenced Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedFields;

	/**
	 * The cached value of the '{@link #getReferencedMethods() <em>Referenced Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedMethods;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiClass getApiClass() {
		if (eContainerFeatureID() != DomainPackage.METHOD__API_CLASS) return null;
		return (ApiClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiClass(ApiClass newApiClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApiClass, DomainPackage.METHOD__API_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiClass(ApiClass newApiClass) {
		if (newApiClass != eInternalContainer() || (eContainerFeatureID() != DomainPackage.METHOD__API_CLASS && newApiClass != null)) {
			if (EcoreUtil.isAncestor(this, newApiClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApiClass != null)
				msgs = ((InternalEObject)newApiClass).eInverseAdd(this, DomainPackage.API_CLASS__METHODS, ApiClass.class, msgs);
			msgs = basicSetApiClass(newApiClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__API_CLASS, newApiClass, newApiClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(Boolean newPrivate) {
		Boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedFields() {
		return referencedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedFields(EList<String> newReferencedFields) {
		EList<String> oldReferencedFields = referencedFields;
		referencedFields = newReferencedFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__REFERENCED_FIELDS, oldReferencedFields, referencedFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedMethods() {
		return referencedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMethods(EList<String> newReferencedMethods) {
		EList<String> oldReferencedMethods = referencedMethods;
		referencedMethods = newReferencedMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__REFERENCED_METHODS, oldReferencedMethods, referencedMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.METHOD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.METHOD__API_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApiClass((ApiClass)otherEnd, msgs);
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
			case DomainPackage.METHOD__API_CLASS:
				return basicSetApiClass(null, msgs);
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
			case DomainPackage.METHOD__API_CLASS:
				return eInternalContainer().eInverseRemove(this, DomainPackage.API_CLASS__METHODS, ApiClass.class, msgs);
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
			case DomainPackage.METHOD__SIGNATURE:
				return getSignature();
			case DomainPackage.METHOD__API_CLASS:
				return getApiClass();
			case DomainPackage.METHOD__PRIVATE:
				return getPrivate();
			case DomainPackage.METHOD__REFERENCED_FIELDS:
				return getReferencedFields();
			case DomainPackage.METHOD__REFERENCED_METHODS:
				return getReferencedMethods();
			case DomainPackage.METHOD__STATIC:
				return isStatic();
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
			case DomainPackage.METHOD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case DomainPackage.METHOD__API_CLASS:
				setApiClass((ApiClass)newValue);
				return;
			case DomainPackage.METHOD__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case DomainPackage.METHOD__REFERENCED_FIELDS:
				setReferencedFields((EList<String>)newValue);
				return;
			case DomainPackage.METHOD__REFERENCED_METHODS:
				setReferencedMethods((EList<String>)newValue);
				return;
			case DomainPackage.METHOD__STATIC:
				setStatic((Boolean)newValue);
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
			case DomainPackage.METHOD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case DomainPackage.METHOD__API_CLASS:
				setApiClass((ApiClass)null);
				return;
			case DomainPackage.METHOD__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case DomainPackage.METHOD__REFERENCED_FIELDS:
				setReferencedFields((EList<String>)null);
				return;
			case DomainPackage.METHOD__REFERENCED_METHODS:
				setReferencedMethods((EList<String>)null);
				return;
			case DomainPackage.METHOD__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case DomainPackage.METHOD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case DomainPackage.METHOD__API_CLASS:
				return getApiClass() != null;
			case DomainPackage.METHOD__PRIVATE:
				return PRIVATE_EDEFAULT == null ? private_ != null : !PRIVATE_EDEFAULT.equals(private_);
			case DomainPackage.METHOD__REFERENCED_FIELDS:
				return referencedFields != null;
			case DomainPackage.METHOD__REFERENCED_METHODS:
				return referencedMethods != null;
			case DomainPackage.METHOD__STATIC:
				return static_ != STATIC_EDEFAULT;
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", private: ");
		result.append(private_);
		result.append(", referencedFields: ");
		result.append(referencedFields);
		result.append(", referencedMethods: ");
		result.append(referencedMethods);
		result.append(", static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
