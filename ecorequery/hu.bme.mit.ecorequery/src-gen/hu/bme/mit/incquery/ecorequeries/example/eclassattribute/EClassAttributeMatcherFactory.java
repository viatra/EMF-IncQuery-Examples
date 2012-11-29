package hu.bme.mit.incquery.ecorequeries.example.eclassattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EClassAttributeMatcher in a type-safe way.
 * 
 * @see EClassAttributeMatcher
 * @see EClassAttributeMatch
 * 
 */
public class EClassAttributeMatcherFactory extends BaseGeneratedMatcherFactory<EClassAttributeMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassAttributeMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EClassAttributeMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassAttribute";
    
  }
  
  private EClassAttributeMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EClassAttributeMatcherFactory> {
    @Override
    public EClassAttributeMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EClassAttributeMatcherFactory INSTANCE = make();
    
    public static EClassAttributeMatcherFactory make() {
      try {
      	return new EClassAttributeMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
