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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnect.bodymodel.HumanLink#getSource <em>Source</em>}</li>
 *   <li>{@link org.jnect.bodymodel.HumanLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnect.bodymodel.BodymodelPackage#getHumanLink()
 * @model
 * @generated
 */
public interface HumanLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PositionedElement)
	 * @see org.jnect.bodymodel.BodymodelPackage#getHumanLink_Source()
	 * @model
	 * @generated
	 */
	PositionedElement getSource();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.HumanLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PositionedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PositionedElement)
	 * @see org.jnect.bodymodel.BodymodelPackage#getHumanLink_Target()
	 * @model
	 * @generated
	 */
	PositionedElement getTarget();

	/**
	 * Sets the value of the '{@link org.jnect.bodymodel.HumanLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PositionedElement value);

} // HumanLink
