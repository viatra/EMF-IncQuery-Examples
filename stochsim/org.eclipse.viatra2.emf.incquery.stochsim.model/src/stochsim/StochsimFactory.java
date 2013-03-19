/**
 */
package stochsim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see stochsim.StochsimPackage
 * @generated
 */
public interface StochsimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochsimFactory eINSTANCE = stochsim.impl.StochsimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SN</em>'.
	 * @generated
	 */
	SN createSN();

	/**
	 * Returns a new object of class '<em>CL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CL</em>'.
	 * @generated
	 */
	CL createCL();

	/**
	 * Returns a new object of class '<em>Snet Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snet Model</em>'.
	 * @generated
	 */
	SnetModel createSnetModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StochsimPackage getStochsimPackage();

} //StochsimFactory
