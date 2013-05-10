package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeachersOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolMatch
 * 
 */
public final class TeachersOfSchoolQuerySpecification extends BaseGeneratedQuerySpecification<TeachersOfSchoolMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachersOfSchool";
    
  }
  
  private TeachersOfSchoolQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TeachersOfSchoolQuerySpecification> {
    @Override
    public TeachersOfSchoolQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachersOfSchoolQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolQuerySpecification make() {
      try {
      	return new TeachersOfSchoolQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
