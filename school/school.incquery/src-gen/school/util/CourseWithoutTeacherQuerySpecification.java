package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithoutTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithoutTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithoutTeacherMatcher
 * @see CourseWithoutTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithoutTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithoutTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithoutTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithoutTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithoutTeacherMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.CourseWithoutTeacher";
    
  }
  
  private CourseWithoutTeacherQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithoutTeacherQuerySpecification> {
    @Override
    public CourseWithoutTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithoutTeacherQuerySpecification INSTANCE = make();
    
    public static CourseWithoutTeacherQuerySpecification make() {
      try {
      	return new CourseWithoutTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
