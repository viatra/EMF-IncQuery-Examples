package school.coursewithweightthirty;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithweightthirty.CourseWithWeightThirtyMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithWeightThirtyMatcher in a type-safe way.
 * 
 * @see CourseWithWeightThirtyMatcher
 * @see CourseWithWeightThirtyMatch
 * 
 */
public class CourseWithWeightThirtyMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithWeightThirtyMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithWeightThirtyMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithWeightThirtyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithWeightThirtyMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithWeightThirty";
    
  }
  
  private CourseWithWeightThirtyMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithWeightThirtyMatcherFactory> {
    @Override
    public CourseWithWeightThirtyMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithWeightThirtyMatcherFactory INSTANCE = make();
    
    public static CourseWithWeightThirtyMatcherFactory make() {
      try {
      	return new CourseWithWeightThirtyMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
