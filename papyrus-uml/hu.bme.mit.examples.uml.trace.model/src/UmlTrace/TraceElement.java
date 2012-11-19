/**
 */
package UmlTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UmlTrace.TraceElement#getSource <em>Source</em>}</li>
 *   <li>{@link UmlTrace.TraceElement#getTarget <em>Target</em>}</li>
 *   <li>{@link UmlTrace.TraceElement#getInheritedSource <em>Inherited Source</em>}</li>
 *   <li>{@link UmlTrace.TraceElement#getInheritedTarget <em>Inherited Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see UmlTrace.UmlTracePackage#getTraceElement()
 * @model
 * @generated
 */
public interface TraceElement extends EObject {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(org.eclipse.uml2.uml.Class)
     * @see UmlTrace.UmlTracePackage#getTraceElement_Source()
     * @model required="true"
     * @generated
     */
    org.eclipse.uml2.uml.Class getSource();

    /**
     * Sets the value of the '{@link UmlTrace.TraceElement#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(org.eclipse.uml2.uml.Class value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(org.eclipse.uml2.uml.Class)
     * @see UmlTrace.UmlTracePackage#getTraceElement_Target()
     * @model required="true"
     * @generated
     */
    org.eclipse.uml2.uml.Class getTarget();

    /**
     * Sets the value of the '{@link UmlTrace.TraceElement#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(org.eclipse.uml2.uml.Class value);

    /**
     * Returns the value of the '<em><b>Inherited Source</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inherited Source</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inherited Source</em>' reference list.
     * @see UmlTrace.UmlTracePackage#getTraceElement_InheritedSource()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='uml.included.inheritedSource'"
     * @generated
     */
    EList<org.eclipse.uml2.uml.Class> getInheritedSource();

    /**
     * Returns the value of the '<em><b>Inherited Target</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inherited Target</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inherited Target</em>' reference list.
     * @see UmlTrace.UmlTracePackage#getTraceElement_InheritedTarget()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="org.eclipse.viatra2.emf.incquery.derived.feature patternFQN='uml.included.inheritedTarget'"
     * @generated
     */
    EList<org.eclipse.uml2.uml.Class> getInheritedTarget();

} // TraceElement
