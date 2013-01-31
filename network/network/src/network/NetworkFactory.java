/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see network.NetworkPackage
 * @generated
 */
public interface NetworkFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	NetworkFactory eINSTANCE = network.impl.NetworkFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Network</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Network</em>'.
     * @generated
     */
	Network createNetwork();

	/**
     * Returns a new object of class '<em>Person</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Person</em>'.
     * @generated
     */
	Person createPerson();

	/**
     * Returns a new object of class '<em>Post</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Post</em>'.
     * @generated
     */
	Post createPost();

	/**
     * Returns a new object of class '<em>Circle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Circle</em>'.
     * @generated
     */
	Circle createCircle();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	NetworkPackage getNetworkPackage();

} //NetworkFactory
