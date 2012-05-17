/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain.impl;

import domain.ApiClass;
import domain.DomainPackage;
import domain.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link domain.impl.ProductImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link domain.impl.ProductImpl#getContainingFolders <em>Containing Folders</em>}</li>
 *   <li>{@link domain.impl.ProductImpl#getProductPath <em>Product Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends CodeElementImpl implements Product {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ApiClass> classes;

	/**
	 * The default value of the '{@link #getContainingFolders() <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFolders()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINING_FOLDERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainingFolders() <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFolders()
	 * @generated
	 * @ordered
	 */
	protected String containingFolders = CONTAINING_FOLDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPath() <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPath() <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPath()
	 * @generated
	 * @ordered
	 */
	protected String productPath = PRODUCT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApiClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<ApiClass>(ApiClass.class, this, DomainPackage.PRODUCT__CLASSES, DomainPackage.API_CLASS__PRODUCT);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainingFolders() {
		return containingFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingFolders(String newContainingFolders) {
		String oldContainingFolders = containingFolders;
		containingFolders = newContainingFolders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCT__CONTAINING_FOLDERS, oldContainingFolders, containingFolders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductPath() {
		return productPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPath(String newProductPath) {
		String oldProductPath = productPath;
		productPath = newProductPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PRODUCT__PRODUCT_PATH, oldProductPath, productPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PRODUCT__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.PRODUCT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.PRODUCT__NAME:
				return getName();
			case DomainPackage.PRODUCT__CLASSES:
				return getClasses();
			case DomainPackage.PRODUCT__CONTAINING_FOLDERS:
				return getContainingFolders();
			case DomainPackage.PRODUCT__PRODUCT_PATH:
				return getProductPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.PRODUCT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ApiClass>)newValue);
				return;
			case DomainPackage.PRODUCT__CONTAINING_FOLDERS:
				setContainingFolders((String)newValue);
				return;
			case DomainPackage.PRODUCT__PRODUCT_PATH:
				setProductPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.PRODUCT__CLASSES:
				getClasses().clear();
				return;
			case DomainPackage.PRODUCT__CONTAINING_FOLDERS:
				setContainingFolders(CONTAINING_FOLDERS_EDEFAULT);
				return;
			case DomainPackage.PRODUCT__PRODUCT_PATH:
				setProductPath(PRODUCT_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.PRODUCT__CLASSES:
				return classes != null && !classes.isEmpty();
			case DomainPackage.PRODUCT__CONTAINING_FOLDERS:
				return CONTAINING_FOLDERS_EDEFAULT == null ? containingFolders != null : !CONTAINING_FOLDERS_EDEFAULT.equals(containingFolders);
			case DomainPackage.PRODUCT__PRODUCT_PATH:
				return PRODUCT_PATH_EDEFAULT == null ? productPath != null : !PRODUCT_PATH_EDEFAULT.equals(productPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", containingFolders: ");
		result.append(containingFolders);
		result.append(", productPath: ");
		result.append(productPath);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
