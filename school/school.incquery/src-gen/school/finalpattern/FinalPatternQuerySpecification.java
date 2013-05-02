package school.finalpattern;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.finalpattern.FinalPatternMatcher;

/**
 * A pattern-specific query specification that can instantiate FinalPatternMatcher in a type-safe way.
 * 
 * @see FinalPatternMatcher
 * @see FinalPatternMatch
 * 
 */
public final class FinalPatternQuerySpecification extends BaseGeneratedQuerySpecification<FinalPatternMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPatternQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FinalPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new FinalPatternMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.finalPattern";
    
  }
  
  private FinalPatternQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<FinalPatternQuerySpecification> {
    @Override
    public FinalPatternQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static FinalPatternQuerySpecification INSTANCE = make();
    
    public static FinalPatternQuerySpecification make() {
      try {
      	return new FinalPatternQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
