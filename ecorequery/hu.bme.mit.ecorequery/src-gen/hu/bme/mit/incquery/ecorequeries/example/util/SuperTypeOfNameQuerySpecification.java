package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate SuperTypeOfNameMatcher in a type-safe way.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameMatch
 * 
 */
public final class SuperTypeOfNameQuerySpecification extends BaseGeneratedQuerySpecification<SuperTypeOfNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfNameMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
    
  }
  
  private SuperTypeOfNameQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<SuperTypeOfNameQuerySpecification> {
    @Override
    public SuperTypeOfNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfNameQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfNameQuerySpecification make() {
      try {
      	return new SuperTypeOfNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
