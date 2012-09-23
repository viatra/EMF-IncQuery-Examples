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
 * A representation of the model object '<em><b>Positioned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getX <em>X</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getY <em>Y</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getZ <em>Z</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getColor_r <em>Color r</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getColor_g <em>Color g</em>}</li>
 *   <li>{@link org.jnect.bodymodel.PositionedElement#getColor_b <em>Color b</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement()
 * @model abstract="true"
 * @generated
 */
public interface PositionedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_X()
	 * @model
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_Y()
	 * @model
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(float)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_Z()
	 * @model
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link org.jnect.bodymodel.HumanLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_IncomingLinks()
	 * @model
	 * @generated
	 */
	EList<HumanLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link org.jnect.bodymodel.HumanLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_OutgoingLinks()
	 * @model
	 * @generated
	 */
	EList<HumanLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Color r</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color r</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color r</em>' attribute.
	 * @see #setColor_r(int)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_Color_r()
	 * @model
	 * @generated
	 */
	int getColor_r();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getColor_r <em>Color r</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color r</em>' attribute.
	 * @see #getColor_r()
	 * @generated
	 */
	void setColor_r(int value);

	/**
	 * Returns the value of the '<em><b>Color g</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color g</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color g</em>' attribute.
	 * @see #setColor_g(int)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_Color_g()
	 * @model
	 * @generated
	 */
	int getColor_g();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getColor_g <em>Color g</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color g</em>' attribute.
	 * @see #getColor_g()
	 * @generated
	 */
	void setColor_g(int value);

	/**
	 * Returns the value of the '<em><b>Color b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color b</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color b</em>' attribute.
	 * @see #setColor_b(int)
	 * @see org.jnect.bodymodel.BodymodelPackage#getPositionedElement_Color_b()
	 * @model
	 * @generated
	 */
	int getColor_b();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.PositionedElement#getColor_b <em>Color b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color b</em>' attribute.
	 * @see #getColor_b()
	 * @generated
	 */
	void setColor_b(int value);

} // PositionedElement
