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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link network.impl.CircleImpl#getName <em>Name</em>}</li>
 *   <li>{@link network.impl.CircleImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link network.impl.CircleImpl#getCirclePosts <em>Circle Posts</em>}</li>
 *   <li>{@link network.impl.CircleImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircleImpl extends EObjectImpl implements Circle {
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
     * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMembers()
     * @generated
     * @ordered
     */
	protected EList<Person> members;

	/**
     * The cached value of the '{@link #getCirclePosts() <em>Circle Posts</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCirclePosts()
     * @generated
     * @ordered
     */
	protected EList<Post> circlePosts;

	/**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
	protected Person owner;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CircleImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return NetworkPackage.Literals.CIRCLE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.CIRCLE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Person> getMembers() {
        if (members == null) {
            members = new EObjectResolvingEList<Person>(Person.class, this, NetworkPackage.CIRCLE__MEMBERS);
        }
        return members;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Post> getCirclePosts() {
        if (circlePosts == null) {
            circlePosts = new EObjectResolvingEList<Post>(Post.class, this, NetworkPackage.CIRCLE__CIRCLE_POSTS);
        }
        return circlePosts;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Person getOwner() {
        if (owner != null && owner.eIsProxy()) {
            InternalEObject oldOwner = (InternalEObject)owner;
            owner = (Person)eResolveProxy(oldOwner);
            if (owner != oldOwner) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.CIRCLE__OWNER, oldOwner, owner));
            }
        }
        return owner;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Person basicGetOwner() {
        return owner;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOwner(Person newOwner) {
        Person oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.CIRCLE__OWNER, oldOwner, owner));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NetworkPackage.CIRCLE__NAME:
                return getName();
            case NetworkPackage.CIRCLE__MEMBERS:
                return getMembers();
            case NetworkPackage.CIRCLE__CIRCLE_POSTS:
                return getCirclePosts();
            case NetworkPackage.CIRCLE__OWNER:
                if (resolve) return getOwner();
                return basicGetOwner();
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
            case NetworkPackage.CIRCLE__NAME:
                setName((String)newValue);
                return;
            case NetworkPackage.CIRCLE__MEMBERS:
                getMembers().clear();
                getMembers().addAll((Collection<? extends Person>)newValue);
                return;
            case NetworkPackage.CIRCLE__CIRCLE_POSTS:
                getCirclePosts().clear();
                getCirclePosts().addAll((Collection<? extends Post>)newValue);
                return;
            case NetworkPackage.CIRCLE__OWNER:
                setOwner((Person)newValue);
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
            case NetworkPackage.CIRCLE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case NetworkPackage.CIRCLE__MEMBERS:
                getMembers().clear();
                return;
            case NetworkPackage.CIRCLE__CIRCLE_POSTS:
                getCirclePosts().clear();
                return;
            case NetworkPackage.CIRCLE__OWNER:
                setOwner((Person)null);
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
            case NetworkPackage.CIRCLE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case NetworkPackage.CIRCLE__MEMBERS:
                return members != null && !members.isEmpty();
            case NetworkPackage.CIRCLE__CIRCLE_POSTS:
                return circlePosts != null && !circlePosts.isEmpty();
            case NetworkPackage.CIRCLE__OWNER:
                return owner != null;
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

} //CircleImpl
