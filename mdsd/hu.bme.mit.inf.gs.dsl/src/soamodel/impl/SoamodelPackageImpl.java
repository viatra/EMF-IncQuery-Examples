/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import soamodel.Attribute;
import soamodel.BuiltInDataType;
import soamodel.CSharpComponent;
import soamodel.CollectionType;
import soamodel.DataType;
import soamodel.Entity;
import soamodel.EnumLiteral;
import soamodel.HttpMethod;
import soamodel.JEEComponent;
import soamodel.OCLConstraint;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoamodelPackageImpl extends EPackageImpl implements SoamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSharpComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jeeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOrientedArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osGiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPostconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclDataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPreconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see soamodel.SoamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoamodelPackageImpl() {
		super(eNS_URI, SoamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SoamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoamodelPackage init() {
		if (isInited) return (SoamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SoamodelPackage.eNS_URI);

		// Obtain or create and register package
		SoamodelPackageImpl theSoamodelPackage = (SoamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSoamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSoamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoamodelPackage.eNS_URI, theSoamodelPackage);
		return theSoamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceComponent() {
		return serviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComponent_Methods() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceComponent_Name() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceComponent_Namespace() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComponent_ConnectsTo() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceComponent_URI() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComponent_Persists() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComponent_InArchitecture() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSharpComponent() {
		return cSharpComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJEEComponent() {
		return jeeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMethod() {
		return serviceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_Description() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_Parameters() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_MethodType() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_Name() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_Preconditions() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_Postconditions() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Name() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OclConstraints() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SuperType() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PersistedBy() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_GeneratedID() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ID() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInDataType() {
		return builtInDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_ItemType() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeOf() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOrientedArchitecture() {
		return serviceOrientedArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOrientedArchitecture_Components() {
		return (EReference)serviceOrientedArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOrientedArchitecture_DataTypes() {
		return (EReference)serviceOrientedArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOrientedArchitecture_Name() {
		return (EAttribute)serviceOrientedArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLConstraint() {
		return oclConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraint_Constraint() {
		return (EAttribute)oclConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraint_Description() {
		return (EAttribute)oclConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_Literals() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Name() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSGiComponent() {
		return osGiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPostcondition() {
		return oclPostconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLDataConstraint() {
		return oclDataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPrecondition() {
		return oclPreconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestMethod() {
		return restMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestMethod_HttpMethod() {
		return (EAttribute)restMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestMethod_Path() {
		return (EAttribute)restMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelFactory getSoamodelFactory() {
		return (SoamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceComponentEClass = createEClass(SERVICE_COMPONENT);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__METHODS);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__NAME);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__NAMESPACE);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__CONNECTS_TO);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__URI);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__PERSISTS);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__IN_ARCHITECTURE);

		cSharpComponentEClass = createEClass(CSHARP_COMPONENT);

		jeeComponentEClass = createEClass(JEE_COMPONENT);

		serviceMethodEClass = createEClass(SERVICE_METHOD);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__DESCRIPTION);
		createEReference(serviceMethodEClass, SERVICE_METHOD__PARAMETERS);
		createEReference(serviceMethodEClass, SERVICE_METHOD__METHOD_TYPE);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
		createEReference(serviceMethodEClass, SERVICE_METHOD__POSTCONDITIONS);
		createEReference(serviceMethodEClass, SERVICE_METHOD__PRECONDITIONS);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAMETER_TYPE);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__OCL_CONSTRAINTS);
		createEReference(entityEClass, ENTITY__SUPER_TYPE);
		createEReference(entityEClass, ENTITY__PERSISTED_BY);
		createEAttribute(entityEClass, ENTITY__GENERATED_ID);
		createEReference(entityEClass, ENTITY__ID);

		builtInDataTypeEClass = createEClass(BUILT_IN_DATA_TYPE);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__ITEM_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_OF);

		serviceOrientedArchitectureEClass = createEClass(SERVICE_ORIENTED_ARCHITECTURE);
		createEReference(serviceOrientedArchitectureEClass, SERVICE_ORIENTED_ARCHITECTURE__COMPONENTS);
		createEReference(serviceOrientedArchitectureEClass, SERVICE_ORIENTED_ARCHITECTURE__DATA_TYPES);
		createEAttribute(serviceOrientedArchitectureEClass, SERVICE_ORIENTED_ARCHITECTURE__NAME);

		oclConstraintEClass = createEClass(OCL_CONSTRAINT);
		createEAttribute(oclConstraintEClass, OCL_CONSTRAINT__CONSTRAINT);
		createEAttribute(oclConstraintEClass, OCL_CONSTRAINT__DESCRIPTION);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__LITERALS);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);

		osGiComponentEClass = createEClass(OS_GI_COMPONENT);

		oclPostconditionEClass = createEClass(OCL_POSTCONDITION);

		oclDataConstraintEClass = createEClass(OCL_DATA_CONSTRAINT);

		oclPreconditionEClass = createEClass(OCL_PRECONDITION);

		restMethodEClass = createEClass(REST_METHOD);
		createEAttribute(restMethodEClass, REST_METHOD__HTTP_METHOD);
		createEAttribute(restMethodEClass, REST_METHOD__PATH);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		cSharpComponentEClass.getESuperTypes().add(this.getServiceComponent());
		jeeComponentEClass.getESuperTypes().add(this.getServiceComponent());
		entityEClass.getESuperTypes().add(this.getDataType());
		builtInDataTypeEClass.getESuperTypes().add(this.getDataType());
		collectionTypeEClass.getESuperTypes().add(this.getDataType());
		enumEClass.getESuperTypes().add(this.getDataType());
		osGiComponentEClass.getESuperTypes().add(this.getServiceComponent());
		oclPostconditionEClass.getESuperTypes().add(this.getOCLConstraint());
		oclDataConstraintEClass.getESuperTypes().add(this.getOCLConstraint());
		oclPreconditionEClass.getESuperTypes().add(this.getOCLConstraint());
		restMethodEClass.getESuperTypes().add(this.getServiceMethod());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceComponentEClass, ServiceComponent.class, "ServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceComponent_Methods(), this.getServiceMethod(), null, "methods", null, 0, -1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_ConnectsTo(), this.getServiceComponent(), null, "connectsTo", null, 0, -1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_URI(), ecorePackage.getEString(), "URI", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_Persists(), this.getEntity(), this.getEntity_PersistedBy(), "persists", null, 0, -1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_InArchitecture(), this.getServiceOrientedArchitecture(), this.getServiceOrientedArchitecture_Components(), "inArchitecture", null, 1, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSharpComponentEClass, CSharpComponent.class, "CSharpComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jeeComponentEClass, JEEComponent.class, "JEEComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMethod_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_MethodType(), this.getDataType(), null, "methodType", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_Postconditions(), this.getOCLPostcondition(), null, "postconditions", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_Preconditions(), this.getOCLPrecondition(), null, "preconditions", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_ParameterType(), this.getDataType(), null, "parameterType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attributes(), this.getAttribute(), this.getAttribute_AttributeOf(), "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_OclConstraints(), this.getOCLDataConstraint(), null, "oclConstraints", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SuperType(), this.getDataType(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PersistedBy(), this.getServiceComponent(), this.getServiceComponent_Persists(), "persistedBy", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_GeneratedID(), ecorePackage.getEBoolean(), "generatedID", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ID(), this.getAttribute(), null, "ID", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInDataTypeEClass, BuiltInDataType.class, "BuiltInDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_ItemType(), this.getDataType(), null, "itemType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_AttributeType(), this.getDataType(), null, "attributeType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_AttributeOf(), this.getEntity(), this.getEntity_Attributes(), "attributeOf", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOrientedArchitectureEClass, ServiceOrientedArchitecture.class, "ServiceOrientedArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOrientedArchitecture_Components(), this.getServiceComponent(), this.getServiceComponent_InArchitecture(), "components", null, 0, -1, ServiceOrientedArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOrientedArchitecture_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, ServiceOrientedArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOrientedArchitecture_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceOrientedArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclConstraintEClass, OCLConstraint.class, "OCLConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 1, 1, OCLConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOCLConstraint_Description(), ecorePackage.getEString(), "description", null, 0, 1, OCLConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, soamodel.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Literals(), this.getEnumLiteral(), null, "literals", null, 1, -1, soamodel.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osGiComponentEClass, OSGiComponent.class, "OSGiComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclPostconditionEClass, OCLPostcondition.class, "OCLPostcondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclDataConstraintEClass, OCLDataConstraint.class, "OCLDataConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclPreconditionEClass, OCLPrecondition.class, "OCLPrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restMethodEClass, RestMethod.class, "RestMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestMethod_HttpMethod(), this.getHttpMethod(), "httpMethod", null, 1, 1, RestMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestMethod_Path(), ecorePackage.getEString(), "path", null, 0, 1, RestMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET_LITERAL);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST_LITERAL);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT_LITERAL);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getServiceOrientedArchitecture_Components(), 
		   source, 
		   new String[] {
			 "name", "dataTypes"
		   });
	}

} //SoamodelPackageImpl
