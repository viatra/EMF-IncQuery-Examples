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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link network.Person#getName <em>Name</em>}</li>
 *   <li>{@link network.Person#getAge <em>Age</em>}</li>
 *   <li>{@link network.Person#getCircles <em>Circles</em>}</li>
 *   <li>{@link network.Person#getPersonalPosts <em>Personal Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @see network.NetworkPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
     * @see network.NetworkPackage#getPerson_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link network.Person#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Age</em>' attribute.
     * @see #setAge(int)
     * @see network.NetworkPackage#getPerson_Age()
     * @model
     * @generated
     */
	int getAge();

	/**
     * Sets the value of the '{@link network.Person#getAge <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Age</em>' attribute.
     * @see #getAge()
     * @generated
     */
	void setAge(int value);

	/**
     * Returns the value of the '<em><b>Circles</b></em>' containment reference list.
     * The list contents are of type {@link network.Circle}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Circles</em>' containment reference list.
     * @see network.NetworkPackage#getPerson_Circles()
     * @model containment="true"
     * @generated
     */
	EList<Circle> getCircles();

	/**
     * Returns the value of the '<em><b>Personal Posts</b></em>' reference list.
     * The list contents are of type {@link network.Post}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Posts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Personal Posts</em>' reference list.
     * @see network.NetworkPackage#getPerson_PersonalPosts()
     * @model
     * @generated
     */
	EList<Post> getPersonalPosts();

} // Person
