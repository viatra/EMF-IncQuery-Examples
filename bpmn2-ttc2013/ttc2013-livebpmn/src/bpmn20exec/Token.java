/**
 */
package bpmn20exec;

import org.eclipse.bpmn2.FlowElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn20exec.Token#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn20exec.Bpmn20execPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
    /**
     * Returns the value of the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' reference.
     * @see #setElement(FlowElement)
     * @see bpmn20exec.Bpmn20execPackage#getToken_Element()
     * @model
     * @generated
     */
    FlowElement getElement();

    /**
     * Sets the value of the '{@link bpmn20exec.Token#getElement <em>Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' reference.
     * @see #getElement()
     * @generated
     */
    void setElement(FlowElement value);

} // Token
