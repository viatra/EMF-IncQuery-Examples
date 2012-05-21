/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package soamodel.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import soamodel.Attribute;
import soamodel.BuiltInDataType;
import soamodel.CSharpComponent;
import soamodel.CollectionType;
import soamodel.DataType;
import soamodel.Entity;
import soamodel.EnumLiteral;
import soamodel.HttpMethod;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see soamodel.SoamodelPackage
 * @generated
 */
public class SoamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SoamodelValidator INSTANCE = new SoamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "soamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return SoamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case SoamodelPackage.SERVICE_COMPONENT:
				return validateServiceComponent((ServiceComponent)value, diagnostics, context);
			case SoamodelPackage.CSHARP_COMPONENT:
				return validateCSharpComponent((CSharpComponent)value, diagnostics, context);
			case SoamodelPackage.JEE_COMPONENT:
				return validateJEEComponent((JEEComponent)value, diagnostics, context);
			case SoamodelPackage.SERVICE_METHOD:
				return validateServiceMethod((ServiceMethod)value, diagnostics, context);
			case SoamodelPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case SoamodelPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case SoamodelPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case SoamodelPackage.BUILT_IN_DATA_TYPE:
				return validateBuiltInDataType((BuiltInDataType)value, diagnostics, context);
			case SoamodelPackage.COLLECTION_TYPE:
				return validateCollectionType((CollectionType)value, diagnostics, context);
			case SoamodelPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case SoamodelPackage.SERVICE_ORIENTED_ARCHITECTURE:
				return validateServiceOrientedArchitecture((ServiceOrientedArchitecture)value, diagnostics, context);
			case SoamodelPackage.OCL_CONSTRAINT:
				return validateOCLConstraint((OCLConstraint)value, diagnostics, context);
			case SoamodelPackage.ENUM:
				return validateEnum((soamodel.Enum)value, diagnostics, context);
			case SoamodelPackage.ENUM_LITERAL:
				return validateEnumLiteral((EnumLiteral)value, diagnostics, context);
			case SoamodelPackage.OS_GI_COMPONENT:
				return validateOSGiComponent((OSGiComponent)value, diagnostics, context);
			case SoamodelPackage.OCL_POSTCONDITION:
				return validateOCLPostcondition((OCLPostcondition)value, diagnostics, context);
			case SoamodelPackage.OCL_DATA_CONSTRAINT:
				return validateOCLDataConstraint((OCLDataConstraint)value, diagnostics, context);
			case SoamodelPackage.OCL_PRECONDITION:
				return validateOCLPrecondition((OCLPrecondition)value, diagnostics, context);
			case SoamodelPackage.REST_METHOD:
				return validateRestMethod((RestMethod)value, diagnostics, context);
			case SoamodelPackage.HTTP_METHOD:
				return validateHttpMethod((HttpMethod)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceComponent(ServiceComponent serviceComponent, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueServiceMethodSignatures(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_LivingComponent(serviceComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueSCURINamespace(serviceComponent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueServiceMethodSignatures constraint of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceComponent_UniqueServiceMethodSignatures(ServiceComponent serviceComponent, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueServiceMethodSignatures", getObjectLabel(serviceComponent, context) }),
						 new Object[] { serviceComponent }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LivingComponent constraint of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceComponent_LivingComponent(ServiceComponent serviceComponent, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "LivingComponent", getObjectLabel(serviceComponent, context) }),
						 new Object[] { serviceComponent }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueSCURINamespace constraint of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceComponent_UniqueSCURINamespace(ServiceComponent serviceComponent, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueSCURINamespace", getObjectLabel(serviceComponent, context) }),
						 new Object[] { serviceComponent }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCSharpComponent(CSharpComponent cSharpComponent, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueServiceMethodSignatures(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_LivingComponent(cSharpComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueSCURINamespace(cSharpComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJEEComponent(JEEComponent jeeComponent, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueServiceMethodSignatures(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_LivingComponent(jeeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueSCURINamespace(jeeComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMethod(ServiceMethod serviceMethod, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_FilledMethodDescription(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_OnlyRestMethods(serviceMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_DifferentParameternames(serviceMethod, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FilledMethodDescription constraint of '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMethod_FilledMethodDescription(ServiceMethod serviceMethod, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FilledMethodDescription", getObjectLabel(serviceMethod, context) }),
						 new Object[] { serviceMethod }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OnlyRestMethods constraint of '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMethod_OnlyRestMethods(ServiceMethod serviceMethod, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "OnlyRestMethods", getObjectLabel(serviceMethod, context) }),
						 new Object[] { serviceMethod }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DifferentParameternames constraint of '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMethod_DifferentParameternames(ServiceMethod serviceMethod, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "DifferentParameternames", getObjectLabel(serviceMethod, context) }),
						 new Object[] { serviceMethod }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_uniqueEntityNames(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_singleAttributeNameInEntity(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_InternalIDAttribute(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueEntityNames constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueEntityNames(Entity entity, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueEntityNames", getObjectLabel(entity, context) }),
						 new Object[] { entity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the singleAttributeNameInEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_singleAttributeNameInEntity(Entity entity, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "singleAttributeNameInEntity", getObjectLabel(entity, context) }),
						 new Object[] { entity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the InternalIDAttribute constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_InternalIDAttribute(Entity entity, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "InternalIDAttribute", getObjectLabel(entity, context) }),
						 new Object[] { entity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInDataType(BuiltInDataType builtInDataType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(builtInDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType(CollectionType collectionType, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionType_existingCollectionItem(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionType_UniqueItemType(collectionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the existingCollectionItem constraint of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType_existingCollectionItem(CollectionType collectionType, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "existingCollectionItem", getObjectLabel(collectionType, context) }),
						 new Object[] { collectionType }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueItemType constraint of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType_UniqueItemType(CollectionType collectionType, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueItemType", getObjectLabel(collectionType, context) }),
						 new Object[] { collectionType }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOrientedArchitecture(ServiceOrientedArchitecture serviceOrientedArchitecture, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceOrientedArchitecture_uniqueDatatypeNames(serviceOrientedArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceOrientedArchitecture_uniqueComponentNames(serviceOrientedArchitecture, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueDatatypeNames constraint of '<em>Service Oriented Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOrientedArchitecture_uniqueDatatypeNames(ServiceOrientedArchitecture serviceOrientedArchitecture, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueDatatypeNames", getObjectLabel(serviceOrientedArchitecture, context) }),
						 new Object[] { serviceOrientedArchitecture }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the uniqueComponentNames constraint of '<em>Service Oriented Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOrientedArchitecture_uniqueComponentNames(ServiceOrientedArchitecture serviceOrientedArchitecture, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueComponentNames", getObjectLabel(serviceOrientedArchitecture, context) }),
						 new Object[] { serviceOrientedArchitecture }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLConstraint(OCLConstraint oclConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oclConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLConstraint_FilledOCLDescription(oclConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FilledOCLDescription constraint of '<em>OCL Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLConstraint_FilledOCLDescription(OCLConstraint oclConstraint, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "FilledOCLDescription", getObjectLabel(oclConstraint, context) }),
						 new Object[] { oclConstraint }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum(soamodel.Enum enum_, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnum_UniqueLiteralNames(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnum_LivingDataType(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnum_UniqueLiteralValues(enum_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueLiteralNames constraint of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum_UniqueLiteralNames(soamodel.Enum enum_, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueLiteralNames", getObjectLabel(enum_, context) }),
						 new Object[] { enum_ }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LivingDataType constraint of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum_LivingDataType(soamodel.Enum enum_, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "LivingDataType", getObjectLabel(enum_, context) }),
						 new Object[] { enum_ }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueLiteralValues constraint of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum_UniqueLiteralValues(soamodel.Enum enum_, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "UniqueLiteralValues", getObjectLabel(enum_, context) }),
						 new Object[] { enum_ }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteral(EnumLiteral enumLiteral, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(enumLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSGiComponent(OSGiComponent osGiComponent, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueServiceMethodSignatures(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_LivingComponent(osGiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceComponent_UniqueSCURINamespace(osGiComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPostcondition(OCLPostcondition oclPostcondition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oclPostcondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclPostcondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclPostcondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclPostcondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclPostcondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLConstraint_FilledOCLDescription(oclPostcondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLDataConstraint(OCLDataConstraint oclDataConstraint, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oclDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLConstraint_FilledOCLDescription(oclDataConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPrecondition(OCLPrecondition oclPrecondition, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(oclPrecondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclPrecondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclPrecondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclPrecondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclPrecondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLConstraint_FilledOCLDescription(oclPrecondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestMethod(RestMethod restMethod, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_FilledMethodDescription(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_OnlyRestMethods(restMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceMethod_DifferentParameternames(restMethod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethod(HttpMethod httpMethod, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //SoamodelValidator
