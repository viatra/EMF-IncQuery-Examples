package school.insameschooldifferentyears;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.insameschooldifferentyears.InSameSchoolDifferentYearsMatch;
import school.insameschooldifferentyears.InSameSchoolDifferentYearsMatcher;

/**
 * A pattern-specific matcher factory that can instantiate InSameSchoolDifferentYearsMatcher in a type-safe way.
 * 
 * @see InSameSchoolDifferentYearsMatcher
 * @see InSameSchoolDifferentYearsMatch
 * 
 */
public class InSameSchoolDifferentYearsMatcherFactory extends BaseGeneratedMatcherFactory<InSameSchoolDifferentYearsMatch,InSameSchoolDifferentYearsMatcher> {
  @Override
  protected InSameSchoolDifferentYearsMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new InSameSchoolDifferentYearsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery.istvan";
    
  }
  
  @Override
  protected String patternName() {
    return "school.inSameSchoolDifferentYears";
    
  }
}
