/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network;

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
 * @see network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "network";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://network/1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "network";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	NetworkPackage eINSTANCE = network.impl.NetworkPackageImpl.init();

	/**
     * The meta object id for the '{@link network.impl.NetworkImpl <em>Network</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see network.impl.NetworkImpl
     * @see network.impl.NetworkPackageImpl#getNetwork()
     * @generated
     */
	int NETWORK = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__NAME = 0;

	/**
     * The feature id for the '<em><b>People</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__PEOPLE = 1;

	/**
     * The feature id for the '<em><b>Posts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__POSTS = 2;

	/**
     * The number of structural features of the '<em>Network</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link network.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see network.impl.PersonImpl
     * @see network.impl.NetworkPackageImpl#getPerson()
     * @generated
     */
	int PERSON = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSON__NAME = 0;

	/**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSON__AGE = 1;

	/**
     * The feature id for the '<em><b>Circles</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSON__CIRCLES = 2;

	/**
     * The feature id for the '<em><b>Personal Posts</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSON__PERSONAL_POSTS = 3;

	/**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSON_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link network.impl.PostImpl <em>Post</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see network.impl.PostImpl
     * @see network.impl.NetworkPackageImpl#getPost()
     * @generated
     */
	int POST = 2;

	/**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POST__TEXT = 0;

	/**
     * The feature id for the '<em><b>Author</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POST__AUTHOR = 1;

	/**
     * The feature id for the '<em><b>Visible To</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POST__VISIBLE_TO = 2;

	/**
     * The number of structural features of the '<em>Post</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POST_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link network.impl.CircleImpl <em>Circle</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see network.impl.CircleImpl
     * @see network.impl.NetworkPackageImpl#getCircle()
     * @generated
     */
	int CIRCLE = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIRCLE__NAME = 0;

	/**
     * The feature id for the '<em><b>Members</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIRCLE__MEMBERS = 1;

	/**
     * The feature id for the '<em><b>Circle Posts</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIRCLE__CIRCLE_POSTS = 2;

	/**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIRCLE__OWNER = 3;

	/**
     * The number of structural features of the '<em>Circle</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIRCLE_FEATURE_COUNT = 4;


	/**
     * Returns the meta object for class '{@link network.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network</em>'.
     * @see network.Network
     * @generated
     */
	EClass getNetwork();

	/**
     * Returns the meta object for the attribute '{@link network.Network#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see network.Network#getName()
     * @see #getNetwork()
     * @generated
     */
	EAttribute getNetwork_Name();

	/**
     * Returns the meta object for the containment reference list '{@link network.Network#getPeople <em>People</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>People</em>'.
     * @see network.Network#getPeople()
     * @see #getNetwork()
     * @generated
     */
	EReference getNetwork_People();

	/**
     * Returns the meta object for the containment reference list '{@link network.Network#getPosts <em>Posts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Posts</em>'.
     * @see network.Network#getPosts()
     * @see #getNetwork()
     * @generated
     */
	EReference getNetwork_Posts();

	/**
     * Returns the meta object for class '{@link network.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see network.Person
     * @generated
     */
	EClass getPerson();

	/**
     * Returns the meta object for the attribute '{@link network.Person#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see network.Person#getName()
     * @see #getPerson()
     * @generated
     */
	EAttribute getPerson_Name();

	/**
     * Returns the meta object for the attribute '{@link network.Person#getAge <em>Age</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Age</em>'.
     * @see network.Person#getAge()
     * @see #getPerson()
     * @generated
     */
	EAttribute getPerson_Age();

	/**
     * Returns the meta object for the containment reference list '{@link network.Person#getCircles <em>Circles</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Circles</em>'.
     * @see network.Person#getCircles()
     * @see #getPerson()
     * @generated
     */
	EReference getPerson_Circles();

	/**
     * Returns the meta object for the reference list '{@link network.Person#getPersonalPosts <em>Personal Posts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Personal Posts</em>'.
     * @see network.Person#getPersonalPosts()
     * @see #getPerson()
     * @generated
     */
	EReference getPerson_PersonalPosts();

	/**
     * Returns the meta object for class '{@link network.Post <em>Post</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Post</em>'.
     * @see network.Post
     * @generated
     */
	EClass getPost();

	/**
     * Returns the meta object for the attribute '{@link network.Post#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see network.Post#getText()
     * @see #getPost()
     * @generated
     */
	EAttribute getPost_Text();

	/**
     * Returns the meta object for the reference '{@link network.Post#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Author</em>'.
     * @see network.Post#getAuthor()
     * @see #getPost()
     * @generated
     */
	EReference getPost_Author();

	/**
     * Returns the meta object for the reference list '{@link network.Post#getVisibleTo <em>Visible To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Visible To</em>'.
     * @see network.Post#getVisibleTo()
     * @see #getPost()
     * @generated
     */
	EReference getPost_VisibleTo();

	/**
     * Returns the meta object for class '{@link network.Circle <em>Circle</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Circle</em>'.
     * @see network.Circle
     * @generated
     */
	EClass getCircle();

	/**
     * Returns the meta object for the attribute '{@link network.Circle#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see network.Circle#getName()
     * @see #getCircle()
     * @generated
     */
	EAttribute getCircle_Name();

	/**
     * Returns the meta object for the reference list '{@link network.Circle#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Members</em>'.
     * @see network.Circle#getMembers()
     * @see #getCircle()
     * @generated
     */
	EReference getCircle_Members();

	/**
     * Returns the meta object for the reference list '{@link network.Circle#getCirclePosts <em>Circle Posts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Circle Posts</em>'.
     * @see network.Circle#getCirclePosts()
     * @see #getCircle()
     * @generated
     */
	EReference getCircle_CirclePosts();

	/**
     * Returns the meta object for the reference '{@link network.Circle#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see network.Circle#getOwner()
     * @see #getCircle()
     * @generated
     */
	EReference getCircle_Owner();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	NetworkFactory getNetworkFactory();

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
         * The meta object literal for the '{@link network.impl.NetworkImpl <em>Network</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see network.impl.NetworkImpl
         * @see network.impl.NetworkPackageImpl#getNetwork()
         * @generated
         */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
         * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NETWORK__PEOPLE = eINSTANCE.getNetwork_People();

		/**
         * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NETWORK__POSTS = eINSTANCE.getNetwork_Posts();

		/**
         * The meta object literal for the '{@link network.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see network.impl.PersonImpl
         * @see network.impl.NetworkPackageImpl#getPerson()
         * @generated
         */
		EClass PERSON = eINSTANCE.getPerson();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
         * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
         * The meta object literal for the '<em><b>Circles</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSON__CIRCLES = eINSTANCE.getPerson_Circles();

		/**
         * The meta object literal for the '<em><b>Personal Posts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSON__PERSONAL_POSTS = eINSTANCE.getPerson_PersonalPosts();

		/**
         * The meta object literal for the '{@link network.impl.PostImpl <em>Post</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see network.impl.PostImpl
         * @see network.impl.NetworkPackageImpl#getPost()
         * @generated
         */
		EClass POST = eINSTANCE.getPost();

		/**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute POST__TEXT = eINSTANCE.getPost_Text();

		/**
         * The meta object literal for the '<em><b>Author</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference POST__AUTHOR = eINSTANCE.getPost_Author();

		/**
         * The meta object literal for the '<em><b>Visible To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference POST__VISIBLE_TO = eINSTANCE.getPost_VisibleTo();

		/**
         * The meta object literal for the '{@link network.impl.CircleImpl <em>Circle</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see network.impl.CircleImpl
         * @see network.impl.NetworkPackageImpl#getCircle()
         * @generated
         */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CIRCLE__NAME = eINSTANCE.getCircle_Name();

		/**
         * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CIRCLE__MEMBERS = eINSTANCE.getCircle_Members();

		/**
         * The meta object literal for the '<em><b>Circle Posts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CIRCLE__CIRCLE_POSTS = eINSTANCE.getCircle_CirclePosts();

		/**
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CIRCLE__OWNER = eINSTANCE.getCircle_Owner();

	}

} //NetworkPackage
