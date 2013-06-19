/**
 */
package bpmn20exec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bpmn20exec.Bpmn20execPackage
 * @generated
 */
public interface Bpmn20execFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Bpmn20execFactory eINSTANCE = bpmn20exec.impl.Bpmn20execFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Process Instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Instance</em>'.
     * @generated
     */
    ProcessInstance createProcessInstance();

    /**
     * Returns a new object of class '<em>Token</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Token</em>'.
     * @generated
     */
    Token createToken();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    Bpmn20execPackage getBpmn20execPackage();

} //Bpmn20execFactory
