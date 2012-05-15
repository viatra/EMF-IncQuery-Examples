/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soamodel.RestMethod#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link soamodel.RestMethod#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see soamodel.SoamodelPackage#getRestMethod()
 * @model
 * @generated
 */
public interface RestMethod extends ServiceMethod {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link soamodel.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see soamodel.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see soamodel.SoamodelPackage#getRestMethod_HttpMethod()
	 * @model required="true"
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link soamodel.RestMethod#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see soamodel.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see soamodel.SoamodelPackage#getRestMethod_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link soamodel.RestMethod#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // RestMethod
