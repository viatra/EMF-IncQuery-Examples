/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.Enum#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends DataType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getEnum_Literals()
	 * @model type="soamodel.EnumLiteral" containment="true" required="true"
	 * @generated
	 */
	EList getLiterals();

} // Enum
