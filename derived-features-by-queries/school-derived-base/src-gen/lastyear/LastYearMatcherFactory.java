package lastyear;

import lastyear.LastYearMatch;
import lastyear.LastYearMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;

/**
 * A pattern-specific matcher factory that can instantiate LastYearMatcher in a type-safe way.
 * 
 * @see LastYearMatcher
 * @see LastYearMatch
 * 
 */
public class LastYearMatcherFactory extends BaseGeneratedMatcherFactory<LastYearMatch,LastYearMatcher> {
  @Override
  protected LastYearMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new LastYearMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school-derived-base";
    
  }
  
  @Override
  protected String patternName() {
    return "lastYear";
    
  }
}
