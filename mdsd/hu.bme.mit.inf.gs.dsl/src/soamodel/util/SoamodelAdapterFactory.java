/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import soamodel.Attribute;
import soamodel.BuiltInDataType;
import soamodel.CSharpComponent;
import soamodel.CollectionType;
import soamodel.DataType;
import soamodel.Entity;
import soamodel.EnumLiteral;
import soamodel.JEEComponent;
import soamodel.OCLConstraint;
import soamodel.OCLDataConstraint;
import soamodel.OCLPostcondition;
import soamodel.OCLPrecondition;
import soamodel.OSGiComponent;
import soamodel.Parameter;
import soamodel.RestMethod;
import soamodel.ServiceComponent;
import soamodel.ServiceMethod;
import soamodel.ServiceOrientedArchitecture;
import soamodel.SoamodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelPackage
 * @generated
 */
public class SoamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoamodelSwitch modelSwitch =
		new SoamodelSwitch() {
			public Object caseServiceComponent(ServiceComponent object) {
				return createServiceComponentAdapter();
			}
			public Object caseCSharpComponent(CSharpComponent object) {
				return createCSharpComponentAdapter();
			}
			public Object caseJEEComponent(JEEComponent object) {
				return createJEEComponentAdapter();
			}
			public Object caseServiceMethod(ServiceMethod object) {
				return createServiceMethodAdapter();
			}
			public Object caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			public Object caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			public Object caseEntity(Entity object) {
				return createEntityAdapter();
			}
			public Object caseBuiltInDataType(BuiltInDataType object) {
				return createBuiltInDataTypeAdapter();
			}
			public Object caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseServiceOrientedArchitecture(ServiceOrientedArchitecture object) {
				return createServiceOrientedArchitectureAdapter();
			}
			public Object caseOCLConstraint(OCLConstraint object) {
				return createOCLConstraintAdapter();
			}
			public Object caseEnum(soamodel.Enum object) {
				return createEnumAdapter();
			}
			public Object caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			public Object caseOSGiComponent(OSGiComponent object) {
				return createOSGiComponentAdapter();
			}
			public Object caseOCLPostcondition(OCLPostcondition object) {
				return createOCLPostconditionAdapter();
			}
			public Object caseOCLDataConstraint(OCLDataConstraint object) {
				return createOCLDataConstraintAdapter();
			}
			public Object caseOCLPrecondition(OCLPrecondition object) {
				return createOCLPreconditionAdapter();
			}
			public Object caseRestMethod(RestMethod object) {
				return createRestMethodAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link soamodel.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.ServiceComponent
	 * @generated
	 */
	public Adapter createServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.CSharpComponent <em>CSharp Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.CSharpComponent
	 * @generated
	 */
	public Adapter createCSharpComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.JEEComponent <em>JEE Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.JEEComponent
	 * @generated
	 */
	public Adapter createJEEComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.ServiceMethod
	 * @generated
	 */
	public Adapter createServiceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.BuiltInDataType <em>Built In Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.BuiltInDataType
	 * @generated
	 */
	public Adapter createBuiltInDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.ServiceOrientedArchitecture <em>Service Oriented Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.ServiceOrientedArchitecture
	 * @generated
	 */
	public Adapter createServiceOrientedArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.OCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.OCLConstraint
	 * @generated
	 */
	public Adapter createOCLConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.OSGiComponent <em>OS Gi Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.OSGiComponent
	 * @generated
	 */
	public Adapter createOSGiComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.OCLPostcondition <em>OCL Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.OCLPostcondition
	 * @generated
	 */
	public Adapter createOCLPostconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.OCLDataConstraint <em>OCL Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.OCLDataConstraint
	 * @generated
	 */
	public Adapter createOCLDataConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.OCLPrecondition <em>OCL Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.OCLPrecondition
	 * @generated
	 */
	public Adapter createOCLPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link soamodel.RestMethod <em>Rest Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see soamodel.RestMethod
	 * @generated
	 */
	public Adapter createRestMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SoamodelAdapterFactory
