/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package process;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process.ProcessPackage#getTaskKind()
 * @model
 * @generated
 */
public final class TaskKind extends AbstractEnumerator {
	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_LITERAL
	 * @model name="user"
	 * @generated
	 * @ordered
	 */
	public static final int USER = 0;

	/**
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_LITERAL
	 * @model name="manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL = 1;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_LITERAL
	 * @model name="service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE = 2;

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @generated
	 * @ordered
	 */
	public static final TaskKind USER_LITERAL = new TaskKind(USER, "user", "user");

	/**
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @generated
	 * @ordered
	 */
	public static final TaskKind MANUAL_LITERAL = new TaskKind(MANUAL, "manual", "manual");

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @generated
	 * @ordered
	 */
	public static final TaskKind SERVICE_LITERAL = new TaskKind(SERVICE, "service", "service");

	/**
	 * An array of all the '<em><b>Task Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskKind[] VALUES_ARRAY =
		new TaskKind[] {
			USER_LITERAL,
			MANUAL_LITERAL,
			SERVICE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskKind get(int value) {
		switch (value) {
			case USER: return USER_LITERAL;
			case MANUAL: return MANUAL_LITERAL;
			case SERVICE: return SERVICE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TaskKind
