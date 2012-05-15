/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.CollectionType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends DataType {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' reference.
	 * @see #setItemType(DataType)
	 * @see soamodel.SoamodelPackage#getCollectionType_ItemType()
	 * @model required="true"
	 * @generated
	 */
	DataType getItemType();

	/**
	 * Sets the value of the '{@link soamodel.CollectionType#getItemType <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' reference.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(DataType value);

} // CollectionType
