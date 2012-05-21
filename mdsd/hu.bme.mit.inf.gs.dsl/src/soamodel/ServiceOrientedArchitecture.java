/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Oriented Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.ServiceOrientedArchitecture#getComponents <em>Components</em>}</li>
 *   <li>{@link soamodel.ServiceOrientedArchitecture#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link soamodel.ServiceOrientedArchitecture#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getServiceOrientedArchitecture()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueDatatypeNames uniqueComponentNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueDatatypeNames='self.dataTypes->forAll(t1 : DataType, t2 : DataType | t1.name <> t2.name or t1 = t2)' uniqueComponentNames='self.components->forAll(s1 : ServiceComponent, s2 : ServiceComponent | s1.name <> s2.name or s1 = s2)'"
 * @generated
 */
public interface ServiceOrientedArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.ServiceComponent}.
	 * It is bidirectional and its opposite is '{@link soamodel.ServiceComponent#getInArchitecture <em>In Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceOrientedArchitecture_Components()
	 * @see soamodel.ServiceComponent#getInArchitecture
	 * @model type="soamodel.ServiceComponent" opposite="inArchitecture" containment="true"
	 *        extendedMetaData="name='dataTypes'"
	 * @generated
	 */
	EList getComponents();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceOrientedArchitecture_DataTypes()
	 * @model type="soamodel.DataType" containment="true"
	 * @generated
	 */
	EList getDataTypes();

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
	 * @see soamodel.SoamodelPackage#getServiceOrientedArchitecture_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soamodel.ServiceOrientedArchitecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ServiceOrientedArchitecture
