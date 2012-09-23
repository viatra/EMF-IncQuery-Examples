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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jnect.bodymodel.Body;
import org.jnect.bodymodel.BodymodelFactory;
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
import org.jnect.bodymodel.PositionedElement;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BodymodelPackageImpl extends EPackageImpl implements BodymodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centerShoulderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftShoulderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightShoulderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftElbowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightElbowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftWristEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightWristEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftHandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightHandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centerHipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftHipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightHipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftKneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightKneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftAnkleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightAnkleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftFootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightFootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jnect.bodymodel.BodymodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BodymodelPackageImpl() {
		super(eNS_URI, BodymodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BodymodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BodymodelPackage init() {
		if (isInited) return (BodymodelPackage)EPackage.Registry.INSTANCE.getEPackage(BodymodelPackage.eNS_URI);

		// Obtain or create and register package
		BodymodelPackageImpl theBodymodelPackage = (BodymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BodymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BodymodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBodymodelPackage.createPackageContents();

		// Initialize created meta-data
		theBodymodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBodymodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BodymodelPackage.eNS_URI, theBodymodelPackage);
		return theBodymodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionedElement() {
		return positionedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_X() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_Y() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_Z() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_IncomingLinks() {
		return (EReference)positionedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionedElement_OutgoingLinks() {
		return (EReference)positionedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_Color_r() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_Color_g() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionedElement_Color_b() {
		return (EAttribute)positionedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanLink() {
		return humanLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanLink_Source() {
		return (EReference)humanLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanLink_Target() {
		return (EReference)humanLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Head() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_CenterShoulder() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftShoulder() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightShoulder() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftElbow() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightElbow() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftWrist() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightWrist() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftHand() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightHand() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Spine() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_CenterHip() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftHip() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightHip() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftKnee() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightKnee() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftFoot() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightFoot() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Links() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LeftAnkle() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_RightAnkle() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHead() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCenterShoulder() {
		return centerShoulderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftShoulder() {
		return leftShoulderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightShoulder() {
		return rightShoulderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftElbow() {
		return leftElbowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightElbow() {
		return rightElbowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftWrist() {
		return leftWristEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightWrist() {
		return rightWristEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftHand() {
		return leftHandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightHand() {
		return rightHandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpine() {
		return spineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCenterHip() {
		return centerHipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftHip() {
		return leftHipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightHip() {
		return rightHipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftKnee() {
		return leftKneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightKnee() {
		return rightKneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftAnkle() {
		return leftAnkleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightAnkle() {
		return rightAnkleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftFoot() {
		return leftFootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightFoot() {
		return rightFootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodymodelFactory getBodymodelFactory() {
		return (BodymodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		positionedElementEClass = createEClass(POSITIONED_ELEMENT);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__X);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__Y);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__Z);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__INCOMING_LINKS);
		createEReference(positionedElementEClass, POSITIONED_ELEMENT__OUTGOING_LINKS);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__COLOR_R);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__COLOR_G);
		createEAttribute(positionedElementEClass, POSITIONED_ELEMENT__COLOR_B);

		humanLinkEClass = createEClass(HUMAN_LINK);
		createEReference(humanLinkEClass, HUMAN_LINK__SOURCE);
		createEReference(humanLinkEClass, HUMAN_LINK__TARGET);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__HEAD);
		createEReference(bodyEClass, BODY__CENTER_SHOULDER);
		createEReference(bodyEClass, BODY__LEFT_SHOULDER);
		createEReference(bodyEClass, BODY__RIGHT_SHOULDER);
		createEReference(bodyEClass, BODY__LEFT_ELBOW);
		createEReference(bodyEClass, BODY__RIGHT_ELBOW);
		createEReference(bodyEClass, BODY__LEFT_WRIST);
		createEReference(bodyEClass, BODY__RIGHT_WRIST);
		createEReference(bodyEClass, BODY__LEFT_HAND);
		createEReference(bodyEClass, BODY__RIGHT_HAND);
		createEReference(bodyEClass, BODY__SPINE);
		createEReference(bodyEClass, BODY__CENTER_HIP);
		createEReference(bodyEClass, BODY__LEFT_HIP);
		createEReference(bodyEClass, BODY__RIGHT_HIP);
		createEReference(bodyEClass, BODY__LEFT_KNEE);
		createEReference(bodyEClass, BODY__RIGHT_KNEE);
		createEReference(bodyEClass, BODY__LEFT_FOOT);
		createEReference(bodyEClass, BODY__RIGHT_FOOT);
		createEReference(bodyEClass, BODY__LINKS);
		createEReference(bodyEClass, BODY__LEFT_ANKLE);
		createEReference(bodyEClass, BODY__RIGHT_ANKLE);

		headEClass = createEClass(HEAD);

		centerShoulderEClass = createEClass(CENTER_SHOULDER);

		leftShoulderEClass = createEClass(LEFT_SHOULDER);

		rightShoulderEClass = createEClass(RIGHT_SHOULDER);

		leftElbowEClass = createEClass(LEFT_ELBOW);

		rightElbowEClass = createEClass(RIGHT_ELBOW);

		leftWristEClass = createEClass(LEFT_WRIST);

		rightWristEClass = createEClass(RIGHT_WRIST);

		leftHandEClass = createEClass(LEFT_HAND);

		rightHandEClass = createEClass(RIGHT_HAND);

		spineEClass = createEClass(SPINE);

		centerHipEClass = createEClass(CENTER_HIP);

		leftHipEClass = createEClass(LEFT_HIP);

		rightHipEClass = createEClass(RIGHT_HIP);

		leftKneeEClass = createEClass(LEFT_KNEE);

		rightKneeEClass = createEClass(RIGHT_KNEE);

		leftAnkleEClass = createEClass(LEFT_ANKLE);

		rightAnkleEClass = createEClass(RIGHT_ANKLE);

		leftFootEClass = createEClass(LEFT_FOOT);

		rightFootEClass = createEClass(RIGHT_FOOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		headEClass.getESuperTypes().add(this.getPositionedElement());
		centerShoulderEClass.getESuperTypes().add(this.getPositionedElement());
		leftShoulderEClass.getESuperTypes().add(this.getPositionedElement());
		rightShoulderEClass.getESuperTypes().add(this.getPositionedElement());
		leftElbowEClass.getESuperTypes().add(this.getPositionedElement());
		rightElbowEClass.getESuperTypes().add(this.getPositionedElement());
		leftWristEClass.getESuperTypes().add(this.getPositionedElement());
		rightWristEClass.getESuperTypes().add(this.getPositionedElement());
		leftHandEClass.getESuperTypes().add(this.getPositionedElement());
		rightHandEClass.getESuperTypes().add(this.getPositionedElement());
		spineEClass.getESuperTypes().add(this.getPositionedElement());
		centerHipEClass.getESuperTypes().add(this.getPositionedElement());
		leftHipEClass.getESuperTypes().add(this.getPositionedElement());
		rightHipEClass.getESuperTypes().add(this.getPositionedElement());
		leftKneeEClass.getESuperTypes().add(this.getPositionedElement());
		rightKneeEClass.getESuperTypes().add(this.getPositionedElement());
		leftAnkleEClass.getESuperTypes().add(this.getPositionedElement());
		rightAnkleEClass.getESuperTypes().add(this.getPositionedElement());
		leftFootEClass.getESuperTypes().add(this.getPositionedElement());
		rightFootEClass.getESuperTypes().add(this.getPositionedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(positionedElementEClass, PositionedElement.class, "PositionedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionedElement_X(), ecorePackage.getEFloat(), "x", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedElement_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedElement_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_IncomingLinks(), this.getHumanLink(), null, "incomingLinks", null, 0, -1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionedElement_OutgoingLinks(), this.getHumanLink(), null, "outgoingLinks", null, 0, -1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedElement_Color_r(), ecorePackage.getEInt(), "color_r", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedElement_Color_g(), ecorePackage.getEInt(), "color_g", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionedElement_Color_b(), ecorePackage.getEInt(), "color_b", null, 0, 1, PositionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanLinkEClass, HumanLink.class, "HumanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanLink_Source(), this.getPositionedElement(), null, "source", null, 0, 1, HumanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanLink_Target(), this.getPositionedElement(), null, "target", null, 0, 1, HumanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBody_Head(), this.getHead(), null, "Head", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_CenterShoulder(), this.getCenterShoulder(), null, "CenterShoulder", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftShoulder(), this.getLeftShoulder(), null, "LeftShoulder", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightShoulder(), this.getRightShoulder(), null, "RightShoulder", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftElbow(), this.getLeftElbow(), null, "LeftElbow", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightElbow(), this.getRightElbow(), null, "RightElbow", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftWrist(), this.getLeftWrist(), null, "LeftWrist", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightWrist(), this.getRightWrist(), null, "RightWrist", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftHand(), this.getLeftHand(), null, "LeftHand", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightHand(), this.getRightHand(), null, "RightHand", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Spine(), this.getSpine(), null, "Spine", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_CenterHip(), this.getCenterHip(), null, "CenterHip", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftHip(), this.getLeftHip(), null, "LeftHip", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightHip(), this.getRightHip(), null, "RightHip", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftKnee(), this.getLeftKnee(), null, "LeftKnee", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightKnee(), this.getRightKnee(), null, "RightKnee", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftFoot(), this.getLeftFoot(), null, "LeftFoot", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightFoot(), this.getRightFoot(), null, "RightFoot", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Links(), this.getHumanLink(), null, "links", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LeftAnkle(), this.getLeftAnkle(), null, "LeftAnkle", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_RightAnkle(), this.getRightAnkle(), null, "RightAnkle", null, 1, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(centerShoulderEClass, CenterShoulder.class, "CenterShoulder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftShoulderEClass, LeftShoulder.class, "LeftShoulder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightShoulderEClass, RightShoulder.class, "RightShoulder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftElbowEClass, LeftElbow.class, "LeftElbow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightElbowEClass, RightElbow.class, "RightElbow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftWristEClass, LeftWrist.class, "LeftWrist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightWristEClass, RightWrist.class, "RightWrist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftHandEClass, LeftHand.class, "LeftHand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightHandEClass, RightHand.class, "RightHand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spineEClass, Spine.class, "Spine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(centerHipEClass, CenterHip.class, "CenterHip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftHipEClass, LeftHip.class, "LeftHip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightHipEClass, RightHip.class, "RightHip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftKneeEClass, LeftKnee.class, "LeftKnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightKneeEClass, RightKnee.class, "RightKnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftAnkleEClass, LeftAnkle.class, "LeftAnkle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightAnkleEClass, RightAnkle.class, "RightAnkle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftFootEClass, LeftFoot.class, "LeftFoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightFootEClass, RightFoot.class, "RightFoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BodymodelPackageImpl
