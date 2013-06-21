package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeachersNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersNamesMatcher in a type-safe way.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeachersNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachersNames";
    
  }
  
  private TeachersNamesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TeachersNamesQuerySpecification> {
    @Override
    public TeachersNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersNamesQuerySpecification INSTANCE = make();
    
    public static TeachersNamesQuerySpecification make() {
      try {
      	return new TeachersNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
