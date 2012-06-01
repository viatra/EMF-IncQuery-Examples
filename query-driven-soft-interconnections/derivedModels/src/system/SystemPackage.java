/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package system;

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
 * @see system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://system/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "system";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link system.impl.ResourceElementImpl <em>Resource Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.ResourceElementImpl
	 * @see system.impl.SystemPackageImpl#getResourceElement()
	 * @generated
	 */
	int RESOURCE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link system.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.SystemImpl
	 * @see system.impl.SystemPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDES = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USES = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINS = RESOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DATA = RESOURCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link system.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.InterfaceImpl
	 * @see system.impl.SystemPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PROVIDER = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__USER = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link system.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.JobImpl
	 * @see system.impl.SystemPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Runs On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNS_ON = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CALLS = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TASK_IDS = RESOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TASKS = RESOURCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__INFO = RESOURCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link system.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.DataImpl
	 * @see system.impl.SystemPackageImpl#getData()
	 * @generated
	 */
	int DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reading Task Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__READING_TASK_IDS = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writing Task Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__WRITING_TASK_IDS = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Writing Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__WRITING_TASK = RESOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reading Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__READING_TASK = RESOURCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link system.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see system.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link system.System#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see system.System#getProvides()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Provides();

	/**
	 * Returns the meta object for the reference list '{@link system.System#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see system.System#getUses()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link system.System#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see system.System#getContains()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link system.System#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see system.System#getData()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Data();

	/**
	 * Returns the meta object for class '{@link system.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see system.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the container reference '{@link system.Interface#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Provider</em>'.
	 * @see system.Interface#getProvider()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Provider();

	/**
	 * Returns the meta object for the reference list '{@link system.Interface#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see system.Interface#getUser()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_User();

	/**
	 * Returns the meta object for class '{@link system.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see system.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the reference '{@link system.Job#getRunsOn <em>Runs On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runs On</em>'.
	 * @see system.Job#getRunsOn()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_RunsOn();

	/**
	 * Returns the meta object for the reference list '{@link system.Job#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls</em>'.
	 * @see system.Job#getCalls()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Calls();

	/**
	 * Returns the meta object for the attribute list '{@link system.Job#getTaskIds <em>Task Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Task Ids</em>'.
	 * @see system.Job#getTaskIds()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_TaskIds();

	/**
	 * Returns the meta object for the reference list '{@link system.Job#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see system.Job#getTasks()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link system.Job#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Info</em>'.
	 * @see system.Job#getInfo()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Info();

	/**
	 * Returns the meta object for class '{@link system.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see system.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute list '{@link system.Data#getReadingTaskIds <em>Reading Task Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reading Task Ids</em>'.
	 * @see system.Data#getReadingTaskIds()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_ReadingTaskIds();

	/**
	 * Returns the meta object for the attribute list '{@link system.Data#getWritingTaskIds <em>Writing Task Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Writing Task Ids</em>'.
	 * @see system.Data#getWritingTaskIds()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_WritingTaskIds();

	/**
	 * Returns the meta object for the reference list '{@link system.Data#getWritingTask <em>Writing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writing Task</em>'.
	 * @see system.Data#getWritingTask()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_WritingTask();

	/**
	 * Returns the meta object for the reference list '{@link system.Data#getReadingTask <em>Reading Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reading Task</em>'.
	 * @see system.Data#getReadingTask()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_ReadingTask();

	/**
	 * Returns the meta object for class '{@link system.ResourceElement <em>Resource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Element</em>'.
	 * @see system.ResourceElement
	 * @generated
	 */
	EClass getResourceElement();

	/**
	 * Returns the meta object for the attribute '{@link system.ResourceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see system.ResourceElement#getName()
	 * @see #getResourceElement()
	 * @generated
	 */
	EAttribute getResourceElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

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
		 * The meta object literal for the '{@link system.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.SystemImpl
		 * @see system.impl.SystemPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDES = eINSTANCE.getSystem_Provides();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__USES = eINSTANCE.getSystem_Uses();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTAINS = eINSTANCE.getSystem_Contains();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__DATA = eINSTANCE.getSystem_Data();

		/**
		 * The meta object literal for the '{@link system.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.InterfaceImpl
		 * @see system.impl.SystemPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PROVIDER = eINSTANCE.getInterface_Provider();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__USER = eINSTANCE.getInterface_User();

		/**
		 * The meta object literal for the '{@link system.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.JobImpl
		 * @see system.impl.SystemPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Runs On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__RUNS_ON = eINSTANCE.getJob_RunsOn();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CALLS = eINSTANCE.getJob_Calls();

		/**
		 * The meta object literal for the '<em><b>Task Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TASK_IDS = eINSTANCE.getJob_TaskIds();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TASKS = eINSTANCE.getJob_Tasks();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__INFO = eINSTANCE.getJob_Info();

		/**
		 * The meta object literal for the '{@link system.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.DataImpl
		 * @see system.impl.SystemPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Reading Task Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__READING_TASK_IDS = eINSTANCE.getData_ReadingTaskIds();

		/**
		 * The meta object literal for the '<em><b>Writing Task Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__WRITING_TASK_IDS = eINSTANCE.getData_WritingTaskIds();

		/**
		 * The meta object literal for the '<em><b>Writing Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__WRITING_TASK = eINSTANCE.getData_WritingTask();

		/**
		 * The meta object literal for the '<em><b>Reading Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__READING_TASK = eINSTANCE.getData_ReadingTask();

		/**
		 * The meta object literal for the '{@link system.impl.ResourceElementImpl <em>Resource Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.ResourceElementImpl
		 * @see system.impl.SystemPackageImpl#getResourceElement()
		 * @generated
		 */
		EClass RESOURCE_ELEMENT = eINSTANCE.getResourceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ELEMENT__NAME = eINSTANCE.getResourceElement_Name();

	}

} //SystemPackage
