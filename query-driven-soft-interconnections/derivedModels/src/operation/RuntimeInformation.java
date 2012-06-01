/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operation.RuntimeInformation#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see operation.OperationPackage#getRuntimeInformation()
 * @model
 * @generated
 */
public interface RuntimeInformation extends OperationElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(Map)
	 * @see operation.OperationPackage#getRuntimeInformation_Contents()
	 * @model transient="true"
	 * @generated
	 */
	Map getContents();

	/**
	 * Sets the value of the '{@link operation.RuntimeInformation#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Map value);

} // RuntimeInformation
