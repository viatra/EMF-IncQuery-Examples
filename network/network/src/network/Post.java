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
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link network.Post#getText <em>Text</em>}</li>
 *   <li>{@link network.Post#getAuthor <em>Author</em>}</li>
 *   <li>{@link network.Post#getVisibleTo <em>Visible To</em>}</li>
 * </ul>
 * </p>
 *
 * @see network.NetworkPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {
	/**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see network.NetworkPackage#getPost_Text()
     * @model
     * @generated
     */
	String getText();

	/**
     * Sets the value of the '{@link network.Post#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
	void setText(String value);

	/**
     * Returns the value of the '<em><b>Author</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Author</em>' reference.
     * @see #setAuthor(Person)
     * @see network.NetworkPackage#getPost_Author()
     * @model required="true"
     * @generated
     */
	Person getAuthor();

	/**
     * Sets the value of the '{@link network.Post#getAuthor <em>Author</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' reference.
     * @see #getAuthor()
     * @generated
     */
	void setAuthor(Person value);

	/**
     * Returns the value of the '<em><b>Visible To</b></em>' reference list.
     * The list contents are of type {@link network.Circle}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Visible To</em>' reference list.
     * @see network.NetworkPackage#getPost_VisibleTo()
     * @model
     * @generated
     */
	EList<Circle> getVisibleTo();

} // Post
