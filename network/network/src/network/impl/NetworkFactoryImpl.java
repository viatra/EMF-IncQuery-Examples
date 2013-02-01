/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network.impl;

import network.*;

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
public class NetworkFactoryImpl extends EFactoryImpl implements NetworkFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static NetworkFactory init() {
        try {
            NetworkFactory theNetworkFactory = (NetworkFactory)EPackage.Registry.INSTANCE.getEFactory("http://network/1.0"); 
            if (theNetworkFactory != null) {
                return theNetworkFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NetworkFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NetworkFactoryImpl() {
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
            case NetworkPackage.NETWORK: return createNetwork();
            case NetworkPackage.PERSON: return createPerson();
            case NetworkPackage.POST: return createPost();
            case NetworkPackage.CIRCLE: return createCircle();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Network createNetwork() {
        NetworkImpl network = new NetworkImpl();
        return network;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Person createPerson() {
        PersonImpl person = new PersonImpl();
        return person;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Post createPost() {
        PostImpl post = new PostImpl();
        return post;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Circle createCircle() {
        CircleImpl circle = new CircleImpl();
        return circle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NetworkPackage getNetworkPackage() {
        return (NetworkPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static NetworkPackage getPackage() {
        return NetworkPackage.eINSTANCE;
    }

} //NetworkFactoryImpl
