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
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link network.impl.PostImpl#getText <em>Text</em>}</li>
 *   <li>{@link network.impl.PostImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link network.impl.PostImpl#getVisibleTo <em>Visible To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostImpl extends EObjectImpl implements Post {
	/**
     * The default value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
	protected static final String TEXT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
	protected String text = TEXT_EDEFAULT;

	/**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
	protected Person author;

	/**
     * The cached value of the '{@link #getVisibleTo() <em>Visible To</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVisibleTo()
     * @generated
     * @ordered
     */
	protected EList<Circle> visibleTo;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PostImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return NetworkPackage.Literals.POST;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getText() {
        return text;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setText(String newText) {
        String oldText = text;
        text = newText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.POST__TEXT, oldText, text));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Person getAuthor() {
        if (author != null && author.eIsProxy()) {
            InternalEObject oldAuthor = (InternalEObject)author;
            author = (Person)eResolveProxy(oldAuthor);
            if (author != oldAuthor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.POST__AUTHOR, oldAuthor, author));
            }
        }
        return author;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Person basicGetAuthor() {
        return author;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAuthor(Person newAuthor) {
        Person oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.POST__AUTHOR, oldAuthor, author));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Circle> getVisibleTo() {
        if (visibleTo == null) {
            visibleTo = new EObjectResolvingEList<Circle>(Circle.class, this, NetworkPackage.POST__VISIBLE_TO);
        }
        return visibleTo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case NetworkPackage.POST__TEXT:
                return getText();
            case NetworkPackage.POST__AUTHOR:
                if (resolve) return getAuthor();
                return basicGetAuthor();
            case NetworkPackage.POST__VISIBLE_TO:
                return getVisibleTo();
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
            case NetworkPackage.POST__TEXT:
                setText((String)newValue);
                return;
            case NetworkPackage.POST__AUTHOR:
                setAuthor((Person)newValue);
                return;
            case NetworkPackage.POST__VISIBLE_TO:
                getVisibleTo().clear();
                getVisibleTo().addAll((Collection<? extends Circle>)newValue);
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
            case NetworkPackage.POST__TEXT:
                setText(TEXT_EDEFAULT);
                return;
            case NetworkPackage.POST__AUTHOR:
                setAuthor((Person)null);
                return;
            case NetworkPackage.POST__VISIBLE_TO:
                getVisibleTo().clear();
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
            case NetworkPackage.POST__TEXT:
                return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
            case NetworkPackage.POST__AUTHOR:
                return author != null;
            case NetworkPackage.POST__VISIBLE_TO:
                return visibleTo != null && !visibleTo.isEmpty();
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
        result.append(" (text: ");
        result.append(text);
        result.append(')');
        return result.toString();
    }

} //PostImpl
