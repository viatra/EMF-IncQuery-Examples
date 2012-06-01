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
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.Data#getReadingTaskIds <em>Reading Task Ids</em>}</li>
 *   <li>{@link system.Data#getWritingTaskIds <em>Writing Task Ids</em>}</li>
 *   <li>{@link system.Data#getWritingTask <em>Writing Task</em>}</li>
 *   <li>{@link system.Data#getReadingTask <em>Reading Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getData()
 * @model
 * @generated
 */
public interface Data extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Reading Task Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Task Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Task Ids</em>' attribute list.
	 * @see system.SystemPackage#getData_ReadingTaskIds()
	 * @model
	 * @generated
	 */
	EList getReadingTaskIds();

	/**
	 * Returns the value of the '<em><b>Writing Task Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing Task Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing Task Ids</em>' attribute list.
	 * @see system.SystemPackage#getData_WritingTaskIds()
	 * @model
	 * @generated
	 */
	EList getWritingTaskIds();

	/**
	 * Returns the value of the '<em><b>Writing Task</b></em>' reference list.
	 * The list contents are of type {@link process.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing Task</em>' reference list.
	 * @see system.SystemPackage#getData_WritingTask()
	 * @model type="process.Task" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getWritingTask();

	/**
	 * Returns the value of the '<em><b>Reading Task</b></em>' reference list.
	 * The list contents are of type {@link process.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Task</em>' reference list.
	 * @see system.SystemPackage#getData_ReadingTask()
	 * @model type="process.Task" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList getReadingTask();

} // Data
