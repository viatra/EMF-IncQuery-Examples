package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CoursesOfTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherMatch
 * 
 */
public final class CoursesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CoursesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.coursesOfTeacher";
    
  }
  
  private CoursesOfTeacherQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<CoursesOfTeacherQuerySpecification> {
    @Override
    public CoursesOfTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CoursesOfTeacherQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherQuerySpecification make() {
      try {
      	return new CoursesOfTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
