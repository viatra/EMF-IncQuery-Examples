/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network.impl;

import java.util.Collection;

import network.Circle;
import network.NetworkPackage;
import network.Person;
import network.Post;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link network.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link network.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link network.impl.PersonImpl#getCircles <em>Circles</em>}</li>
 *   <li>{@link network.impl.PersonImpl#getPersonalPosts <em>Personal Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
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
     * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAge()
     * @generated
     * @ordered
     */
	protected static final int AGE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAge()
     * @generated
     * @ordered
     */
	protected int age = AGE_EDEFAULT;

	/**
     * The cached value of the '{@link #getCircles() <em>Circles</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCircles()
     * @generated
     * @ordered
     */
	protected EList<Circle> circles;

	/**
     * The cached value of the '{@link #getPersonalPosts() <em>Personal Posts</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersonalPosts()
     * @generated
     * @ordered
     */
	protected EList<Post> personalPosts;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PersonImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return NetworkPackage.Literals.PERSON;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.PERSON__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAge() {
        return age;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAge(int newAge) {
        int oldAge = age;
        age = newAge;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.PERSON__AGE, oldAge, age));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Circle> getCircles() {
        if (circles == null) {
            circles = new EObjectContainmentEList<Circle>(Circle.class, this, NetworkPackage.PERSON__CIRCLES);
        }
        return circles;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Post> getPersonalPosts() {
        if (personalPosts == null) {
            personalPosts = new EObjectResolvingEList<Post>(Post.class, this, NetworkPackage.PERSON__PERSONAL_POSTS);
        }
        return personalPosts;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NetworkPackage.PERSON__CIRCLES:
                return ((InternalEList<?>)getCircles()).basicRemove(otherEnd, msgs);
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
            case NetworkPackage.PERSON__NAME:
                return getName();
            case NetworkPackage.PERSON__AGE:
                return getAge();
            case NetworkPackage.PERSON__CIRCLES:
                return getCircles();
            case NetworkPackage.PERSON__PERSONAL_POSTS:
                return getPersonalPosts();
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
            case NetworkPackage.PERSON__NAME:
                setName((String)newValue);
                return;
            case NetworkPackage.PERSON__AGE:
                setAge((Integer)newValue);
                return;
            case NetworkPackage.PERSON__CIRCLES:
                getCircles().clear();
                getCircles().addAll((Collection<? extends Circle>)newValue);
                return;
            case NetworkPackage.PERSON__PERSONAL_POSTS:
                getPersonalPosts().clear();
                getPersonalPosts().addAll((Collection<? extends Post>)newValue);
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
            case NetworkPackage.PERSON__NAME:
                setName(NAME_EDEFAULT);
                return;
            case NetworkPackage.PERSON__AGE:
                setAge(AGE_EDEFAULT);
                return;
            case NetworkPackage.PERSON__CIRCLES:
                getCircles().clear();
                return;
            case NetworkPackage.PERSON__PERSONAL_POSTS:
                getPersonalPosts().clear();
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
            case NetworkPackage.PERSON__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case NetworkPackage.PERSON__AGE:
                return age != AGE_EDEFAULT;
            case NetworkPackage.PERSON__CIRCLES:
                return circles != null && !circles.isEmpty();
            case NetworkPackage.PERSON__PERSONAL_POSTS:
                return personalPosts != null && !personalPosts.isEmpty();
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
        result.append(", age: ");
        result.append(age);
        result.append(')');
        return result.toString();
    }

} //PersonImpl
