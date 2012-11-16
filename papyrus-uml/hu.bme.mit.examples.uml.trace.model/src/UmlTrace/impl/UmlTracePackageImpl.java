/**
 */
package UmlTrace.impl;

import UmlTrace.TraceElement;
import UmlTrace.UmlTraceFactory;
import UmlTrace.UmlTracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlTracePackageImpl extends EPackageImpl implements UmlTracePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traceElementEClass = null;

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
     * @see UmlTrace.UmlTracePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UmlTracePackageImpl() {
        super(eNS_URI, UmlTraceFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link UmlTracePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UmlTracePackage init() {
        if (isInited) return (UmlTracePackage)EPackage.Registry.INSTANCE.getEPackage(UmlTracePackage.eNS_URI);

        // Obtain or create and register package
        UmlTracePackageImpl theUmlTracePackage = (UmlTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlTracePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUmlTracePackage.createPackageContents();

        // Initialize created meta-data
        theUmlTracePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUmlTracePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UmlTracePackage.eNS_URI, theUmlTracePackage);
        return theUmlTracePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraceElement() {
        return traceElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceElement_Source() {
        return (EReference)traceElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceElement_Target() {
        return (EReference)traceElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceElement_InheritedSource() {
        return (EReference)traceElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTraceElement_InheritedTarget() {
        return (EReference)traceElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlTraceFactory getUmlTraceFactory() {
        return (UmlTraceFactory)getEFactoryInstance();
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
        traceElementEClass = createEClass(TRACE_ELEMENT);
        createEReference(traceElementEClass, TRACE_ELEMENT__SOURCE);
        createEReference(traceElementEClass, TRACE_ELEMENT__TARGET);
        createEReference(traceElementEClass, TRACE_ELEMENT__INHERITED_SOURCE);
        createEReference(traceElementEClass, TRACE_ELEMENT__INHERITED_TARGET);
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
        UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(traceElementEClass, TraceElement.class, "TraceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTraceElement_Source(), theUMLPackage.getClass_(), null, "source", null, 1, 1, TraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTraceElement_Target(), theUMLPackage.getClass_(), null, "target", null, 1, 1, TraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTraceElement_InheritedSource(), theUMLPackage.getClass_(), null, "inheritedSource", null, 0, -1, TraceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTraceElement_InheritedTarget(), theUMLPackage.getClass_(), null, "inheritedTarget", null, 0, -1, TraceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // org.eclipse.viatra2.emf.incquery.derived.feature
        createOrgAnnotations();
    }

    /**
     * Initializes the annotations for <b>org.eclipse.viatra2.emf.incquery.derived.feature</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createOrgAnnotations() {
        String source = "org.eclipse.viatra2.emf.incquery.derived.feature";		
        addAnnotation
          (getTraceElement_InheritedSource(), 
           source, 
           new String[] {
             "patternFQN", "uml.included.inheritedSource"
           });		
        addAnnotation
          (getTraceElement_InheritedTarget(), 
           source, 
           new String[] {
             "patternFQN", "uml.included.inheritedTarget"
           });
    }

} //UmlTracePackageImpl
