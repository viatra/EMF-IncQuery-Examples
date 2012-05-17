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
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Product#getName <em>Name</em>}</li>
 *   <li>{@link domain.Product#getClasses <em>Classes</em>}</li>
 *   <li>{@link domain.Product#getContainingFolders <em>Containing Folders</em>}</li>
 *   <li>{@link domain.Product#getProductPath <em>Product Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends CodeElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ApiClass}.
	 * It is bidirectional and its opposite is '{@link domain.ApiClass#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see domain.DomainPackage#getProduct_Classes()
	 * @see domain.ApiClass#getProduct
	 * @model opposite="product" containment="true"
	 * @generated
	 */
	EList<ApiClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Containing Folders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Folders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Folders</em>' attribute.
	 * @see #setContainingFolders(String)
	 * @see domain.DomainPackage#getProduct_ContainingFolders()
	 * @model
	 * @generated
	 */
	String getContainingFolders();

	/**
	 * Sets the value of the '{@link domain.Product#getContainingFolders <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Folders</em>' attribute.
	 * @see #getContainingFolders()
	 * @generated
	 */
	void setContainingFolders(String value);

	/**
	 * Returns the value of the '<em><b>Product Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Path</em>' attribute.
	 * @see #setProductPath(String)
	 * @see domain.DomainPackage#getProduct_ProductPath()
	 * @model
	 * @generated
	 */
	String getProductPath();

	/**
	 * Sets the value of the '{@link domain.Product#getProductPath <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Path</em>' attribute.
	 * @see #getProductPath()
	 * @generated
	 */
	void setProductPath(String value);

} // Product
