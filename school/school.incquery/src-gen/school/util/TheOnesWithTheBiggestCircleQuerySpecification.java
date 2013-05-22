package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TheOnesWithTheBiggestCircleMatcher;

/**
 * A pattern-specific query specification that can instantiate TheOnesWithTheBiggestCircleMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleMatcher
 * @see TheOnesWithTheBiggestCircleMatch
 * 
 */
public final class TheOnesWithTheBiggestCircleQuerySpecification extends BaseGeneratedQuerySpecification<TheOnesWithTheBiggestCircleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.theOnesWithTheBiggestCircle";
    
  }
  
  private TheOnesWithTheBiggestCircleQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TheOnesWithTheBiggestCircleQuerySpecification> {
    @Override
    public TheOnesWithTheBiggestCircleQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleQuerySpecification INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleQuerySpecification make() {
      try {
      	return new TheOnesWithTheBiggestCircleQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
