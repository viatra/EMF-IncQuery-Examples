package hu.bme.mit.incquery.ecorequeries.example.isinecore;

import hu.bme.mit.incquery.ecorequeries.example.isinecore.IsInECoreMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate IsInECoreMatcher in a type-safe way.
 * 
 * @see IsInECoreMatcher
 * @see IsInECoreMatch
 * 
 */
public final class IsInECoreMatcherFactory extends BaseGeneratedMatcherFactory<IsInECoreMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsInECoreMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IsInECoreMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new IsInECoreMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.IsInECore";
    
  }
  
  private IsInECoreMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<IsInECoreMatcherFactory> {
    @Override
    public IsInECoreMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static IsInECoreMatcherFactory INSTANCE = make();
    
    public static IsInECoreMatcherFactory make() {
      try {
      	return new IsInECoreMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
