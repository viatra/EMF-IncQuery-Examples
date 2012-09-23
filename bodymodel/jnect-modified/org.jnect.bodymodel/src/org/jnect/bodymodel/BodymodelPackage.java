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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jnect.bodymodel.BodymodelFactory
 * @model kind="package"
 * @generated
 */
public interface BodymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bodymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/jnect/bodymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.jnect.bodymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BodymodelPackage eINSTANCE = org.jnect.bodymodel.impl.BodymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.PositionedElementImpl <em>Positioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.PositionedElementImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getPositionedElement()
	 * @generated
	 */
	int POSITIONED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__Z = 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__INCOMING_LINKS = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__OUTGOING_LINKS = 4;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__COLOR_R = 5;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__COLOR_G = 6;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT__COLOR_B = 7;

	/**
	 * The number of structural features of the '<em>Positioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.HumanLinkImpl <em>Human Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.HumanLinkImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getHumanLink()
	 * @generated
	 */
	int HUMAN_LINK = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Human Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.BodyImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 2;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Center Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CENTER_SHOULDER = 1;

	/**
	 * The feature id for the '<em><b>Left Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_SHOULDER = 2;

	/**
	 * The feature id for the '<em><b>Right Shoulder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_SHOULDER = 3;

	/**
	 * The feature id for the '<em><b>Left Elbow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_ELBOW = 4;

	/**
	 * The feature id for the '<em><b>Right Elbow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_ELBOW = 5;

	/**
	 * The feature id for the '<em><b>Left Wrist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_WRIST = 6;

	/**
	 * The feature id for the '<em><b>Right Wrist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_WRIST = 7;

	/**
	 * The feature id for the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_HAND = 8;

	/**
	 * The feature id for the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_HAND = 9;

	/**
	 * The feature id for the '<em><b>Spine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SPINE = 10;

	/**
	 * The feature id for the '<em><b>Center Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CENTER_HIP = 11;

	/**
	 * The feature id for the '<em><b>Left Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_HIP = 12;

	/**
	 * The feature id for the '<em><b>Right Hip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_HIP = 13;

	/**
	 * The feature id for the '<em><b>Left Knee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_KNEE = 14;

	/**
	 * The feature id for the '<em><b>Right Knee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_KNEE = 15;

	/**
	 * The feature id for the '<em><b>Left Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_FOOT = 16;

	/**
	 * The feature id for the '<em><b>Right Foot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_FOOT = 17;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LINKS = 18;

	/**
	 * The feature id for the '<em><b>Left Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEFT_ANKLE = 19;

	/**
	 * The feature id for the '<em><b>Right Ankle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RIGHT_ANKLE = 20;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.HeadImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.CenterShoulderImpl <em>Center Shoulder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.CenterShoulderImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getCenterShoulder()
	 * @generated
	 */
	int CENTER_SHOULDER = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Center Shoulder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_SHOULDER_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftShoulderImpl <em>Left Shoulder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftShoulderImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftShoulder()
	 * @generated
	 */
	int LEFT_SHOULDER = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Shoulder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SHOULDER_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightShoulderImpl <em>Right Shoulder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightShoulderImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightShoulder()
	 * @generated
	 */
	int RIGHT_SHOULDER = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Shoulder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SHOULDER_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftElbowImpl <em>Left Elbow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftElbowImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftElbow()
	 * @generated
	 */
	int LEFT_ELBOW = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Elbow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ELBOW_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightElbowImpl <em>Right Elbow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightElbowImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightElbow()
	 * @generated
	 */
	int RIGHT_ELBOW = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Elbow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ELBOW_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftWristImpl <em>Left Wrist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftWristImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftWrist()
	 * @generated
	 */
	int LEFT_WRIST = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Wrist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_WRIST_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightWristImpl <em>Right Wrist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightWristImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightWrist()
	 * @generated
	 */
	int RIGHT_WRIST = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Wrist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_WRIST_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftHandImpl <em>Left Hand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftHandImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftHand()
	 * @generated
	 */
	int LEFT_HAND = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightHandImpl <em>Right Hand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightHandImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightHand()
	 * @generated
	 */
	int RIGHT_HAND = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HAND_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.SpineImpl <em>Spine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.SpineImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getSpine()
	 * @generated
	 */
	int SPINE = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Spine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINE_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.CenterHipImpl <em>Center Hip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.CenterHipImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getCenterHip()
	 * @generated
	 */
	int CENTER_HIP = 14;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Center Hip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_HIP_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftHipImpl <em>Left Hip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftHipImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftHip()
	 * @generated
	 */
	int LEFT_HIP = 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Hip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HIP_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightHipImpl <em>Right Hip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightHipImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightHip()
	 * @generated
	 */
	int RIGHT_HIP = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Hip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_HIP_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftKneeImpl <em>Left Knee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftKneeImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftKnee()
	 * @generated
	 */
	int LEFT_KNEE = 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Knee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_KNEE_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightKneeImpl <em>Right Knee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightKneeImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightKnee()
	 * @generated
	 */
	int RIGHT_KNEE = 18;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Knee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_KNEE_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftAnkleImpl <em>Left Ankle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftAnkleImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftAnkle()
	 * @generated
	 */
	int LEFT_ANKLE = 19;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Ankle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ANKLE_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightAnkleImpl <em>Right Ankle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightAnkleImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightAnkle()
	 * @generated
	 */
	int RIGHT_ANKLE = 20;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Ankle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ANKLE_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.LeftFootImpl <em>Left Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.LeftFootImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftFoot()
	 * @generated
	 */
	int LEFT_FOOT = 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Left Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FOOT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnect.bodymodel.impl.RightFootImpl <em>Right Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnect.bodymodel.impl.RightFootImpl
	 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightFoot()
	 * @generated
	 */
	int RIGHT_FOOT = 22;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__X = POSITIONED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__Y = POSITIONED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__Z = POSITIONED_ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__INCOMING_LINKS = POSITIONED_ELEMENT__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__OUTGOING_LINKS = POSITIONED_ELEMENT__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__COLOR_R = POSITIONED_ELEMENT__COLOR_R;

	/**
	 * The feature id for the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__COLOR_G = POSITIONED_ELEMENT__COLOR_G;

	/**
	 * The feature id for the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT__COLOR_B = POSITIONED_ELEMENT__COLOR_B;

	/**
	 * The number of structural features of the '<em>Right Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FOOT_FEATURE_COUNT = POSITIONED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.PositionedElement <em>Positioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Element</em>'.
	 * @see org.jnect.bodymodel.PositionedElement
	 * @generated
	 */
	EClass getPositionedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getX()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_X();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getY()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getZ()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_Z();

	/**
	 * Returns the meta object for the reference list '{@link org.jnect.bodymodel.PositionedElement#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getIncomingLinks()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.jnect.bodymodel.PositionedElement#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getOutgoingLinks()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EReference getPositionedElement_OutgoingLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getColor_r <em>Color r</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color r</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getColor_r()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_Color_r();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getColor_g <em>Color g</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color g</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getColor_g()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_Color_g();

	/**
	 * Returns the meta object for the attribute '{@link org.jnect.bodymodel.PositionedElement#getColor_b <em>Color b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color b</em>'.
	 * @see org.jnect.bodymodel.PositionedElement#getColor_b()
	 * @see #getPositionedElement()
	 * @generated
	 */
	EAttribute getPositionedElement_Color_b();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.HumanLink <em>Human Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Link</em>'.
	 * @see org.jnect.bodymodel.HumanLink
	 * @generated
	 */
	EClass getHumanLink();

	/**
	 * Returns the meta object for the reference '{@link org.jnect.bodymodel.HumanLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.jnect.bodymodel.HumanLink#getSource()
	 * @see #getHumanLink()
	 * @generated
	 */
	EReference getHumanLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.jnect.bodymodel.HumanLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.jnect.bodymodel.HumanLink#getTarget()
	 * @see #getHumanLink()
	 * @generated
	 */
	EReference getHumanLink_Target();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.jnect.bodymodel.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.jnect.bodymodel.Body#getHead()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getCenterShoulder <em>Center Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center Shoulder</em>'.
	 * @see org.jnect.bodymodel.Body#getCenterShoulder()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_CenterShoulder();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftShoulder <em>Left Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Shoulder</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftShoulder()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftShoulder();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightShoulder <em>Right Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Shoulder</em>'.
	 * @see org.jnect.bodymodel.Body#getRightShoulder()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightShoulder();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftElbow <em>Left Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Elbow</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftElbow()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftElbow();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightElbow <em>Right Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Elbow</em>'.
	 * @see org.jnect.bodymodel.Body#getRightElbow()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightElbow();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftWrist <em>Left Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Wrist</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftWrist()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftWrist();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightWrist <em>Right Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Wrist</em>'.
	 * @see org.jnect.bodymodel.Body#getRightWrist()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightWrist();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftHand <em>Left Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftHand()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftHand();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightHand <em>Right Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand</em>'.
	 * @see org.jnect.bodymodel.Body#getRightHand()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightHand();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getSpine <em>Spine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spine</em>'.
	 * @see org.jnect.bodymodel.Body#getSpine()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Spine();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getCenterHip <em>Center Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center Hip</em>'.
	 * @see org.jnect.bodymodel.Body#getCenterHip()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_CenterHip();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftHip <em>Left Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hip</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftHip()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftHip();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightHip <em>Right Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hip</em>'.
	 * @see org.jnect.bodymodel.Body#getRightHip()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightHip();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftKnee <em>Left Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Knee</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftKnee()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftKnee();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightKnee <em>Right Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Knee</em>'.
	 * @see org.jnect.bodymodel.Body#getRightKnee()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightKnee();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftFoot <em>Left Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Foot</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftFoot()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftFoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightFoot <em>Right Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Foot</em>'.
	 * @see org.jnect.bodymodel.Body#getRightFoot()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightFoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnect.bodymodel.Body#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.jnect.bodymodel.Body#getLinks()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getLeftAnkle <em>Left Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Ankle</em>'.
	 * @see org.jnect.bodymodel.Body#getLeftAnkle()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LeftAnkle();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnect.bodymodel.Body#getRightAnkle <em>Right Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Ankle</em>'.
	 * @see org.jnect.bodymodel.Body#getRightAnkle()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_RightAnkle();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see org.jnect.bodymodel.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.CenterShoulder <em>Center Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Center Shoulder</em>'.
	 * @see org.jnect.bodymodel.CenterShoulder
	 * @generated
	 */
	EClass getCenterShoulder();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftShoulder <em>Left Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Shoulder</em>'.
	 * @see org.jnect.bodymodel.LeftShoulder
	 * @generated
	 */
	EClass getLeftShoulder();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightShoulder <em>Right Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Shoulder</em>'.
	 * @see org.jnect.bodymodel.RightShoulder
	 * @generated
	 */
	EClass getRightShoulder();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftElbow <em>Left Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Elbow</em>'.
	 * @see org.jnect.bodymodel.LeftElbow
	 * @generated
	 */
	EClass getLeftElbow();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightElbow <em>Right Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Elbow</em>'.
	 * @see org.jnect.bodymodel.RightElbow
	 * @generated
	 */
	EClass getRightElbow();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftWrist <em>Left Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Wrist</em>'.
	 * @see org.jnect.bodymodel.LeftWrist
	 * @generated
	 */
	EClass getLeftWrist();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightWrist <em>Right Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Wrist</em>'.
	 * @see org.jnect.bodymodel.RightWrist
	 * @generated
	 */
	EClass getRightWrist();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftHand <em>Left Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Hand</em>'.
	 * @see org.jnect.bodymodel.LeftHand
	 * @generated
	 */
	EClass getLeftHand();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightHand <em>Right Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Hand</em>'.
	 * @see org.jnect.bodymodel.RightHand
	 * @generated
	 */
	EClass getRightHand();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.Spine <em>Spine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spine</em>'.
	 * @see org.jnect.bodymodel.Spine
	 * @generated
	 */
	EClass getSpine();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.CenterHip <em>Center Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Center Hip</em>'.
	 * @see org.jnect.bodymodel.CenterHip
	 * @generated
	 */
	EClass getCenterHip();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftHip <em>Left Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Hip</em>'.
	 * @see org.jnect.bodymodel.LeftHip
	 * @generated
	 */
	EClass getLeftHip();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightHip <em>Right Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Hip</em>'.
	 * @see org.jnect.bodymodel.RightHip
	 * @generated
	 */
	EClass getRightHip();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftKnee <em>Left Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Knee</em>'.
	 * @see org.jnect.bodymodel.LeftKnee
	 * @generated
	 */
	EClass getLeftKnee();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightKnee <em>Right Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Knee</em>'.
	 * @see org.jnect.bodymodel.RightKnee
	 * @generated
	 */
	EClass getRightKnee();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftAnkle <em>Left Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Ankle</em>'.
	 * @see org.jnect.bodymodel.LeftAnkle
	 * @generated
	 */
	EClass getLeftAnkle();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightAnkle <em>Right Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Ankle</em>'.
	 * @see org.jnect.bodymodel.RightAnkle
	 * @generated
	 */
	EClass getRightAnkle();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.LeftFoot <em>Left Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Foot</em>'.
	 * @see org.jnect.bodymodel.LeftFoot
	 * @generated
	 */
	EClass getLeftFoot();

	/**
	 * Returns the meta object for class '{@link org.jnect.bodymodel.RightFoot <em>Right Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Foot</em>'.
	 * @see org.jnect.bodymodel.RightFoot
	 * @generated
	 */
	EClass getRightFoot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BodymodelFactory getBodymodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.PositionedElementImpl <em>Positioned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.PositionedElementImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getPositionedElement()
		 * @generated
		 */
		EClass POSITIONED_ELEMENT = eINSTANCE.getPositionedElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__X = eINSTANCE.getPositionedElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__Y = eINSTANCE.getPositionedElement_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__Z = eINSTANCE.getPositionedElement_Z();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__INCOMING_LINKS = eINSTANCE.getPositionedElement_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED_ELEMENT__OUTGOING_LINKS = eINSTANCE.getPositionedElement_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Color r</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__COLOR_R = eINSTANCE.getPositionedElement_Color_r();

		/**
		 * The meta object literal for the '<em><b>Color g</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__COLOR_G = eINSTANCE.getPositionedElement_Color_g();

		/**
		 * The meta object literal for the '<em><b>Color b</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED_ELEMENT__COLOR_B = eINSTANCE.getPositionedElement_Color_b();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.HumanLinkImpl <em>Human Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.HumanLinkImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getHumanLink()
		 * @generated
		 */
		EClass HUMAN_LINK = eINSTANCE.getHumanLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_LINK__SOURCE = eINSTANCE.getHumanLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_LINK__TARGET = eINSTANCE.getHumanLink_Target();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.BodyImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__HEAD = eINSTANCE.getBody_Head();

		/**
		 * The meta object literal for the '<em><b>Center Shoulder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__CENTER_SHOULDER = eINSTANCE.getBody_CenterShoulder();

		/**
		 * The meta object literal for the '<em><b>Left Shoulder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_SHOULDER = eINSTANCE.getBody_LeftShoulder();

		/**
		 * The meta object literal for the '<em><b>Right Shoulder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_SHOULDER = eINSTANCE.getBody_RightShoulder();

		/**
		 * The meta object literal for the '<em><b>Left Elbow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_ELBOW = eINSTANCE.getBody_LeftElbow();

		/**
		 * The meta object literal for the '<em><b>Right Elbow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_ELBOW = eINSTANCE.getBody_RightElbow();

		/**
		 * The meta object literal for the '<em><b>Left Wrist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_WRIST = eINSTANCE.getBody_LeftWrist();

		/**
		 * The meta object literal for the '<em><b>Right Wrist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_WRIST = eINSTANCE.getBody_RightWrist();

		/**
		 * The meta object literal for the '<em><b>Left Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_HAND = eINSTANCE.getBody_LeftHand();

		/**
		 * The meta object literal for the '<em><b>Right Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_HAND = eINSTANCE.getBody_RightHand();

		/**
		 * The meta object literal for the '<em><b>Spine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__SPINE = eINSTANCE.getBody_Spine();

		/**
		 * The meta object literal for the '<em><b>Center Hip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__CENTER_HIP = eINSTANCE.getBody_CenterHip();

		/**
		 * The meta object literal for the '<em><b>Left Hip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_HIP = eINSTANCE.getBody_LeftHip();

		/**
		 * The meta object literal for the '<em><b>Right Hip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_HIP = eINSTANCE.getBody_RightHip();

		/**
		 * The meta object literal for the '<em><b>Left Knee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_KNEE = eINSTANCE.getBody_LeftKnee();

		/**
		 * The meta object literal for the '<em><b>Right Knee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_KNEE = eINSTANCE.getBody_RightKnee();

		/**
		 * The meta object literal for the '<em><b>Left Foot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_FOOT = eINSTANCE.getBody_LeftFoot();

		/**
		 * The meta object literal for the '<em><b>Right Foot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_FOOT = eINSTANCE.getBody_RightFoot();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LINKS = eINSTANCE.getBody_Links();

		/**
		 * The meta object literal for the '<em><b>Left Ankle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEFT_ANKLE = eINSTANCE.getBody_LeftAnkle();

		/**
		 * The meta object literal for the '<em><b>Right Ankle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__RIGHT_ANKLE = eINSTANCE.getBody_RightAnkle();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.HeadImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.CenterShoulderImpl <em>Center Shoulder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.CenterShoulderImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getCenterShoulder()
		 * @generated
		 */
		EClass CENTER_SHOULDER = eINSTANCE.getCenterShoulder();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftShoulderImpl <em>Left Shoulder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftShoulderImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftShoulder()
		 * @generated
		 */
		EClass LEFT_SHOULDER = eINSTANCE.getLeftShoulder();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightShoulderImpl <em>Right Shoulder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightShoulderImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightShoulder()
		 * @generated
		 */
		EClass RIGHT_SHOULDER = eINSTANCE.getRightShoulder();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftElbowImpl <em>Left Elbow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftElbowImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftElbow()
		 * @generated
		 */
		EClass LEFT_ELBOW = eINSTANCE.getLeftElbow();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightElbowImpl <em>Right Elbow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightElbowImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightElbow()
		 * @generated
		 */
		EClass RIGHT_ELBOW = eINSTANCE.getRightElbow();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftWristImpl <em>Left Wrist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftWristImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftWrist()
		 * @generated
		 */
		EClass LEFT_WRIST = eINSTANCE.getLeftWrist();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightWristImpl <em>Right Wrist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightWristImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightWrist()
		 * @generated
		 */
		EClass RIGHT_WRIST = eINSTANCE.getRightWrist();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftHandImpl <em>Left Hand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftHandImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftHand()
		 * @generated
		 */
		EClass LEFT_HAND = eINSTANCE.getLeftHand();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightHandImpl <em>Right Hand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightHandImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightHand()
		 * @generated
		 */
		EClass RIGHT_HAND = eINSTANCE.getRightHand();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.SpineImpl <em>Spine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.SpineImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getSpine()
		 * @generated
		 */
		EClass SPINE = eINSTANCE.getSpine();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.CenterHipImpl <em>Center Hip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.CenterHipImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getCenterHip()
		 * @generated
		 */
		EClass CENTER_HIP = eINSTANCE.getCenterHip();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftHipImpl <em>Left Hip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftHipImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftHip()
		 * @generated
		 */
		EClass LEFT_HIP = eINSTANCE.getLeftHip();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightHipImpl <em>Right Hip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightHipImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightHip()
		 * @generated
		 */
		EClass RIGHT_HIP = eINSTANCE.getRightHip();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftKneeImpl <em>Left Knee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftKneeImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftKnee()
		 * @generated
		 */
		EClass LEFT_KNEE = eINSTANCE.getLeftKnee();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightKneeImpl <em>Right Knee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightKneeImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightKnee()
		 * @generated
		 */
		EClass RIGHT_KNEE = eINSTANCE.getRightKnee();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftAnkleImpl <em>Left Ankle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftAnkleImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftAnkle()
		 * @generated
		 */
		EClass LEFT_ANKLE = eINSTANCE.getLeftAnkle();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightAnkleImpl <em>Right Ankle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightAnkleImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightAnkle()
		 * @generated
		 */
		EClass RIGHT_ANKLE = eINSTANCE.getRightAnkle();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.LeftFootImpl <em>Left Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.LeftFootImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getLeftFoot()
		 * @generated
		 */
		EClass LEFT_FOOT = eINSTANCE.getLeftFoot();

		/**
		 * The meta object literal for the '{@link org.jnect.bodymodel.impl.RightFootImpl <em>Right Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnect.bodymodel.impl.RightFootImpl
		 * @see org.jnect.bodymodel.impl.BodymodelPackageImpl#getRightFoot()
		 * @generated
		 */
		EClass RIGHT_FOOT = eINSTANCE.getRightFoot();

	}

} //BodymodelPackage
