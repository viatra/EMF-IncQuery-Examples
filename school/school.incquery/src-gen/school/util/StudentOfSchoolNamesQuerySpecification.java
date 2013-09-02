package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.StudentOfSchoolNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate StudentOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolNamesMatcher
 * @see StudentOfSchoolNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class StudentOfSchoolNamesQuerySpecification extends BaseGeneratedQuerySpecification<StudentOfSchoolNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StudentOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentOfSchoolNames";
    
  }
  
  private StudentOfSchoolNamesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<StudentOfSchoolNamesQuerySpecification> {
    @Override
    public StudentOfSchoolNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static StudentOfSchoolNamesQuerySpecification INSTANCE = make();
    
    public static StudentOfSchoolNamesQuerySpecification make() {
      try {
      	return new StudentOfSchoolNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
