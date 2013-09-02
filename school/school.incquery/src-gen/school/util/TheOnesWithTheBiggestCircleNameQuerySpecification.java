package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TheOnesWithTheBiggestCircleNameMatcher;

/**
 * A pattern-specific query specification that can instantiate TheOnesWithTheBiggestCircleNameMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleNameMatcher
 * @see TheOnesWithTheBiggestCircleNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TheOnesWithTheBiggestCircleNameQuerySpecification extends BaseGeneratedQuerySpecification<TheOnesWithTheBiggestCircleNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.theOnesWithTheBiggestCircleName";
    
  }
  
  private TheOnesWithTheBiggestCircleNameQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TheOnesWithTheBiggestCircleNameQuerySpecification> {
    @Override
    public TheOnesWithTheBiggestCircleNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleNameQuerySpecification INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleNameQuerySpecification make() {
      try {
      	return new TheOnesWithTheBiggestCircleNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
