/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelPackage#getHttpMethod()
 * @model
 * @generated
 */
public final class HttpMethod extends AbstractEnumerator {
	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET = 0;

	/**
	 * The '<em><b>POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST = 1;

	/**
	 * The '<em><b>PUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUT = 2;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE = 3;

	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @generated
	 * @ordered
	 */
	public static final HttpMethod GET_LITERAL = new HttpMethod(GET, "GET", "GET");

	/**
	 * The '<em><b>POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST
	 * @generated
	 * @ordered
	 */
	public static final HttpMethod POST_LITERAL = new HttpMethod(POST, "POST", "POST");

	/**
	 * The '<em><b>PUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUT
	 * @generated
	 * @ordered
	 */
	public static final HttpMethod PUT_LITERAL = new HttpMethod(PUT, "PUT", "PUT");

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @generated
	 * @ordered
	 */
	public static final HttpMethod DELETE_LITERAL = new HttpMethod(DELETE, "DELETE", "DELETE");

	/**
	 * An array of all the '<em><b>Http Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HttpMethod[] VALUES_ARRAY =
		new HttpMethod[] {
			GET_LITERAL,
			POST_LITERAL,
			PUT_LITERAL,
			DELETE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Http Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Http Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HttpMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HttpMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HttpMethod get(int value) {
		switch (value) {
			case GET: return GET_LITERAL;
			case POST: return POST_LITERAL;
			case PUT: return PUT_LITERAL;
			case DELETE: return DELETE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HttpMethod(int value, String name, String literal) {
		super(value, name, literal);
	}

} //HttpMethod
