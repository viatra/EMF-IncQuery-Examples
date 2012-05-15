package school.samecodeclassdifferentyearsbetter;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.samecodeclassdifferentyearsbetter.SameCodeClassDifferentYearsBetterMatch;
import school.samecodeclassdifferentyearsbetter.SameCodeClassDifferentYearsBetterMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SameCodeClassDifferentYearsBetterMatcher in a type-safe way.
 * 
 * @see SameCodeClassDifferentYearsBetterMatcher
 * @see SameCodeClassDifferentYearsBetterMatch
 * 
 */
public class SameCodeClassDifferentYearsBetterMatcherFactory extends BaseGeneratedMatcherFactory<SameCodeClassDifferentYearsBetterMatch,SameCodeClassDifferentYearsBetterMatcher> {
  @Override
  protected SameCodeClassDifferentYearsBetterMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new SameCodeClassDifferentYearsBetterMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery.istvan";
    
  }
  
  @Override
  protected String patternName() {
    return "school.sameCodeClassDifferentYearsBetter";
    
  }
}
