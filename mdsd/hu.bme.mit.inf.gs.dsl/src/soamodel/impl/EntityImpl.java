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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soamodel.Attribute;
import soamodel.DataType;
import soamodel.Entity;
import soamodel.OCLDataConstraint;
import soamodel.ServiceComponent;
import soamodel.OCLConstraint;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link soamodel.impl.EntityImpl#getOclConstraints <em>Ocl Constraints</em>}</li>
 *   <li>{@link soamodel.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link soamodel.impl.EntityImpl#getPersistedBy <em>Persisted By</em>}</li>
 *   <li>{@link soamodel.impl.EntityImpl#isGeneratedID <em>Generated ID</em>}</li>
 *   <li>{@link soamodel.impl.EntityImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends DataTypeImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes;

	/**
	 * The cached value of the '{@link #getOclConstraints() <em>Ocl Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList oclConstraints;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected DataType superType;

	/**
	 * The cached value of the '{@link #getPersistedBy() <em>Persisted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistedBy()
	 * @generated
	 * @ordered
	 */
	protected ServiceComponent persistedBy;

	/**
	 * The default value of the '{@link #isGeneratedID() <em>Generated ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratedID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneratedID() <em>Generated ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratedID()
	 * @generated
	 * @ordered
	 */
	protected boolean generatedID = GENERATED_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected Attribute id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList(Attribute.class, this, SoamodelPackage.ENTITY__ATTRIBUTES, SoamodelPackage.ATTRIBUTE__ATTRIBUTE_OF);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOclConstraints() {
		if (oclConstraints == null) {
			oclConstraints = new EObjectContainmentEList(OCLDataConstraint.class, this, SoamodelPackage.ENTITY__OCL_CONSTRAINTS);
		}
		return oclConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (DataType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(DataType newSuperType) {
		DataType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent getPersistedBy() {
		if (persistedBy != null && persistedBy.eIsProxy()) {
			InternalEObject oldPersistedBy = (InternalEObject)persistedBy;
			persistedBy = (ServiceComponent)eResolveProxy(oldPersistedBy);
			if (persistedBy != oldPersistedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.ENTITY__PERSISTED_BY, oldPersistedBy, persistedBy));
			}
		}
		return persistedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent basicGetPersistedBy() {
		return persistedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistedBy(ServiceComponent newPersistedBy, NotificationChain msgs) {
		ServiceComponent oldPersistedBy = persistedBy;
		persistedBy = newPersistedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoamodelPackage.ENTITY__PERSISTED_BY, oldPersistedBy, newPersistedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistedBy(ServiceComponent newPersistedBy) {
		if (newPersistedBy != persistedBy) {
			NotificationChain msgs = null;
			if (persistedBy != null)
				msgs = ((InternalEObject)persistedBy).eInverseRemove(this, SoamodelPackage.SERVICE_COMPONENT__PERSISTS, ServiceComponent.class, msgs);
			if (newPersistedBy != null)
				msgs = ((InternalEObject)newPersistedBy).eInverseAdd(this, SoamodelPackage.SERVICE_COMPONENT__PERSISTS, ServiceComponent.class, msgs);
			msgs = basicSetPersistedBy(newPersistedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ENTITY__PERSISTED_BY, newPersistedBy, newPersistedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneratedID() {
		return generatedID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedID(boolean newGeneratedID) {
		boolean oldGeneratedID = generatedID;
		generatedID = newGeneratedID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ENTITY__GENERATED_ID, oldGeneratedID, generatedID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getID() {
		if (id != null && id.eIsProxy()) {
			InternalEObject oldID = (InternalEObject)id;
			id = (Attribute)eResolveProxy(oldID);
			if (id != oldID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamodelPackage.ENTITY__ID, oldID, id));
			}
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(Attribute newID) {
		Attribute oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.ENTITY__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicAdd(otherEnd, msgs);
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				if (persistedBy != null)
					msgs = ((InternalEObject)persistedBy).eInverseRemove(this, SoamodelPackage.SERVICE_COMPONENT__PERSISTS, ServiceComponent.class, msgs);
				return basicSetPersistedBy((ServiceComponent)otherEnd, msgs);
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
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.ENTITY__OCL_CONSTRAINTS:
				return ((InternalEList)getOclConstraints()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				return basicSetPersistedBy(null, msgs);
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
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case SoamodelPackage.ENTITY__OCL_CONSTRAINTS:
				return getOclConstraints();
			case SoamodelPackage.ENTITY__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				if (resolve) return getPersistedBy();
				return basicGetPersistedBy();
			case SoamodelPackage.ENTITY__GENERATED_ID:
				return isGeneratedID() ? Boolean.TRUE : Boolean.FALSE;
			case SoamodelPackage.ENTITY__ID:
				if (resolve) return getID();
				return basicGetID();
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
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case SoamodelPackage.ENTITY__OCL_CONSTRAINTS:
				getOclConstraints().clear();
				getOclConstraints().addAll((Collection)newValue);
				return;
			case SoamodelPackage.ENTITY__SUPER_TYPE:
				setSuperType((DataType)newValue);
				return;
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				setPersistedBy((ServiceComponent)newValue);
				return;
			case SoamodelPackage.ENTITY__GENERATED_ID:
				setGeneratedID(((Boolean)newValue).booleanValue());
				return;
			case SoamodelPackage.ENTITY__ID:
				setID((Attribute)newValue);
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
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case SoamodelPackage.ENTITY__OCL_CONSTRAINTS:
				getOclConstraints().clear();
				return;
			case SoamodelPackage.ENTITY__SUPER_TYPE:
				setSuperType((DataType)null);
				return;
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				setPersistedBy((ServiceComponent)null);
				return;
			case SoamodelPackage.ENTITY__GENERATED_ID:
				setGeneratedID(GENERATED_ID_EDEFAULT);
				return;
			case SoamodelPackage.ENTITY__ID:
				setID((Attribute)null);
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
			case SoamodelPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case SoamodelPackage.ENTITY__OCL_CONSTRAINTS:
				return oclConstraints != null && !oclConstraints.isEmpty();
			case SoamodelPackage.ENTITY__SUPER_TYPE:
				return superType != null;
			case SoamodelPackage.ENTITY__PERSISTED_BY:
				return persistedBy != null;
			case SoamodelPackage.ENTITY__GENERATED_ID:
				return generatedID != GENERATED_ID_EDEFAULT;
			case SoamodelPackage.ENTITY__ID:
				return id != null;
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
		result.append(" (generatedID: ");
		result.append(generatedID);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
