/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package network.impl;

import java.util.Collection;

import network.Network;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link network.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link network.impl.NetworkImpl#getPeople <em>People</em>}</li>
 *   <li>{@link network.impl.NetworkImpl#getPosts <em>Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends EObjectImpl implements Network {
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
     * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPeople()
     * @generated
     * @ordered
     */
	protected EList<Person> people;

	/**
     * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPosts()
     * @generated
     * @ordered
     */
	protected EList<Post> posts;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NetworkImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return NetworkPackage.Literals.NETWORK;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NETWORK__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Person> getPeople() {
        if (people == null) {
            people = new EObjectContainmentEList<Person>(Person.class, this, NetworkPackage.NETWORK__PEOPLE);
        }
        return people;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Post> getPosts() {
        if (posts == null) {
            posts = new EObjectContainmentEList<Post>(Post.class, this, NetworkPackage.NETWORK__POSTS);
        }
        return posts;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NetworkPackage.NETWORK__PEOPLE:
                return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
            case NetworkPackage.NETWORK__POSTS:
                return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
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
            case NetworkPackage.NETWORK__NAME:
                return getName();
            case NetworkPackage.NETWORK__PEOPLE:
                return getPeople();
            case NetworkPackage.NETWORK__POSTS:
                return getPosts();
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
            case NetworkPackage.NETWORK__NAME:
                setName((String)newValue);
                return;
            case NetworkPackage.NETWORK__PEOPLE:
                getPeople().clear();
                getPeople().addAll((Collection<? extends Person>)newValue);
                return;
            case NetworkPackage.NETWORK__POSTS:
                getPosts().clear();
                getPosts().addAll((Collection<? extends Post>)newValue);
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
            case NetworkPackage.NETWORK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case NetworkPackage.NETWORK__PEOPLE:
                getPeople().clear();
                return;
            case NetworkPackage.NETWORK__POSTS:
                getPosts().clear();
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
            case NetworkPackage.NETWORK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case NetworkPackage.NETWORK__PEOPLE:
                return people != null && !people.isEmpty();
            case NetworkPackage.NETWORK__POSTS:
                return posts != null && !posts.isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //NetworkImpl
