package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate SuperTypeOfMatcher in a type-safe way.
 * 
 * @see SuperTypeOfMatcher
 * @see SuperTypeOfMatch
 * 
 */
public final class SuperTypeOfQuerySpecification extends BaseGeneratedQuerySpecification<SuperTypeOfMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf";
    
  }
  
  private SuperTypeOfQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<SuperTypeOfQuerySpecification> {
    @Override
    public SuperTypeOfQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfQuerySpecification make() {
      try {
      	return new SuperTypeOfQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
