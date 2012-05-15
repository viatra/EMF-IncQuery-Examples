/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.ServiceComponent#getMethods <em>Methods</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getName <em>Name</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getURI <em>URI</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getPersists <em>Persists</em>}</li>
 *   <li>{@link soamodel.ServiceComponent#getInArchitecture <em>In Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getServiceComponent()
 * @model
 * @generated
 */
public interface ServiceComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link soamodel.ServiceMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see soamodel.SoamodelPackage#getServiceComponent_Methods()
	 * @model type="soamodel.ServiceMethod" containment="true"
	 * @generated
	 */
	EList getMethods();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soamodel.SoamodelPackage#getServiceComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soamodel.ServiceComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see soamodel.SoamodelPackage#getServiceComponent_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link soamodel.ServiceComponent#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Connects To</b></em>' reference list.
	 * The list contents are of type {@link soamodel.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects To</em>' reference list.
	 * @see soamodel.SoamodelPackage#getServiceComponent_ConnectsTo()
	 * @model type="soamodel.ServiceComponent"
	 * @generated
	 */
	EList getConnectsTo();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see soamodel.SoamodelPackage#getServiceComponent_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link soamodel.ServiceComponent#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Persists</b></em>' reference list.
	 * The list contents are of type {@link soamodel.Entity}.
	 * It is bidirectional and its opposite is '{@link soamodel.Entity#getPersistedBy <em>Persisted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persists</em>' reference list.
	 * @see soamodel.SoamodelPackage#getServiceComponent_Persists()
	 * @see soamodel.Entity#getPersistedBy
	 * @model type="soamodel.Entity" opposite="persistedBy"
	 * @generated
	 */
	EList getPersists();

	/**
	 * Returns the value of the '<em><b>In Architecture</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soamodel.ServiceOrientedArchitecture#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Architecture</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Architecture</em>' container reference.
	 * @see #setInArchitecture(ServiceOrientedArchitecture)
	 * @see soamodel.SoamodelPackage#getServiceComponent_InArchitecture()
	 * @see soamodel.ServiceOrientedArchitecture#getComponents
	 * @model opposite="components" required="true" transient="false"
	 * @generated
	 */
	ServiceOrientedArchitecture getInArchitecture();

	/**
	 * Sets the value of the '{@link soamodel.ServiceComponent#getInArchitecture <em>In Architecture</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Architecture</em>' container reference.
	 * @see #getInArchitecture()
	 * @generated
	 */
	void setInArchitecture(ServiceOrientedArchitecture value);

} // ServiceComponent
