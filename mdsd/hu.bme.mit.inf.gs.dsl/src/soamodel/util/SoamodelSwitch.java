/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelPackage
 * @generated
 */
public class SoamodelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SoamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SoamodelPackage.SERVICE_COMPONENT: {
				ServiceComponent serviceComponent = (ServiceComponent)theEObject;
				Object result = caseServiceComponent(serviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.CSHARP_COMPONENT: {
				CSharpComponent cSharpComponent = (CSharpComponent)theEObject;
				Object result = caseCSharpComponent(cSharpComponent);
				if (result == null) result = caseServiceComponent(cSharpComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.JEE_COMPONENT: {
				JEEComponent jeeComponent = (JEEComponent)theEObject;
				Object result = caseJEEComponent(jeeComponent);
				if (result == null) result = caseServiceComponent(jeeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.SERVICE_METHOD: {
				ServiceMethod serviceMethod = (ServiceMethod)theEObject;
				Object result = caseServiceMethod(serviceMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				Object result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				Object result = caseEntity(entity);
				if (result == null) result = caseDataType(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.BUILT_IN_DATA_TYPE: {
				BuiltInDataType builtInDataType = (BuiltInDataType)theEObject;
				Object result = caseBuiltInDataType(builtInDataType);
				if (result == null) result = caseDataType(builtInDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				Object result = caseCollectionType(collectionType);
				if (result == null) result = caseDataType(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE: {
				ServiceOrientedArchitecture serviceOrientedArchitecture = (ServiceOrientedArchitecture)theEObject;
				Object result = caseServiceOrientedArchitecture(serviceOrientedArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.OCL_CONSTRAINT: {
				OCLConstraint oclConstraint = (OCLConstraint)theEObject;
				Object result = caseOCLConstraint(oclConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.ENUM: {
				soamodel.Enum enum_ = (soamodel.Enum)theEObject;
				Object result = caseEnum(enum_);
				if (result == null) result = caseDataType(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				Object result = caseEnumLiteral(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.OS_GI_COMPONENT: {
				OSGiComponent osGiComponent = (OSGiComponent)theEObject;
				Object result = caseOSGiComponent(osGiComponent);
				if (result == null) result = caseServiceComponent(osGiComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.OCL_POSTCONDITION: {
				OCLPostcondition oclPostcondition = (OCLPostcondition)theEObject;
				Object result = caseOCLPostcondition(oclPostcondition);
				if (result == null) result = caseOCLConstraint(oclPostcondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.OCL_DATA_CONSTRAINT: {
				OCLDataConstraint oclDataConstraint = (OCLDataConstraint)theEObject;
				Object result = caseOCLDataConstraint(oclDataConstraint);
				if (result == null) result = caseOCLConstraint(oclDataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.OCL_PRECONDITION: {
				OCLPrecondition oclPrecondition = (OCLPrecondition)theEObject;
				Object result = caseOCLPrecondition(oclPrecondition);
				if (result == null) result = caseOCLConstraint(oclPrecondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoamodelPackage.REST_METHOD: {
				RestMethod restMethod = (RestMethod)theEObject;
				Object result = caseRestMethod(restMethod);
				if (result == null) result = caseServiceMethod(restMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceComponent(ServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCSharpComponent(CSharpComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JEE Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JEE Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJEEComponent(JEEComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceMethod(ServiceMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBuiltInDataType(BuiltInDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Oriented Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Oriented Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceOrientedArchitecture(ServiceOrientedArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOCLConstraint(OCLConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnum(soamodel.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Gi Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Gi Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOSGiComponent(OSGiComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Postcondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOCLPostcondition(OCLPostcondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOCLDataConstraint(OCLDataConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOCLPrecondition(OCLPrecondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRestMethod(RestMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SoamodelSwitch
