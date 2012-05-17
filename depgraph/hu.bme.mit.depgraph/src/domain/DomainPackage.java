/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

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
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dependency-graph/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.GraphElementImpl
	 * @see domain.impl.DomainPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__UUID = 0;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link domain.impl.CodeElementImpl <em>Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.CodeElementImpl
	 * @see domain.impl.DomainPackageImpl#getCodeElement()
	 * @generated
	 */
	int CODE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__UUID = GRAPH_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Incoming Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__INCOMING_DEPS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__OUTGOING_DEPS = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__VERSIONS = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT__ID = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ELEMENT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link domain.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.ProductImpl
	 * @see domain.impl.DomainPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UUID = CODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Incoming Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INCOMING_DEPS = CODE_ELEMENT__INCOMING_DEPS;

	/**
	 * The feature id for the '<em><b>Outgoing Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OUTGOING_DEPS = CODE_ELEMENT__OUTGOING_DEPS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSIONS = CODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CLASSES = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Folders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONTAINING_FOLDERS = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_PATH = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link domain.impl.ApiClassImpl <em>Api Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.ApiClassImpl
	 * @see domain.impl.DomainPackageImpl#getApiClass()
	 * @generated
	 */
	int API_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__UUID = CODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Incoming Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__INCOMING_DEPS = CODE_ELEMENT__INCOMING_DEPS;

	/**
	 * The feature id for the '<em><b>Outgoing Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__OUTGOING_DEPS = CODE_ELEMENT__OUTGOING_DEPS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__VERSIONS = CODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__ID = CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__SIMPLE_NAME = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__PACKAGE_NAME = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__METHODS = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__FIELDS = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__PRODUCT = CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__EXTENDS = CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__IMPLEMENTS = CODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__PRIVATE = CODE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__ANONYMOUS = CODE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Referenced Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS__REFERENCED_CLASSES = CODE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Api Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CLASS_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link domain.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.MethodImpl
	 * @see domain.impl.DomainPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__UUID = CODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Incoming Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INCOMING_DEPS = CODE_ELEMENT__INCOMING_DEPS;

	/**
	 * The feature id for the '<em><b>Outgoing Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUTGOING_DEPS = CODE_ELEMENT__OUTGOING_DEPS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VERSIONS = CODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__API_CLASS = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PRIVATE = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERENCED_FIELDS = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referenced Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERENCED_METHODS = CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link domain.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.FieldImpl
	 * @see domain.impl.DomainPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__UUID = CODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Incoming Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCOMING_DEPS = CODE_ELEMENT__INCOMING_DEPS;

	/**
	 * The feature id for the '<em><b>Outgoing Deps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUTGOING_DEPS = CODE_ELEMENT__OUTGOING_DEPS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VERSIONS = CODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SIGNATURE = CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__API_CLASS = CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PRIVATE = CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link domain.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DependencyImpl
	 * @see domain.impl.DomainPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__UUID = GRAPH_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__FROM = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TO = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link domain.impl.DependencyGraphImpl <em>Dependency Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DependencyGraphImpl
	 * @see domain.impl.DomainPackageImpl#getDependencyGraph()
	 * @generated
	 */
	int DEPENDENCY_GRAPH = 7;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH__PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Dependency Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link domain.impl.TransitiveDependencyImpl <em>Transitive Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.TransitiveDependencyImpl
	 * @see domain.impl.DomainPackageImpl#getTransitiveDependency()
	 * @generated
	 */
	int TRANSITIVE_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY__UUID = DEPENDENCY__UUID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY__FROM = DEPENDENCY__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY__TO = DEPENDENCY__TO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY__TYPE = DEPENDENCY__TYPE;

	/**
	 * The feature id for the '<em><b>Transitive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transitive Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link domain.DependencyType <em>Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.DependencyType
	 * @see domain.impl.DomainPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link domain.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see domain.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the attribute '{@link domain.GraphElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see domain.GraphElement#getUuid()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Uuid();

	/**
	 * Returns the meta object for class '{@link domain.CodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Element</em>'.
	 * @see domain.CodeElement
	 * @generated
	 */
	EClass getCodeElement();

	/**
	 * Returns the meta object for the reference list '{@link domain.CodeElement#getIncomingDeps <em>Incoming Deps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Deps</em>'.
	 * @see domain.CodeElement#getIncomingDeps()
	 * @see #getCodeElement()
	 * @generated
	 */
	EReference getCodeElement_IncomingDeps();

	/**
	 * Returns the meta object for the reference list '{@link domain.CodeElement#getOutgoingDeps <em>Outgoing Deps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Deps</em>'.
	 * @see domain.CodeElement#getOutgoingDeps()
	 * @see #getCodeElement()
	 * @generated
	 */
	EReference getCodeElement_OutgoingDeps();

	/**
	 * Returns the meta object for the attribute list '{@link domain.CodeElement#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see domain.CodeElement#getVersions()
	 * @see #getCodeElement()
	 * @generated
	 */
	EAttribute getCodeElement_Versions();

	/**
	 * Returns the meta object for the attribute '{@link domain.CodeElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see domain.CodeElement#getId()
	 * @see #getCodeElement()
	 * @generated
	 */
	EAttribute getCodeElement_Id();

	/**
	 * Returns the meta object for class '{@link domain.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see domain.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link domain.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.Product#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see domain.Product#getClasses()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Classes();

	/**
	 * Returns the meta object for the attribute '{@link domain.Product#getContainingFolders <em>Containing Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containing Folders</em>'.
	 * @see domain.Product#getContainingFolders()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ContainingFolders();

	/**
	 * Returns the meta object for the attribute '{@link domain.Product#getProductPath <em>Product Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Path</em>'.
	 * @see domain.Product#getProductPath()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductPath();

	/**
	 * Returns the meta object for class '{@link domain.ApiClass <em>Api Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api Class</em>'.
	 * @see domain.ApiClass
	 * @generated
	 */
	EClass getApiClass();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see domain.ApiClass#getSimpleName()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see domain.ApiClass#getPackageName()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ApiClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see domain.ApiClass#getMethods()
	 * @see #getApiClass()
	 * @generated
	 */
	EReference getApiClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ApiClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see domain.ApiClass#getFields()
	 * @see #getApiClass()
	 * @generated
	 */
	EReference getApiClass_Fields();

	/**
	 * Returns the meta object for the container reference '{@link domain.ApiClass#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see domain.ApiClass#getProduct()
	 * @see #getApiClass()
	 * @generated
	 */
	EReference getApiClass_Product();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see domain.ApiClass#getExtends()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see domain.ApiClass#getImplements()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see domain.ApiClass#isPrivate()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_Private();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see domain.ApiClass#isAnonymous()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_Anonymous();

	/**
	 * Returns the meta object for the attribute '{@link domain.ApiClass#getReferencedClasses <em>Referenced Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Classes</em>'.
	 * @see domain.ApiClass#getReferencedClasses()
	 * @see #getApiClass()
	 * @generated
	 */
	EAttribute getApiClass_ReferencedClasses();

	/**
	 * Returns the meta object for class '{@link domain.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see domain.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link domain.Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see domain.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Signature();

	/**
	 * Returns the meta object for the container reference '{@link domain.Method#getApiClass <em>Api Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Class</em>'.
	 * @see domain.Method#getApiClass()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ApiClass();

	/**
	 * Returns the meta object for the attribute '{@link domain.Method#getPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see domain.Method#getPrivate()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Private();

	/**
	 * Returns the meta object for the attribute '{@link domain.Method#getReferencedFields <em>Referenced Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Fields</em>'.
	 * @see domain.Method#getReferencedFields()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReferencedFields();

	/**
	 * Returns the meta object for the attribute '{@link domain.Method#getReferencedMethods <em>Referenced Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Methods</em>'.
	 * @see domain.Method#getReferencedMethods()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReferencedMethods();

	/**
	 * Returns the meta object for the attribute '{@link domain.Method#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see domain.Method#isStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Static();

	/**
	 * Returns the meta object for class '{@link domain.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see domain.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link domain.Field#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see domain.Field#getSignature()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Signature();

	/**
	 * Returns the meta object for the container reference '{@link domain.Field#getApiClass <em>Api Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Class</em>'.
	 * @see domain.Field#getApiClass()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ApiClass();

	/**
	 * Returns the meta object for the attribute '{@link domain.Field#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see domain.Field#isPrivate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Private();

	/**
	 * Returns the meta object for class '{@link domain.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see domain.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link domain.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see domain.Dependency#getFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_From();

	/**
	 * Returns the meta object for the reference '{@link domain.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see domain.Dependency#getTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_To();

	/**
	 * Returns the meta object for the attribute '{@link domain.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domain.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Type();

	/**
	 * Returns the meta object for class '{@link domain.DependencyGraph <em>Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Graph</em>'.
	 * @see domain.DependencyGraph
	 * @generated
	 */
	EClass getDependencyGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DependencyGraph#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see domain.DependencyGraph#getDependencies()
	 * @see #getDependencyGraph()
	 * @generated
	 */
	EReference getDependencyGraph_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DependencyGraph#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see domain.DependencyGraph#getProducts()
	 * @see #getDependencyGraph()
	 * @generated
	 */
	EReference getDependencyGraph_Products();

	/**
	 * Returns the meta object for class '{@link domain.TransitiveDependency <em>Transitive Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitive Dependency</em>'.
	 * @see domain.TransitiveDependency
	 * @generated
	 */
	EClass getTransitiveDependency();

	/**
	 * Returns the meta object for the reference list '{@link domain.TransitiveDependency#getTransitiveFrom <em>Transitive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitive From</em>'.
	 * @see domain.TransitiveDependency#getTransitiveFrom()
	 * @see #getTransitiveDependency()
	 * @generated
	 */
	EReference getTransitiveDependency_TransitiveFrom();

	/**
	 * Returns the meta object for enum '{@link domain.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Type</em>'.
	 * @see domain.DependencyType
	 * @generated
	 */
	EEnum getDependencyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link domain.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.GraphElementImpl
		 * @see domain.impl.DomainPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__UUID = eINSTANCE.getGraphElement_Uuid();

		/**
		 * The meta object literal for the '{@link domain.impl.CodeElementImpl <em>Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.CodeElementImpl
		 * @see domain.impl.DomainPackageImpl#getCodeElement()
		 * @generated
		 */
		EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

		/**
		 * The meta object literal for the '<em><b>Incoming Deps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ELEMENT__INCOMING_DEPS = eINSTANCE.getCodeElement_IncomingDeps();

		/**
		 * The meta object literal for the '<em><b>Outgoing Deps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ELEMENT__OUTGOING_DEPS = eINSTANCE.getCodeElement_OutgoingDeps();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ELEMENT__VERSIONS = eINSTANCE.getCodeElement_Versions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ELEMENT__ID = eINSTANCE.getCodeElement_Id();

		/**
		 * The meta object literal for the '{@link domain.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.ProductImpl
		 * @see domain.impl.DomainPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CLASSES = eINSTANCE.getProduct_Classes();

		/**
		 * The meta object literal for the '<em><b>Containing Folders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CONTAINING_FOLDERS = eINSTANCE.getProduct_ContainingFolders();

		/**
		 * The meta object literal for the '<em><b>Product Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_PATH = eINSTANCE.getProduct_ProductPath();

		/**
		 * The meta object literal for the '{@link domain.impl.ApiClassImpl <em>Api Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.ApiClassImpl
		 * @see domain.impl.DomainPackageImpl#getApiClass()
		 * @generated
		 */
		EClass API_CLASS = eINSTANCE.getApiClass();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__SIMPLE_NAME = eINSTANCE.getApiClass_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__PACKAGE_NAME = eINSTANCE.getApiClass_PackageName();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CLASS__METHODS = eINSTANCE.getApiClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CLASS__FIELDS = eINSTANCE.getApiClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CLASS__PRODUCT = eINSTANCE.getApiClass_Product();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__EXTENDS = eINSTANCE.getApiClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__IMPLEMENTS = eINSTANCE.getApiClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__PRIVATE = eINSTANCE.getApiClass_Private();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__ANONYMOUS = eINSTANCE.getApiClass_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Referenced Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_CLASS__REFERENCED_CLASSES = eINSTANCE.getApiClass_ReferencedClasses();

		/**
		 * The meta object literal for the '{@link domain.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.MethodImpl
		 * @see domain.impl.DomainPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>Api Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__API_CLASS = eINSTANCE.getMethod_ApiClass();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__PRIVATE = eINSTANCE.getMethod_Private();

		/**
		 * The meta object literal for the '<em><b>Referenced Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__REFERENCED_FIELDS = eINSTANCE.getMethod_ReferencedFields();

		/**
		 * The meta object literal for the '<em><b>Referenced Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__REFERENCED_METHODS = eINSTANCE.getMethod_ReferencedMethods();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

		/**
		 * The meta object literal for the '{@link domain.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.FieldImpl
		 * @see domain.impl.DomainPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SIGNATURE = eINSTANCE.getField_Signature();

		/**
		 * The meta object literal for the '<em><b>Api Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__API_CLASS = eINSTANCE.getField_ApiClass();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__PRIVATE = eINSTANCE.getField_Private();

		/**
		 * The meta object literal for the '{@link domain.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DependencyImpl
		 * @see domain.impl.DomainPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__FROM = eINSTANCE.getDependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TO = eINSTANCE.getDependency_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '{@link domain.impl.DependencyGraphImpl <em>Dependency Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DependencyGraphImpl
		 * @see domain.impl.DomainPackageImpl#getDependencyGraph()
		 * @generated
		 */
		EClass DEPENDENCY_GRAPH = eINSTANCE.getDependencyGraph();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_GRAPH__DEPENDENCIES = eINSTANCE.getDependencyGraph_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_GRAPH__PRODUCTS = eINSTANCE.getDependencyGraph_Products();

		/**
		 * The meta object literal for the '{@link domain.impl.TransitiveDependencyImpl <em>Transitive Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.TransitiveDependencyImpl
		 * @see domain.impl.DomainPackageImpl#getTransitiveDependency()
		 * @generated
		 */
		EClass TRANSITIVE_DEPENDENCY = eINSTANCE.getTransitiveDependency();

		/**
		 * The meta object literal for the '<em><b>Transitive From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_DEPENDENCY__TRANSITIVE_FROM = eINSTANCE.getTransitiveDependency_TransitiveFrom();

		/**
		 * The meta object literal for the '{@link domain.DependencyType <em>Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.DependencyType
		 * @see domain.impl.DomainPackageImpl#getDependencyType()
		 * @generated
		 */
		EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

	}

} //DomainPackage
