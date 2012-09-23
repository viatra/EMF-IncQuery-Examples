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
package org.jnect.bodymodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.jnect.bodymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jnect.bodymodel.BodymodelPackage
 * @generated
 */
public class BodymodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BodymodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodymodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BodymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BodymodelPackage.POSITIONED_ELEMENT: {
				PositionedElement positionedElement = (PositionedElement)theEObject;
				T result = casePositionedElement(positionedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.HUMAN_LINK: {
				HumanLink humanLink = (HumanLink)theEObject;
				T result = caseHumanLink(humanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.BODY: {
				Body body = (Body)theEObject;
				T result = caseBody(body);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.HEAD: {
				Head head = (Head)theEObject;
				T result = caseHead(head);
				if (result == null) result = casePositionedElement(head);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.CENTER_SHOULDER: {
				CenterShoulder centerShoulder = (CenterShoulder)theEObject;
				T result = caseCenterShoulder(centerShoulder);
				if (result == null) result = casePositionedElement(centerShoulder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_SHOULDER: {
				LeftShoulder leftShoulder = (LeftShoulder)theEObject;
				T result = caseLeftShoulder(leftShoulder);
				if (result == null) result = casePositionedElement(leftShoulder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_SHOULDER: {
				RightShoulder rightShoulder = (RightShoulder)theEObject;
				T result = caseRightShoulder(rightShoulder);
				if (result == null) result = casePositionedElement(rightShoulder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_ELBOW: {
				LeftElbow leftElbow = (LeftElbow)theEObject;
				T result = caseLeftElbow(leftElbow);
				if (result == null) result = casePositionedElement(leftElbow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_ELBOW: {
				RightElbow rightElbow = (RightElbow)theEObject;
				T result = caseRightElbow(rightElbow);
				if (result == null) result = casePositionedElement(rightElbow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_WRIST: {
				LeftWrist leftWrist = (LeftWrist)theEObject;
				T result = caseLeftWrist(leftWrist);
				if (result == null) result = casePositionedElement(leftWrist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_WRIST: {
				RightWrist rightWrist = (RightWrist)theEObject;
				T result = caseRightWrist(rightWrist);
				if (result == null) result = casePositionedElement(rightWrist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_HAND: {
				LeftHand leftHand = (LeftHand)theEObject;
				T result = caseLeftHand(leftHand);
				if (result == null) result = casePositionedElement(leftHand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_HAND: {
				RightHand rightHand = (RightHand)theEObject;
				T result = caseRightHand(rightHand);
				if (result == null) result = casePositionedElement(rightHand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.SPINE: {
				Spine spine = (Spine)theEObject;
				T result = caseSpine(spine);
				if (result == null) result = casePositionedElement(spine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.CENTER_HIP: {
				CenterHip centerHip = (CenterHip)theEObject;
				T result = caseCenterHip(centerHip);
				if (result == null) result = casePositionedElement(centerHip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_HIP: {
				LeftHip leftHip = (LeftHip)theEObject;
				T result = caseLeftHip(leftHip);
				if (result == null) result = casePositionedElement(leftHip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_HIP: {
				RightHip rightHip = (RightHip)theEObject;
				T result = caseRightHip(rightHip);
				if (result == null) result = casePositionedElement(rightHip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_KNEE: {
				LeftKnee leftKnee = (LeftKnee)theEObject;
				T result = caseLeftKnee(leftKnee);
				if (result == null) result = casePositionedElement(leftKnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_KNEE: {
				RightKnee rightKnee = (RightKnee)theEObject;
				T result = caseRightKnee(rightKnee);
				if (result == null) result = casePositionedElement(rightKnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_ANKLE: {
				LeftAnkle leftAnkle = (LeftAnkle)theEObject;
				T result = caseLeftAnkle(leftAnkle);
				if (result == null) result = casePositionedElement(leftAnkle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_ANKLE: {
				RightAnkle rightAnkle = (RightAnkle)theEObject;
				T result = caseRightAnkle(rightAnkle);
				if (result == null) result = casePositionedElement(rightAnkle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.LEFT_FOOT: {
				LeftFoot leftFoot = (LeftFoot)theEObject;
				T result = caseLeftFoot(leftFoot);
				if (result == null) result = casePositionedElement(leftFoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BodymodelPackage.RIGHT_FOOT: {
				RightFoot rightFoot = (RightFoot)theEObject;
				T result = caseRightFoot(rightFoot);
				if (result == null) result = casePositionedElement(rightFoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionedElement(PositionedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanLink(HumanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHead(Head object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Shoulder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterShoulder(CenterShoulder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Shoulder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftShoulder(LeftShoulder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Shoulder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightShoulder(RightShoulder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Elbow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Elbow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftElbow(LeftElbow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Elbow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Elbow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightElbow(RightElbow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Wrist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Wrist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftWrist(LeftWrist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Wrist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Wrist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightWrist(RightWrist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Hand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Hand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftHand(LeftHand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Hand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Hand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightHand(RightHand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpine(Spine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Hip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Hip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterHip(CenterHip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Hip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Hip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftHip(LeftHip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Hip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Hip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightHip(RightHip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Knee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Knee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftKnee(LeftKnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Knee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Knee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightKnee(RightKnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Ankle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Ankle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftAnkle(LeftAnkle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Ankle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Ankle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightAnkle(RightAnkle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftFoot(LeftFoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightFoot(RightFoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BodymodelSwitch
