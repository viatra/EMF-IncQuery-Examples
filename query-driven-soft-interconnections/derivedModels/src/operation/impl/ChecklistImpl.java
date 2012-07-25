/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation.impl;

import java.util.Collection;

import operation.Checklist;
import operation.ChecklistEntry;
import operation.MenuItem;
import operation.OperationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.viatra2.emf.incquery.runtime.derived.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link operation.impl.ChecklistImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link operation.impl.ChecklistImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link operation.impl.ChecklistImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link operation.impl.ChecklistImpl#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChecklistImpl extends OperationElementImpl implements Checklist {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList entries;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList menu;

	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected String processId = PROCESS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChecklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OperationPackage.Literals.CHECKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList(ChecklistEntry.class, this, OperationPackage.CHECKLIST__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList(MenuItem.class, this, OperationPackage.CHECKLIST__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Process getProcess() {
		process.Process process = basicGetProcess();
		return process != null && process.eIsProxy() ? (process.Process)eResolveProxy((InternalEObject)process) : process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Process basicGetProcessGen() {
		// TODO: implement this method to return the 'Process' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessId(String newProcessId) {
		String oldProcessId = processId;
		processId = newProcessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.CHECKLIST__PROCESS_ID, oldProcessId, processId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationPackage.CHECKLIST__ENTRIES:
				return ((InternalEList)getEntries()).basicRemove(otherEnd, msgs);
			case OperationPackage.CHECKLIST__MENU:
				return ((InternalEList)getMenu()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.CHECKLIST__ENTRIES:
				return getEntries();
			case OperationPackage.CHECKLIST__MENU:
				return getMenu();
			case OperationPackage.CHECKLIST__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case OperationPackage.CHECKLIST__PROCESS_ID:
				return getProcessId();
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
			case OperationPackage.CHECKLIST__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection)newValue);
				return;
			case OperationPackage.CHECKLIST__MENU:
				getMenu().clear();
				getMenu().addAll((Collection)newValue);
				return;
			case OperationPackage.CHECKLIST__PROCESS_ID:
				setProcessId((String)newValue);
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
			case OperationPackage.CHECKLIST__ENTRIES:
				getEntries().clear();
				return;
			case OperationPackage.CHECKLIST__MENU:
				getMenu().clear();
				return;
			case OperationPackage.CHECKLIST__PROCESS_ID:
				setProcessId(PROCESS_ID_EDEFAULT);
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
			case OperationPackage.CHECKLIST__ENTRIES:
				return entries != null && !entries.isEmpty();
			case OperationPackage.CHECKLIST__MENU:
				return menu != null && !menu.isEmpty();
			case OperationPackage.CHECKLIST__PROCESS:
				return basicGetProcess() != null;
			case OperationPackage.CHECKLIST__PROCESS_ID:
				return PROCESS_ID_EDEFAULT == null ? processId != null : !PROCESS_ID_EDEFAULT.equals(processId);
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
		result.append(" (processId: ");
		result.append(processId);
		result.append(')');
		return result.toString();
	}

	/**
	 * EMF-IncQuery handler for derived feature process
	 */
	private IncqueryFeatureHandler processHandler;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @derived getter created by EMF-IncQuery for derived feature process
	 */
	public process.Process basicGetProcess() {
		if (processHandler == null) {
			processHandler = IncqueryFeatureHelper.createHandler(this,
					OperationPackageImpl.Literals.CHECKLIST__PROCESS,
					"operation.queries.ChecklistProcessCorrespondence",
					"Checklist", "Process", FeatureKind.SINGLE_REFERENCE, true);
		}
		return (process.Process) IncqueryFeatureHelper
				.getSingleReferenceValueForHandler(processHandler, this,
						OperationPackageImpl.Literals.CHECKLIST__PROCESS);
	}

} //ChecklistImpl
