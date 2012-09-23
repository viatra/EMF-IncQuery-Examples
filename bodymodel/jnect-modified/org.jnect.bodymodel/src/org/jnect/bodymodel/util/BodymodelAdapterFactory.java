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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jnect.bodymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jnect.bodymodel.BodymodelPackage
 * @generated
 */
public class BodymodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BodymodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodymodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BodymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodymodelSwitch<Adapter> modelSwitch =
		new BodymodelSwitch<Adapter>() {
			@Override
			public Adapter casePositionedElement(PositionedElement object) {
				return createPositionedElementAdapter();
			}
			@Override
			public Adapter caseHumanLink(HumanLink object) {
				return createHumanLinkAdapter();
			}
			@Override
			public Adapter caseBody(Body object) {
				return createBodyAdapter();
			}
			@Override
			public Adapter caseHead(Head object) {
				return createHeadAdapter();
			}
			@Override
			public Adapter caseCenterShoulder(CenterShoulder object) {
				return createCenterShoulderAdapter();
			}
			@Override
			public Adapter caseLeftShoulder(LeftShoulder object) {
				return createLeftShoulderAdapter();
			}
			@Override
			public Adapter caseRightShoulder(RightShoulder object) {
				return createRightShoulderAdapter();
			}
			@Override
			public Adapter caseLeftElbow(LeftElbow object) {
				return createLeftElbowAdapter();
			}
			@Override
			public Adapter caseRightElbow(RightElbow object) {
				return createRightElbowAdapter();
			}
			@Override
			public Adapter caseLeftWrist(LeftWrist object) {
				return createLeftWristAdapter();
			}
			@Override
			public Adapter caseRightWrist(RightWrist object) {
				return createRightWristAdapter();
			}
			@Override
			public Adapter caseLeftHand(LeftHand object) {
				return createLeftHandAdapter();
			}
			@Override
			public Adapter caseRightHand(RightHand object) {
				return createRightHandAdapter();
			}
			@Override
			public Adapter caseSpine(Spine object) {
				return createSpineAdapter();
			}
			@Override
			public Adapter caseCenterHip(CenterHip object) {
				return createCenterHipAdapter();
			}
			@Override
			public Adapter caseLeftHip(LeftHip object) {
				return createLeftHipAdapter();
			}
			@Override
			public Adapter caseRightHip(RightHip object) {
				return createRightHipAdapter();
			}
			@Override
			public Adapter caseLeftKnee(LeftKnee object) {
				return createLeftKneeAdapter();
			}
			@Override
			public Adapter caseRightKnee(RightKnee object) {
				return createRightKneeAdapter();
			}
			@Override
			public Adapter caseLeftAnkle(LeftAnkle object) {
				return createLeftAnkleAdapter();
			}
			@Override
			public Adapter caseRightAnkle(RightAnkle object) {
				return createRightAnkleAdapter();
			}
			@Override
			public Adapter caseLeftFoot(LeftFoot object) {
				return createLeftFootAdapter();
			}
			@Override
			public Adapter caseRightFoot(RightFoot object) {
				return createRightFootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.PositionedElement <em>Positioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.PositionedElement
	 * @generated
	 */
	public Adapter createPositionedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.HumanLink <em>Human Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.HumanLink
	 * @generated
	 */
	public Adapter createHumanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.Head
	 * @generated
	 */
	public Adapter createHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.CenterShoulder <em>Center Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.CenterShoulder
	 * @generated
	 */
	public Adapter createCenterShoulderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftShoulder <em>Left Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftShoulder
	 * @generated
	 */
	public Adapter createLeftShoulderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightShoulder <em>Right Shoulder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightShoulder
	 * @generated
	 */
	public Adapter createRightShoulderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftElbow <em>Left Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftElbow
	 * @generated
	 */
	public Adapter createLeftElbowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightElbow <em>Right Elbow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightElbow
	 * @generated
	 */
	public Adapter createRightElbowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftWrist <em>Left Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftWrist
	 * @generated
	 */
	public Adapter createLeftWristAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightWrist <em>Right Wrist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightWrist
	 * @generated
	 */
	public Adapter createRightWristAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftHand <em>Left Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftHand
	 * @generated
	 */
	public Adapter createLeftHandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightHand <em>Right Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightHand
	 * @generated
	 */
	public Adapter createRightHandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.Spine <em>Spine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.Spine
	 * @generated
	 */
	public Adapter createSpineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.CenterHip <em>Center Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.CenterHip
	 * @generated
	 */
	public Adapter createCenterHipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftHip <em>Left Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftHip
	 * @generated
	 */
	public Adapter createLeftHipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightHip <em>Right Hip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightHip
	 * @generated
	 */
	public Adapter createRightHipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftKnee <em>Left Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftKnee
	 * @generated
	 */
	public Adapter createLeftKneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightKnee <em>Right Knee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightKnee
	 * @generated
	 */
	public Adapter createRightKneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftAnkle <em>Left Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftAnkle
	 * @generated
	 */
	public Adapter createLeftAnkleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightAnkle <em>Right Ankle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightAnkle
	 * @generated
	 */
	public Adapter createRightAnkleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.LeftFoot <em>Left Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.LeftFoot
	 * @generated
	 */
	public Adapter createLeftFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jnect.bodymodel.RightFoot <em>Right Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jnect.bodymodel.RightFoot
	 * @generated
	 */
	public Adapter createRightFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BodymodelAdapterFactory
