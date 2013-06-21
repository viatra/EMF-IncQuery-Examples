package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.SomeCourseMatcher;

/**
 * A pattern-specific query specification that can instantiate SomeCourseMatcher in a type-safe way.
 * 
 * @see SomeCourseMatcher
 * @see SomeCourseMatch
 * 
 */
@SuppressWarnings("all")
public final class SomeCourseQuerySpecification extends BaseGeneratedQuerySpecification<SomeCourseMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SomeCourseQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SomeCourseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SomeCourseMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.SomeCourse";
    
  }
  
  private SomeCourseQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SomeCourseQuerySpecification> {
    @Override
    public SomeCourseQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SomeCourseQuerySpecification INSTANCE = make();
    
    public static SomeCourseQuerySpecification make() {
      try {
      	return new SomeCourseQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
