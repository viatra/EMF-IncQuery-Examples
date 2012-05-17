/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Field#getSignature <em>Signature</em>}</li>
 *   <li>{@link domain.Field#getApiClass <em>Api Class</em>}</li>
 *   <li>{@link domain.Field#isPrivate <em>Private</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getField()
 * @model
 * @generated
 */
public interface Field extends CodeElement {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see domain.DomainPackage#getField_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link domain.Field#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Api Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.ApiClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Class</em>' container reference.
	 * @see #setApiClass(ApiClass)
	 * @see domain.DomainPackage#getField_ApiClass()
	 * @see domain.ApiClass#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	ApiClass getApiClass();

	/**
	 * Sets the value of the '{@link domain.Field#getApiClass <em>Api Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Class</em>' container reference.
	 * @see #getApiClass()
	 * @generated
	 */
	void setApiClass(ApiClass value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see domain.DomainPackage#getField_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link domain.Field#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

} // Field
