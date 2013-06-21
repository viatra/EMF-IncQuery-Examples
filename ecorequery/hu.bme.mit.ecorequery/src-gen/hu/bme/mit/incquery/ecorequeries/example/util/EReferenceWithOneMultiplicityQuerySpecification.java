package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithOneMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityMatcher
 * @see EReferenceWithOneMultiplicityMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithOneMultiplicityQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithOneMultiplicityMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity";
    
  }
  
  private EReferenceWithOneMultiplicityQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithOneMultiplicityQuerySpecification> {
    @Override
    public EReferenceWithOneMultiplicityQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityQuerySpecification INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityQuerySpecification make() {
      try {
      	return new EReferenceWithOneMultiplicityQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
