/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operation.Checklist#getEntries <em>Entries</em>}</li>
 *   <li>{@link operation.Checklist#getMenu <em>Menu</em>}</li>
 *   <li>{@link operation.Checklist#getProcess <em>Process</em>}</li>
 *   <li>{@link operation.Checklist#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see operation.OperationPackage#getChecklist()
 * @model
 * @generated
 */
public interface Checklist extends OperationElement {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link operation.ChecklistEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see operation.OperationPackage#getChecklist_Entries()
	 * @model type="operation.ChecklistEntry" containment="true"
	 * @generated
	 */
	EList getEntries();

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link operation.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see operation.OperationPackage#getChecklist_Menu()
	 * @model type="operation.MenuItem" containment="true"
	 * @generated
	 */
	EList getMenu();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see operation.OperationPackage#getChecklist_Process()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	process.Process getProcess();

	/**
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #setProcessId(String)
	 * @see operation.OperationPackage#getChecklist_ProcessId()
	 * @model required="true"
	 * @generated
	 */
	String getProcessId();

	/**
	 * Sets the value of the '{@link operation.Checklist#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #getProcessId()
	 * @generated
	 */
	void setProcessId(String value);

} // Checklist
