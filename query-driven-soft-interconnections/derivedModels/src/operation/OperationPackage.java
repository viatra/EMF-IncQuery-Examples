/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see operation.OperationFactory
 * @model kind="package"
 * @generated
 */
public interface OperationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://operation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationPackage eINSTANCE = operation.impl.OperationPackageImpl.init();

	/**
	 * The meta object id for the '{@link operation.impl.OperationElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operation.impl.OperationElementImpl
	 * @see operation.impl.OperationPackageImpl#getOperationElement()
	 * @generated
	 */
	int OPERATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link operation.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operation.impl.MenuItemImpl
	 * @see operation.impl.OperationPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ID = OPERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__NAME = OPERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__DESCRIPTION = OPERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__LOCATION = OPERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = OPERATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link operation.impl.RuntimeInformationImpl <em>Runtime Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operation.impl.RuntimeInformationImpl
	 * @see operation.impl.OperationPackageImpl#getRuntimeInformation()
	 * @generated
	 */
	int RUNTIME_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__ID = OPERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__NAME = OPERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__CONTENTS = OPERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION_FEATURE_COUNT = OPERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link operation.impl.ChecklistEntryImpl <em>Checklist Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operation.impl.ChecklistEntryImpl
	 * @see operation.impl.OperationPackageImpl#getChecklistEntry()
	 * @generated
	 */
	int CHECKLIST_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__ID = OPERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__NAME = OPERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__MENU = OPERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__INFO = OPERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__TASK_ID = OPERATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__JOB_PATHS = OPERATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__TASK = OPERATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY__JOBS = OPERATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Checklist Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_ENTRY_FEATURE_COUNT = OPERATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link operation.impl.ChecklistImpl <em>Checklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operation.impl.ChecklistImpl
	 * @see operation.impl.OperationPackageImpl#getChecklist()
	 * @generated
	 */
	int CHECKLIST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__ID = OPERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__NAME = OPERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__ENTRIES = OPERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__MENU = OPERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__PROCESS = OPERATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST__PROCESS_ID = OPERATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Checklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKLIST_FEATURE_COUNT = OPERATION_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link operation.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see operation.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the attribute '{@link operation.MenuItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see operation.MenuItem#getDescription()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link operation.MenuItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see operation.MenuItem#getLocation()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_Location();

	/**
	 * Returns the meta object for class '{@link operation.RuntimeInformation <em>Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Information</em>'.
	 * @see operation.RuntimeInformation
	 * @generated
	 */
	EClass getRuntimeInformation();

	/**
	 * Returns the meta object for the attribute '{@link operation.RuntimeInformation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see operation.RuntimeInformation#getContents()
	 * @see #getRuntimeInformation()
	 * @generated
	 */
	EAttribute getRuntimeInformation_Contents();

	/**
	 * Returns the meta object for class '{@link operation.ChecklistEntry <em>Checklist Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checklist Entry</em>'.
	 * @see operation.ChecklistEntry
	 * @generated
	 */
	EClass getChecklistEntry();

	/**
	 * Returns the meta object for the reference '{@link operation.ChecklistEntry#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu</em>'.
	 * @see operation.ChecklistEntry#getMenu()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EReference getChecklistEntry_Menu();

	/**
	 * Returns the meta object for the attribute '{@link operation.ChecklistEntry#getTaskId <em>Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Id</em>'.
	 * @see operation.ChecklistEntry#getTaskId()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EAttribute getChecklistEntry_TaskId();

	/**
	 * Returns the meta object for the attribute list '{@link operation.ChecklistEntry#getJobPaths <em>Job Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Job Paths</em>'.
	 * @see operation.ChecklistEntry#getJobPaths()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EAttribute getChecklistEntry_JobPaths();

	/**
	 * Returns the meta object for the reference '{@link operation.ChecklistEntry#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see operation.ChecklistEntry#getTask()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EReference getChecklistEntry_Task();

	/**
	 * Returns the meta object for the reference list '{@link operation.ChecklistEntry#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jobs</em>'.
	 * @see operation.ChecklistEntry#getJobs()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EReference getChecklistEntry_Jobs();

	/**
	 * Returns the meta object for the containment reference '{@link operation.ChecklistEntry#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see operation.ChecklistEntry#getInfo()
	 * @see #getChecklistEntry()
	 * @generated
	 */
	EReference getChecklistEntry_Info();

	/**
	 * Returns the meta object for class '{@link operation.Checklist <em>Checklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checklist</em>'.
	 * @see operation.Checklist
	 * @generated
	 */
	EClass getChecklist();

	/**
	 * Returns the meta object for the containment reference list '{@link operation.Checklist#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see operation.Checklist#getEntries()
	 * @see #getChecklist()
	 * @generated
	 */
	EReference getChecklist_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link operation.Checklist#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see operation.Checklist#getMenu()
	 * @see #getChecklist()
	 * @generated
	 */
	EReference getChecklist_Menu();

	/**
	 * Returns the meta object for the reference '{@link operation.Checklist#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see operation.Checklist#getProcess()
	 * @see #getChecklist()
	 * @generated
	 */
	EReference getChecklist_Process();

	/**
	 * Returns the meta object for the attribute '{@link operation.Checklist#getProcessId <em>Process Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see operation.Checklist#getProcessId()
	 * @see #getChecklist()
	 * @generated
	 */
	EAttribute getChecklist_ProcessId();

	/**
	 * Returns the meta object for class '{@link operation.OperationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see operation.OperationElement
	 * @generated
	 */
	EClass getOperationElement();

	/**
	 * Returns the meta object for the attribute '{@link operation.OperationElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see operation.OperationElement#getId()
	 * @see #getOperationElement()
	 * @generated
	 */
	EAttribute getOperationElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link operation.OperationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see operation.OperationElement#getName()
	 * @see #getOperationElement()
	 * @generated
	 */
	EAttribute getOperationElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationFactory getOperationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link operation.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operation.impl.MenuItemImpl
		 * @see operation.impl.OperationPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__DESCRIPTION = eINSTANCE.getMenuItem_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__LOCATION = eINSTANCE.getMenuItem_Location();

		/**
		 * The meta object literal for the '{@link operation.impl.RuntimeInformationImpl <em>Runtime Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operation.impl.RuntimeInformationImpl
		 * @see operation.impl.OperationPackageImpl#getRuntimeInformation()
		 * @generated
		 */
		EClass RUNTIME_INFORMATION = eINSTANCE.getRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFORMATION__CONTENTS = eINSTANCE.getRuntimeInformation_Contents();

		/**
		 * The meta object literal for the '{@link operation.impl.ChecklistEntryImpl <em>Checklist Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operation.impl.ChecklistEntryImpl
		 * @see operation.impl.OperationPackageImpl#getChecklistEntry()
		 * @generated
		 */
		EClass CHECKLIST_ENTRY = eINSTANCE.getChecklistEntry();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST_ENTRY__MENU = eINSTANCE.getChecklistEntry_Menu();

		/**
		 * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKLIST_ENTRY__TASK_ID = eINSTANCE.getChecklistEntry_TaskId();

		/**
		 * The meta object literal for the '<em><b>Job Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKLIST_ENTRY__JOB_PATHS = eINSTANCE.getChecklistEntry_JobPaths();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST_ENTRY__TASK = eINSTANCE.getChecklistEntry_Task();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST_ENTRY__JOBS = eINSTANCE.getChecklistEntry_Jobs();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST_ENTRY__INFO = eINSTANCE.getChecklistEntry_Info();

		/**
		 * The meta object literal for the '{@link operation.impl.ChecklistImpl <em>Checklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operation.impl.ChecklistImpl
		 * @see operation.impl.OperationPackageImpl#getChecklist()
		 * @generated
		 */
		EClass CHECKLIST = eINSTANCE.getChecklist();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST__ENTRIES = eINSTANCE.getChecklist_Entries();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST__MENU = eINSTANCE.getChecklist_Menu();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKLIST__PROCESS = eINSTANCE.getChecklist_Process();

		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKLIST__PROCESS_ID = eINSTANCE.getChecklist_ProcessId();

		/**
		 * The meta object literal for the '{@link operation.impl.OperationElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operation.impl.OperationElementImpl
		 * @see operation.impl.OperationPackageImpl#getOperationElement()
		 * @generated
		 */
		EClass OPERATION_ELEMENT = eINSTANCE.getOperationElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ELEMENT__ID = eINSTANCE.getOperationElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ELEMENT__NAME = eINSTANCE.getOperationElement_Name();

	}

} //OperationPackage
