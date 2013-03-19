/**
 */
package stochsim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stochsim.SN#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see stochsim.StochsimPackage#getSN()
 * @model
 * @generated
 */
public interface SN extends Node {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link stochsim.SN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see stochsim.StochsimPackage#getSN_Link()
	 * @model
	 * @generated
	 */
	EList<SN> getLink();

} // SN
