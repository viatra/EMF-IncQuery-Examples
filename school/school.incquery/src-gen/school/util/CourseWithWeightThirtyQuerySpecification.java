package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithWeightThirtyMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithWeightThirtyMatcher in a type-safe way.
 * 
 * @see CourseWithWeightThirtyMatcher
 * @see CourseWithWeightThirtyMatch
 * 
 */
public final class CourseWithWeightThirtyQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithWeightThirtyMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithWeightThirtyQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithWeightThirtyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithWeightThirtyMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithWeightThirty";
    
  }
  
  private CourseWithWeightThirtyQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<CourseWithWeightThirtyQuerySpecification> {
    @Override
    public CourseWithWeightThirtyQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithWeightThirtyQuerySpecification INSTANCE = make();
    
    public static CourseWithWeightThirtyQuerySpecification make() {
      try {
      	return new CourseWithWeightThirtyQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
