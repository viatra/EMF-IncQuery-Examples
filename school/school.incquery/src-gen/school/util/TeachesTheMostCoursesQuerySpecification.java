package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeachesTheMostCoursesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachesTheMostCoursesMatcher in a type-safe way.
 * 
 * @see TeachesTheMostCoursesMatcher
 * @see TeachesTheMostCoursesMatch
 * 
 */
public final class TeachesTheMostCoursesQuerySpecification extends BaseGeneratedQuerySpecification<TeachesTheMostCoursesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesTheMostCoursesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachesTheMostCoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachesTheMostCoursesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachesTheMostCourses";
    
  }
  
  private TeachesTheMostCoursesQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TeachesTheMostCoursesQuerySpecification> {
    @Override
    public TeachesTheMostCoursesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachesTheMostCoursesQuerySpecification INSTANCE = make();
    
    public static TeachesTheMostCoursesQuerySpecification make() {
      try {
      	return new TeachesTheMostCoursesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
