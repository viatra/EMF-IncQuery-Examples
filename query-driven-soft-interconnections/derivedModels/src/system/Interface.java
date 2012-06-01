/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.Interface#getProvider <em>Provider</em>}</li>
 *   <li>{@link system.Interface#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link system.System#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(system.System)
	 * @see system.SystemPackage#getInterface_Provider()
	 * @see system.System#getProvides
	 * @model opposite="provides" transient="false"
	 * @generated
	 */
	system.System getProvider();

	/**
	 * Sets the value of the '{@link system.Interface#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(system.System value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link system.System}.
	 * It is bidirectional and its opposite is '{@link system.System#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see system.SystemPackage#getInterface_User()
	 * @see system.System#getUses
	 * @model type="system.System" opposite="uses"
	 * @generated
	 */
	EList getUser();

} // Interface
