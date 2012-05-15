package teachers;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import teachers.TeachersMatch;
import teachers.TeachersMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachersMatcher in a type-safe way.
 * 
 * @see TeachersMatcher
 * @see TeachersMatch
 * 
 */
public class TeachersMatcherFactory extends BaseGeneratedMatcherFactory<TeachersMatch,TeachersMatcher> {
  @Override
  protected TeachersMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new TeachersMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school-derived-base";
    
  }
  
  @Override
  protected String patternName() {
    return "teachers";
    
  }
}
