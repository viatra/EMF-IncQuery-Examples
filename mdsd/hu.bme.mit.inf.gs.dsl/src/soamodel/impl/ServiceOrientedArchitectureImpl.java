/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soamodel.DataType;
import soamodel.ServiceComponent;
import soamodel.ServiceOrientedArchitecture;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Oriented Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.ServiceOrientedArchitectureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link soamodel.impl.ServiceOrientedArchitectureImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link soamodel.impl.ServiceOrientedArchitectureImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOrientedArchitectureImpl extends EObjectImpl implements ServiceOrientedArchitecture {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList components;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList dataTypes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOrientedArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.SERVICE_ORIENTED_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList(ServiceComponent.class, this, SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS, SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList(DataType.class, this, SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES);
		}
		return dataTypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				return ((InternalEList)getComponents()).basicAdd(otherEnd, msgs);
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
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				return ((InternalEList)getComponents()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES:
				return ((InternalEList)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				return getComponents();
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES:
				return getDataTypes();
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__NAME:
				return getName();
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
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__NAME:
				setName((String)newValue);
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
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				getComponents().clear();
				return;
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES:
				getDataTypes().clear();
				return;
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
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
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS:
				return components != null && !components.isEmpty();
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceOrientedArchitectureImpl
