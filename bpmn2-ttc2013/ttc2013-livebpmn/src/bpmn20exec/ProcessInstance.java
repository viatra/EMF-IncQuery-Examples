/**
 */
package bpmn20exec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn20exec.ProcessInstance#getProcess <em>Process</em>}</li>
 *   <li>{@link bpmn20exec.ProcessInstance#getTokens <em>Tokens</em>}</li>
 *   <li>{@link bpmn20exec.ProcessInstance#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn20exec.Bpmn20execPackage#getProcessInstance()
 * @model
 * @generated
 */
public interface ProcessInstance extends EObject {
    /**
     * Returns the value of the '<em><b>Process</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' reference.
     * @see #setProcess(org.eclipse.bpmn2.Process)
     * @see bpmn20exec.Bpmn20execPackage#getProcessInstance_Process()
     * @model
     * @generated
     */
    org.eclipse.bpmn2.Process getProcess();

    /**
     * Sets the value of the '{@link bpmn20exec.ProcessInstance#getProcess <em>Process</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(org.eclipse.bpmn2.Process value);

    /**
     * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
     * The list contents are of type {@link bpmn20exec.Token}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tokens</em>' containment reference list.
     * @see bpmn20exec.Bpmn20execPackage#getProcessInstance_Tokens()
     * @model containment="true"
     * @generated
     */
    EList<Token> getTokens();

    /**
     * Returns the value of the '<em><b>State</b></em>' attribute.
     * The literals are from the enumeration {@link bpmn20exec.ProcessState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' attribute.
     * @see bpmn20exec.ProcessState
     * @see #setState(ProcessState)
     * @see bpmn20exec.Bpmn20execPackage#getProcessInstance_State()
     * @model
     * @generated
     */
    ProcessState getState();

    /**
     * Sets the value of the '{@link bpmn20exec.ProcessInstance#getState <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' attribute.
     * @see bpmn20exec.ProcessState
     * @see #getState()
     * @generated
     */
    void setState(ProcessState value);

} // ProcessInstance
