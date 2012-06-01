/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Activity#getParent <em>Parent</em>}</li>
 *   <li>{@link process.Activity#getNext <em>Next</em>}</li>
 *   <li>{@link process.Activity#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link process.Process#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(process.Process)
	 * @see process.ProcessPackage#getActivity_Parent()
	 * @see process.Process#getContents
	 * @model opposite="contents" required="true" transient="false"
	 * @generated
	 */
	process.Process getParent();

	/**
	 * Sets the value of the '{@link process.Activity#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(process.Process value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link process.Activity}.
	 * It is bidirectional and its opposite is '{@link process.Activity#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see process.ProcessPackage#getActivity_Next()
	 * @see process.Activity#getPrevious
	 * @model type="process.Activity" opposite="previous"
	 * @generated
	 */
	EList getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link process.Activity}.
	 * It is bidirectional and its opposite is '{@link process.Activity#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see process.ProcessPackage#getActivity_Previous()
	 * @see process.Activity#getNext
	 * @model type="process.Activity" opposite="next"
	 * @generated
	 */
	EList getPrevious();

} // Activity
