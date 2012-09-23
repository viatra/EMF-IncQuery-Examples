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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jnect.bodymodel.BodymodelPackage
 * @generated
 */
public interface BodymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BodymodelFactory eINSTANCE = org.jnect.bodymodel.impl.BodymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Human Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Link</em>'.
	 * @generated
	 */
	HumanLink createHumanLink();

	/**
	 * Returns a new object of class '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body</em>'.
	 * @generated
	 */
	Body createBody();

	/**
	 * Returns a new object of class '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head</em>'.
	 * @generated
	 */
	Head createHead();

	/**
	 * Returns a new object of class '<em>Center Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Center Shoulder</em>'.
	 * @generated
	 */
	CenterShoulder createCenterShoulder();

	/**
	 * Returns a new object of class '<em>Left Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Shoulder</em>'.
	 * @generated
	 */
	LeftShoulder createLeftShoulder();

	/**
	 * Returns a new object of class '<em>Right Shoulder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Shoulder</em>'.
	 * @generated
	 */
	RightShoulder createRightShoulder();

	/**
	 * Returns a new object of class '<em>Left Elbow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Elbow</em>'.
	 * @generated
	 */
	LeftElbow createLeftElbow();

	/**
	 * Returns a new object of class '<em>Right Elbow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Elbow</em>'.
	 * @generated
	 */
	RightElbow createRightElbow();

	/**
	 * Returns a new object of class '<em>Left Wrist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Wrist</em>'.
	 * @generated
	 */
	LeftWrist createLeftWrist();

	/**
	 * Returns a new object of class '<em>Right Wrist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Wrist</em>'.
	 * @generated
	 */
	RightWrist createRightWrist();

	/**
	 * Returns a new object of class '<em>Left Hand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Hand</em>'.
	 * @generated
	 */
	LeftHand createLeftHand();

	/**
	 * Returns a new object of class '<em>Right Hand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Hand</em>'.
	 * @generated
	 */
	RightHand createRightHand();

	/**
	 * Returns a new object of class '<em>Spine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spine</em>'.
	 * @generated
	 */
	Spine createSpine();

	/**
	 * Returns a new object of class '<em>Center Hip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Center Hip</em>'.
	 * @generated
	 */
	CenterHip createCenterHip();

	/**
	 * Returns a new object of class '<em>Left Hip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Hip</em>'.
	 * @generated
	 */
	LeftHip createLeftHip();

	/**
	 * Returns a new object of class '<em>Right Hip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Hip</em>'.
	 * @generated
	 */
	RightHip createRightHip();

	/**
	 * Returns a new object of class '<em>Left Knee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Knee</em>'.
	 * @generated
	 */
	LeftKnee createLeftKnee();

	/**
	 * Returns a new object of class '<em>Right Knee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Knee</em>'.
	 * @generated
	 */
	RightKnee createRightKnee();

	/**
	 * Returns a new object of class '<em>Left Ankle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Ankle</em>'.
	 * @generated
	 */
	LeftAnkle createLeftAnkle();

	/**
	 * Returns a new object of class '<em>Right Ankle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Ankle</em>'.
	 * @generated
	 */
	RightAnkle createRightAnkle();

	/**
	 * Returns a new object of class '<em>Left Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Foot</em>'.
	 * @generated
	 */
	LeftFoot createLeftFoot();

	/**
	 * Returns a new object of class '<em>Right Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Foot</em>'.
	 * @generated
	 */
	RightFoot createRightFoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BodymodelPackage getBodymodelPackage();

} //BodymodelFactory
