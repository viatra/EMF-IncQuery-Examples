/**
 */
package bpmn20exec;

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
 * @see bpmn20exec.Bpmn20execFactory
 * @model kind="package"
 * @generated
 */
public interface Bpmn20execPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "bpmn20exec";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://bpmn20exec";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "exec";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Bpmn20execPackage eINSTANCE = bpmn20exec.impl.Bpmn20execPackageImpl.init();

    /**
     * The meta object id for the '{@link bpmn20exec.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bpmn20exec.impl.ProcessInstanceImpl
     * @see bpmn20exec.impl.Bpmn20execPackageImpl#getProcessInstance()
     * @generated
     */
    int PROCESS_INSTANCE = 0;

    /**
     * The feature id for the '<em><b>Process</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_INSTANCE__PROCESS = 0;

    /**
     * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_INSTANCE__TOKENS = 1;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_INSTANCE__STATE = 2;

    /**
     * The number of structural features of the '<em>Process Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_INSTANCE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link bpmn20exec.impl.TokenImpl <em>Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bpmn20exec.impl.TokenImpl
     * @see bpmn20exec.impl.Bpmn20execPackageImpl#getToken()
     * @generated
     */
    int TOKEN = 1;

    /**
     * The feature id for the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN__ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Token</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOKEN_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link bpmn20exec.ProcessState <em>Process State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bpmn20exec.ProcessState
     * @see bpmn20exec.impl.Bpmn20execPackageImpl#getProcessState()
     * @generated
     */
    int PROCESS_STATE = 2;


    /**
     * Returns the meta object for class '{@link bpmn20exec.ProcessInstance <em>Process Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Instance</em>'.
     * @see bpmn20exec.ProcessInstance
     * @generated
     */
    EClass getProcessInstance();

    /**
     * Returns the meta object for the reference '{@link bpmn20exec.ProcessInstance#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Process</em>'.
     * @see bpmn20exec.ProcessInstance#getProcess()
     * @see #getProcessInstance()
     * @generated
     */
    EReference getProcessInstance_Process();

    /**
     * Returns the meta object for the containment reference list '{@link bpmn20exec.ProcessInstance#getTokens <em>Tokens</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tokens</em>'.
     * @see bpmn20exec.ProcessInstance#getTokens()
     * @see #getProcessInstance()
     * @generated
     */
    EReference getProcessInstance_Tokens();

    /**
     * Returns the meta object for the attribute '{@link bpmn20exec.ProcessInstance#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see bpmn20exec.ProcessInstance#getState()
     * @see #getProcessInstance()
     * @generated
     */
    EAttribute getProcessInstance_State();

    /**
     * Returns the meta object for class '{@link bpmn20exec.Token <em>Token</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Token</em>'.
     * @see bpmn20exec.Token
     * @generated
     */
    EClass getToken();

    /**
     * Returns the meta object for the reference '{@link bpmn20exec.Token#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Element</em>'.
     * @see bpmn20exec.Token#getElement()
     * @see #getToken()
     * @generated
     */
    EReference getToken_Element();

    /**
     * Returns the meta object for enum '{@link bpmn20exec.ProcessState <em>Process State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process State</em>'.
     * @see bpmn20exec.ProcessState
     * @generated
     */
    EEnum getProcessState();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Bpmn20execFactory getBpmn20execFactory();

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
         * The meta object literal for the '{@link bpmn20exec.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see bpmn20exec.impl.ProcessInstanceImpl
         * @see bpmn20exec.impl.Bpmn20execPackageImpl#getProcessInstance()
         * @generated
         */
        EClass PROCESS_INSTANCE = eINSTANCE.getProcessInstance();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_INSTANCE__PROCESS = eINSTANCE.getProcessInstance_Process();

        /**
         * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_INSTANCE__TOKENS = eINSTANCE.getProcessInstance_Tokens();

        /**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_INSTANCE__STATE = eINSTANCE.getProcessInstance_State();

        /**
         * The meta object literal for the '{@link bpmn20exec.impl.TokenImpl <em>Token</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see bpmn20exec.impl.TokenImpl
         * @see bpmn20exec.impl.Bpmn20execPackageImpl#getToken()
         * @generated
         */
        EClass TOKEN = eINSTANCE.getToken();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TOKEN__ELEMENT = eINSTANCE.getToken_Element();

        /**
         * The meta object literal for the '{@link bpmn20exec.ProcessState <em>Process State</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see bpmn20exec.ProcessState
         * @see bpmn20exec.impl.Bpmn20execPackageImpl#getProcessState()
         * @generated
         */
        EEnum PROCESS_STATE = eINSTANCE.getProcessState();

    }

} //Bpmn20execPackage
