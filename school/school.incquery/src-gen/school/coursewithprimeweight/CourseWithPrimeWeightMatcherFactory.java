package school.coursewithprimeweight;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithprimeweight.CourseWithPrimeWeightMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithPrimeWeightMatcher in a type-safe way.
 * 
 * @see CourseWithPrimeWeightMatcher
 * @see CourseWithPrimeWeightMatch
 * 
 */
public class CourseWithPrimeWeightMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithPrimeWeightMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithPrimeWeightMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithPrimeWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithPrimeWeightMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithPrimeWeight";
    
  }
  
  private CourseWithPrimeWeightMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithPrimeWeightMatcherFactory> {
    @Override
    public CourseWithPrimeWeightMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithPrimeWeightMatcherFactory INSTANCE = make();
    
    public static CourseWithPrimeWeightMatcherFactory make() {
      try {
      	return new CourseWithPrimeWeightMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
