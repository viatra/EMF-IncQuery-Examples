/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitive Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TransitiveDependency#getTransitiveFrom <em>Transitive From</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTransitiveDependency()
 * @model
 * @generated
 */
public interface TransitiveDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Transitive From</b></em>' reference list.
	 * The list contents are of type {@link domain.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive From</em>' reference list.
	 * @see domain.DomainPackage#getTransitiveDependency_TransitiveFrom()
	 * @model
	 * @generated
	 */
	EList<Dependency> getTransitiveFrom();

} // TransitiveDependency
