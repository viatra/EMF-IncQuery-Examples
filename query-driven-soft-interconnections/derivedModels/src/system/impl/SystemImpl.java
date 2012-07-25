/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.Data;
import system.Interface;
import system.Job;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.SystemImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link system.impl.SystemImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link system.impl.SystemImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link system.impl.SystemImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ResourceElementImpl implements system.System {
	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList provides;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList uses;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList contains;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentWithInverseEList(Interface.class, this, SystemPackage.SYSTEM__PROVIDES, SystemPackage.INTERFACE__PROVIDER);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList.ManyInverse(Interface.class, this, SystemPackage.SYSTEM__USES, SystemPackage.INTERFACE__USER);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList(Job.class, this, SystemPackage.SYSTEM__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getData() {
		if (data == null) {
			data = new EObjectContainmentEList(Data.class, this, SystemPackage.SYSTEM__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.SYSTEM__PROVIDES:
				return ((InternalEList)getProvides()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__USES:
				return ((InternalEList)getUses()).basicAdd(otherEnd, msgs);
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
			case SystemPackage.SYSTEM__PROVIDES:
				return ((InternalEList)getProvides()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__USES:
				return ((InternalEList)getUses()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__CONTAINS:
				return ((InternalEList)getContains()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__DATA:
				return ((InternalEList)getData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.SYSTEM__PROVIDES:
				return getProvides();
			case SystemPackage.SYSTEM__USES:
				return getUses();
			case SystemPackage.SYSTEM__CONTAINS:
				return getContains();
			case SystemPackage.SYSTEM__DATA:
				return getData();
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
			case SystemPackage.SYSTEM__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection)newValue);
				return;
			case SystemPackage.SYSTEM__USES:
				getUses().clear();
				getUses().addAll((Collection)newValue);
				return;
			case SystemPackage.SYSTEM__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection)newValue);
				return;
			case SystemPackage.SYSTEM__DATA:
				getData().clear();
				getData().addAll((Collection)newValue);
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
			case SystemPackage.SYSTEM__PROVIDES:
				getProvides().clear();
				return;
			case SystemPackage.SYSTEM__USES:
				getUses().clear();
				return;
			case SystemPackage.SYSTEM__CONTAINS:
				getContains().clear();
				return;
			case SystemPackage.SYSTEM__DATA:
				getData().clear();
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
			case SystemPackage.SYSTEM__PROVIDES:
				return provides != null && !provides.isEmpty();
			case SystemPackage.SYSTEM__USES:
				return uses != null && !uses.isEmpty();
			case SystemPackage.SYSTEM__CONTAINS:
				return contains != null && !contains.isEmpty();
			case SystemPackage.SYSTEM__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
