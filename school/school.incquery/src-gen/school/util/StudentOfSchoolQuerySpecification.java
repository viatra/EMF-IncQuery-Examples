package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.StudentOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate StudentOfSchoolMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class StudentOfSchoolQuerySpecification extends BaseGeneratedQuerySpecification<StudentOfSchoolMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StudentOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentOfSchool";
    
  }
  
  private StudentOfSchoolQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<StudentOfSchoolQuerySpecification> {
    @Override
    public StudentOfSchoolQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static StudentOfSchoolQuerySpecification INSTANCE = make();
    
    public static StudentOfSchoolQuerySpecification make() {
      try {
      	return new StudentOfSchoolQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
