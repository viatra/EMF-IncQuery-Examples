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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.Attribute#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link soamodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.Attribute#getAttributeOf <em>Attribute Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' reference.
	 * @see #setAttributeType(DataType)
	 * @see soamodel.SoamodelPackage#getAttribute_AttributeType()
	 * @model required="true"
	 * @generated
	 */
	DataType getAttributeType();

	/**
	 * Sets the value of the '{@link soamodel.Attribute#getAttributeType <em>Attribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' reference.
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(DataType value);

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
	 * @see soamodel.SoamodelPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soamodel.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soamodel.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Of</em>' container reference.
	 * @see #setAttributeOf(Entity)
	 * @see soamodel.SoamodelPackage#getAttribute_AttributeOf()
	 * @see soamodel.Entity#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	Entity getAttributeOf();

	/**
	 * Sets the value of the '{@link soamodel.Attribute#getAttributeOf <em>Attribute Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Of</em>' container reference.
	 * @see #getAttributeOf()
	 * @generated
	 */
	void setAttributeOf(Entity value);

} // Attribute
