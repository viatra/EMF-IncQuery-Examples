/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import school.SchoolPackage;
import school.SpecialisationCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.SpecialisationCourseImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialisationCourseImpl extends CourseImpl implements SpecialisationCourse {
	/**
     * The default value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpecialisation()
     * @generated
     * @ordered
     */
	protected static final String SPECIALISATION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSpecialisation()
     * @generated
     * @ordered
     */
	protected String specialisation = SPECIALISATION_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpecialisationCourseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SchoolPackage.Literals.SPECIALISATION_COURSE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSpecialisation() {
        return specialisation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSpecialisation(String newSpecialisation) {
        String oldSpecialisation = specialisation;
        specialisation = newSpecialisation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SPECIALISATION_COURSE__SPECIALISATION, oldSpecialisation, specialisation));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchoolPackage.SPECIALISATION_COURSE__SPECIALISATION:
                return getSpecialisation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SchoolPackage.SPECIALISATION_COURSE__SPECIALISATION:
                setSpecialisation((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SchoolPackage.SPECIALISATION_COURSE__SPECIALISATION:
                setSpecialisation(SPECIALISATION_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SchoolPackage.SPECIALISATION_COURSE__SPECIALISATION:
                return SPECIALISATION_EDEFAULT == null ? specialisation != null : !SPECIALISATION_EDEFAULT.equals(specialisation);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (specialisation: ");
        result.append(specialisation);
        result.append(')');
        return result.toString();
    }

} //SpecialisationCourseImpl
