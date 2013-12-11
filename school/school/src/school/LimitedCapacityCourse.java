/**
 */
package school;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limited Capacity Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.LimitedCapacityCourse#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.SchoolPackage#getLimitedCapacityCourse()
 * @model
 * @generated
 */
public interface LimitedCapacityCourse extends Course {
    /**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see school.SchoolPackage#getLimitedCapacityCourse_Capacity()
	 * @model
	 * @generated
	 */
    int getCapacity();

    /**
	 * Sets the value of the '{@link school.LimitedCapacityCourse#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
    void setCapacity(int value);

} // LimitedCapacityCourse
