package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CoursesMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesMatcher in a type-safe way.
 * 
 * @see CoursesMatcher
 * @see CoursesMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesQuerySpecification extends BaseGeneratedQuerySpecification<CoursesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courses";
    
  }
  
  private CoursesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoursesQuerySpecification> {
    @Override
    public CoursesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesQuerySpecification INSTANCE = make();
    
    public static CoursesQuerySpecification make() {
      try {
      	return new CoursesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
