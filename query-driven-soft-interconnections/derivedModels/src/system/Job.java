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
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.Job#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link system.Job#getCalls <em>Calls</em>}</li>
 *   <li>{@link system.Job#getTaskIds <em>Task Ids</em>}</li>
 *   <li>{@link system.Job#getTasks <em>Tasks</em>}</li>
 *   <li>{@link system.Job#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Runs On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs On</em>' reference.
	 * @see #setRunsOn(system.System)
	 * @see system.SystemPackage#getJob_RunsOn()
	 * @model required="true"
	 * @generated
	 */
	system.System getRunsOn();

	/**
	 * Sets the value of the '{@link system.Job#getRunsOn <em>Runs On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs On</em>' reference.
	 * @see #getRunsOn()
	 * @generated
	 */
	void setRunsOn(system.System value);

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference list.
	 * The list contents are of type {@link system.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference list.
	 * @see system.SystemPackage#getJob_Calls()
	 * @model type="system.Interface"
	 * @generated
	 */
	EList getCalls();

	/**
	 * Returns the value of the '<em><b>Task Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Ids</em>' attribute list.
	 * @see system.SystemPackage#getJob_TaskIds()
	 * @model
	 * @generated
	 */
	EList getTaskIds();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link process.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see system.SystemPackage#getJob_Tasks()
	 * @model type="process.Task" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getTasks();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' reference list.
	 * The list contents are of type {@link operation.RuntimeInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' reference list.
	 * @see system.SystemPackage#getJob_Info()
	 * @model type="operation.RuntimeInformation" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getInfo();

} // Job
