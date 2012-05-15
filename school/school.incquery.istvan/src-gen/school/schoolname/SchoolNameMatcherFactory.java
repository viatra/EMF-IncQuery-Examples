package school.schoolname;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.schoolname.SchoolNameMatch;
import school.schoolname.SchoolNameMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SchoolNameMatcher in a type-safe way.
 * 
 * @see SchoolNameMatcher
 * @see SchoolNameMatch
 * 
 */
public class SchoolNameMatcherFactory extends BaseGeneratedMatcherFactory<SchoolNameMatch,SchoolNameMatcher> {
  @Override
  protected SchoolNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new SchoolNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery.istvan";
    
  }
  
  @Override
  protected String patternName() {
    return "school.schoolName";
    
  }
}
