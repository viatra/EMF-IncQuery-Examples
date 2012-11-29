package school.somecourse;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.somecourse.SomeCourseMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SomeCourseMatcher in a type-safe way.
 * 
 * @see SomeCourseMatcher
 * @see SomeCourseMatch
 * 
 */
public class SomeCourseMatcherFactory extends BaseGeneratedMatcherFactory<SomeCourseMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SomeCourseMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SomeCourseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SomeCourseMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.SomeCourse";
    
  }
  
  private SomeCourseMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SomeCourseMatcherFactory> {
    @Override
    public SomeCourseMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SomeCourseMatcherFactory INSTANCE = make();
    
    public static SomeCourseMatcherFactory make() {
      try {
      	return new SomeCourseMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
