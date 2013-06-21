package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.SchoolsMatcher;

/**
 * A pattern-specific query specification that can instantiate SchoolsMatcher in a type-safe way.
 * 
 * @see SchoolsMatcher
 * @see SchoolsMatch
 * 
 */
@SuppressWarnings("all")
public final class SchoolsQuerySpecification extends BaseGeneratedQuerySpecification<SchoolsMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SchoolsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.schools";
    
  }
  
  private SchoolsQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SchoolsQuerySpecification> {
    @Override
    public SchoolsQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SchoolsQuerySpecification INSTANCE = make();
    
    public static SchoolsQuerySpecification make() {
      try {
      	return new SchoolsQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
