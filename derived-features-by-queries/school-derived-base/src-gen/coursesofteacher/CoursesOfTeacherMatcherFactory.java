package coursesofteacher;

import coursesofteacher.CoursesOfTeacherMatch;
import coursesofteacher.CoursesOfTeacherMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;

/**
 * A pattern-specific matcher factory that can instantiate CoursesOfTeacherMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherMatch
 * 
 */
public class CoursesOfTeacherMatcherFactory extends BaseGeneratedMatcherFactory<CoursesOfTeacherMatch,CoursesOfTeacherMatcher> {
  @Override
  protected CoursesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new CoursesOfTeacherMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school-derived-base";
    
  }
  
  @Override
  protected String patternName() {
    return "coursesOfTeacher";
    
  }
}
