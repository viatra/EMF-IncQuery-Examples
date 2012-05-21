/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.DataType#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.DataType#getExtendedBy <em>Extended By</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soamodel.SoamodelPackage#getDataType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soamodel.DataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extended By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended By</em>' reference.
	 * @see #setExtendedBy(Entity)
	 * @see soamodel.SoamodelPackage#getDataType_ExtendedBy()
	 * @model
	 * @generated
	 */
	Entity getExtendedBy();

	/**
	 * Sets the value of the '{@link soamodel.DataType#getExtendedBy <em>Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended By</em>' reference.
	 * @see #getExtendedBy()
	 * @generated
	 */
	void setExtendedBy(Entity value);

} // DataType
