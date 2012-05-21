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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueLiteralNames LivingDataType UniqueLiteralValues'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueLiteralNames='self.literals->forAll(L1 : EnumLiteral, L2 : EnumLiteral | L1.name <> L2.name or L1 = L2)' LivingDataType='ServiceOrientedArchitecture.allInstances()->exists(a : ServiceOrientedArchitecture | a.dataTypes->exists(c : DataType | c = self))' UniqueLiteralValues='self.literals->forAll(l1 : EnumLiteral, l2 : EnumLiteral | l1.value <> l2.value or l1 = l2)'"
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
