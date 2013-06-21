package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.CourseWithNameLongerThanWeightIntMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithNameLongerThanWeightIntMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightIntMatcher
 * @see CourseWithNameLongerThanWeightIntMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithNameLongerThanWeightIntQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithNameLongerThanWeightIntMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightIntQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightIntMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightIntMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.courseWithNameLongerThanWeightInt";
    
  }
  
  private CourseWithNameLongerThanWeightIntQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithNameLongerThanWeightIntQuerySpecification> {
    @Override
    public CourseWithNameLongerThanWeightIntQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightIntQuerySpecification INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightIntQuerySpecification make() {
      try {
      	return new CourseWithNameLongerThanWeightIntQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
