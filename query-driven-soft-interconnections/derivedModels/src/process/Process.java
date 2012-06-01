/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Process#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link process.Activity}.
	 * It is bidirectional and its opposite is '{@link process.Activity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see process.ProcessPackage#getProcess_Contents()
	 * @see process.Activity#getParent
	 * @model type="process.Activity" opposite="parent" containment="true"
	 * @generated
	 */
	EList getContents();

} // Process
