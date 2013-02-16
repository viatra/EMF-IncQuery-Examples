package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname;

import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname.ECoreNamedElementNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate ECoreNamedElementNameMatcher in a type-safe way.
 * 
 * @see ECoreNamedElementNameMatcher
 * @see ECoreNamedElementNameMatch
 * 
 */
public final class ECoreNamedElementNameMatcherFactory extends BaseGeneratedMatcherFactory<ECoreNamedElementNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ECoreNamedElementNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ECoreNamedElementNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ECoreNamedElementNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementName";
    
  }
  
  private ECoreNamedElementNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ECoreNamedElementNameMatcherFactory> {
    @Override
    public ECoreNamedElementNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ECoreNamedElementNameMatcherFactory INSTANCE = make();
    
    public static ECoreNamedElementNameMatcherFactory make() {
      try {
      	return new ECoreNamedElementNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
