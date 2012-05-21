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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='existingCollectionItem UniqueItemType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot existingCollectionItem='DataType.allInstances()->exists(d : DataType | self.itemType = d)' UniqueItemType='CollectionType.allInstances()->forAll(C1 : CollectionType, C2 : CollectionType | C1.itemType <> C2.itemType or C1 = C2)'"
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
