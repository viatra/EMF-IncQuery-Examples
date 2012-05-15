/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelPackage
 * @generated
 */
public interface SoamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoamodelFactory eINSTANCE = soamodel.impl.SoamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Component</em>'.
	 * @generated
	 */
	ServiceComponent createServiceComponent();

	/**
	 * Returns a new object of class '<em>CSharp Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSharp Component</em>'.
	 * @generated
	 */
	CSharpComponent createCSharpComponent();

	/**
	 * Returns a new object of class '<em>JEE Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JEE Component</em>'.
	 * @generated
	 */
	JEEComponent createJEEComponent();

	/**
	 * Returns a new object of class '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Method</em>'.
	 * @generated
	 */
	ServiceMethod createServiceMethod();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Built In Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Built In Data Type</em>'.
	 * @generated
	 */
	BuiltInDataType createBuiltInDataType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Service Oriented Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Oriented Architecture</em>'.
	 * @generated
	 */
	ServiceOrientedArchitecture createServiceOrientedArchitecture();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
	EnumLiteral createEnumLiteral();

	/**
	 * Returns a new object of class '<em>OS Gi Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Gi Component</em>'.
	 * @generated
	 */
	OSGiComponent createOSGiComponent();

	/**
	 * Returns a new object of class '<em>OCL Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Postcondition</em>'.
	 * @generated
	 */
	OCLPostcondition createOCLPostcondition();

	/**
	 * Returns a new object of class '<em>OCL Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Data Constraint</em>'.
	 * @generated
	 */
	OCLDataConstraint createOCLDataConstraint();

	/**
	 * Returns a new object of class '<em>OCL Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Precondition</em>'.
	 * @generated
	 */
	OCLPrecondition createOCLPrecondition();

	/**
	 * Returns a new object of class '<em>Rest Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Method</em>'.
	 * @generated
	 */
	RestMethod createRestMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoamodelPackage getSoamodelPackage();

} //SoamodelFactory
