/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DependencyGraph#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link domain.DependencyGraph#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDependencyGraph()
 * @model
 * @generated
 */
public interface DependencyGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see domain.DomainPackage#getDependencyGraph_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see domain.DomainPackage#getDependencyGraph_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // DependencyGraph
