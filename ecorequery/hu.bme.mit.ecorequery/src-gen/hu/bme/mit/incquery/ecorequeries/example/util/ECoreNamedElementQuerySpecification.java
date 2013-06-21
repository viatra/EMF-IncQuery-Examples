package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate ECoreNamedElementMatcher in a type-safe way.
 * 
 * @see ECoreNamedElementMatcher
 * @see ECoreNamedElementMatch
 * 
 */
@SuppressWarnings("all")
public final class ECoreNamedElementQuerySpecification extends BaseGeneratedQuerySpecification<ECoreNamedElementMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ECoreNamedElementQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ECoreNamedElementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ECoreNamedElementMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement";
    
  }
  
  private ECoreNamedElementQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ECoreNamedElementQuerySpecification> {
    @Override
    public ECoreNamedElementQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ECoreNamedElementQuerySpecification INSTANCE = make();
    
    public static ECoreNamedElementQuerySpecification make() {
      try {
      	return new ECoreNamedElementQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
