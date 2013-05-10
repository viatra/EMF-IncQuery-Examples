package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EClassWithEStringAttributeMatcher in a type-safe way.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeMatch
 * 
 */
public final class EClassWithEStringAttributeQuerySpecification extends BaseGeneratedQuerySpecification<EClassWithEStringAttributeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassWithEStringAttributeQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassWithEStringAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EClassWithEStringAttributeMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute";
    
  }
  
  private EClassWithEStringAttributeQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<EClassWithEStringAttributeQuerySpecification> {
    @Override
    public EClassWithEStringAttributeQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EClassWithEStringAttributeQuerySpecification INSTANCE = make();
    
    public static EClassWithEStringAttributeQuerySpecification make() {
      try {
      	return new EClassWithEStringAttributeQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
