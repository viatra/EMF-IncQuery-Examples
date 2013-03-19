/**
 */
package stochsim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see stochsim.StochsimFactory
 * @model kind="package"
 * @generated
 */
public interface StochsimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stochsim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.viatra2.emf.incquery.stochsim.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stochsim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochsimPackage eINSTANCE = stochsim.impl.StochsimPackageImpl.init();

	/**
	 * The meta object id for the '{@link stochsim.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stochsim.impl.NodeImpl
	 * @see stochsim.impl.StochsimPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link stochsim.impl.SNImpl <em>SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stochsim.impl.SNImpl
	 * @see stochsim.impl.StochsimPackageImpl#getSN()
	 * @generated
	 */
	int SN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN__LINK = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link stochsim.impl.CLImpl <em>CL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stochsim.impl.CLImpl
	 * @see stochsim.impl.StochsimPackageImpl#getCL()
	 * @generated
	 */
	int CL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cnn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL__CNN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link stochsim.impl.SnetModelImpl <em>Snet Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stochsim.impl.SnetModelImpl
	 * @see stochsim.impl.StochsimPackageImpl#getSnetModel()
	 * @generated
	 */
	int SNET_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNET_MODEL__NODES = 0;

	/**
	 * The number of structural features of the '<em>Snet Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNET_MODEL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link stochsim.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see stochsim.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link stochsim.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stochsim.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link stochsim.SN <em>SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SN</em>'.
	 * @see stochsim.SN
	 * @generated
	 */
	EClass getSN();

	/**
	 * Returns the meta object for the reference list '{@link stochsim.SN#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see stochsim.SN#getLink()
	 * @see #getSN()
	 * @generated
	 */
	EReference getSN_Link();

	/**
	 * Returns the meta object for class '{@link stochsim.CL <em>CL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CL</em>'.
	 * @see stochsim.CL
	 * @generated
	 */
	EClass getCL();

	/**
	 * Returns the meta object for the reference '{@link stochsim.CL#getCnn <em>Cnn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cnn</em>'.
	 * @see stochsim.CL#getCnn()
	 * @see #getCL()
	 * @generated
	 */
	EReference getCL_Cnn();

	/**
	 * Returns the meta object for class '{@link stochsim.SnetModel <em>Snet Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snet Model</em>'.
	 * @see stochsim.SnetModel
	 * @generated
	 */
	EClass getSnetModel();

	/**
	 * Returns the meta object for the containment reference list '{@link stochsim.SnetModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see stochsim.SnetModel#getNodes()
	 * @see #getSnetModel()
	 * @generated
	 */
	EReference getSnetModel_Nodes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StochsimFactory getStochsimFactory();

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
		 * The meta object literal for the '{@link stochsim.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stochsim.impl.NodeImpl
		 * @see stochsim.impl.StochsimPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link stochsim.impl.SNImpl <em>SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stochsim.impl.SNImpl
		 * @see stochsim.impl.StochsimPackageImpl#getSN()
		 * @generated
		 */
		EClass SN = eINSTANCE.getSN();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SN__LINK = eINSTANCE.getSN_Link();

		/**
		 * The meta object literal for the '{@link stochsim.impl.CLImpl <em>CL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stochsim.impl.CLImpl
		 * @see stochsim.impl.StochsimPackageImpl#getCL()
		 * @generated
		 */
		EClass CL = eINSTANCE.getCL();

		/**
		 * The meta object literal for the '<em><b>Cnn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CL__CNN = eINSTANCE.getCL_Cnn();

		/**
		 * The meta object literal for the '{@link stochsim.impl.SnetModelImpl <em>Snet Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stochsim.impl.SnetModelImpl
		 * @see stochsim.impl.StochsimPackageImpl#getSnetModel()
		 * @generated
		 */
		EClass SNET_MODEL = eINSTANCE.getSnetModel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNET_MODEL__NODES = eINSTANCE.getSnetModel_Nodes();

	}

} //StochsimPackage
