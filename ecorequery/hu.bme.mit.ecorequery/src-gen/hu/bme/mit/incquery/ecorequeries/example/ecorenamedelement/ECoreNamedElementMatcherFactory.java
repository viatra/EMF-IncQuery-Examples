package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement;

import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ECoreNamedElementMatcher in a type-safe way.
 * 
 * @see ECoreNamedElementMatcher
 * @see ECoreNamedElementMatch
 * 
 */
public final class ECoreNamedElementMatcherFactory extends BaseGeneratedMatcherFactory<ECoreNamedElementMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ECoreNamedElementMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ECoreNamedElementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ECoreNamedElementMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement";
    
  }
  
  private ECoreNamedElementMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ECoreNamedElementMatcherFactory> {
    @Override
    public ECoreNamedElementMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ECoreNamedElementMatcherFactory INSTANCE = make();
    
    public static ECoreNamedElementMatcherFactory make() {
      try {
      	return new ECoreNamedElementMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
