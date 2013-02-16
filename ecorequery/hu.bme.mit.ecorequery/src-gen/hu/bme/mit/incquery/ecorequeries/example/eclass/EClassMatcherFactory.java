package hu.bme.mit.incquery.ecorequeries.example.eclass;

import hu.bme.mit.incquery.ecorequeries.example.eclass.EClassMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EClassMatcher in a type-safe way.
 * 
 * @see EClassMatcher
 * @see EClassMatch
 * 
 */
public final class EClassMatcherFactory extends BaseGeneratedMatcherFactory<EClassMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EClassMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClass";
    
  }
  
  private EClassMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EClassMatcherFactory> {
    @Override
    public EClassMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EClassMatcherFactory INSTANCE = make();
    
    public static EClassMatcherFactory make() {
      try {
      	return new EClassMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
