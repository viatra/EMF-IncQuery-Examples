package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CoursesOfTeacherNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesOfTeacherNamesQuerySpecification extends BaseGeneratedQuerySpecification<CoursesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.coursesOfTeacherNames";
    
  }
  
  private CoursesOfTeacherNamesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoursesOfTeacherNamesQuerySpecification> {
    @Override
    public CoursesOfTeacherNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherNamesQuerySpecification make() {
      try {
      	return new CoursesOfTeacherNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
