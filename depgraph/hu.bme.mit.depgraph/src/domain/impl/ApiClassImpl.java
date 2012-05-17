/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain.impl;

import domain.ApiClass;
import domain.DomainPackage;
import domain.Field;
import domain.Method;
import domain.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.ApiClassImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link domain.impl.ApiClassImpl#getReferencedClasses <em>Referenced Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApiClassImpl extends CodeElementImpl implements ApiClass {
	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected String implements_ = IMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * This is true if the Private attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean privateESet;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedClasses() <em>Referenced Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.API_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, DomainPackage.API_CLASS__METHODS, DomainPackage.METHOD__API_CLASS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, DomainPackage.API_CLASS__FIELDS, DomainPackage.FIELD__API_CLASS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (eContainerFeatureID() != DomainPackage.API_CLASS__PRODUCT) return null;
		return (Product)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Product newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProduct, DomainPackage.API_CLASS__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		if (newProduct != eInternalContainer() || (eContainerFeatureID() != DomainPackage.API_CLASS__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, DomainPackage.PRODUCT__CLASSES, Product.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(String newImplements) {
		String oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		boolean oldPrivateESet = privateESet;
		privateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__PRIVATE, oldPrivate, private_, !oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrivate() {
		boolean oldPrivate = private_;
		boolean oldPrivateESet = privateESet;
		private_ = PRIVATE_EDEFAULT;
		privateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomainPackage.API_CLASS__PRIVATE, oldPrivate, PRIVATE_EDEFAULT, oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrivate() {
		return privateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedClasses() {
		return referencedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedClasses(EList<String> newReferencedClasses) {
		EList<String> oldReferencedClasses = referencedClasses;
		referencedClasses = newReferencedClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.API_CLASS__REFERENCED_CLASSES, oldReferencedClasses, referencedClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFqName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case DomainPackage.API_CLASS__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case DomainPackage.API_CLASS__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case DomainPackage.API_CLASS__PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProduct((Product)otherEnd, msgs);
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
			case DomainPackage.API_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case DomainPackage.API_CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DomainPackage.API_CLASS__PRODUCT:
				return basicSetProduct(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.API_CLASS__PRODUCT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.PRODUCT__CLASSES, Product.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.API_CLASS__SIMPLE_NAME:
				return getSimpleName();
			case DomainPackage.API_CLASS__PACKAGE_NAME:
				return getPackageName();
			case DomainPackage.API_CLASS__METHODS:
				return getMethods();
			case DomainPackage.API_CLASS__FIELDS:
				return getFields();
			case DomainPackage.API_CLASS__PRODUCT:
				return getProduct();
			case DomainPackage.API_CLASS__EXTENDS:
				return getExtends();
			case DomainPackage.API_CLASS__IMPLEMENTS:
				return getImplements();
			case DomainPackage.API_CLASS__PRIVATE:
				return isPrivate();
			case DomainPackage.API_CLASS__ANONYMOUS:
				return isAnonymous();
			case DomainPackage.API_CLASS__REFERENCED_CLASSES:
				return getReferencedClasses();
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
			case DomainPackage.API_CLASS__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DomainPackage.API_CLASS__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case DomainPackage.API_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case DomainPackage.API_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case DomainPackage.API_CLASS__PRODUCT:
				setProduct((Product)newValue);
				return;
			case DomainPackage.API_CLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case DomainPackage.API_CLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case DomainPackage.API_CLASS__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case DomainPackage.API_CLASS__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case DomainPackage.API_CLASS__REFERENCED_CLASSES:
				setReferencedClasses((EList<String>)newValue);
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
			case DomainPackage.API_CLASS__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DomainPackage.API_CLASS__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case DomainPackage.API_CLASS__METHODS:
				getMethods().clear();
				return;
			case DomainPackage.API_CLASS__FIELDS:
				getFields().clear();
				return;
			case DomainPackage.API_CLASS__PRODUCT:
				setProduct((Product)null);
				return;
			case DomainPackage.API_CLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case DomainPackage.API_CLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case DomainPackage.API_CLASS__PRIVATE:
				unsetPrivate();
				return;
			case DomainPackage.API_CLASS__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case DomainPackage.API_CLASS__REFERENCED_CLASSES:
				setReferencedClasses((EList<String>)null);
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
			case DomainPackage.API_CLASS__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DomainPackage.API_CLASS__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case DomainPackage.API_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case DomainPackage.API_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case DomainPackage.API_CLASS__PRODUCT:
				return getProduct() != null;
			case DomainPackage.API_CLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case DomainPackage.API_CLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case DomainPackage.API_CLASS__PRIVATE:
				return isSetPrivate();
			case DomainPackage.API_CLASS__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case DomainPackage.API_CLASS__REFERENCED_CLASSES:
				return referencedClasses != null;
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
		result.append(" (simpleName: ");
		result.append(simpleName);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", extends: ");
		result.append(extends_);
		result.append(", implements: ");
		result.append(implements_);
		result.append(", private: ");
		if (privateESet) result.append(private_); else result.append("<unset>");
		result.append(", anonymous: ");
		result.append(anonymous);
		result.append(", referencedClasses: ");
		result.append(referencedClasses);
		result.append(')');
		return result.toString();
	}

} //ApiClassImpl
