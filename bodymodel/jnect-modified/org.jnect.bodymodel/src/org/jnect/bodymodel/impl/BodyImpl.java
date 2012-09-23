/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ${user} - initial API and implementation
 *******************************************************************************/
package org.jnect.bodymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.BodymodelPackage;
import org.jnect.bodymodel.CenterHip;
import org.jnect.bodymodel.CenterShoulder;
import org.jnect.bodymodel.Head;
import org.jnect.bodymodel.HumanLink;
import org.jnect.bodymodel.LeftAnkle;
import org.jnect.bodymodel.LeftElbow;
import org.jnect.bodymodel.LeftFoot;
import org.jnect.bodymodel.LeftHand;
import org.jnect.bodymodel.LeftHip;
import org.jnect.bodymodel.LeftKnee;
import org.jnect.bodymodel.LeftShoulder;
import org.jnect.bodymodel.LeftWrist;
import org.jnect.bodymodel.RightAnkle;
import org.jnect.bodymodel.RightElbow;
import org.jnect.bodymodel.RightFoot;
import org.jnect.bodymodel.RightHand;
import org.jnect.bodymodel.RightHip;
import org.jnect.bodymodel.RightKnee;
import org.jnect.bodymodel.RightShoulder;
import org.jnect.bodymodel.RightWrist;
import org.jnect.bodymodel.Spine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getCenterShoulder <em>Center Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftShoulder <em>Left Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightShoulder <em>Right Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftElbow <em>Left Elbow</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightElbow <em>Right Elbow</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftWrist <em>Left Wrist</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightWrist <em>Right Wrist</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getSpine <em>Spine</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getCenterHip <em>Center Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftHip <em>Left Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightHip <em>Right Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftKnee <em>Left Knee</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightKnee <em>Right Knee</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftFoot <em>Left Foot</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightFoot <em>Right Foot</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getLeftAnkle <em>Left Ankle</em>}</li>
 *   <li>{@link org.jnect.bodymodel.impl.BodyImpl#getRightAnkle <em>Right Ankle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends EObjectImpl implements Body {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Head head;

	/**
	 * The cached value of the '{@link #getCenterShoulder() <em>Center Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterShoulder()
	 * @generated
	 * @ordered
	 */
	protected CenterShoulder centerShoulder;

	/**
	 * The cached value of the '{@link #getLeftShoulder() <em>Left Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftShoulder()
	 * @generated
	 * @ordered
	 */
	protected LeftShoulder leftShoulder;

	/**
	 * The cached value of the '{@link #getRightShoulder() <em>Right Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightShoulder()
	 * @generated
	 * @ordered
	 */
	protected RightShoulder rightShoulder;

	/**
	 * The cached value of the '{@link #getLeftElbow() <em>Left Elbow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftElbow()
	 * @generated
	 * @ordered
	 */
	protected LeftElbow leftElbow;

	/**
	 * The cached value of the '{@link #getRightElbow() <em>Right Elbow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightElbow()
	 * @generated
	 * @ordered
	 */
	protected RightElbow rightElbow;

	/**
	 * The cached value of the '{@link #getLeftWrist() <em>Left Wrist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWrist()
	 * @generated
	 * @ordered
	 */
	protected LeftWrist leftWrist;

	/**
	 * The cached value of the '{@link #getRightWrist() <em>Right Wrist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWrist()
	 * @generated
	 * @ordered
	 */
	protected RightWrist rightWrist;

	/**
	 * The cached value of the '{@link #getLeftHand() <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHand()
	 * @generated
	 * @ordered
	 */
	protected LeftHand leftHand;

	/**
	 * The cached value of the '{@link #getRightHand() <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHand()
	 * @generated
	 * @ordered
	 */
	protected RightHand rightHand;

	/**
	 * The cached value of the '{@link #getSpine() <em>Spine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpine()
	 * @generated
	 * @ordered
	 */
	protected Spine spine;

	/**
	 * The cached value of the '{@link #getCenterHip() <em>Center Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterHip()
	 * @generated
	 * @ordered
	 */
	protected CenterHip centerHip;

	/**
	 * The cached value of the '{@link #getLeftHip() <em>Left Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHip()
	 * @generated
	 * @ordered
	 */
	protected LeftHip leftHip;

	/**
	 * The cached value of the '{@link #getRightHip() <em>Right Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHip()
	 * @generated
	 * @ordered
	 */
	protected RightHip rightHip;

	/**
	 * The cached value of the '{@link #getLeftKnee() <em>Left Knee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftKnee()
	 * @generated
	 * @ordered
	 */
	protected LeftKnee leftKnee;

	/**
	 * The cached value of the '{@link #getRightKnee() <em>Right Knee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightKnee()
	 * @generated
	 * @ordered
	 */
	protected RightKnee rightKnee;

	/**
	 * The cached value of the '{@link #getLeftFoot() <em>Left Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFoot()
	 * @generated
	 * @ordered
	 */
	protected LeftFoot leftFoot;

	/**
	 * The cached value of the '{@link #getRightFoot() <em>Right Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFoot()
	 * @generated
	 * @ordered
	 */
	protected RightFoot rightFoot;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanLink> links;

	/**
	 * The cached value of the '{@link #getLeftAnkle() <em>Left Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftAnkle()
	 * @generated
	 * @ordered
	 */
	protected LeftAnkle leftAnkle;

	/**
	 * The cached value of the '{@link #getRightAnkle() <em>Right Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAnkle()
	 * @generated
	 * @ordered
	 */
	protected RightAnkle rightAnkle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BodymodelPackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Head newHead, NotificationChain msgs) {
		Head oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Head newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenterShoulder getCenterShoulder() {
		return centerShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterShoulder(CenterShoulder newCenterShoulder, NotificationChain msgs) {
		CenterShoulder oldCenterShoulder = centerShoulder;
		centerShoulder = newCenterShoulder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__CENTER_SHOULDER, oldCenterShoulder, newCenterShoulder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterShoulder(CenterShoulder newCenterShoulder) {
		if (newCenterShoulder != centerShoulder) {
			NotificationChain msgs = null;
			if (centerShoulder != null)
				msgs = ((InternalEObject)centerShoulder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__CENTER_SHOULDER, null, msgs);
			if (newCenterShoulder != null)
				msgs = ((InternalEObject)newCenterShoulder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__CENTER_SHOULDER, null, msgs);
			msgs = basicSetCenterShoulder(newCenterShoulder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__CENTER_SHOULDER, newCenterShoulder, newCenterShoulder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftShoulder getLeftShoulder() {
		return leftShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftShoulder(LeftShoulder newLeftShoulder, NotificationChain msgs) {
		LeftShoulder oldLeftShoulder = leftShoulder;
		leftShoulder = newLeftShoulder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_SHOULDER, oldLeftShoulder, newLeftShoulder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftShoulder(LeftShoulder newLeftShoulder) {
		if (newLeftShoulder != leftShoulder) {
			NotificationChain msgs = null;
			if (leftShoulder != null)
				msgs = ((InternalEObject)leftShoulder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_SHOULDER, null, msgs);
			if (newLeftShoulder != null)
				msgs = ((InternalEObject)newLeftShoulder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_SHOULDER, null, msgs);
			msgs = basicSetLeftShoulder(newLeftShoulder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_SHOULDER, newLeftShoulder, newLeftShoulder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightShoulder getRightShoulder() {
		return rightShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightShoulder(RightShoulder newRightShoulder, NotificationChain msgs) {
		RightShoulder oldRightShoulder = rightShoulder;
		rightShoulder = newRightShoulder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_SHOULDER, oldRightShoulder, newRightShoulder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightShoulder(RightShoulder newRightShoulder) {
		if (newRightShoulder != rightShoulder) {
			NotificationChain msgs = null;
			if (rightShoulder != null)
				msgs = ((InternalEObject)rightShoulder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_SHOULDER, null, msgs);
			if (newRightShoulder != null)
				msgs = ((InternalEObject)newRightShoulder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_SHOULDER, null, msgs);
			msgs = basicSetRightShoulder(newRightShoulder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_SHOULDER, newRightShoulder, newRightShoulder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftElbow getLeftElbow() {
		return leftElbow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftElbow(LeftElbow newLeftElbow, NotificationChain msgs) {
		LeftElbow oldLeftElbow = leftElbow;
		leftElbow = newLeftElbow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_ELBOW, oldLeftElbow, newLeftElbow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftElbow(LeftElbow newLeftElbow) {
		if (newLeftElbow != leftElbow) {
			NotificationChain msgs = null;
			if (leftElbow != null)
				msgs = ((InternalEObject)leftElbow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_ELBOW, null, msgs);
			if (newLeftElbow != null)
				msgs = ((InternalEObject)newLeftElbow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_ELBOW, null, msgs);
			msgs = basicSetLeftElbow(newLeftElbow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_ELBOW, newLeftElbow, newLeftElbow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightElbow getRightElbow() {
		return rightElbow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightElbow(RightElbow newRightElbow, NotificationChain msgs) {
		RightElbow oldRightElbow = rightElbow;
		rightElbow = newRightElbow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_ELBOW, oldRightElbow, newRightElbow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightElbow(RightElbow newRightElbow) {
		if (newRightElbow != rightElbow) {
			NotificationChain msgs = null;
			if (rightElbow != null)
				msgs = ((InternalEObject)rightElbow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_ELBOW, null, msgs);
			if (newRightElbow != null)
				msgs = ((InternalEObject)newRightElbow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_ELBOW, null, msgs);
			msgs = basicSetRightElbow(newRightElbow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_ELBOW, newRightElbow, newRightElbow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftWrist getLeftWrist() {
		return leftWrist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftWrist(LeftWrist newLeftWrist, NotificationChain msgs) {
		LeftWrist oldLeftWrist = leftWrist;
		leftWrist = newLeftWrist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_WRIST, oldLeftWrist, newLeftWrist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftWrist(LeftWrist newLeftWrist) {
		if (newLeftWrist != leftWrist) {
			NotificationChain msgs = null;
			if (leftWrist != null)
				msgs = ((InternalEObject)leftWrist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_WRIST, null, msgs);
			if (newLeftWrist != null)
				msgs = ((InternalEObject)newLeftWrist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_WRIST, null, msgs);
			msgs = basicSetLeftWrist(newLeftWrist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_WRIST, newLeftWrist, newLeftWrist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightWrist getRightWrist() {
		return rightWrist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightWrist(RightWrist newRightWrist, NotificationChain msgs) {
		RightWrist oldRightWrist = rightWrist;
		rightWrist = newRightWrist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_WRIST, oldRightWrist, newRightWrist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightWrist(RightWrist newRightWrist) {
		if (newRightWrist != rightWrist) {
			NotificationChain msgs = null;
			if (rightWrist != null)
				msgs = ((InternalEObject)rightWrist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_WRIST, null, msgs);
			if (newRightWrist != null)
				msgs = ((InternalEObject)newRightWrist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_WRIST, null, msgs);
			msgs = basicSetRightWrist(newRightWrist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_WRIST, newRightWrist, newRightWrist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHand getLeftHand() {
		return leftHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHand(LeftHand newLeftHand, NotificationChain msgs) {
		LeftHand oldLeftHand = leftHand;
		leftHand = newLeftHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_HAND, oldLeftHand, newLeftHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHand(LeftHand newLeftHand) {
		if (newLeftHand != leftHand) {
			NotificationChain msgs = null;
			if (leftHand != null)
				msgs = ((InternalEObject)leftHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_HAND, null, msgs);
			if (newLeftHand != null)
				msgs = ((InternalEObject)newLeftHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_HAND, null, msgs);
			msgs = basicSetLeftHand(newLeftHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_HAND, newLeftHand, newLeftHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightHand getRightHand() {
		return rightHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHand(RightHand newRightHand, NotificationChain msgs) {
		RightHand oldRightHand = rightHand;
		rightHand = newRightHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_HAND, oldRightHand, newRightHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHand(RightHand newRightHand) {
		if (newRightHand != rightHand) {
			NotificationChain msgs = null;
			if (rightHand != null)
				msgs = ((InternalEObject)rightHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_HAND, null, msgs);
			if (newRightHand != null)
				msgs = ((InternalEObject)newRightHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_HAND, null, msgs);
			msgs = basicSetRightHand(newRightHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_HAND, newRightHand, newRightHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spine getSpine() {
		return spine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpine(Spine newSpine, NotificationChain msgs) {
		Spine oldSpine = spine;
		spine = newSpine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__SPINE, oldSpine, newSpine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpine(Spine newSpine) {
		if (newSpine != spine) {
			NotificationChain msgs = null;
			if (spine != null)
				msgs = ((InternalEObject)spine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__SPINE, null, msgs);
			if (newSpine != null)
				msgs = ((InternalEObject)newSpine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__SPINE, null, msgs);
			msgs = basicSetSpine(newSpine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__SPINE, newSpine, newSpine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenterHip getCenterHip() {
		return centerHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterHip(CenterHip newCenterHip, NotificationChain msgs) {
		CenterHip oldCenterHip = centerHip;
		centerHip = newCenterHip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__CENTER_HIP, oldCenterHip, newCenterHip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterHip(CenterHip newCenterHip) {
		if (newCenterHip != centerHip) {
			NotificationChain msgs = null;
			if (centerHip != null)
				msgs = ((InternalEObject)centerHip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__CENTER_HIP, null, msgs);
			if (newCenterHip != null)
				msgs = ((InternalEObject)newCenterHip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__CENTER_HIP, null, msgs);
			msgs = basicSetCenterHip(newCenterHip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__CENTER_HIP, newCenterHip, newCenterHip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHip getLeftHip() {
		return leftHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHip(LeftHip newLeftHip, NotificationChain msgs) {
		LeftHip oldLeftHip = leftHip;
		leftHip = newLeftHip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_HIP, oldLeftHip, newLeftHip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHip(LeftHip newLeftHip) {
		if (newLeftHip != leftHip) {
			NotificationChain msgs = null;
			if (leftHip != null)
				msgs = ((InternalEObject)leftHip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_HIP, null, msgs);
			if (newLeftHip != null)
				msgs = ((InternalEObject)newLeftHip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_HIP, null, msgs);
			msgs = basicSetLeftHip(newLeftHip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_HIP, newLeftHip, newLeftHip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightHip getRightHip() {
		return rightHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHip(RightHip newRightHip, NotificationChain msgs) {
		RightHip oldRightHip = rightHip;
		rightHip = newRightHip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_HIP, oldRightHip, newRightHip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHip(RightHip newRightHip) {
		if (newRightHip != rightHip) {
			NotificationChain msgs = null;
			if (rightHip != null)
				msgs = ((InternalEObject)rightHip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_HIP, null, msgs);
			if (newRightHip != null)
				msgs = ((InternalEObject)newRightHip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_HIP, null, msgs);
			msgs = basicSetRightHip(newRightHip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_HIP, newRightHip, newRightHip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftKnee getLeftKnee() {
		return leftKnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftKnee(LeftKnee newLeftKnee, NotificationChain msgs) {
		LeftKnee oldLeftKnee = leftKnee;
		leftKnee = newLeftKnee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_KNEE, oldLeftKnee, newLeftKnee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftKnee(LeftKnee newLeftKnee) {
		if (newLeftKnee != leftKnee) {
			NotificationChain msgs = null;
			if (leftKnee != null)
				msgs = ((InternalEObject)leftKnee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_KNEE, null, msgs);
			if (newLeftKnee != null)
				msgs = ((InternalEObject)newLeftKnee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_KNEE, null, msgs);
			msgs = basicSetLeftKnee(newLeftKnee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_KNEE, newLeftKnee, newLeftKnee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightKnee getRightKnee() {
		return rightKnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightKnee(RightKnee newRightKnee, NotificationChain msgs) {
		RightKnee oldRightKnee = rightKnee;
		rightKnee = newRightKnee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_KNEE, oldRightKnee, newRightKnee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightKnee(RightKnee newRightKnee) {
		if (newRightKnee != rightKnee) {
			NotificationChain msgs = null;
			if (rightKnee != null)
				msgs = ((InternalEObject)rightKnee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_KNEE, null, msgs);
			if (newRightKnee != null)
				msgs = ((InternalEObject)newRightKnee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_KNEE, null, msgs);
			msgs = basicSetRightKnee(newRightKnee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_KNEE, newRightKnee, newRightKnee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftFoot getLeftFoot() {
		return leftFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftFoot(LeftFoot newLeftFoot, NotificationChain msgs) {
		LeftFoot oldLeftFoot = leftFoot;
		leftFoot = newLeftFoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_FOOT, oldLeftFoot, newLeftFoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftFoot(LeftFoot newLeftFoot) {
		if (newLeftFoot != leftFoot) {
			NotificationChain msgs = null;
			if (leftFoot != null)
				msgs = ((InternalEObject)leftFoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_FOOT, null, msgs);
			if (newLeftFoot != null)
				msgs = ((InternalEObject)newLeftFoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_FOOT, null, msgs);
			msgs = basicSetLeftFoot(newLeftFoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_FOOT, newLeftFoot, newLeftFoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightFoot getRightFoot() {
		return rightFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightFoot(RightFoot newRightFoot, NotificationChain msgs) {
		RightFoot oldRightFoot = rightFoot;
		rightFoot = newRightFoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_FOOT, oldRightFoot, newRightFoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightFoot(RightFoot newRightFoot) {
		if (newRightFoot != rightFoot) {
			NotificationChain msgs = null;
			if (rightFoot != null)
				msgs = ((InternalEObject)rightFoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_FOOT, null, msgs);
			if (newRightFoot != null)
				msgs = ((InternalEObject)newRightFoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_FOOT, null, msgs);
			msgs = basicSetRightFoot(newRightFoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_FOOT, newRightFoot, newRightFoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<HumanLink>(HumanLink.class, this, BodymodelPackage.BODY__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftAnkle getLeftAnkle() {
		return leftAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftAnkle(LeftAnkle newLeftAnkle, NotificationChain msgs) {
		LeftAnkle oldLeftAnkle = leftAnkle;
		leftAnkle = newLeftAnkle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_ANKLE, oldLeftAnkle, newLeftAnkle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftAnkle(LeftAnkle newLeftAnkle) {
		if (newLeftAnkle != leftAnkle) {
			NotificationChain msgs = null;
			if (leftAnkle != null)
				msgs = ((InternalEObject)leftAnkle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_ANKLE, null, msgs);
			if (newLeftAnkle != null)
				msgs = ((InternalEObject)newLeftAnkle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__LEFT_ANKLE, null, msgs);
			msgs = basicSetLeftAnkle(newLeftAnkle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__LEFT_ANKLE, newLeftAnkle, newLeftAnkle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightAnkle getRightAnkle() {
		return rightAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightAnkle(RightAnkle newRightAnkle, NotificationChain msgs) {
		RightAnkle oldRightAnkle = rightAnkle;
		rightAnkle = newRightAnkle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_ANKLE, oldRightAnkle, newRightAnkle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAnkle(RightAnkle newRightAnkle) {
		if (newRightAnkle != rightAnkle) {
			NotificationChain msgs = null;
			if (rightAnkle != null)
				msgs = ((InternalEObject)rightAnkle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_ANKLE, null, msgs);
			if (newRightAnkle != null)
				msgs = ((InternalEObject)newRightAnkle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BodymodelPackage.BODY__RIGHT_ANKLE, null, msgs);
			msgs = basicSetRightAnkle(newRightAnkle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BodymodelPackage.BODY__RIGHT_ANKLE, newRightAnkle, newRightAnkle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BodymodelPackage.BODY__HEAD:
				return basicSetHead(null, msgs);
			case BodymodelPackage.BODY__CENTER_SHOULDER:
				return basicSetCenterShoulder(null, msgs);
			case BodymodelPackage.BODY__LEFT_SHOULDER:
				return basicSetLeftShoulder(null, msgs);
			case BodymodelPackage.BODY__RIGHT_SHOULDER:
				return basicSetRightShoulder(null, msgs);
			case BodymodelPackage.BODY__LEFT_ELBOW:
				return basicSetLeftElbow(null, msgs);
			case BodymodelPackage.BODY__RIGHT_ELBOW:
				return basicSetRightElbow(null, msgs);
			case BodymodelPackage.BODY__LEFT_WRIST:
				return basicSetLeftWrist(null, msgs);
			case BodymodelPackage.BODY__RIGHT_WRIST:
				return basicSetRightWrist(null, msgs);
			case BodymodelPackage.BODY__LEFT_HAND:
				return basicSetLeftHand(null, msgs);
			case BodymodelPackage.BODY__RIGHT_HAND:
				return basicSetRightHand(null, msgs);
			case BodymodelPackage.BODY__SPINE:
				return basicSetSpine(null, msgs);
			case BodymodelPackage.BODY__CENTER_HIP:
				return basicSetCenterHip(null, msgs);
			case BodymodelPackage.BODY__LEFT_HIP:
				return basicSetLeftHip(null, msgs);
			case BodymodelPackage.BODY__RIGHT_HIP:
				return basicSetRightHip(null, msgs);
			case BodymodelPackage.BODY__LEFT_KNEE:
				return basicSetLeftKnee(null, msgs);
			case BodymodelPackage.BODY__RIGHT_KNEE:
				return basicSetRightKnee(null, msgs);
			case BodymodelPackage.BODY__LEFT_FOOT:
				return basicSetLeftFoot(null, msgs);
			case BodymodelPackage.BODY__RIGHT_FOOT:
				return basicSetRightFoot(null, msgs);
			case BodymodelPackage.BODY__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case BodymodelPackage.BODY__LEFT_ANKLE:
				return basicSetLeftAnkle(null, msgs);
			case BodymodelPackage.BODY__RIGHT_ANKLE:
				return basicSetRightAnkle(null, msgs);
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
			case BodymodelPackage.BODY__HEAD:
				return getHead();
			case BodymodelPackage.BODY__CENTER_SHOULDER:
				return getCenterShoulder();
			case BodymodelPackage.BODY__LEFT_SHOULDER:
				return getLeftShoulder();
			case BodymodelPackage.BODY__RIGHT_SHOULDER:
				return getRightShoulder();
			case BodymodelPackage.BODY__LEFT_ELBOW:
				return getLeftElbow();
			case BodymodelPackage.BODY__RIGHT_ELBOW:
				return getRightElbow();
			case BodymodelPackage.BODY__LEFT_WRIST:
				return getLeftWrist();
			case BodymodelPackage.BODY__RIGHT_WRIST:
				return getRightWrist();
			case BodymodelPackage.BODY__LEFT_HAND:
				return getLeftHand();
			case BodymodelPackage.BODY__RIGHT_HAND:
				return getRightHand();
			case BodymodelPackage.BODY__SPINE:
				return getSpine();
			case BodymodelPackage.BODY__CENTER_HIP:
				return getCenterHip();
			case BodymodelPackage.BODY__LEFT_HIP:
				return getLeftHip();
			case BodymodelPackage.BODY__RIGHT_HIP:
				return getRightHip();
			case BodymodelPackage.BODY__LEFT_KNEE:
				return getLeftKnee();
			case BodymodelPackage.BODY__RIGHT_KNEE:
				return getRightKnee();
			case BodymodelPackage.BODY__LEFT_FOOT:
				return getLeftFoot();
			case BodymodelPackage.BODY__RIGHT_FOOT:
				return getRightFoot();
			case BodymodelPackage.BODY__LINKS:
				return getLinks();
			case BodymodelPackage.BODY__LEFT_ANKLE:
				return getLeftAnkle();
			case BodymodelPackage.BODY__RIGHT_ANKLE:
				return getRightAnkle();
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
			case BodymodelPackage.BODY__HEAD:
				setHead((Head)newValue);
				return;
			case BodymodelPackage.BODY__CENTER_SHOULDER:
				setCenterShoulder((CenterShoulder)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_SHOULDER:
				setLeftShoulder((LeftShoulder)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_SHOULDER:
				setRightShoulder((RightShoulder)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_ELBOW:
				setLeftElbow((LeftElbow)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_ELBOW:
				setRightElbow((RightElbow)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_WRIST:
				setLeftWrist((LeftWrist)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_WRIST:
				setRightWrist((RightWrist)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_HAND:
				setLeftHand((LeftHand)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_HAND:
				setRightHand((RightHand)newValue);
				return;
			case BodymodelPackage.BODY__SPINE:
				setSpine((Spine)newValue);
				return;
			case BodymodelPackage.BODY__CENTER_HIP:
				setCenterHip((CenterHip)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_HIP:
				setLeftHip((LeftHip)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_HIP:
				setRightHip((RightHip)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_KNEE:
				setLeftKnee((LeftKnee)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_KNEE:
				setRightKnee((RightKnee)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_FOOT:
				setLeftFoot((LeftFoot)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_FOOT:
				setRightFoot((RightFoot)newValue);
				return;
			case BodymodelPackage.BODY__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends HumanLink>)newValue);
				return;
			case BodymodelPackage.BODY__LEFT_ANKLE:
				setLeftAnkle((LeftAnkle)newValue);
				return;
			case BodymodelPackage.BODY__RIGHT_ANKLE:
				setRightAnkle((RightAnkle)newValue);
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
			case BodymodelPackage.BODY__HEAD:
				setHead((Head)null);
				return;
			case BodymodelPackage.BODY__CENTER_SHOULDER:
				setCenterShoulder((CenterShoulder)null);
				return;
			case BodymodelPackage.BODY__LEFT_SHOULDER:
				setLeftShoulder((LeftShoulder)null);
				return;
			case BodymodelPackage.BODY__RIGHT_SHOULDER:
				setRightShoulder((RightShoulder)null);
				return;
			case BodymodelPackage.BODY__LEFT_ELBOW:
				setLeftElbow((LeftElbow)null);
				return;
			case BodymodelPackage.BODY__RIGHT_ELBOW:
				setRightElbow((RightElbow)null);
				return;
			case BodymodelPackage.BODY__LEFT_WRIST:
				setLeftWrist((LeftWrist)null);
				return;
			case BodymodelPackage.BODY__RIGHT_WRIST:
				setRightWrist((RightWrist)null);
				return;
			case BodymodelPackage.BODY__LEFT_HAND:
				setLeftHand((LeftHand)null);
				return;
			case BodymodelPackage.BODY__RIGHT_HAND:
				setRightHand((RightHand)null);
				return;
			case BodymodelPackage.BODY__SPINE:
				setSpine((Spine)null);
				return;
			case BodymodelPackage.BODY__CENTER_HIP:
				setCenterHip((CenterHip)null);
				return;
			case BodymodelPackage.BODY__LEFT_HIP:
				setLeftHip((LeftHip)null);
				return;
			case BodymodelPackage.BODY__RIGHT_HIP:
				setRightHip((RightHip)null);
				return;
			case BodymodelPackage.BODY__LEFT_KNEE:
				setLeftKnee((LeftKnee)null);
				return;
			case BodymodelPackage.BODY__RIGHT_KNEE:
				setRightKnee((RightKnee)null);
				return;
			case BodymodelPackage.BODY__LEFT_FOOT:
				setLeftFoot((LeftFoot)null);
				return;
			case BodymodelPackage.BODY__RIGHT_FOOT:
				setRightFoot((RightFoot)null);
				return;
			case BodymodelPackage.BODY__LINKS:
				getLinks().clear();
				return;
			case BodymodelPackage.BODY__LEFT_ANKLE:
				setLeftAnkle((LeftAnkle)null);
				return;
			case BodymodelPackage.BODY__RIGHT_ANKLE:
				setRightAnkle((RightAnkle)null);
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
			case BodymodelPackage.BODY__HEAD:
				return head != null;
			case BodymodelPackage.BODY__CENTER_SHOULDER:
				return centerShoulder != null;
			case BodymodelPackage.BODY__LEFT_SHOULDER:
				return leftShoulder != null;
			case BodymodelPackage.BODY__RIGHT_SHOULDER:
				return rightShoulder != null;
			case BodymodelPackage.BODY__LEFT_ELBOW:
				return leftElbow != null;
			case BodymodelPackage.BODY__RIGHT_ELBOW:
				return rightElbow != null;
			case BodymodelPackage.BODY__LEFT_WRIST:
				return leftWrist != null;
			case BodymodelPackage.BODY__RIGHT_WRIST:
				return rightWrist != null;
			case BodymodelPackage.BODY__LEFT_HAND:
				return leftHand != null;
			case BodymodelPackage.BODY__RIGHT_HAND:
				return rightHand != null;
			case BodymodelPackage.BODY__SPINE:
				return spine != null;
			case BodymodelPackage.BODY__CENTER_HIP:
				return centerHip != null;
			case BodymodelPackage.BODY__LEFT_HIP:
				return leftHip != null;
			case BodymodelPackage.BODY__RIGHT_HIP:
				return rightHip != null;
			case BodymodelPackage.BODY__LEFT_KNEE:
				return leftKnee != null;
			case BodymodelPackage.BODY__RIGHT_KNEE:
				return rightKnee != null;
			case BodymodelPackage.BODY__LEFT_FOOT:
				return leftFoot != null;
			case BodymodelPackage.BODY__RIGHT_FOOT:
				return rightFoot != null;
			case BodymodelPackage.BODY__LINKS:
				return links != null && !links.isEmpty();
			case BodymodelPackage.BODY__LEFT_ANKLE:
				return leftAnkle != null;
			case BodymodelPackage.BODY__RIGHT_ANKLE:
				return rightAnkle != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
