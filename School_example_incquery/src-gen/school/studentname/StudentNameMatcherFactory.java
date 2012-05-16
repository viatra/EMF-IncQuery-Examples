package school.studentname;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.studentname.StudentNameMatch;
import school.studentname.StudentNameMatcher;

/**
 * A pattern-specific matcher factory that can instantiate StudentNameMatcher in a type-safe way.
 * 
 * @see StudentNameMatcher
 * @see StudentNameMatch
 * 
 */
public class StudentNameMatcherFactory extends BaseGeneratedMatcherFactory<StudentNameMatch,StudentNameMatcher> {
  @Override
  protected StudentNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new StudentNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "School_example_incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentName";
    
  }
}
