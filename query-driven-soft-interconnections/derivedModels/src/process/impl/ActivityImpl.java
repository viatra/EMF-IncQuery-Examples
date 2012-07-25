/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Activity;
import process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.ActivityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link process.impl.ActivityImpl#getNext <em>Next</em>}</li>
 *   <li>{@link process.impl.ActivityImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends ProcessElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Process getParent() {
		if (eContainerFeatureID() != ProcessPackage.ACTIVITY__PARENT) return null;
		return (process.Process)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(process.Process newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ProcessPackage.ACTIVITY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(process.Process newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ProcessPackage.ACTIVITY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ProcessPackage.PROCESS__CONTENTS, process.Process.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ACTIVITY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse(Activity.class, this, ProcessPackage.ACTIVITY__NEXT, ProcessPackage.ACTIVITY__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse(Activity.class, this, ProcessPackage.ACTIVITY__PREVIOUS, ProcessPackage.ACTIVITY__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((process.Process)otherEnd, msgs);
			case ProcessPackage.ACTIVITY__NEXT:
				return ((InternalEList)getNext()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__PREVIOUS:
				return ((InternalEList)getPrevious()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				return basicSetParent(null, msgs);
			case ProcessPackage.ACTIVITY__NEXT:
				return ((InternalEList)getNext()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__PREVIOUS:
				return ((InternalEList)getPrevious()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProcessPackage.ACTIVITY__PARENT:
				return eInternalContainer().eInverseRemove(this, ProcessPackage.PROCESS__CONTENTS, process.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				return getParent();
			case ProcessPackage.ACTIVITY__NEXT:
				return getNext();
			case ProcessPackage.ACTIVITY__PREVIOUS:
				return getPrevious();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				setParent((process.Process)newValue);
				return;
			case ProcessPackage.ACTIVITY__NEXT:
				getNext().clear();
				getNext().addAll((Collection)newValue);
				return;
			case ProcessPackage.ACTIVITY__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				setParent((process.Process)null);
				return;
			case ProcessPackage.ACTIVITY__NEXT:
				getNext().clear();
				return;
			case ProcessPackage.ACTIVITY__PREVIOUS:
				getPrevious().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessPackage.ACTIVITY__PARENT:
				return getParent() != null;
			case ProcessPackage.ACTIVITY__NEXT:
				return next != null && !next.isEmpty();
			case ProcessPackage.ACTIVITY__PREVIOUS:
				return previous != null && !previous.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
