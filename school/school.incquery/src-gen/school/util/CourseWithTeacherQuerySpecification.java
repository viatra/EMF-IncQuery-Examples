package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithTeacherMatcher
 * @see CourseWithTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithTeacherMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.CourseWithTeacher";
    
  }
  
  private CourseWithTeacherQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithTeacherQuerySpecification> {
    @Override
    public CourseWithTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithTeacherQuerySpecification INSTANCE = make();
    
    public static CourseWithTeacherQuerySpecification make() {
      try {
      	return new CourseWithTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
