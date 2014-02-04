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
    querySpecifications.add(SampleQueryMatcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityMatcher.querySpecification());
    querySpecifications.add(EClassAttributeMatcher.querySpecification());
    querySpecifications.add(EReferenceWithOneMultiplicityNameMatcher.querySpecification());
    querySpecifications.add(EObjectMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementNameMatcher.querySpecification());
    querySpecifications.add(SampleQuery2Matcher.querySpecification());
    querySpecifications.add(EClassWithEStringAttributeMatcher.querySpecification());
    querySpecifications.add(IsEStringMatcher.querySpecification());
    querySpecifications.add(IsInECoreMatcher.querySpecification());
    querySpecifications.add(EClassNameMatcher.querySpecification());
    querySpecifications.add(EClassMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfNameMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementMatcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithOneMultiplicityMatcher.querySpecification());
    
  }
}
