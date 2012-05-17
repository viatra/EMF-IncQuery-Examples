/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain.impl;

import domain.Dependency;
import domain.DomainPackage;
import domain.TransitiveDependency;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transitive Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.TransitiveDependencyImpl#getTransitiveFrom <em>Transitive From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitiveDependencyImpl extends DependencyImpl implements TransitiveDependency {
	/**
	 * The cached value of the '{@link #getTransitiveFrom() <em>Transitive From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitiveFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> transitiveFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitiveDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.TRANSITIVE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getTransitiveFrom() {
		if (transitiveFrom == null) {
			transitiveFrom = new EObjectResolvingEList<Dependency>(Dependency.class, this, DomainPackage.TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM);
		}
		return transitiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM:
				return getTransitiveFrom();
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
			case DomainPackage.TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM:
				getTransitiveFrom().clear();
				getTransitiveFrom().addAll((Collection<? extends Dependency>)newValue);
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
			case DomainPackage.TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM:
				getTransitiveFrom().clear();
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
			case DomainPackage.TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM:
				return transitiveFrom != null && !transitiveFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitiveDependencyImpl
