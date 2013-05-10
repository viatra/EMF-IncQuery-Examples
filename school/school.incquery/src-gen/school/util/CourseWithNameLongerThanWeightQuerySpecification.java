package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithNameLongerThanWeightMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithNameLongerThanWeightMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightMatcher
 * @see CourseWithNameLongerThanWeightMatch
 * 
 */
public final class CourseWithNameLongerThanWeightQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithNameLongerThanWeightMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithNameLongerThanWeight";
    
  }
  
  private CourseWithNameLongerThanWeightQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<CourseWithNameLongerThanWeightQuerySpecification> {
    @Override
    public CourseWithNameLongerThanWeightQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightQuerySpecification INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightQuerySpecification make() {
      try {
      	return new CourseWithNameLongerThanWeightQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
