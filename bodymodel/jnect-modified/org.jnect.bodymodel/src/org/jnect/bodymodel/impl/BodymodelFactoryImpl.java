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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jnect.bodymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BodymodelFactoryImpl extends EFactoryImpl implements BodymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BodymodelFactory init() {
		try {
			BodymodelFactory theBodymodelFactory = (BodymodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/jnect/bodymodel"); 
			if (theBodymodelFactory != null) {
				return theBodymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BodymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BodymodelPackage.HUMAN_LINK: return createHumanLink();
			case BodymodelPackage.BODY: return createBody();
			case BodymodelPackage.HEAD: return createHead();
			case BodymodelPackage.CENTER_SHOULDER: return createCenterShoulder();
			case BodymodelPackage.LEFT_SHOULDER: return createLeftShoulder();
			case BodymodelPackage.RIGHT_SHOULDER: return createRightShoulder();
			case BodymodelPackage.LEFT_ELBOW: return createLeftElbow();
			case BodymodelPackage.RIGHT_ELBOW: return createRightElbow();
			case BodymodelPackage.LEFT_WRIST: return createLeftWrist();
			case BodymodelPackage.RIGHT_WRIST: return createRightWrist();
			case BodymodelPackage.LEFT_HAND: return createLeftHand();
			case BodymodelPackage.RIGHT_HAND: return createRightHand();
			case BodymodelPackage.SPINE: return createSpine();
			case BodymodelPackage.CENTER_HIP: return createCenterHip();
			case BodymodelPackage.LEFT_HIP: return createLeftHip();
			case BodymodelPackage.RIGHT_HIP: return createRightHip();
			case BodymodelPackage.LEFT_KNEE: return createLeftKnee();
			case BodymodelPackage.RIGHT_KNEE: return createRightKnee();
			case BodymodelPackage.LEFT_ANKLE: return createLeftAnkle();
			case BodymodelPackage.RIGHT_ANKLE: return createRightAnkle();
			case BodymodelPackage.LEFT_FOOT: return createLeftFoot();
			case BodymodelPackage.RIGHT_FOOT: return createRightFoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanLink createHumanLink() {
		HumanLinkImpl humanLink = new HumanLinkImpl();
		return humanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenterShoulder createCenterShoulder() {
		CenterShoulderImpl centerShoulder = new CenterShoulderImpl();
		return centerShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftShoulder createLeftShoulder() {
		LeftShoulderImpl leftShoulder = new LeftShoulderImpl();
		return leftShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightShoulder createRightShoulder() {
		RightShoulderImpl rightShoulder = new RightShoulderImpl();
		return rightShoulder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftElbow createLeftElbow() {
		LeftElbowImpl leftElbow = new LeftElbowImpl();
		return leftElbow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightElbow createRightElbow() {
		RightElbowImpl rightElbow = new RightElbowImpl();
		return rightElbow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftWrist createLeftWrist() {
		LeftWristImpl leftWrist = new LeftWristImpl();
		return leftWrist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightWrist createRightWrist() {
		RightWristImpl rightWrist = new RightWristImpl();
		return rightWrist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHand createLeftHand() {
		LeftHandImpl leftHand = new LeftHandImpl();
		return leftHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightHand createRightHand() {
		RightHandImpl rightHand = new RightHandImpl();
		return rightHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spine createSpine() {
		SpineImpl spine = new SpineImpl();
		return spine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenterHip createCenterHip() {
		CenterHipImpl centerHip = new CenterHipImpl();
		return centerHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHip createLeftHip() {
		LeftHipImpl leftHip = new LeftHipImpl();
		return leftHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightHip createRightHip() {
		RightHipImpl rightHip = new RightHipImpl();
		return rightHip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftKnee createLeftKnee() {
		LeftKneeImpl leftKnee = new LeftKneeImpl();
		return leftKnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightKnee createRightKnee() {
		RightKneeImpl rightKnee = new RightKneeImpl();
		return rightKnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftAnkle createLeftAnkle() {
		LeftAnkleImpl leftAnkle = new LeftAnkleImpl();
		return leftAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightAnkle createRightAnkle() {
		RightAnkleImpl rightAnkle = new RightAnkleImpl();
		return rightAnkle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftFoot createLeftFoot() {
		LeftFootImpl leftFoot = new LeftFootImpl();
		return leftFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightFoot createRightFoot() {
		RightFootImpl rightFoot = new RightFootImpl();
		return rightFoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodymodelPackage getBodymodelPackage() {
		return (BodymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BodymodelPackage getPackage() {
		return BodymodelPackage.eINSTANCE;
	}

} //BodymodelFactoryImpl
