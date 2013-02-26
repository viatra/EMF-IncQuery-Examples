package school.courses;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.courses.CoursesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CoursesMatcher in a type-safe way.
 * 
 * @see CoursesMatcher
 * @see CoursesMatch
 * 
 */
public final class CoursesMatcherFactory extends BaseGeneratedMatcherFactory<CoursesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CoursesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courses";
    
  }
  
  private CoursesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CoursesMatcherFactory> {
    @Override
    public CoursesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CoursesMatcherFactory INSTANCE = make();
    
    public static CoursesMatcherFactory make() {
      try {
      	return new CoursesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
