package hu.bme.mit.incquery.ecorequeries.example.isestring;

import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IsEStringMatcher in a type-safe way.
 * 
 * @see IsEStringMatcher
 * @see IsEStringMatch
 * 
 */
public final class IsEStringMatcherFactory extends BaseGeneratedMatcherFactory<IsEStringMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsEStringMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IsEStringMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IsEStringMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.IsEString";
    
  }
  
  private IsEStringMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IsEStringMatcherFactory> {
    @Override
    public IsEStringMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IsEStringMatcherFactory INSTANCE = make();
    
    public static IsEStringMatcherFactory make() {
      try {
      	return new IsEStringMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
