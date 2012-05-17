/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Dependency#getFrom <em>From</em>}</li>
 *   <li>{@link domain.Dependency#getTo <em>To</em>}</li>
 *   <li>{@link domain.Dependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends GraphElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.CodeElement#getOutgoingDeps <em>Outgoing Deps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CodeElement)
	 * @see domain.DomainPackage#getDependency_From()
	 * @see domain.CodeElement#getOutgoingDeps
	 * @model opposite="outgoingDeps" required="true"
	 * @generated
	 */
	CodeElement getFrom();

	/**
	 * Sets the value of the '{@link domain.Dependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CodeElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.CodeElement#getIncomingDeps <em>Incoming Deps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CodeElement)
	 * @see domain.DomainPackage#getDependency_To()
	 * @see domain.CodeElement#getIncomingDeps
	 * @model opposite="incomingDeps" required="true"
	 * @generated
	 */
	CodeElement getTo();

	/**
	 * Sets the value of the '{@link domain.Dependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CodeElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domain.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domain.DependencyType
	 * @see #setType(DependencyType)
	 * @see domain.DomainPackage#getDependency_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link domain.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domain.DependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

} // Dependency
