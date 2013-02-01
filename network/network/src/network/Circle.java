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
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link network.Circle#getName <em>Name</em>}</li>
 *   <li>{@link network.Circle#getMembers <em>Members</em>}</li>
 *   <li>{@link network.Circle#getCirclePosts <em>Circle Posts</em>}</li>
 *   <li>{@link network.Circle#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see network.NetworkPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends EObject {
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
     * @see network.NetworkPackage#getCircle_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link network.Circle#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Members</b></em>' reference list.
     * The list contents are of type {@link network.Person}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' reference list.
     * @see network.NetworkPackage#getCircle_Members()
     * @model
     * @generated
     */
	EList<Person> getMembers();

	/**
     * Returns the value of the '<em><b>Circle Posts</b></em>' reference list.
     * The list contents are of type {@link network.Post}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle Posts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Circle Posts</em>' reference list.
     * @see network.NetworkPackage#getCircle_CirclePosts()
     * @model
     * @generated
     */
	EList<Post> getCirclePosts();

	/**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(Person)
     * @see network.NetworkPackage#getCircle_Owner()
     * @model required="true"
     * @generated
     */
	Person getOwner();

	/**
     * Sets the value of the '{@link network.Circle#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
	void setOwner(Person value);

} // Circle
