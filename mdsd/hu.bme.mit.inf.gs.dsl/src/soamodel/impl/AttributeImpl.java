/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import soamodel.Attribute;
import soamodel.DataType;
import soamodel.Entity;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.AttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link soamodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.impl.AttributeImpl#getAttributeOf <em>Attribute Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected DataType attributeType;

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
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAttributeType() {
		if (attributeType != null && attributeType.eIsProxy()) {
			InternalEObject oldAttributeType = (InternalEObject)attributeType;
			attributeType = (DataType)eResolveProxy(oldAttributeType);
			if (attributeType != oldAttributeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
			}
		}
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(DataType newAttributeType) {
		DataType oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getAttributeOf() {
		if (eContainerFeatureID() != SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF) return null;
		return (Entity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOf(Entity newAttributeOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAttributeOf, SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOf(Entity newAttributeOf) {
		if (newAttributeOf != eInternalContainer() || (eContainerFeatureID() != SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF && newAttributeOf != null)) {
			if (EcoreUtil.isAncestor(this, newAttributeOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAttributeOf != null)
				msgs = ((InternalEObject)newAttributeOf).eInverseAdd(this, SoamodelPackage.ENTITY__ATTRIBUTES, Entity.class, msgs);
			msgs = basicSetAttributeOf(newAttributeOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF, newAttributeOf, newAttributeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAttributeOf((Entity)otherEnd, msgs);
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				return basicSetAttributeOf(null, msgs);
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				return eInternalContainer().eInverseRemove(this, SoamodelPackage.ENTITY__ATTRIBUTES, Entity.class, msgs);
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				if (resolve) return getAttributeType();
				return basicGetAttributeType();
			case SoamodelPackage.ATTRIBUTE__NAME:
				return getName();
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				return getAttributeOf();
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((DataType)newValue);
				return;
			case SoamodelPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				setAttributeOf((Entity)newValue);
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				setAttributeType((DataType)null);
				return;
			case SoamodelPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				setAttributeOf((Entity)null);
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
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_TYPE:
				return attributeType != null;
			case SoamodelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF:
				return getAttributeOf() != null;
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

} //AttributeImpl
