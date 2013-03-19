/**
 */
package stochsim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stochsim.CL;
import stochsim.SN;
import stochsim.StochsimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stochsim.impl.CLImpl#getCnn <em>Cnn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLImpl extends NodeImpl implements CL {
	/**
	 * The cached value of the '{@link #getCnn() <em>Cnn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnn()
	 * @generated
	 * @ordered
	 */
	protected SN cnn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StochsimPackage.Literals.CL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN getCnn() {
		if (cnn != null && cnn.eIsProxy()) {
			InternalEObject oldCnn = (InternalEObject)cnn;
			cnn = (SN)eResolveProxy(oldCnn);
			if (cnn != oldCnn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StochsimPackage.CL__CNN, oldCnn, cnn));
			}
		}
		return cnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN basicGetCnn() {
		return cnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCnn(SN newCnn) {
		SN oldCnn = cnn;
		cnn = newCnn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StochsimPackage.CL__CNN, oldCnn, cnn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StochsimPackage.CL__CNN:
				if (resolve) return getCnn();
				return basicGetCnn();
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
			case StochsimPackage.CL__CNN:
				setCnn((SN)newValue);
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
			case StochsimPackage.CL__CNN:
				setCnn((SN)null);
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
			case StochsimPackage.CL__CNN:
				return cnn != null;
		}
		return super.eIsSet(featureID);
	}

} //CLImpl
