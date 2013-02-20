package school.coursewithnamelongerthanweight;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithnamelongerthanweight.CourseWithNameLongerThanWeightMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithNameLongerThanWeightMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightMatcher
 * @see CourseWithNameLongerThanWeightMatch
 * 
 */
public final class CourseWithNameLongerThanWeightMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithNameLongerThanWeightMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithNameLongerThanWeightMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithNameLongerThanWeight";
    
  }
  
  private CourseWithNameLongerThanWeightMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithNameLongerThanWeightMatcherFactory> {
    @Override
    public CourseWithNameLongerThanWeightMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightMatcherFactory INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightMatcherFactory make() {
      try {
      	return new CourseWithNameLongerThanWeightMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
