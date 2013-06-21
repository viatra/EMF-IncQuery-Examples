package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithPrimeWeightMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithPrimeWeightMatcher in a type-safe way.
 * 
 * @see CourseWithPrimeWeightMatcher
 * @see CourseWithPrimeWeightMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithPrimeWeightQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithPrimeWeightMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithPrimeWeightQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithPrimeWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithPrimeWeightMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithPrimeWeight";
    
  }
  
  private CourseWithPrimeWeightQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithPrimeWeightQuerySpecification> {
    @Override
    public CourseWithPrimeWeightQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithPrimeWeightQuerySpecification INSTANCE = make();
    
    public static CourseWithPrimeWeightQuerySpecification make() {
      try {
      	return new CourseWithPrimeWeightQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
