/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package operation.impl;

import operation.Checklist;
import operation.ChecklistEntry;
import operation.MenuItem;
import operation.OperationElement;
import operation.OperationFactory;
import operation.OperationPackage;
import operation.RuntimeInformation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationFactoryImpl extends EFactoryImpl implements OperationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationFactory init() {
		try {
			OperationFactory theOperationFactory = (OperationFactory)EPackage.Registry.INSTANCE.getEFactory("http://operation/1.0"); 
			if (theOperationFactory != null) {
				return theOperationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationPackage.MENU_ITEM: return createMenuItem();
			case OperationPackage.RUNTIME_INFORMATION: return createRuntimeInformation();
			case OperationPackage.CHECKLIST_ENTRY: return createChecklistEntry();
			case OperationPackage.CHECKLIST: return createChecklist();
			case OperationPackage.OPERATION_ELEMENT: return createOperationElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInformation createRuntimeInformation() {
		RuntimeInformationImpl runtimeInformation = new RuntimeInformationImpl();
		return runtimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecklistEntry createChecklistEntry() {
		ChecklistEntryImpl checklistEntry = new ChecklistEntryImpl();
		return checklistEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checklist createChecklist() {
		ChecklistImpl checklist = new ChecklistImpl();
		return checklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationElement createOperationElement() {
		OperationElementImpl operationElement = new OperationElementImpl();
		return operationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPackage getOperationPackage() {
		return (OperationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static OperationPackage getPackage() {
		return OperationPackage.eINSTANCE;
	}

} //OperationFactoryImpl
