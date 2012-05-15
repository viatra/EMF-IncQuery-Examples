package teacherwithmostcourses;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import teacherwithmostcourses.TeacherWithMostCoursesMatch;
import teacherwithmostcourses.TeacherWithMostCoursesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeacherWithMostCoursesMatcher in a type-safe way.
 * 
 * @see TeacherWithMostCoursesMatcher
 * @see TeacherWithMostCoursesMatch
 * 
 */
public class TeacherWithMostCoursesMatcherFactory extends BaseGeneratedMatcherFactory<TeacherWithMostCoursesMatch,TeacherWithMostCoursesMatcher> {
  @Override
  protected TeacherWithMostCoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new TeacherWithMostCoursesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school-derived-base";
    
  }
  
  @Override
  protected String patternName() {
    return "teacherWithMostCourses";
    
  }
}
