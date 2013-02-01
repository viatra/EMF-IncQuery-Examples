/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link network.Network#getName <em>Name</em>}</li>
 *   <li>{@link network.Network#getPeople <em>People</em>}</li>
 *   <li>{@link network.Network#getPosts <em>Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @see network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
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
     * @see network.NetworkPackage#getNetwork_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link network.Network#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>People</b></em>' containment reference list.
     * The list contents are of type {@link network.Person}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>People</em>' containment reference list.
     * @see network.NetworkPackage#getNetwork_People()
     * @model containment="true"
     * @generated
     */
	EList<Person> getPeople();

	/**
     * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
     * The list contents are of type {@link network.Post}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Posts</em>' containment reference list.
     * @see network.NetworkPackage#getNetwork_Posts()
     * @model containment="true"
     * @generated
     */
	EList<Post> getPosts();

} // Network
