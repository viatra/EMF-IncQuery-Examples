/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import school.School;
import school.SchoolClass;
import school.SchoolPackage;
import school.Year;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.impl.YearImpl#getStartingDate <em>Starting Date</em>}</li>
 *   <li>{@link school.impl.YearImpl#getSchool <em>School</em>}</li>
 *   <li>{@link school.impl.YearImpl#getSchoolClasses <em>School Classes</em>}</li>
 *   <li>{@link school.impl.YearImpl#getWeightOfRegularCourses <em>Weight Of Regular Courses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YearImpl extends EObjectImpl implements Year {
	/**
   * The default value of the '{@link #getStartingDate() <em>Starting Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStartingDate()
   * @generated
   * @ordered
   */
	protected static final int STARTING_DATE_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getStartingDate() <em>Starting Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStartingDate()
   * @generated
   * @ordered
   */
	protected int startingDate = STARTING_DATE_EDEFAULT;

	/**
   * The cached value of the '{@link #getSchoolClasses() <em>School Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSchoolClasses()
   * @generated
   * @ordered
   */
	protected EList<SchoolClass> schoolClasses;

	/**
   * The default value of the '{@link #getWeightOfRegularCourses() <em>Weight Of Regular Courses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightOfRegularCourses()
   * @generated
   * @ordered
   */
  protected static final int WEIGHT_OF_REGULAR_COURSES_EDEFAULT = 0;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected YearImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SchoolPackage.Literals.YEAR;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getStartingDate() {
    return startingDate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStartingDate(int newStartingDate) {
    int oldStartingDate = startingDate;
    startingDate = newStartingDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.YEAR__STARTING_DATE, oldStartingDate, startingDate));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public School getSchool() {
    if (eContainerFeatureID() != SchoolPackage.YEAR__SCHOOL) return null;
    return (School)eContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newSchool, SchoolPackage.YEAR__SCHOOL, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSchool(School newSchool) {
    if (newSchool != eInternalContainer() || (eContainerFeatureID() != SchoolPackage.YEAR__SCHOOL && newSchool != null)) {
      if (EcoreUtil.isAncestor(this, newSchool))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSchool != null)
        msgs = ((InternalEObject)newSchool).eInverseAdd(this, SchoolPackage.SCHOOL__YEARS, School.class, msgs);
      msgs = basicSetSchool(newSchool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.YEAR__SCHOOL, newSchool, newSchool));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<SchoolClass> getSchoolClasses() {
    if (schoolClasses == null) {
      schoolClasses = new EObjectContainmentWithInverseEList<SchoolClass>(SchoolClass.class, this, SchoolPackage.YEAR__SCHOOL_CLASSES, SchoolPackage.SCHOOL_CLASS__YEAR);
    }
    return schoolClasses;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWeightOfRegularCoursesGen() {
    // TODO: implement this method to return the 'Weight Of Regular Courses' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SchoolPackage.YEAR__SCHOOL:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSchool((School)otherEnd, msgs);
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchoolClasses()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case SchoolPackage.YEAR__SCHOOL:
        return basicSetSchool(null, msgs);
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        return ((InternalEList<?>)getSchoolClasses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case SchoolPackage.YEAR__SCHOOL:
        return eInternalContainer().eInverseRemove(this, SchoolPackage.SCHOOL__YEARS, School.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SchoolPackage.YEAR__STARTING_DATE:
        return getStartingDate();
      case SchoolPackage.YEAR__SCHOOL:
        return getSchool();
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        return getSchoolClasses();
      case SchoolPackage.YEAR__WEIGHT_OF_REGULAR_COURSES:
        return getWeightOfRegularCourses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case SchoolPackage.YEAR__STARTING_DATE:
        setStartingDate((Integer)newValue);
        return;
      case SchoolPackage.YEAR__SCHOOL:
        setSchool((School)newValue);
        return;
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        getSchoolClasses().clear();
        getSchoolClasses().addAll((Collection<? extends SchoolClass>)newValue);
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
      case SchoolPackage.YEAR__STARTING_DATE:
        setStartingDate(STARTING_DATE_EDEFAULT);
        return;
      case SchoolPackage.YEAR__SCHOOL:
        setSchool((School)null);
        return;
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        getSchoolClasses().clear();
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
      case SchoolPackage.YEAR__STARTING_DATE:
        return startingDate != STARTING_DATE_EDEFAULT;
      case SchoolPackage.YEAR__SCHOOL:
        return getSchool() != null;
      case SchoolPackage.YEAR__SCHOOL_CLASSES:
        return schoolClasses != null && !schoolClasses.isEmpty();
      case SchoolPackage.YEAR__WEIGHT_OF_REGULAR_COURSES:
        return getWeightOfRegularCourses() != WEIGHT_OF_REGULAR_COURSES_EDEFAULT;
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
    result.append(" (startingDate: ");
    result.append(startingDate);
    result.append(')');
    return result.toString();
  }

	/**
	 * EMF-IncQuery handler for derived feature weightOfRegularCourses
	 */
	private IncqueryFeatureHandler weightOfRegularCoursesHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-InccQuery for derived feature weightOfRegularCourses
	 */
	public int getWeightOfRegularCourses() {
		if (weightOfRegularCoursesHandler != null) {
			return weightOfRegularCoursesHandler.getIntValue();
		} else {
			weightOfRegularCoursesHandler = IncqueryFeatureHelper
					.createHandler(
							this,
							SchoolPackageImpl.Literals.YEAR__WEIGHT_OF_REGULAR_COURSES,
							"courseWeights", "Y", "W", FeatureKind.SUM);
			if (weightOfRegularCoursesHandler != null) {
				return weightOfRegularCoursesHandler.getIntValue();
			}
		}
		return 0;
	}

} //YearImpl
