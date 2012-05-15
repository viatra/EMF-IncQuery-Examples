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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link soamodel.Entity#getOclConstraints <em>Ocl Constraints</em>}</li>
 *   <li>{@link soamodel.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link soamodel.Entity#getPersistedBy <em>Persisted By</em>}</li>
 *   <li>{@link soamodel.Entity#isGeneratedID <em>Generated ID</em>}</li>
 *   <li>{@link soamodel.Entity#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.Attribute}.
	 * It is bidirectional and its opposite is '{@link soamodel.Attribute#getAttributeOf <em>Attribute Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getEntity_Attributes()
	 * @see soamodel.Attribute#getAttributeOf
	 * @model type="soamodel.Attribute" opposite="attributeOf" containment="true"
	 * @generated
	 */
	EList getAttributes();

	/**
	 * Returns the value of the '<em><b>Ocl Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.OCLDataConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Constraints</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getEntity_OclConstraints()
	 * @model type="soamodel.OCLDataConstraint" containment="true"
	 * @generated
	 */
	EList getOclConstraints();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(DataType)
	 * @see soamodel.SoamodelPackage#getEntity_SuperType()
	 * @model
	 * @generated
	 */
	DataType getSuperType();

	/**
	 * Sets the value of the '{@link soamodel.Entity#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DataType value);

	/**
	 * Returns the value of the '<em><b>Persisted By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link soamodel.ServiceComponent#getPersists <em>Persists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persisted By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persisted By</em>' reference.
	 * @see #setPersistedBy(ServiceComponent)
	 * @see soamodel.SoamodelPackage#getEntity_PersistedBy()
	 * @see soamodel.ServiceComponent#getPersists
	 * @model opposite="persists"
	 * @generated
	 */
	ServiceComponent getPersistedBy();

	/**
	 * Sets the value of the '{@link soamodel.Entity#getPersistedBy <em>Persisted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persisted By</em>' reference.
	 * @see #getPersistedBy()
	 * @generated
	 */
	void setPersistedBy(ServiceComponent value);

	/**
	 * Returns the value of the '<em><b>Generated ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated ID</em>' attribute.
	 * @see #setGeneratedID(boolean)
	 * @see soamodel.SoamodelPackage#getEntity_GeneratedID()
	 * @model required="true"
	 * @generated
	 */
	boolean isGeneratedID();

	/**
	 * Sets the value of the '{@link soamodel.Entity#isGeneratedID <em>Generated ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated ID</em>' attribute.
	 * @see #isGeneratedID()
	 * @generated
	 */
	void setGeneratedID(boolean value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' reference.
	 * @see #setID(Attribute)
	 * @see soamodel.SoamodelPackage#getEntity_ID()
	 * @model required="true"
	 * @generated
	 */
	Attribute getID();

	/**
	 * Sets the value of the '{@link soamodel.Entity#getID <em>ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' reference.
	 * @see #getID()
	 * @generated
	 */
	void setID(Attribute value);

} // Entity
