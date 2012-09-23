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
package org.jnect.bodymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnect.bodymodel.Body#getHead <em>Head</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getCenterShoulder <em>Center Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftShoulder <em>Left Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightShoulder <em>Right Shoulder</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftElbow <em>Left Elbow</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightElbow <em>Right Elbow</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftWrist <em>Left Wrist</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightWrist <em>Right Wrist</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getSpine <em>Spine</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getCenterHip <em>Center Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftHip <em>Left Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightHip <em>Right Hip</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftKnee <em>Left Knee</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightKnee <em>Right Knee</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftFoot <em>Left Foot</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightFoot <em>Right Foot</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLinks <em>Links</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getLeftAnkle <em>Left Ankle</em>}</li>
 *   <li>{@link org.jnect.bodymodel.Body#getRightAnkle <em>Right Ankle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnect.bodymodel.BodymodelPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Head)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_Head()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

	/**
	 * Returns the value of the '<em><b>Center Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center Shoulder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Shoulder</em>' containment reference.
	 * @see #setCenterShoulder(CenterShoulder)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_CenterShoulder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CenterShoulder getCenterShoulder();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getCenterShoulder <em>Center Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Shoulder</em>' containment reference.
	 * @see #getCenterShoulder()
	 * @generated
	 */
	void setCenterShoulder(CenterShoulder value);

	/**
	 * Returns the value of the '<em><b>Left Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Shoulder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Shoulder</em>' containment reference.
	 * @see #setLeftShoulder(LeftShoulder)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftShoulder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftShoulder getLeftShoulder();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftShoulder <em>Left Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Shoulder</em>' containment reference.
	 * @see #getLeftShoulder()
	 * @generated
	 */
	void setLeftShoulder(LeftShoulder value);

	/**
	 * Returns the value of the '<em><b>Right Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Shoulder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Shoulder</em>' containment reference.
	 * @see #setRightShoulder(RightShoulder)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightShoulder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightShoulder getRightShoulder();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightShoulder <em>Right Shoulder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Shoulder</em>' containment reference.
	 * @see #getRightShoulder()
	 * @generated
	 */
	void setRightShoulder(RightShoulder value);

	/**
	 * Returns the value of the '<em><b>Left Elbow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Elbow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Elbow</em>' containment reference.
	 * @see #setLeftElbow(LeftElbow)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftElbow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftElbow getLeftElbow();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftElbow <em>Left Elbow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Elbow</em>' containment reference.
	 * @see #getLeftElbow()
	 * @generated
	 */
	void setLeftElbow(LeftElbow value);

	/**
	 * Returns the value of the '<em><b>Right Elbow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Elbow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Elbow</em>' containment reference.
	 * @see #setRightElbow(RightElbow)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightElbow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightElbow getRightElbow();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightElbow <em>Right Elbow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Elbow</em>' containment reference.
	 * @see #getRightElbow()
	 * @generated
	 */
	void setRightElbow(RightElbow value);

	/**
	 * Returns the value of the '<em><b>Left Wrist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Wrist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Wrist</em>' containment reference.
	 * @see #setLeftWrist(LeftWrist)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftWrist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftWrist getLeftWrist();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftWrist <em>Left Wrist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Wrist</em>' containment reference.
	 * @see #getLeftWrist()
	 * @generated
	 */
	void setLeftWrist(LeftWrist value);

	/**
	 * Returns the value of the '<em><b>Right Wrist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Wrist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Wrist</em>' containment reference.
	 * @see #setRightWrist(RightWrist)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightWrist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightWrist getRightWrist();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightWrist <em>Right Wrist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Wrist</em>' containment reference.
	 * @see #getRightWrist()
	 * @generated
	 */
	void setRightWrist(RightWrist value);

	/**
	 * Returns the value of the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand</em>' containment reference.
	 * @see #setLeftHand(LeftHand)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftHand getLeftHand();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftHand <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand</em>' containment reference.
	 * @see #getLeftHand()
	 * @generated
	 */
	void setLeftHand(LeftHand value);

	/**
	 * Returns the value of the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand</em>' containment reference.
	 * @see #setRightHand(RightHand)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightHand getRightHand();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightHand <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand</em>' containment reference.
	 * @see #getRightHand()
	 * @generated
	 */
	void setRightHand(RightHand value);

	/**
	 * Returns the value of the '<em><b>Spine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spine</em>' containment reference.
	 * @see #setSpine(Spine)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_Spine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Spine getSpine();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getSpine <em>Spine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spine</em>' containment reference.
	 * @see #getSpine()
	 * @generated
	 */
	void setSpine(Spine value);

	/**
	 * Returns the value of the '<em><b>Center Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center Hip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Hip</em>' containment reference.
	 * @see #setCenterHip(CenterHip)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_CenterHip()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CenterHip getCenterHip();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getCenterHip <em>Center Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Hip</em>' containment reference.
	 * @see #getCenterHip()
	 * @generated
	 */
	void setCenterHip(CenterHip value);

	/**
	 * Returns the value of the '<em><b>Left Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hip</em>' containment reference.
	 * @see #setLeftHip(LeftHip)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftHip()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftHip getLeftHip();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftHip <em>Left Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hip</em>' containment reference.
	 * @see #getLeftHip()
	 * @generated
	 */
	void setLeftHip(LeftHip value);

	/**
	 * Returns the value of the '<em><b>Right Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hip</em>' containment reference.
	 * @see #setRightHip(RightHip)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightHip()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightHip getRightHip();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightHip <em>Right Hip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hip</em>' containment reference.
	 * @see #getRightHip()
	 * @generated
	 */
	void setRightHip(RightHip value);

	/**
	 * Returns the value of the '<em><b>Left Knee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Knee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Knee</em>' containment reference.
	 * @see #setLeftKnee(LeftKnee)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftKnee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftKnee getLeftKnee();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftKnee <em>Left Knee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Knee</em>' containment reference.
	 * @see #getLeftKnee()
	 * @generated
	 */
	void setLeftKnee(LeftKnee value);

	/**
	 * Returns the value of the '<em><b>Right Knee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Knee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Knee</em>' containment reference.
	 * @see #setRightKnee(RightKnee)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightKnee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightKnee getRightKnee();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightKnee <em>Right Knee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Knee</em>' containment reference.
	 * @see #getRightKnee()
	 * @generated
	 */
	void setRightKnee(RightKnee value);

	/**
	 * Returns the value of the '<em><b>Left Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Foot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Foot</em>' containment reference.
	 * @see #setLeftFoot(LeftFoot)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftFoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftFoot getLeftFoot();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftFoot <em>Left Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Foot</em>' containment reference.
	 * @see #getLeftFoot()
	 * @generated
	 */
	void setLeftFoot(LeftFoot value);

	/**
	 * Returns the value of the '<em><b>Right Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Foot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Foot</em>' containment reference.
	 * @see #setRightFoot(RightFoot)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightFoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightFoot getRightFoot();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightFoot <em>Right Foot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Foot</em>' containment reference.
	 * @see #getRightFoot()
	 * @generated
	 */
	void setRightFoot(RightFoot value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnect.bodymodel.HumanLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<HumanLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Left Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Ankle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Ankle</em>' containment reference.
	 * @see #setLeftAnkle(LeftAnkle)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_LeftAnkle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftAnkle getLeftAnkle();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getLeftAnkle <em>Left Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ankle</em>' containment reference.
	 * @see #getLeftAnkle()
	 * @generated
	 */
	void setLeftAnkle(LeftAnkle value);

	/**
	 * Returns the value of the '<em><b>Right Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Ankle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ankle</em>' containment reference.
	 * @see #setRightAnkle(RightAnkle)
	 * @see org.jnect.bodymodel.BodymodelPackage#getBody_RightAnkle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightAnkle getRightAnkle();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.Body#getRightAnkle <em>Right Ankle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ankle</em>' containment reference.
	 * @see #getRightAnkle()
	 * @generated
	 */
	void setRightAnkle(RightAnkle value);

} // Body
