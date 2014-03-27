package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.CourseWithTeacherMatcher;
import school.CourseWithoutTeacherMatcher;
import school.util.CourseWithTeacherQuerySpecification;
import school.util.CourseWithoutTeacherQuerySpecification;

/**
 * A pattern group formed of all patterns defined in schoolValidationRules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file schoolValidationRules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package school, the group contains the definition of the following patterns: <ul>
 * <li>CourseWithTeacher</li>
 * <li>CourseWithoutTeacher</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class SchoolValidationRules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SchoolValidationRules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new SchoolValidationRules();
    }
    return INSTANCE;
    
  }
  
  private static SchoolValidationRules INSTANCE;
  
  private SchoolValidationRules() throws IncQueryException {
    querySpecifications.add(CourseWithTeacherQuerySpecification.instance());
    querySpecifications.add(CourseWithoutTeacherQuerySpecification.instance());
    
  }
  
  public CourseWithTeacherQuerySpecification getCourseWithTeacher() throws IncQueryException {
    return CourseWithTeacherQuerySpecification.instance();
  }
  
  public CourseWithTeacherMatcher getCourseWithTeacher(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithTeacherMatcher.on(engine);
  }
  
  public CourseWithoutTeacherQuerySpecification getCourseWithoutTeacher() throws IncQueryException {
    return CourseWithoutTeacherQuerySpecification.instance();
  }
  
  public CourseWithoutTeacherMatcher getCourseWithoutTeacher(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithoutTeacherMatcher.on(engine);
  }
}
