/**
 */
package UmlTrace;

import org.eclipse.emf.ecore.EClass;
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
 * @see UmlTrace.UmlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface UmlTracePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "UmlTrace";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://hu.bme.mit.uml.trace/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "umltrace";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UmlTracePackage eINSTANCE = UmlTrace.impl.UmlTracePackageImpl.init();

    /**
     * The meta object id for the '{@link UmlTrace.impl.TraceElementImpl <em>Trace Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see UmlTrace.impl.TraceElementImpl
     * @see UmlTrace.impl.UmlTracePackageImpl#getTraceElement()
     * @generated
     */
    int TRACE_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_ELEMENT__SOURCE = 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_ELEMENT__TARGET = 1;

    /**
     * The feature id for the '<em><b>Inherited Source</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_ELEMENT__INHERITED_SOURCE = 2;

    /**
     * The feature id for the '<em><b>Inherited Target</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_ELEMENT__INHERITED_TARGET = 3;

    /**
     * The number of structural features of the '<em>Trace Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRACE_ELEMENT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link UmlTrace.TraceElement <em>Trace Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trace Element</em>'.
     * @see UmlTrace.TraceElement
     * @generated
     */
    EClass getTraceElement();

    /**
     * Returns the meta object for the reference '{@link UmlTrace.TraceElement#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see UmlTrace.TraceElement#getSource()
     * @see #getTraceElement()
     * @generated
     */
    EReference getTraceElement_Source();

    /**
     * Returns the meta object for the reference '{@link UmlTrace.TraceElement#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see UmlTrace.TraceElement#getTarget()
     * @see #getTraceElement()
     * @generated
     */
    EReference getTraceElement_Target();

    /**
     * Returns the meta object for the reference list '{@link UmlTrace.TraceElement#getInheritedSource <em>Inherited Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Inherited Source</em>'.
     * @see UmlTrace.TraceElement#getInheritedSource()
     * @see #getTraceElement()
     * @generated
     */
    EReference getTraceElement_InheritedSource();

    /**
     * Returns the meta object for the reference list '{@link UmlTrace.TraceElement#getInheritedTarget <em>Inherited Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Inherited Target</em>'.
     * @see UmlTrace.TraceElement#getInheritedTarget()
     * @see #getTraceElement()
     * @generated
     */
    EReference getTraceElement_InheritedTarget();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UmlTraceFactory getUmlTraceFactory();

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
         * The meta object literal for the '{@link UmlTrace.impl.TraceElementImpl <em>Trace Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see UmlTrace.impl.TraceElementImpl
         * @see UmlTrace.impl.UmlTracePackageImpl#getTraceElement()
         * @generated
         */
        EClass TRACE_ELEMENT = eINSTANCE.getTraceElement();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_ELEMENT__SOURCE = eINSTANCE.getTraceElement_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_ELEMENT__TARGET = eINSTANCE.getTraceElement_Target();

        /**
         * The meta object literal for the '<em><b>Inherited Source</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_ELEMENT__INHERITED_SOURCE = eINSTANCE.getTraceElement_InheritedSource();

        /**
         * The meta object literal for the '<em><b>Inherited Target</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRACE_ELEMENT__INHERITED_TARGET = eINSTANCE.getTraceElement_InheritedTarget();

    }

} //UmlTracePackage
