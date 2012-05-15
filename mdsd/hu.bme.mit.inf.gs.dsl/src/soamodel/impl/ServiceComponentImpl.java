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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import soamodel.Entity;
import soamodel.DataType;
import soamodel.ServiceComponent;
import soamodel.ServiceMethod;
import soamodel.ServiceOrientedArchitecture;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getURI <em>URI</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getPersists <em>Persists</em>}</li>
 *   <li>{@link soamodel.impl.ServiceComponentImpl#getInArchitecture <em>In Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceComponentImpl extends EObjectImpl implements ServiceComponent {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods;

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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectsTo() <em>Connects To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectsTo()
	 * @generated
	 * @ordered
	 */
	protected EList connectsTo;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersists() <em>Persists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersists()
	 * @generated
	 * @ordered
	 */
	protected EList persists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SoamodelPackage.Literals.SERVICE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList(ServiceMethod.class, this, SoamodelPackage.SERVICE_COMPONENT__METHODS);
		}
		return methods;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_COMPONENT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectsTo() {
		if (connectsTo == null) {
			connectsTo = new EObjectResolvingEList(ServiceComponent.class, this, SoamodelPackage.SERVICE_COMPONENT__CONNECTS_TO);
		}
		return connectsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_COMPONENT__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersists() {
		if (persists == null) {
			persists = new EObjectWithInverseResolvingEList(Entity.class, this, SoamodelPackage.SERVICE_COMPONENT__PERSISTS, SoamodelPackage.ENTITY__PERSISTED_BY);
		}
		return persists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOrientedArchitecture getInArchitecture() {
		if (eContainerFeatureID() != SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE) return null;
		return (ServiceOrientedArchitecture)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInArchitecture(ServiceOrientedArchitecture newInArchitecture, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInArchitecture, SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInArchitecture(ServiceOrientedArchitecture newInArchitecture) {
		if (newInArchitecture != eInternalContainer() || (eContainerFeatureID() != SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE && newInArchitecture != null)) {
			if (EcoreUtil.isAncestor(this, newInArchitecture))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInArchitecture != null)
				msgs = ((InternalEObject)newInArchitecture).eInverseAdd(this, SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS, ServiceOrientedArchitecture.class, msgs);
			msgs = basicSetInArchitecture(newInArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE, newInArchitecture, newInArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				return ((InternalEList)getPersists()).basicAdd(otherEnd, msgs);
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInArchitecture((ServiceOrientedArchitecture)otherEnd, msgs);
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
			case SoamodelPackage.SERVICE_COMPONENT__METHODS:
				return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				return ((InternalEList)getPersists()).basicRemove(otherEnd, msgs);
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				return basicSetInArchitecture(null, msgs);
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
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				return eInternalContainer().eInverseRemove(this, SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS, ServiceOrientedArchitecture.class, msgs);
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
			case SoamodelPackage.SERVICE_COMPONENT__METHODS:
				return getMethods();
			case SoamodelPackage.SERVICE_COMPONENT__NAME:
				return getName();
			case SoamodelPackage.SERVICE_COMPONENT__NAMESPACE:
				return getNamespace();
			case SoamodelPackage.SERVICE_COMPONENT__CONNECTS_TO:
				return getConnectsTo();
			case SoamodelPackage.SERVICE_COMPONENT__URI:
				return getURI();
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				return getPersists();
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				return getInArchitecture();
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
			case SoamodelPackage.SERVICE_COMPONENT__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__CONNECTS_TO:
				getConnectsTo().clear();
				getConnectsTo().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__URI:
				setURI((String)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				getPersists().clear();
				getPersists().addAll((Collection)newValue);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				setInArchitecture((ServiceOrientedArchitecture)newValue);
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
			case SoamodelPackage.SERVICE_COMPONENT__METHODS:
				getMethods().clear();
				return;
			case SoamodelPackage.SERVICE_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__CONNECTS_TO:
				getConnectsTo().clear();
				return;
			case SoamodelPackage.SERVICE_COMPONENT__URI:
				setURI(URI_EDEFAULT);
				return;
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				getPersists().clear();
				return;
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				setInArchitecture((ServiceOrientedArchitecture)null);
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
			case SoamodelPackage.SERVICE_COMPONENT__METHODS:
				return methods != null && !methods.isEmpty();
			case SoamodelPackage.SERVICE_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoamodelPackage.SERVICE_COMPONENT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case SoamodelPackage.SERVICE_COMPONENT__CONNECTS_TO:
				return connectsTo != null && !connectsTo.isEmpty();
			case SoamodelPackage.SERVICE_COMPONENT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SoamodelPackage.SERVICE_COMPONENT__PERSISTS:
				return persists != null && !persists.isEmpty();
			case SoamodelPackage.SERVICE_COMPONENT__IN_ARCHITECTURE:
				return getInArchitecture() != null;
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ServiceComponentImpl
