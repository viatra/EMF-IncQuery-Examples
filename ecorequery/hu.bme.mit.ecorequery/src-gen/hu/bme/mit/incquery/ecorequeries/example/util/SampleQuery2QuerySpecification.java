package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate SampleQuery2Matcher in a type-safe way.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Match
 * 
 */
public final class SampleQuery2QuerySpecification extends BaseGeneratedQuerySpecification<SampleQuery2Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQuery2QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SampleQuery2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery2";
    
  }
  
  private SampleQuery2QuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<SampleQuery2QuerySpecification> {
    @Override
    public SampleQuery2QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SampleQuery2QuerySpecification INSTANCE = make();
    
    public static SampleQuery2QuerySpecification make() {
      try {
      	return new SampleQuery2QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
