package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.CourseWithTeacherMatcher;
import school.CourseWithoutTeacherMatcher;

@SuppressWarnings("all")
public final class SchoolValidationRulesMatchers {
  private IncQueryEngine engine;
  
  public SchoolValidationRulesMatchers(final IncQueryEngine engine) {
    this.engine = engine;
    
  }
  
  public CourseWithoutTeacherMatcher getCourseWithoutTeacherMatcher() throws IncQueryException {
    return CourseWithoutTeacherMatcher.on(engine);
  }
  
  public CourseWithTeacherMatcher getCourseWithTeacherMatcher() throws IncQueryException {
    return CourseWithTeacherMatcher.on(engine);
  }
}
