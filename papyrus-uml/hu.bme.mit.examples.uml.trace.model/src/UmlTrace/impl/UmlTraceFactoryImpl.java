/**
 */
package UmlTrace.impl;

import UmlTrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlTraceFactoryImpl extends EFactoryImpl implements UmlTraceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UmlTraceFactory init() {
        try {
            UmlTraceFactory theUmlTraceFactory = (UmlTraceFactory)EPackage.Registry.INSTANCE.getEFactory("http://hu.bme.mit.uml.trace/1.0"); 
            if (theUmlTraceFactory != null) {
                return theUmlTraceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UmlTraceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlTraceFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case UmlTracePackage.TRACE_ELEMENT: return createTraceElement();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraceElement createTraceElement() {
        TraceElementImpl traceElement = new TraceElementImpl();
        return traceElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlTracePackage getUmlTracePackage() {
        return (UmlTracePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UmlTracePackage getPackage() {
        return UmlTracePackage.eINSTANCE;
    }

} //UmlTraceFactoryImpl
