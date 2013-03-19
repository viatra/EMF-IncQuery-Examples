/**
 */
package stochsim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import stochsim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StochsimFactoryImpl extends EFactoryImpl implements StochsimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StochsimFactory init() {
		try {
			StochsimFactory theStochsimFactory = (StochsimFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.eclipse.viatra2.emf.incquery.stochsim.model"); 
			if (theStochsimFactory != null) {
				return theStochsimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StochsimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochsimFactoryImpl() {
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
			case StochsimPackage.SN: return createSN();
			case StochsimPackage.CL: return createCL();
			case StochsimPackage.SNET_MODEL: return createSnetModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN createSN() {
		SNImpl sn = new SNImpl();
		return sn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CL createCL() {
		CLImpl cl = new CLImpl();
		return cl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnetModel createSnetModel() {
		SnetModelImpl snetModel = new SnetModelImpl();
		return snetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochsimPackage getStochsimPackage() {
		return (StochsimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StochsimPackage getPackage() {
		return StochsimPackage.eINSTANCE;
	}

} //StochsimFactoryImpl
