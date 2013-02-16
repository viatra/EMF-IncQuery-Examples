package hu.bme.mit.incquery.ecorequeries.example.samplequery;

import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SampleQueryMatcher in a type-safe way.
 * 
 * @see SampleQueryMatcher
 * @see SampleQueryMatch
 * 
 */
public final class SampleQueryMatcherFactory extends BaseGeneratedMatcherFactory<SampleQueryMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQueryMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SampleQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SampleQueryMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery";
    
  }
  
  private SampleQueryMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SampleQueryMatcherFactory> {
    @Override
    public SampleQueryMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SampleQueryMatcherFactory INSTANCE = make();
    
    public static SampleQueryMatcherFactory make() {
      try {
      	return new SampleQueryMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
