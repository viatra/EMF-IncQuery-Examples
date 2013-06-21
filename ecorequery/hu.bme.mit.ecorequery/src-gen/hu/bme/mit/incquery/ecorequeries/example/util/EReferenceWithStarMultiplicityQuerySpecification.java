package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithStarMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithStarMultiplicityMatcher
 * @see EReferenceWithStarMultiplicityMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithStarMultiplicityQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithStarMultiplicityMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithStarMultiplicityQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithStarMultiplicityMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity";
    
  }
  
  private EReferenceWithStarMultiplicityQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithStarMultiplicityQuerySpecification> {
    @Override
    public EReferenceWithStarMultiplicityQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EReferenceWithStarMultiplicityQuerySpecification INSTANCE = make();
    
    public static EReferenceWithStarMultiplicityQuerySpecification make() {
      try {
      	return new EReferenceWithStarMultiplicityQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
