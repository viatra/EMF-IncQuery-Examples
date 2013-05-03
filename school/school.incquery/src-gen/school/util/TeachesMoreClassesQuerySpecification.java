package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeachesMoreClassesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachesMoreClassesMatcher in a type-safe way.
 * 
 * @see TeachesMoreClassesMatcher
 * @see TeachesMoreClassesMatch
 * 
 */
public final class TeachesMoreClassesQuerySpecification extends BaseGeneratedQuerySpecification<TeachesMoreClassesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesMoreClassesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachesMoreClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachesMoreClassesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachesMoreClasses";
    
  }
  
  private TeachesMoreClassesQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TeachesMoreClassesQuerySpecification> {
    @Override
    public TeachesMoreClassesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachesMoreClassesQuerySpecification INSTANCE = make();
    
    public static TeachesMoreClassesQuerySpecification make() {
      try {
      	return new TeachesMoreClassesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
