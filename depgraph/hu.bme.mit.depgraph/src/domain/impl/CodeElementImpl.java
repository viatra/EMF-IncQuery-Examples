/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain.impl;

import domain.CodeElement;
import domain.Dependency;
import domain.DomainPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.CodeElementImpl#getIncomingDeps <em>Incoming Deps</em>}</li>
 *   <li>{@link domain.impl.CodeElementImpl#getOutgoingDeps <em>Outgoing Deps</em>}</li>
 *   <li>{@link domain.impl.CodeElementImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link domain.impl.CodeElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CodeElementImpl extends GraphElementImpl implements CodeElement {
	/**
	 * The cached value of the '{@link #getIncomingDeps() <em>Incoming Deps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDeps()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> incomingDeps;

	/**
	 * The cached value of the '{@link #getOutgoingDeps() <em>Outgoing Deps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDeps()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> outgoingDeps;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getIncomingDeps() {
		if (incomingDeps == null) {
			incomingDeps = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, DomainPackage.CODE_ELEMENT__INCOMING_DEPS, DomainPackage.DEPENDENCY__TO);
		}
		return incomingDeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getOutgoingDeps() {
		if (outgoingDeps == null) {
			outgoingDeps = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, DomainPackage.CODE_ELEMENT__OUTGOING_DEPS, DomainPackage.DEPENDENCY__FROM);
		}
		return outgoingDeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeUniqueEList<String>(String.class, this, DomainPackage.CODE_ELEMENT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CODE_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingDeps()).basicAdd(otherEnd, msgs);
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingDeps()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				return ((InternalEList<?>)getIncomingDeps()).basicRemove(otherEnd, msgs);
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				return ((InternalEList<?>)getOutgoingDeps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				return getIncomingDeps();
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				return getOutgoingDeps();
			case DomainPackage.CODE_ELEMENT__VERSIONS:
				return getVersions();
			case DomainPackage.CODE_ELEMENT__ID:
				return getId();
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
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				getIncomingDeps().clear();
				getIncomingDeps().addAll((Collection<? extends Dependency>)newValue);
				return;
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				getOutgoingDeps().clear();
				getOutgoingDeps().addAll((Collection<? extends Dependency>)newValue);
				return;
			case DomainPackage.CODE_ELEMENT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
				return;
			case DomainPackage.CODE_ELEMENT__ID:
				setId((Long)newValue);
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
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				getIncomingDeps().clear();
				return;
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				getOutgoingDeps().clear();
				return;
			case DomainPackage.CODE_ELEMENT__VERSIONS:
				getVersions().clear();
				return;
			case DomainPackage.CODE_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case DomainPackage.CODE_ELEMENT__INCOMING_DEPS:
				return incomingDeps != null && !incomingDeps.isEmpty();
			case DomainPackage.CODE_ELEMENT__OUTGOING_DEPS:
				return outgoingDeps != null && !outgoingDeps.isEmpty();
			case DomainPackage.CODE_ELEMENT__VERSIONS:
				return versions != null && !versions.isEmpty();
			case DomainPackage.CODE_ELEMENT__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (versions: ");
		result.append(versions);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CodeElementImpl
