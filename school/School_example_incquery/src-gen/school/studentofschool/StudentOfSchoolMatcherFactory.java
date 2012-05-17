package school.studentofschool;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import school.studentofschool.StudentOfSchoolMatch;
import school.studentofschool.StudentOfSchoolMatcher;

/**
 * A pattern-specific matcher factory that can instantiate StudentOfSchoolMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolMatch
 * 
 */
public class StudentOfSchoolMatcherFactory extends BaseGeneratedMatcherFactory<StudentOfSchoolMatch,StudentOfSchoolMatcher> {
  @Override
  protected StudentOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new StudentOfSchoolMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "School_example_incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentOfSchool";
    
  }
}
