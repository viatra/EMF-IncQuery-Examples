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
import org.eclipse.emf.ecore.util.InternalEList;

import soamodel.DataType;
import soamodel.OCLPostcondition;
import soamodel.OCLPrecondition;
import soamodel.Parameter;
import soamodel.ServiceMethod;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link soamodel.impl.ServiceMethodImpl#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMethodImpl extends EObjectImpl implements ServiceMethod {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;

	/**
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected DataType methodType;

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
	 * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postconditions;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList preconditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.SERVICE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_METHOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList(Parameter.class, this, SoamodelPackage.SERVICE_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMethodType() {
		if (methodType != null && methodType.eIsProxy()) {
			InternalEObject oldMethodType = (InternalEObject)methodType;
			methodType = (DataType)eResolveProxy(oldMethodType);
			if (methodType != oldMethodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.SERVICE_METHOD__METHOD_TYPE, oldMethodType, methodType));
			}
		}
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMethodType() {
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodType(DataType newMethodType) {
		DataType oldMethodType = methodType;
		methodType = newMethodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_METHOD__METHOD_TYPE, oldMethodType, methodType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList(OCLPrecondition.class, this, SoamodelPackage.SERVICE_METHOD__PRECONDITIONS);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostconditions() {
		if (postconditions == null) {
			postconditions = new EObjectContainmentEList(OCLPostcondition.class, this, SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS);
		}
		return postconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoamodelPackage.SERVICE_METHOD__PARAMETERS:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS:
				return ((InternalEList)getPostconditions()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.SERVICE_METHOD__PRECONDITIONS:
				return ((InternalEList)getPreconditions()).basicRemove(otherEnd, msgs);
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
			case SoamodelPackage.SERVICE_METHOD__DESCRIPTION:
				return getDescription();
			case SoamodelPackage.SERVICE_METHOD__PARAMETERS:
				return getParameters();
			case SoamodelPackage.SERVICE_METHOD__METHOD_TYPE:
				if (resolve) return getMethodType();
				return basicGetMethodType();
			case SoamodelPackage.SERVICE_METHOD__NAME:
				return getName();
			case SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS:
				return getPostconditions();
			case SoamodelPackage.SERVICE_METHOD__PRECONDITIONS:
				return getPreconditions();
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
			case SoamodelPackage.SERVICE_METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SoamodelPackage.SERVICE_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_METHOD__METHOD_TYPE:
				setMethodType((DataType)newValue);
				return;
			case SoamodelPackage.SERVICE_METHOD__NAME:
				setName((String)newValue);
				return;
			case SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_METHOD__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
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
			case SoamodelPackage.SERVICE_METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SoamodelPackage.SERVICE_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case SoamodelPackage.SERVICE_METHOD__METHOD_TYPE:
				setMethodType((DataType)null);
				return;
			case SoamodelPackage.SERVICE_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS:
				getPostconditions().clear();
				return;
			case SoamodelPackage.SERVICE_METHOD__PRECONDITIONS:
				getPreconditions().clear();
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
			case SoamodelPackage.SERVICE_METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SoamodelPackage.SERVICE_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SoamodelPackage.SERVICE_METHOD__METHOD_TYPE:
				return methodType != null;
			case SoamodelPackage.SERVICE_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoamodelPackage.SERVICE_METHOD__POSTCONDITIONS:
				return postconditions != null && !postconditions.isEmpty();
			case SoamodelPackage.SERVICE_METHOD__PRECONDITIONS:
				return preconditions != null && !preconditions.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceMethodImpl
