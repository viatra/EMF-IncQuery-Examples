/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApiClass#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link domain.ApiClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link domain.ApiClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link domain.ApiClass#getFields <em>Fields</em>}</li>
 *   <li>{@link domain.ApiClass#getProduct <em>Product</em>}</li>
 *   <li>{@link domain.ApiClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link domain.ApiClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link domain.ApiClass#isPrivate <em>Private</em>}</li>
 *   <li>{@link domain.ApiClass#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link domain.ApiClass#getReferencedClasses <em>Referenced Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApiClass()
 * @model
 * @generated
 */
public interface ApiClass extends CodeElement {
	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see domain.DomainPackage#getApiClass_SimpleName()
	 * @model
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see domain.DomainPackage#getApiClass_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Method}.
	 * It is bidirectional and its opposite is '{@link domain.Method#getApiClass <em>Api Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see domain.DomainPackage#getApiClass_Methods()
	 * @see domain.Method#getApiClass
	 * @model opposite="apiClass" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Field}.
	 * It is bidirectional and its opposite is '{@link domain.Field#getApiClass <em>Api Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see domain.DomainPackage#getApiClass_Fields()
	 * @see domain.Field#getApiClass
	 * @model opposite="apiClass" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Product#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(Product)
	 * @see domain.DomainPackage#getApiClass_Product()
	 * @see domain.Product#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see domain.DomainPackage#getApiClass_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' attribute.
	 * @see #setImplements(String)
	 * @see domain.DomainPackage#getApiClass_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getImplements <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' attribute.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(String value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #setPrivate(boolean)
	 * @see domain.DomainPackage#getApiClass_Private()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link domain.ApiClass#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Unsets the value of the '{@link domain.ApiClass#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrivate()
	 * @see #isPrivate()
	 * @see #setPrivate(boolean)
	 * @generated
	 */
	void unsetPrivate();

	/**
	 * Returns whether the value of the '{@link domain.ApiClass#isPrivate <em>Private</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Private</em>' attribute is set.
	 * @see #unsetPrivate()
	 * @see #isPrivate()
	 * @see #setPrivate(boolean)
	 * @generated
	 */
	boolean isSetPrivate();

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see domain.DomainPackage#getApiClass_Anonymous()
	 * @model
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link domain.ApiClass#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Classes</em>' attribute.
	 * @see #setReferencedClasses(EList)
	 * @see domain.DomainPackage#getApiClass_ReferencedClasses()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedClasses();

	/**
	 * Sets the value of the '{@link domain.ApiClass#getReferencedClasses <em>Referenced Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Classes</em>' attribute.
	 * @see #getReferencedClasses()
	 * @generated
	 */
	void setReferencedClasses(EList<String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFqName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSourcePath();

} // ApiClass
