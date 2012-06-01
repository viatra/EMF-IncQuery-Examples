/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation;

import org.eclipse.emf.common.util.EList;
import process.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checklist Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operation.ChecklistEntry#getMenu <em>Menu</em>}</li>
 *   <li>{@link operation.ChecklistEntry#getInfo <em>Info</em>}</li>
 *   <li>{@link operation.ChecklistEntry#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link operation.ChecklistEntry#getJobPaths <em>Job Paths</em>}</li>
 *   <li>{@link operation.ChecklistEntry#getTask <em>Task</em>}</li>
 *   <li>{@link operation.ChecklistEntry#getJobs <em>Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see operation.OperationPackage#getChecklistEntry()
 * @model
 * @generated
 */
public interface ChecklistEntry extends OperationElement {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(MenuItem)
	 * @see operation.OperationPackage#getChecklistEntry_Menu()
	 * @model
	 * @generated
	 */
	MenuItem getMenu();

	/**
	 * Sets the value of the '{@link operation.ChecklistEntry#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(MenuItem value);

	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #setTaskId(String)
	 * @see operation.OperationPackage#getChecklistEntry_TaskId()
	 * @model required="true"
	 * @generated
	 */
	String getTaskId();

	/**
	 * Sets the value of the '{@link operation.ChecklistEntry#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Job Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Paths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Paths</em>' attribute list.
	 * @see operation.OperationPackage#getChecklistEntry_JobPaths()
	 * @model
	 * @generated
	 */
	EList getJobPaths();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see operation.OperationPackage#getChecklistEntry_Task()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' reference list.
	 * The list contents are of type {@link system.Job}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' reference list.
	 * @see operation.OperationPackage#getChecklistEntry_Jobs()
	 * @model type="system.Job" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getJobs();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(RuntimeInformation)
	 * @see operation.OperationPackage#getChecklistEntry_Info()
	 * @model containment="true"
	 * @generated
	 */
	RuntimeInformation getInfo();

	/**
	 * Sets the value of the '{@link operation.ChecklistEntry#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(RuntimeInformation value);

} // ChecklistEntry
