/**
 */
package bpmn20exec.impl;

import bpmn20exec.Bpmn20execPackage;
import bpmn20exec.ProcessInstance;
import bpmn20exec.ProcessState;
import bpmn20exec.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmn20exec.impl.ProcessInstanceImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link bpmn20exec.impl.ProcessInstanceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link bpmn20exec.impl.ProcessInstanceImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessInstanceImpl extends EObjectImpl implements ProcessInstance {
    /**
     * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcess()
     * @generated
     * @ordered
     */
    protected org.eclipse.bpmn2.Process process;

    /**
     * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTokens()
     * @generated
     * @ordered
     */
    protected EList<Token> tokens;

    /**
     * The default value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected static final ProcessState STATE_EDEFAULT = ProcessState.CREATED;

    /**
     * The cached value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected ProcessState state = STATE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn20execPackage.Literals.PROCESS_INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn2.Process getProcess() {
        if (process != null && process.eIsProxy()) {
            InternalEObject oldProcess = (InternalEObject)process;
            process = (org.eclipse.bpmn2.Process)eResolveProxy(oldProcess);
            if (process != oldProcess) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn20execPackage.PROCESS_INSTANCE__PROCESS, oldProcess, process));
            }
        }
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn2.Process basicGetProcess() {
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(org.eclipse.bpmn2.Process newProcess) {
        org.eclipse.bpmn2.Process oldProcess = process;
        process = newProcess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Bpmn20execPackage.PROCESS_INSTANCE__PROCESS, oldProcess, process));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Token> getTokens() {
        if (tokens == null) {
            tokens = new EObjectContainmentEList<Token>(Token.class, this, Bpmn20execPackage.PROCESS_INSTANCE__TOKENS);
        }
        return tokens;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessState getState() {
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setState(ProcessState newState) {
        ProcessState oldState = state;
        state = newState == null ? STATE_EDEFAULT : newState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Bpmn20execPackage.PROCESS_INSTANCE__STATE, oldState, state));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Bpmn20execPackage.PROCESS_INSTANCE__TOKENS:
                return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bpmn20execPackage.PROCESS_INSTANCE__PROCESS:
                if (resolve) return getProcess();
                return basicGetProcess();
            case Bpmn20execPackage.PROCESS_INSTANCE__TOKENS:
                return getTokens();
            case Bpmn20execPackage.PROCESS_INSTANCE__STATE:
                return getState();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bpmn20execPackage.PROCESS_INSTANCE__PROCESS:
                setProcess((org.eclipse.bpmn2.Process)newValue);
                return;
            case Bpmn20execPackage.PROCESS_INSTANCE__TOKENS:
                getTokens().clear();
                getTokens().addAll((Collection<? extends Token>)newValue);
                return;
            case Bpmn20execPackage.PROCESS_INSTANCE__STATE:
                setState((ProcessState)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bpmn20execPackage.PROCESS_INSTANCE__PROCESS:
                setProcess((org.eclipse.bpmn2.Process)null);
                return;
            case Bpmn20execPackage.PROCESS_INSTANCE__TOKENS:
                getTokens().clear();
                return;
            case Bpmn20execPackage.PROCESS_INSTANCE__STATE:
                setState(STATE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bpmn20execPackage.PROCESS_INSTANCE__PROCESS:
                return process != null;
            case Bpmn20execPackage.PROCESS_INSTANCE__TOKENS:
                return tokens != null && !tokens.isEmpty();
            case Bpmn20execPackage.PROCESS_INSTANCE__STATE:
                return state != STATE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (state: ");
        result.append(state);
        result.append(')');
        return result.toString();
    }

} //ProcessInstanceImpl
