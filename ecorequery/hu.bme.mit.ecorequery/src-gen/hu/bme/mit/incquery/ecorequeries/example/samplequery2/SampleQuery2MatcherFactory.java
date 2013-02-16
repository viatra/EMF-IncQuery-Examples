package hu.bme.mit.incquery.ecorequeries.example.samplequery2;

import hu.bme.mit.incquery.ecorequeries.example.samplequery2.SampleQuery2Matcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SampleQuery2Matcher in a type-safe way.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Match
 * 
 */
public final class SampleQuery2MatcherFactory extends BaseGeneratedMatcherFactory<SampleQuery2Matcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQuery2MatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SampleQuery2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SampleQuery2Matcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery2";
    
  }
  
  private SampleQuery2MatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SampleQuery2MatcherFactory> {
    @Override
    public SampleQuery2MatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SampleQuery2MatcherFactory INSTANCE = make();
    
    public static SampleQuery2MatcherFactory make() {
      try {
      	return new SampleQuery2MatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
