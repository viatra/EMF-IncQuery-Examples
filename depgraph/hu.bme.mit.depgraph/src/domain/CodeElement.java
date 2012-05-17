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
 * A representation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.CodeElement#getIncomingDeps <em>Incoming Deps</em>}</li>
 *   <li>{@link domain.CodeElement#getOutgoingDeps <em>Outgoing Deps</em>}</li>
 *   <li>{@link domain.CodeElement#getVersions <em>Versions</em>}</li>
 *   <li>{@link domain.CodeElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getCodeElement()
 * @model abstract="true"
 * @generated
 */
public interface CodeElement extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Incoming Deps</b></em>' reference list.
	 * The list contents are of type {@link domain.Dependency}.
	 * It is bidirectional and its opposite is '{@link domain.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Deps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Deps</em>' reference list.
	 * @see domain.DomainPackage#getCodeElement_IncomingDeps()
	 * @see domain.Dependency#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Dependency> getIncomingDeps();

	/**
	 * Returns the value of the '<em><b>Outgoing Deps</b></em>' reference list.
	 * The list contents are of type {@link domain.Dependency}.
	 * It is bidirectional and its opposite is '{@link domain.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Deps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Deps</em>' reference list.
	 * @see domain.DomainPackage#getCodeElement_OutgoingDeps()
	 * @see domain.Dependency#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Dependency> getOutgoingDeps();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see domain.DomainPackage#getCodeElement_Versions()
	 * @model
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see domain.DomainPackage#getCodeElement_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link domain.CodeElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDisplayName();

} // CodeElement
