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
 * A representation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.ServiceMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link soamodel.ServiceMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link soamodel.ServiceMethod#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link soamodel.ServiceMethod#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.ServiceMethod#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link soamodel.ServiceMethod#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getServiceMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FilledMethodDescription OnlyRestMethods DifferentParameternames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FilledMethodDescription='self.description.size() > 0' OnlyRestMethods='RestMethod.allInstances()->includes(self)' DifferentParameternames='self.parameters->forAll(p1 : Parameter, p2 : Parameter | p1.name <> p2.name or p1 = p2)'"
 * @generated
 */
public interface ServiceMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see soamodel.SoamodelPackage#getServiceMethod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link soamodel.ServiceMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceMethod_Parameters()
	 * @model type="soamodel.Parameter" containment="true"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' reference.
	 * @see #setMethodType(DataType)
	 * @see soamodel.SoamodelPackage#getServiceMethod_MethodType()
	 * @model
	 * @generated
	 */
	DataType getMethodType();

	/**
	 * Sets the value of the '{@link soamodel.ServiceMethod#getMethodType <em>Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' reference.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(DataType value);

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
	 * @see soamodel.SoamodelPackage#getServiceMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soamodel.ServiceMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.OCLPrecondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceMethod_Preconditions()
	 * @model type="soamodel.OCLPrecondition" containment="true"
	 * @generated
	 */
	EList getPreconditions();

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.OCLPostcondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postconditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceMethod_Postconditions()
	 * @model type="soamodel.OCLPostcondition" containment="true"
	 * @generated
	 */
	EList getPostconditions();

} // ServiceMethod
