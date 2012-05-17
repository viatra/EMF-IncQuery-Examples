package school.school;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.school.SchoolMatch;
import school.school.SchoolMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SchoolMatcher in a type-safe way.
 * 
 * @see SchoolMatcher
 * @see SchoolMatch
 * 
 */
public class SchoolMatcherFactory extends BaseGeneratedMatcherFactory<SchoolMatch,SchoolMatcher> {
  @Override
  protected SchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new SchoolMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "School_example_incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.school";
    
  }
}
