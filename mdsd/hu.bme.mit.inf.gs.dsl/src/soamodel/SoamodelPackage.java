/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SoamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soamodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "soamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoamodelPackage eINSTANCE = soamodel.impl.SoamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link soamodel.impl.ServiceComponentImpl <em>Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.ServiceComponentImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getServiceComponent()
	 * @generated
	 */
	int SERVICE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__CONNECTS_TO = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__URI = 4;

	/**
	 * The feature id for the '<em><b>Persists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__PERSISTS = 5;

	/**
	 * The feature id for the '<em><b>In Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__IN_ARCHITECTURE = 6;

	/**
	 * The number of structural features of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link soamodel.impl.CSharpComponentImpl <em>CSharp Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.CSharpComponentImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getCSharpComponent()
	 * @generated
	 */
	int CSHARP_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__METHODS = SERVICE_COMPONENT__METHODS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__NAME = SERVICE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__NAMESPACE = SERVICE_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__CONNECTS_TO = SERVICE_COMPONENT__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__URI = SERVICE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Persists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__PERSISTS = SERVICE_COMPONENT__PERSISTS;

	/**
	 * The feature id for the '<em><b>In Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT__IN_ARCHITECTURE = SERVICE_COMPONENT__IN_ARCHITECTURE;

	/**
	 * The number of structural features of the '<em>CSharp Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSHARP_COMPONENT_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.JEEComponentImpl <em>JEE Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.JEEComponentImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getJEEComponent()
	 * @generated
	 */
	int JEE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__METHODS = SERVICE_COMPONENT__METHODS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__NAME = SERVICE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__NAMESPACE = SERVICE_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__CONNECTS_TO = SERVICE_COMPONENT__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__URI = SERVICE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Persists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__PERSISTS = SERVICE_COMPONENT__PERSISTS;

	/**
	 * The feature id for the '<em><b>In Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT__IN_ARCHITECTURE = SERVICE_COMPONENT__IN_ARCHITECTURE;

	/**
	 * The number of structural features of the '<em>JEE Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_COMPONENT_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.ServiceMethodImpl <em>Service Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.ServiceMethodImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getServiceMethod()
	 * @generated
	 */
	int SERVICE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__METHOD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__NAME = 3;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__POSTCONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__PRECONDITIONS = 5;

	/**
	 * The number of structural features of the '<em>Service Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link soamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.ParameterImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link soamodel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.DataTypeImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link soamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.EntityImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ocl Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OCL_CONSTRAINTS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_TYPE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persisted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERSISTED_BY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generated ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERATED_ID = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link soamodel.impl.BuiltInDataTypeImpl <em>Built In Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.BuiltInDataTypeImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getBuiltInDataType()
	 * @generated
	 */
	int BUILT_IN_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Built In Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.CollectionTypeImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ITEM_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link soamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.AttributeImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attribute Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_OF = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link soamodel.impl.ServiceOrientedArchitectureImpl <em>Service Oriented Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.ServiceOrientedArchitectureImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getServiceOrientedArchitecture()
	 * @generated
	 */
	int SERVICE_ORIENTED_ARCHITECTURE = 10;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ORIENTED_ARCHITECTURE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Oriented Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ORIENTED_ARCHITECTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link soamodel.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.OCLConstraintImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getOCLConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>OCL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link soamodel.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.EnumImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__LITERALS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link soamodel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.EnumLiteralImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link soamodel.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.OSGiComponentImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getOSGiComponent()
	 * @generated
	 */
	int OS_GI_COMPONENT = 14;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__METHODS = SERVICE_COMPONENT__METHODS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__NAME = SERVICE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__NAMESPACE = SERVICE_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Connects To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__CONNECTS_TO = SERVICE_COMPONENT__CONNECTS_TO;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__URI = SERVICE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Persists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__PERSISTS = SERVICE_COMPONENT__PERSISTS;

	/**
	 * The feature id for the '<em><b>In Architecture</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT__IN_ARCHITECTURE = SERVICE_COMPONENT__IN_ARCHITECTURE;

	/**
	 * The number of structural features of the '<em>OS Gi Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_COMPONENT_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link soamodel.impl.OCLPostconditionImpl <em>OCL Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.OCLPostconditionImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getOCLPostcondition()
	 * @generated
	 */
	int OCL_POSTCONDITION = 15;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_POSTCONDITION__CONSTRAINT = OCL_CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_POSTCONDITION__DESCRIPTION = OCL_CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OCL Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_POSTCONDITION_FEATURE_COUNT = OCL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.OCLDataConstraintImpl <em>OCL Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.OCLDataConstraintImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getOCLDataConstraint()
	 * @generated
	 */
	int OCL_DATA_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_CONSTRAINT__CONSTRAINT = OCL_CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_CONSTRAINT__DESCRIPTION = OCL_CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OCL Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_CONSTRAINT_FEATURE_COUNT = OCL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.OCLPreconditionImpl <em>OCL Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.OCLPreconditionImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getOCLPrecondition()
	 * @generated
	 */
	int OCL_PRECONDITION = 17;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PRECONDITION__CONSTRAINT = OCL_CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PRECONDITION__DESCRIPTION = OCL_CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OCL Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PRECONDITION_FEATURE_COUNT = OCL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link soamodel.impl.RestMethodImpl <em>Rest Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.impl.RestMethodImpl
	 * @see soamodel.impl.SoamodelPackageImpl#getRestMethod()
	 * @generated
	 */
	int REST_METHOD = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__PARAMETERS = SERVICE_METHOD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__METHOD_TYPE = SERVICE_METHOD__METHOD_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__NAME = SERVICE_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__POSTCONDITIONS = SERVICE_METHOD__POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__PRECONDITIONS = SERVICE_METHOD__PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__HTTP_METHOD = SERVICE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD__PATH = SERVICE_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rest Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link soamodel.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soamodel.HttpMethod
	 * @see soamodel.impl.SoamodelPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 19;

	/**
	 * Returns the meta object for class '{@link soamodel.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component</em>'.
	 * @see soamodel.ServiceComponent
	 * @generated
	 */
	EClass getServiceComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceComponent#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see soamodel.ServiceComponent#getMethods()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_Methods();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.ServiceComponent#getName()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceComponent#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see soamodel.ServiceComponent#getNamespace()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link soamodel.ServiceComponent#getConnectsTo <em>Connects To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connects To</em>'.
	 * @see soamodel.ServiceComponent#getConnectsTo()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_ConnectsTo();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceComponent#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see soamodel.ServiceComponent#getURI()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_URI();

	/**
	 * Returns the meta object for the reference list '{@link soamodel.ServiceComponent#getPersists <em>Persists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persists</em>'.
	 * @see soamodel.ServiceComponent#getPersists()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_Persists();

	/**
	 * Returns the meta object for the container reference '{@link soamodel.ServiceComponent#getInArchitecture <em>In Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Architecture</em>'.
	 * @see soamodel.ServiceComponent#getInArchitecture()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_InArchitecture();

	/**
	 * Returns the meta object for class '{@link soamodel.CSharpComponent <em>CSharp Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSharp Component</em>'.
	 * @see soamodel.CSharpComponent
	 * @generated
	 */
	EClass getCSharpComponent();

	/**
	 * Returns the meta object for class '{@link soamodel.JEEComponent <em>JEE Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JEE Component</em>'.
	 * @see soamodel.JEEComponent
	 * @generated
	 */
	EClass getJEEComponent();

	/**
	 * Returns the meta object for class '{@link soamodel.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Method</em>'.
	 * @see soamodel.ServiceMethod
	 * @generated
	 */
	EClass getServiceMethod();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see soamodel.ServiceMethod#getDescription()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EAttribute getServiceMethod_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see soamodel.ServiceMethod#getParameters()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_Parameters();

	/**
	 * Returns the meta object for the reference '{@link soamodel.ServiceMethod#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Type</em>'.
	 * @see soamodel.ServiceMethod#getMethodType()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_MethodType();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.ServiceMethod#getName()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EAttribute getServiceMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceMethod#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see soamodel.ServiceMethod#getPreconditions()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_Preconditions();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceMethod#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions</em>'.
	 * @see soamodel.ServiceMethod#getPostconditions()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_Postconditions();

	/**
	 * Returns the meta object for class '{@link soamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see soamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link soamodel.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see soamodel.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link soamodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see soamodel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link soamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see soamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see soamodel.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.Entity#getOclConstraints <em>Ocl Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ocl Constraints</em>'.
	 * @see soamodel.Entity#getOclConstraints()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_OclConstraints();

	/**
	 * Returns the meta object for the reference '{@link soamodel.Entity#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see soamodel.Entity#getSuperType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperType();

	/**
	 * Returns the meta object for the reference '{@link soamodel.Entity#getPersistedBy <em>Persisted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persisted By</em>'.
	 * @see soamodel.Entity#getPersistedBy()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PersistedBy();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.Entity#isGeneratedID <em>Generated ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated ID</em>'.
	 * @see soamodel.Entity#isGeneratedID()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_GeneratedID();

	/**
	 * Returns the meta object for the reference '{@link soamodel.Entity#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ID</em>'.
	 * @see soamodel.Entity#getID()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ID();

	/**
	 * Returns the meta object for class '{@link soamodel.BuiltInDataType <em>Built In Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Data Type</em>'.
	 * @see soamodel.BuiltInDataType
	 * @generated
	 */
	EClass getBuiltInDataType();

	/**
	 * Returns the meta object for class '{@link soamodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see soamodel.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link soamodel.CollectionType#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see soamodel.CollectionType#getItemType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ItemType();

	/**
	 * Returns the meta object for class '{@link soamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see soamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link soamodel.Attribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Type</em>'.
	 * @see soamodel.Attribute#getAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeType();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the container reference '{@link soamodel.Attribute#getAttributeOf <em>Attribute Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute Of</em>'.
	 * @see soamodel.Attribute#getAttributeOf()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeOf();

	/**
	 * Returns the meta object for class '{@link soamodel.ServiceOrientedArchitecture <em>Service Oriented Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Oriented Architecture</em>'.
	 * @see soamodel.ServiceOrientedArchitecture
	 * @generated
	 */
	EClass getServiceOrientedArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceOrientedArchitecture#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see soamodel.ServiceOrientedArchitecture#getComponents()
	 * @see #getServiceOrientedArchitecture()
	 * @generated
	 */
	EReference getServiceOrientedArchitecture_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.ServiceOrientedArchitecture#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see soamodel.ServiceOrientedArchitecture#getDataTypes()
	 * @see #getServiceOrientedArchitecture()
	 * @generated
	 */
	EReference getServiceOrientedArchitecture_DataTypes();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.ServiceOrientedArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.ServiceOrientedArchitecture#getName()
	 * @see #getServiceOrientedArchitecture()
	 * @generated
	 */
	EAttribute getServiceOrientedArchitecture_Name();

	/**
	 * Returns the meta object for class '{@link soamodel.OCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Constraint</em>'.
	 * @see soamodel.OCLConstraint
	 * @generated
	 */
	EClass getOCLConstraint();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.OCLConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see soamodel.OCLConstraint#getConstraint()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EAttribute getOCLConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.OCLConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see soamodel.OCLConstraint#getDescription()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EAttribute getOCLConstraint_Description();

	/**
	 * Returns the meta object for class '{@link soamodel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see soamodel.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link soamodel.Enum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see soamodel.Enum#getLiterals()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Literals();

	/**
	 * Returns the meta object for class '{@link soamodel.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see soamodel.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soamodel.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for class '{@link soamodel.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Component</em>'.
	 * @see soamodel.OSGiComponent
	 * @generated
	 */
	EClass getOSGiComponent();

	/**
	 * Returns the meta object for class '{@link soamodel.OCLPostcondition <em>OCL Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Postcondition</em>'.
	 * @see soamodel.OCLPostcondition
	 * @generated
	 */
	EClass getOCLPostcondition();

	/**
	 * Returns the meta object for class '{@link soamodel.OCLDataConstraint <em>OCL Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Data Constraint</em>'.
	 * @see soamodel.OCLDataConstraint
	 * @generated
	 */
	EClass getOCLDataConstraint();

	/**
	 * Returns the meta object for class '{@link soamodel.OCLPrecondition <em>OCL Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Precondition</em>'.
	 * @see soamodel.OCLPrecondition
	 * @generated
	 */
	EClass getOCLPrecondition();

	/**
	 * Returns the meta object for class '{@link soamodel.RestMethod <em>Rest Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Method</em>'.
	 * @see soamodel.RestMethod
	 * @generated
	 */
	EClass getRestMethod();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.RestMethod#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see soamodel.RestMethod#getHttpMethod()
	 * @see #getRestMethod()
	 * @generated
	 */
	EAttribute getRestMethod_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link soamodel.RestMethod#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see soamodel.RestMethod#getPath()
	 * @see #getRestMethod()
	 * @generated
	 */
	EAttribute getRestMethod_Path();

	/**
	 * Returns the meta object for enum '{@link soamodel.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see soamodel.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoamodelFactory getSoamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soamodel.impl.ServiceComponentImpl <em>Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.ServiceComponentImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getServiceComponent()
		 * @generated
		 */
		EClass SERVICE_COMPONENT = eINSTANCE.getServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__METHODS = eINSTANCE.getServiceComponent_Methods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__NAME = eINSTANCE.getServiceComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__NAMESPACE = eINSTANCE.getServiceComponent_Namespace();

		/**
		 * The meta object literal for the '<em><b>Connects To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__CONNECTS_TO = eINSTANCE.getServiceComponent_ConnectsTo();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__URI = eINSTANCE.getServiceComponent_URI();

		/**
		 * The meta object literal for the '<em><b>Persists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__PERSISTS = eINSTANCE.getServiceComponent_Persists();

		/**
		 * The meta object literal for the '<em><b>In Architecture</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__IN_ARCHITECTURE = eINSTANCE.getServiceComponent_InArchitecture();

		/**
		 * The meta object literal for the '{@link soamodel.impl.CSharpComponentImpl <em>CSharp Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.CSharpComponentImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getCSharpComponent()
		 * @generated
		 */
		EClass CSHARP_COMPONENT = eINSTANCE.getCSharpComponent();

		/**
		 * The meta object literal for the '{@link soamodel.impl.JEEComponentImpl <em>JEE Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.JEEComponentImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getJEEComponent()
		 * @generated
		 */
		EClass JEE_COMPONENT = eINSTANCE.getJEEComponent();

		/**
		 * The meta object literal for the '{@link soamodel.impl.ServiceMethodImpl <em>Service Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.ServiceMethodImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getServiceMethod()
		 * @generated
		 */
		EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_METHOD__DESCRIPTION = eINSTANCE.getServiceMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__PARAMETERS = eINSTANCE.getServiceMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__METHOD_TYPE = eINSTANCE.getServiceMethod_MethodType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_METHOD__NAME = eINSTANCE.getServiceMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__PRECONDITIONS = eINSTANCE.getServiceMethod_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__POSTCONDITIONS = eINSTANCE.getServiceMethod_Postconditions();

		/**
		 * The meta object literal for the '{@link soamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.ParameterImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link soamodel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.DataTypeImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link soamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.EntityImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Ocl Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__OCL_CONSTRAINTS = eINSTANCE.getEntity_OclConstraints();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

		/**
		 * The meta object literal for the '<em><b>Persisted By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PERSISTED_BY = eINSTANCE.getEntity_PersistedBy();

		/**
		 * The meta object literal for the '<em><b>Generated ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__GENERATED_ID = eINSTANCE.getEntity_GeneratedID();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID = eINSTANCE.getEntity_ID();

		/**
		 * The meta object literal for the '{@link soamodel.impl.BuiltInDataTypeImpl <em>Built In Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.BuiltInDataTypeImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getBuiltInDataType()
		 * @generated
		 */
		EClass BUILT_IN_DATA_TYPE = eINSTANCE.getBuiltInDataType();

		/**
		 * The meta object literal for the '{@link soamodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.CollectionTypeImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__ITEM_TYPE = eINSTANCE.getCollectionType_ItemType();

		/**
		 * The meta object literal for the '{@link soamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.AttributeImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_OF = eINSTANCE.getAttribute_AttributeOf();

		/**
		 * The meta object literal for the '{@link soamodel.impl.ServiceOrientedArchitectureImpl <em>Service Oriented Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.ServiceOrientedArchitectureImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getServiceOrientedArchitecture()
		 * @generated
		 */
		EClass SERVICE_ORIENTED_ARCHITECTURE = eINSTANCE.getServiceOrientedArchitecture();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS = eINSTANCE.getServiceOrientedArchitecture_Components();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES = eINSTANCE.getServiceOrientedArchitecture_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ORIENTED_ARCHITECTURE__NAME = eINSTANCE.getServiceOrientedArchitecture_Name();

		/**
		 * The meta object literal for the '{@link soamodel.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.OCLConstraintImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getOCLConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOCLConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT__CONSTRAINT = eINSTANCE.getOCLConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT__DESCRIPTION = eINSTANCE.getOCLConstraint_Description();

		/**
		 * The meta object literal for the '{@link soamodel.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.EnumImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__LITERALS = eINSTANCE.getEnum_Literals();

		/**
		 * The meta object literal for the '{@link soamodel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.EnumLiteralImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '{@link soamodel.impl.OSGiComponentImpl <em>OS Gi Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.OSGiComponentImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getOSGiComponent()
		 * @generated
		 */
		EClass OS_GI_COMPONENT = eINSTANCE.getOSGiComponent();

		/**
		 * The meta object literal for the '{@link soamodel.impl.OCLPostconditionImpl <em>OCL Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.OCLPostconditionImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getOCLPostcondition()
		 * @generated
		 */
		EClass OCL_POSTCONDITION = eINSTANCE.getOCLPostcondition();

		/**
		 * The meta object literal for the '{@link soamodel.impl.OCLDataConstraintImpl <em>OCL Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.OCLDataConstraintImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getOCLDataConstraint()
		 * @generated
		 */
		EClass OCL_DATA_CONSTRAINT = eINSTANCE.getOCLDataConstraint();

		/**
		 * The meta object literal for the '{@link soamodel.impl.OCLPreconditionImpl <em>OCL Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.OCLPreconditionImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getOCLPrecondition()
		 * @generated
		 */
		EClass OCL_PRECONDITION = eINSTANCE.getOCLPrecondition();

		/**
		 * The meta object literal for the '{@link soamodel.impl.RestMethodImpl <em>Rest Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.impl.RestMethodImpl
		 * @see soamodel.impl.SoamodelPackageImpl#getRestMethod()
		 * @generated
		 */
		EClass REST_METHOD = eINSTANCE.getRestMethod();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_METHOD__HTTP_METHOD = eINSTANCE.getRestMethod_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_METHOD__PATH = eINSTANCE.getRestMethod_Path();

		/**
		 * The meta object literal for the '{@link soamodel.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soamodel.HttpMethod
		 * @see soamodel.impl.SoamodelPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //SoamodelPackage
