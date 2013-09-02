package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeachersOfSchoolNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolNamesMatcher
 * @see TeachersOfSchoolNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersOfSchoolNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeachersOfSchoolNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachersOfSchoolNames";
    
  }
  
  private TeachersOfSchoolNamesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TeachersOfSchoolNamesQuerySpecification> {
    @Override
    public TeachersOfSchoolNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersOfSchoolNamesQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolNamesQuerySpecification make() {
      try {
      	return new TeachersOfSchoolNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
