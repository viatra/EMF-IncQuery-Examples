/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.GraphElement#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see domain.DomainPackage#getGraphElement_Uuid()
	 * @model id="true" required="true"
	 *        annotation="ExtendedMetaData name='uuid' namespace='http://cern.ch/be/co/devtools-deps-analysis/2.0.0'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link domain.GraphElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // GraphElement
