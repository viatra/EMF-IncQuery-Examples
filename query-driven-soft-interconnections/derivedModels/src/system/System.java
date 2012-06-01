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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.System#getProvides <em>Provides</em>}</li>
 *   <li>{@link system.System#getUses <em>Uses</em>}</li>
 *   <li>{@link system.System#getContains <em>Contains</em>}</li>
 *   <li>{@link system.System#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link system.Interface}.
	 * It is bidirectional and its opposite is '{@link system.Interface#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see system.SystemPackage#getSystem_Provides()
	 * @see system.Interface#getProvider
	 * @model type="system.Interface" opposite="provider" containment="true"
	 * @generated
	 */
	EList getProvides();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link system.Interface}.
	 * It is bidirectional and its opposite is '{@link system.Interface#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see system.SystemPackage#getSystem_Uses()
	 * @see system.Interface#getUser
	 * @model type="system.Interface" opposite="user"
	 * @generated
	 */
	EList getUses();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link system.Job}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see system.SystemPackage#getSystem_Contains()
	 * @model type="system.Job" containment="true"
	 * @generated
	 */
	EList getContains();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link system.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see system.SystemPackage#getSystem_Data()
	 * @model type="system.Data" containment="true"
	 * @generated
	 */
	EList getData();

} // System
