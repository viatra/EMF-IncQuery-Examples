/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getDependencyType()
 * @model
 * @generated
 */
public enum DependencyType implements Enumerator {
	/**
	 * The '<em><b>METHOD CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_CALL(1, "METHOD_CALL", "METHOD_CALL"),

	/**
	 * The '<em><b>FIELD REF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_REF_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD_REF(2, "FIELD_REF", "FIELD_REF"),

	/**
	 * The '<em><b>CLASS DEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_DEF_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_DEF(4, "CLASS_DEF", "CLASS_DEF"),

	/**
	 * The '<em><b>INHERITANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERITANCE(8, "INHERITANCE", "INHERITANCE"),

	/**
	 * The '<em><b>OVERRIDED FUNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERRIDED_FUNC_VALUE
	 * @generated
	 * @ordered
	 */
	OVERRIDED_FUNC(16, "OVERRIDED_FUNC", "OVERRIDED_FUNC"), /**
	 * The '<em><b>CLASS INHERITANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_INHERITANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_INHERITANCE(32, "CLASS_INHERITANCE", "CLASS_INHERITANCE"), /**
	 * The '<em><b>CLASS USAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_USAGE(64, "CLASS_USAGE", "CLASS_USAGE");

	/**
	 * The '<em><b>METHOD CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD CALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_CALL_VALUE = 1;

	/**
	 * The '<em><b>FIELD REF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIELD REF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD_REF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_REF_VALUE = 2;

	/**
	 * The '<em><b>CLASS DEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS DEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_DEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_DEF_VALUE = 4;

	/**
	 * The '<em><b>INHERITANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERITANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERITANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INHERITANCE_VALUE = 8;

	/**
	 * The '<em><b>OVERRIDED FUNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERRIDED FUNC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERRIDED_FUNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERRIDED_FUNC_VALUE = 16;

	/**
	 * The '<em><b>CLASS INHERITANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS INHERITANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_INHERITANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_INHERITANCE_VALUE = 32;

	/**
	 * The '<em><b>CLASS USAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS USAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_USAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_USAGE_VALUE = 64;

	/**
	 * An array of all the '<em><b>Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DependencyType[] VALUES_ARRAY =
		new DependencyType[] {
			METHOD_CALL,
			FIELD_REF,
			CLASS_DEF,
			INHERITANCE,
			OVERRIDED_FUNC,
			CLASS_INHERITANCE,
			CLASS_USAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DependencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType get(int value) {
		switch (value) {
			case METHOD_CALL_VALUE: return METHOD_CALL;
			case FIELD_REF_VALUE: return FIELD_REF;
			case CLASS_DEF_VALUE: return CLASS_DEF;
			case INHERITANCE_VALUE: return INHERITANCE;
			case OVERRIDED_FUNC_VALUE: return OVERRIDED_FUNC;
			case CLASS_INHERITANCE_VALUE: return CLASS_INHERITANCE;
			case CLASS_USAGE_VALUE: return CLASS_USAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DependencyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DependencyType
