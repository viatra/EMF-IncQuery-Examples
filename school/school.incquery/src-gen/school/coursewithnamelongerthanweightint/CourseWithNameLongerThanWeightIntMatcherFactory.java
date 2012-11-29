package school.coursewithnamelongerthanweightint;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithnamelongerthanweightint.CourseWithNameLongerThanWeightIntMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithNameLongerThanWeightIntMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightIntMatcher
 * @see CourseWithNameLongerThanWeightIntMatch
 * 
 */
public class CourseWithNameLongerThanWeightIntMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithNameLongerThanWeightIntMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightIntMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightIntMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithNameLongerThanWeightIntMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithNameLongerThanWeightInt";
    
  }
  
  private CourseWithNameLongerThanWeightIntMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithNameLongerThanWeightIntMatcherFactory> {
    @Override
    public CourseWithNameLongerThanWeightIntMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightIntMatcherFactory INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightIntMatcherFactory make() {
      try {
      	return new CourseWithNameLongerThanWeightIntMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
