/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soamodel.Attribute;
import soamodel.BuiltInDataType;
import soamodel.CSharpComponent;
import soamodel.CollectionType;
import soamodel.Entity;
import soamodel.EnumLiteral;
import soamodel.HttpMethod;
import soamodel.JEEComponent;
import soamodel.OCLDataConstraint;
import soamodel.OCLPostcondition;
import soamodel.OCLPrecondition;
import soamodel.OSGiComponent;
import soamodel.Parameter;
import soamodel.RestMethod;
import soamodel.ServiceComponent;
import soamodel.ServiceMethod;
import soamodel.ServiceOrientedArchitecture;
import soamodel.SoamodelFactory;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoamodelFactoryImpl extends EFactoryImpl implements SoamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoamodelFactory init() {
		try {
			SoamodelFactory theSoamodelFactory = (SoamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://soamodel/1.0"); 
			if (theSoamodelFactory != null) {
				return theSoamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoamodelPackage.SERVICE_COMPONENT: return createServiceComponent();
			case SoamodelPackage.CSHARP_COMPONENT: return createCSharpComponent();
			case SoamodelPackage.JEE_COMPONENT: return createJEEComponent();
			case SoamodelPackage.SERVICE_METHOD: return createServiceMethod();
			case SoamodelPackage.PARAMETER: return createParameter();
			case SoamodelPackage.ENTITY: return createEntity();
			case SoamodelPackage.BUILT_IN_DATA_TYPE: return createBuiltInDataType();
			case SoamodelPackage.COLLECTION_TYPE: return createCollectionType();
			case SoamodelPackage.ATTRIBUTE: return createAttribute();
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE: return createServiceOrientedArchitecture();
			case SoamodelPackage.ENUM: return createEnum();
			case SoamodelPackage.ENUM_LITERAL: return createEnumLiteral();
			case SoamodelPackage.OS_GI_COMPONENT: return createOSGiComponent();
			case SoamodelPackage.OCL_POSTCONDITION: return createOCLPostcondition();
			case SoamodelPackage.OCL_DATA_CONSTRAINT: return createOCLDataConstraint();
			case SoamodelPackage.OCL_PRECONDITION: return createOCLPrecondition();
			case SoamodelPackage.REST_METHOD: return createRestMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SoamodelPackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SoamodelPackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent createServiceComponent() {
		ServiceComponentImpl serviceComponent = new ServiceComponentImpl();
		return serviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharpComponent createCSharpComponent() {
		CSharpComponentImpl cSharpComponent = new CSharpComponentImpl();
		return cSharpComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEEComponent createJEEComponent() {
		JEEComponentImpl jeeComponent = new JEEComponentImpl();
		return jeeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMethod createServiceMethod() {
		ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
		return serviceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInDataType createBuiltInDataType() {
		BuiltInDataTypeImpl builtInDataType = new BuiltInDataTypeImpl();
		return builtInDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOrientedArchitecture createServiceOrientedArchitecture() {
		ServiceOrientedArchitectureImpl serviceOrientedArchitecture = new ServiceOrientedArchitectureImpl();
		return serviceOrientedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public soamodel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGiComponent createOSGiComponent() {
		OSGiComponentImpl osGiComponent = new OSGiComponentImpl();
		return osGiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPostcondition createOCLPostcondition() {
		OCLPostconditionImpl oclPostcondition = new OCLPostconditionImpl();
		return oclPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDataConstraint createOCLDataConstraint() {
		OCLDataConstraintImpl oclDataConstraint = new OCLDataConstraintImpl();
		return oclDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPrecondition createOCLPrecondition() {
		OCLPreconditionImpl oclPrecondition = new OCLPreconditionImpl();
		return oclPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestMethod createRestMethod() {
		RestMethodImpl restMethod = new RestMethodImpl();
		return restMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelPackage getSoamodelPackage() {
		return (SoamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SoamodelPackage getPackage() {
		return SoamodelPackage.eINSTANCE;
	}

} //SoamodelFactoryImpl
