/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.viatra2.emf.incquery.runtime.derived.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

import system.Interface;
import system.Job;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.JobImpl#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link system.impl.JobImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link system.impl.JobImpl#getTaskIds <em>Task Ids</em>}</li>
 *   <li>{@link system.impl.JobImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link system.impl.JobImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobImpl extends ResourceElementImpl implements Job {
	/**
	 * The cached value of the '{@link #getRunsOn() <em>Runs On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOn()
	 * @generated
	 * @ordered
	 */
	protected system.System runsOn;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList calls;

	/**
	 * The cached value of the '{@link #getTaskIds() <em>Task Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskIds()
	 * @generated
	 * @ordered
	 */
	protected EList taskIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SystemPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public system.System getRunsOn() {
		if (runsOn != null && runsOn.eIsProxy()) {
			InternalEObject oldRunsOn = (InternalEObject)runsOn;
			runsOn = (system.System)eResolveProxy(oldRunsOn);
			if (runsOn != oldRunsOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.JOB__RUNS_ON, oldRunsOn, runsOn));
			}
		}
		return runsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public system.System basicGetRunsOn() {
		return runsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunsOn(system.System newRunsOn) {
		system.System oldRunsOn = runsOn;
		runsOn = newRunsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.JOB__RUNS_ON, oldRunsOn, runsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCalls() {
		if (calls == null) {
			calls = new EObjectResolvingEList(Interface.class, this, SystemPackage.JOB__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTaskIds() {
		if (taskIds == null) {
			taskIds = new EDataTypeUniqueEList(String.class, this, SystemPackage.JOB__TASK_IDS);
		}
		return taskIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTasksGen() {
		// TODO: implement this method to return the 'Tasks' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInfoGen() {
		// TODO: implement this method to return the 'Info' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.JOB__RUNS_ON:
				if (resolve) return getRunsOn();
				return basicGetRunsOn();
			case SystemPackage.JOB__CALLS:
				return getCalls();
			case SystemPackage.JOB__TASK_IDS:
				return getTaskIds();
			case SystemPackage.JOB__TASKS:
				return getTasks();
			case SystemPackage.JOB__INFO:
				return getInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.JOB__RUNS_ON:
				setRunsOn((system.System)newValue);
				return;
			case SystemPackage.JOB__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection)newValue);
				return;
			case SystemPackage.JOB__TASK_IDS:
				getTaskIds().clear();
				getTaskIds().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.JOB__RUNS_ON:
				setRunsOn((system.System)null);
				return;
			case SystemPackage.JOB__CALLS:
				getCalls().clear();
				return;
			case SystemPackage.JOB__TASK_IDS:
				getTaskIds().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.JOB__RUNS_ON:
				return runsOn != null;
			case SystemPackage.JOB__CALLS:
				return calls != null && !calls.isEmpty();
			case SystemPackage.JOB__TASK_IDS:
				return taskIds != null && !taskIds.isEmpty();
			case SystemPackage.JOB__TASKS:
				return !getTasks().isEmpty();
			case SystemPackage.JOB__INFO:
				return !getInfo().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (taskIds: ");
		result.append(taskIds);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for derived feature tasks
	 */
	private IncqueryFeatureHandler tasksHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-IncQuery for derived feature tasks
	 */
	public EList getTasks() {
		if (tasksHandler == null) {
			tasksHandler = IncqueryFeatureHelper.createHandler(this,
					SystemPackageImpl.Literals.JOB__TASKS,
					"system.queries.JobTaskCorrespondence", "Job", "Task",
					FeatureKind.MANY_REFERENCE, true);
		}
		return IncqueryFeatureHelper.getManyReferenceValueForHandler(
				tasksHandler, this, SystemPackageImpl.Literals.JOB__TASKS);
	}

	/**
	 * EMF-IncQuery handler for derived feature info
	 */
	private IncqueryFeatureHandler infoHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-IncQuery for derived feature info
	 */
	public EList getInfo() {
		if (infoHandler == null) {
			infoHandler = IncqueryFeatureHelper.createHandler(this,
					SystemPackageImpl.Literals.JOB__INFO,
					"system.queries.JobInfoCorrespondence", "Job", "Info",
					FeatureKind.MANY_REFERENCE, true);
		}
		return IncqueryFeatureHelper.getManyReferenceValueForHandler(
				infoHandler, this, SystemPackageImpl.Literals.JOB__INFO);
	}

} //JobImpl
