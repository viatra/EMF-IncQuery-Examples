package hu.bme.mit.incquery.ecorequeries.example.supertypeof;

import hu.bme.mit.incquery.ecorequeries.example.supertypeof.SuperTypeOfMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SuperTypeOfMatcher in a type-safe way.
 * 
 * @see SuperTypeOfMatcher
 * @see SuperTypeOfMatch
 * 
 */
public final class SuperTypeOfMatcherFactory extends BaseGeneratedMatcherFactory<SuperTypeOfMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SuperTypeOfMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf";
    
  }
  
  private SuperTypeOfMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SuperTypeOfMatcherFactory> {
    @Override
    public SuperTypeOfMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfMatcherFactory INSTANCE = make();
    
    public static SuperTypeOfMatcherFactory make() {
      try {
      	return new SuperTypeOfMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
