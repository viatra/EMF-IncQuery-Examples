package school;

/**
 * @model
 */
public interface SpecialisationCourse extends Course {
	/**
	 * @model
	 */
	String getSpecialisation();

	/**
	 * Sets the value of the '{@link school.SpecialisationCourse#getSpecialisation <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' attribute.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(String value);
	
}
