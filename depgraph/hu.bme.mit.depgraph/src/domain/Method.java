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
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Method#getSignature <em>Signature</em>}</li>
 *   <li>{@link domain.Method#getApiClass <em>Api Class</em>}</li>
 *   <li>{@link domain.Method#getPrivate <em>Private</em>}</li>
 *   <li>{@link domain.Method#getReferencedFields <em>Referenced Fields</em>}</li>
 *   <li>{@link domain.Method#getReferencedMethods <em>Referenced Methods</em>}</li>
 *   <li>{@link domain.Method#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends CodeElement {
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
	 * @see domain.DomainPackage#getMethod_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link domain.Method#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Api Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.ApiClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Class</em>' container reference.
	 * @see #setApiClass(ApiClass)
	 * @see domain.DomainPackage#getMethod_ApiClass()
	 * @see domain.ApiClass#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	ApiClass getApiClass();

	/**
	 * Sets the value of the '{@link domain.Method#getApiClass <em>Api Class</em>}' container reference.
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
	 * @see #setPrivate(Boolean)
	 * @see domain.DomainPackage#getMethod_Private()
	 * @model
	 * @generated
	 */
	Boolean getPrivate();

	/**
	 * Sets the value of the '{@link domain.Method#getPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #getPrivate()
	 * @generated
	 */
	void setPrivate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Fields</em>' attribute.
	 * @see #setReferencedFields(EList)
	 * @see domain.DomainPackage#getMethod_ReferencedFields()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedFields();

	/**
	 * Sets the value of the '{@link domain.Method#getReferencedFields <em>Referenced Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Fields</em>' attribute.
	 * @see #getReferencedFields()
	 * @generated
	 */
	void setReferencedFields(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Referenced Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Methods</em>' attribute.
	 * @see #setReferencedMethods(EList)
	 * @see domain.DomainPackage#getMethod_ReferencedMethods()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedMethods();

	/**
	 * Sets the value of the '{@link domain.Method#getReferencedMethods <em>Referenced Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Methods</em>' attribute.
	 * @see #getReferencedMethods()
	 * @generated
	 */
	void setReferencedMethods(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see domain.DomainPackage#getMethod_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link domain.Method#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // Method
