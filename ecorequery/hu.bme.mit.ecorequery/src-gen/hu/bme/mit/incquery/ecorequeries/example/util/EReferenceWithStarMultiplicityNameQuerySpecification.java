package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithStarMultiplicityNameMatcher in a type-safe way.
 * 
 * @see EReferenceWithStarMultiplicityNameMatcher
 * @see EReferenceWithStarMultiplicityNameMatch
 * 
 */
public final class EReferenceWithStarMultiplicityNameQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithStarMultiplicityNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithStarMultiplicityNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithStarMultiplicityNameMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityName";
    
  }
  
  private EReferenceWithStarMultiplicityNameQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithStarMultiplicityNameQuerySpecification> {
    @Override
    public EReferenceWithStarMultiplicityNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EReferenceWithStarMultiplicityNameQuerySpecification INSTANCE = make();
    
    public static EReferenceWithStarMultiplicityNameQuerySpecification make() {
      try {
      	return new EReferenceWithStarMultiplicityNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
