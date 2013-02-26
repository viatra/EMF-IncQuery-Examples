package school.teachesthemostcourses;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teachesthemostcourses.TeachesTheMostCoursesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachesTheMostCoursesMatcher in a type-safe way.
 * 
 * @see TeachesTheMostCoursesMatcher
 * @see TeachesTheMostCoursesMatch
 * 
 */
public final class TeachesTheMostCoursesMatcherFactory extends BaseGeneratedMatcherFactory<TeachesTheMostCoursesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesTheMostCoursesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachesTheMostCoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeachesTheMostCoursesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachesTheMostCourses";
    
  }
  
  private TeachesTheMostCoursesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeachesTheMostCoursesMatcherFactory> {
    @Override
    public TeachesTheMostCoursesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachesTheMostCoursesMatcherFactory INSTANCE = make();
    
    public static TeachesTheMostCoursesMatcherFactory make() {
      try {
      	return new TeachesTheMostCoursesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
