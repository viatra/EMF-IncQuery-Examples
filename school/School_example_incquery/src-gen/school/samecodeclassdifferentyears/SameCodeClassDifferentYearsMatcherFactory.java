package school.samecodeclassdifferentyears;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.samecodeclassdifferentyears.SameCodeClassDifferentYearsMatch;
import school.samecodeclassdifferentyears.SameCodeClassDifferentYearsMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SameCodeClassDifferentYearsMatcher in a type-safe way.
 * 
 * @see SameCodeClassDifferentYearsMatcher
 * @see SameCodeClassDifferentYearsMatch
 * 
 */
public class SameCodeClassDifferentYearsMatcherFactory extends BaseGeneratedMatcherFactory<SameCodeClassDifferentYearsMatch,SameCodeClassDifferentYearsMatcher> {
  @Override
  protected SameCodeClassDifferentYearsMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new SameCodeClassDifferentYearsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "School_example_incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.sameCodeClassDifferentYears";
    
  }
}
