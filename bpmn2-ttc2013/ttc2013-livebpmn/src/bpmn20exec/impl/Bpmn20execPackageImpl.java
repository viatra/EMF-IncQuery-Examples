/**
 */
package bpmn20exec.impl;

import bpmn20exec.Bpmn20execFactory;
import bpmn20exec.Bpmn20execPackage;
import bpmn20exec.ProcessInstance;
import bpmn20exec.ProcessState;
import bpmn20exec.Token;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn20execPackageImpl extends EPackageImpl implements Bpmn20execPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processInstanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tokenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processStateEEnum = null;

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
     * @see bpmn20exec.Bpmn20execPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Bpmn20execPackageImpl() {
        super(eNS_URI, Bpmn20execFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Bpmn20execPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static Bpmn20execPackage init() {
        if (isInited) return (Bpmn20execPackage)EPackage.Registry.INSTANCE.getEPackage(Bpmn20execPackage.eNS_URI);

        // Obtain or create and register package
        Bpmn20execPackageImpl theBpmn20execPackage = (Bpmn20execPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bpmn20execPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bpmn20execPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        Bpmn2Package.eINSTANCE.eClass();
        BpmnDiPackage.eINSTANCE.eClass();
        DiPackage.eINSTANCE.eClass();
        DcPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theBpmn20execPackage.createPackageContents();

        // Initialize created meta-data
        theBpmn20execPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theBpmn20execPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Bpmn20execPackage.eNS_URI, theBpmn20execPackage);
        return theBpmn20execPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessInstance() {
        return processInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessInstance_Process() {
        return (EReference)processInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessInstance_Tokens() {
        return (EReference)processInstanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessInstance_State() {
        return (EAttribute)processInstanceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getToken() {
        return tokenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getToken_Element() {
        return (EReference)tokenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessState() {
        return processStateEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bpmn20execFactory getBpmn20execFactory() {
        return (Bpmn20execFactory)getEFactoryInstance();
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
        processInstanceEClass = createEClass(PROCESS_INSTANCE);
        createEReference(processInstanceEClass, PROCESS_INSTANCE__PROCESS);
        createEReference(processInstanceEClass, PROCESS_INSTANCE__TOKENS);
        createEAttribute(processInstanceEClass, PROCESS_INSTANCE__STATE);

        tokenEClass = createEClass(TOKEN);
        createEReference(tokenEClass, TOKEN__ELEMENT);

        // Create enums
        processStateEEnum = createEEnum(PROCESS_STATE);
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

        // Obtain other dependent packages
        Bpmn2Package theBpmn2Package = (Bpmn2Package)EPackage.Registry.INSTANCE.getEPackage(Bpmn2Package.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(processInstanceEClass, ProcessInstance.class, "ProcessInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessInstance_Process(), theBpmn2Package.getProcess(), null, "process", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessInstance_Tokens(), this.getToken(), null, "tokens", null, 0, -1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInstance_State(), this.getProcessState(), "state", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getToken_Element(), theBpmn2Package.getFlowElement(), null, "element", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(processStateEEnum, ProcessState.class, "ProcessState");
        addEEnumLiteral(processStateEEnum, ProcessState.CREATED);
        addEEnumLiteral(processStateEEnum, ProcessState.RUNNING);
        addEEnumLiteral(processStateEEnum, ProcessState.FINISHED);

        // Create resource
        createResource(eNS_URI);
    }

} //Bpmn20execPackageImpl
