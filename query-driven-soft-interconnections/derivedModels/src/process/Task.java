/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package process;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Task#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Activity {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link process.TaskKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see process.TaskKind
	 * @see #setKind(TaskKind)
	 * @see process.ProcessPackage#getTask_Kind()
	 * @model required="true"
	 * @generated
	 */
	TaskKind getKind();

	/**
	 * Sets the value of the '{@link process.Task#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see process.TaskKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TaskKind value);

} // Task
