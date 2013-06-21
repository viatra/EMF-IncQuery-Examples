package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithOneMultiplicityNameMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityNameMatcher
 * @see EReferenceWithOneMultiplicityNameMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithOneMultiplicityNameQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithOneMultiplicityNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityNameMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityName";
    
  }
  
  private EReferenceWithOneMultiplicityNameQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithOneMultiplicityNameQuerySpecification> {
    @Override
    public EReferenceWithOneMultiplicityNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityNameQuerySpecification INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityNameQuerySpecification make() {
      try {
      	return new EReferenceWithOneMultiplicityNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
