package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EClassAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EObjectMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.IsEStringMatcher;
import hu.bme.mit.incquery.ecorequeries.example.IsInECoreMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.SampleQueryMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassNameQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.ECoreNamedElementNameQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.ECoreNamedElementQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EObjectQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityNameQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityNameQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsEStringQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsInECoreQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.SampleQuery2QuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.SampleQueryQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.SuperTypeOfNameQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.SuperTypeOfQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in ecoreQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file ecoreQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.incquery.ecorequeries.example, the group contains the definition of the following patterns: <ul>
 * <li>EObject</li>
 * <li>EClass</li>
 * <li>EClassName</li>
 * <li>SuperTypeOf</li>
 * <li>SuperTypeOfName</li>
 * <li>EClassAttribute</li>
 * <li>EClassWithEStringAttribute</li>
 * <li>EReferenceWithStarMultiplicity</li>
 * <li>EReferenceWithStarMultiplicityName</li>
 * <li>EReferenceWithOneMultiplicity</li>
 * <li>EReferenceWithOneMultiplicityName</li>
 * <li>SampleQuery</li>
 * <li>SampleQuery2</li>
 * <li>IsEString</li>
 * <li>ECoreNamedElement</li>
 * <li>ECoreNamedElementName</li>
 * <li>IsInECore</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class EcoreQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EcoreQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new EcoreQueries();
    }
    return INSTANCE;
  }
  
  private static EcoreQueries INSTANCE;
  
  private EcoreQueries() throws IncQueryException {
    querySpecifications.add(EObjectQuerySpecification.instance());
    querySpecifications.add(EClassQuerySpecification.instance());
    querySpecifications.add(EClassNameQuerySpecification.instance());
    querySpecifications.add(SuperTypeOfQuerySpecification.instance());
    querySpecifications.add(SuperTypeOfNameQuerySpecification.instance());
    querySpecifications.add(EClassAttributeQuerySpecification.instance());
    querySpecifications.add(EClassWithEStringAttributeQuerySpecification.instance());
    querySpecifications.add(EReferenceWithStarMultiplicityQuerySpecification.instance());
    querySpecifications.add(EReferenceWithStarMultiplicityNameQuerySpecification.instance());
    querySpecifications.add(EReferenceWithOneMultiplicityQuerySpecification.instance());
    querySpecifications.add(EReferenceWithOneMultiplicityNameQuerySpecification.instance());
    querySpecifications.add(SampleQueryQuerySpecification.instance());
    querySpecifications.add(SampleQuery2QuerySpecification.instance());
    querySpecifications.add(IsEStringQuerySpecification.instance());
    querySpecifications.add(ECoreNamedElementQuerySpecification.instance());
    querySpecifications.add(ECoreNamedElementNameQuerySpecification.instance());
    querySpecifications.add(IsInECoreQuerySpecification.instance());
  }
  
  public EObjectQuerySpecification getEObject() throws IncQueryException {
    return EObjectQuerySpecification.instance();
  }
  
  public EObjectMatcher getEObject(final IncQueryEngine engine) throws IncQueryException {
    return EObjectMatcher.on(engine);
  }
  
  public EClassQuerySpecification getEClass() throws IncQueryException {
    return EClassQuerySpecification.instance();
  }
  
  public EClassMatcher getEClass(final IncQueryEngine engine) throws IncQueryException {
    return EClassMatcher.on(engine);
  }
  
  public EClassNameQuerySpecification getEClassName() throws IncQueryException {
    return EClassNameQuerySpecification.instance();
  }
  
  public EClassNameMatcher getEClassName(final IncQueryEngine engine) throws IncQueryException {
    return EClassNameMatcher.on(engine);
  }
  
  public SuperTypeOfQuerySpecification getSuperTypeOf() throws IncQueryException {
    return SuperTypeOfQuerySpecification.instance();
  }
  
  public SuperTypeOfMatcher getSuperTypeOf(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfMatcher.on(engine);
  }
  
  public SuperTypeOfNameQuerySpecification getSuperTypeOfName() throws IncQueryException {
    return SuperTypeOfNameQuerySpecification.instance();
  }
  
  public SuperTypeOfNameMatcher getSuperTypeOfName(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfNameMatcher.on(engine);
  }
  
  public EClassAttributeQuerySpecification getEClassAttribute() throws IncQueryException {
    return EClassAttributeQuerySpecification.instance();
  }
  
  public EClassAttributeMatcher getEClassAttribute(final IncQueryEngine engine) throws IncQueryException {
    return EClassAttributeMatcher.on(engine);
  }
  
  public EClassWithEStringAttributeQuerySpecification getEClassWithEStringAttribute() throws IncQueryException {
    return EClassWithEStringAttributeQuerySpecification.instance();
  }
  
  public EClassWithEStringAttributeMatcher getEClassWithEStringAttribute(final IncQueryEngine engine) throws IncQueryException {
    return EClassWithEStringAttributeMatcher.on(engine);
  }
  
  public EReferenceWithStarMultiplicityQuerySpecification getEReferenceWithStarMultiplicity() throws IncQueryException {
    return EReferenceWithStarMultiplicityQuerySpecification.instance();
  }
  
  public EReferenceWithStarMultiplicityMatcher getEReferenceWithStarMultiplicity(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithStarMultiplicityMatcher.on(engine);
  }
  
  public EReferenceWithStarMultiplicityNameQuerySpecification getEReferenceWithStarMultiplicityName() throws IncQueryException {
    return EReferenceWithStarMultiplicityNameQuerySpecification.instance();
  }
  
  public EReferenceWithStarMultiplicityNameMatcher getEReferenceWithStarMultiplicityName(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithStarMultiplicityNameMatcher.on(engine);
  }
  
  public EReferenceWithOneMultiplicityQuerySpecification getEReferenceWithOneMultiplicity() throws IncQueryException {
    return EReferenceWithOneMultiplicityQuerySpecification.instance();
  }
  
  public EReferenceWithOneMultiplicityMatcher getEReferenceWithOneMultiplicity(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityMatcher.on(engine);
  }
  
  public EReferenceWithOneMultiplicityNameQuerySpecification getEReferenceWithOneMultiplicityName() throws IncQueryException {
    return EReferenceWithOneMultiplicityNameQuerySpecification.instance();
  }
  
  public EReferenceWithOneMultiplicityNameMatcher getEReferenceWithOneMultiplicityName(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityNameMatcher.on(engine);
  }
  
  public SampleQueryQuerySpecification getSampleQuery() throws IncQueryException {
    return SampleQueryQuerySpecification.instance();
  }
  
  public SampleQueryMatcher getSampleQuery(final IncQueryEngine engine) throws IncQueryException {
    return SampleQueryMatcher.on(engine);
  }
  
  public SampleQuery2QuerySpecification getSampleQuery2() throws IncQueryException {
    return SampleQuery2QuerySpecification.instance();
  }
  
  public SampleQuery2Matcher getSampleQuery2(final IncQueryEngine engine) throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
  }
  
  public IsEStringQuerySpecification getIsEString() throws IncQueryException {
    return IsEStringQuerySpecification.instance();
  }
  
  public IsEStringMatcher getIsEString(final IncQueryEngine engine) throws IncQueryException {
    return IsEStringMatcher.on(engine);
  }
  
  public ECoreNamedElementQuerySpecification getECoreNamedElement() throws IncQueryException {
    return ECoreNamedElementQuerySpecification.instance();
  }
  
  public ECoreNamedElementMatcher getECoreNamedElement(final IncQueryEngine engine) throws IncQueryException {
    return ECoreNamedElementMatcher.on(engine);
  }
  
  public ECoreNamedElementNameQuerySpecification getECoreNamedElementName() throws IncQueryException {
    return ECoreNamedElementNameQuerySpecification.instance();
  }
  
  public ECoreNamedElementNameMatcher getECoreNamedElementName(final IncQueryEngine engine) throws IncQueryException {
    return ECoreNamedElementNameMatcher.on(engine);
  }
  
  public IsInECoreQuerySpecification getIsInECore() throws IncQueryException {
    return IsInECoreQuerySpecification.instance();
  }
  
  public IsInECoreMatcher getIsInECore(final IncQueryEngine engine) throws IncQueryException {
    return IsInECoreMatcher.on(engine);
  }
}
