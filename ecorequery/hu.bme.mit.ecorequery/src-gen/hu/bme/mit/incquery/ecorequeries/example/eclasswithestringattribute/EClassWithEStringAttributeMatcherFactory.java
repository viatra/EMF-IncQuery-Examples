package hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EClassWithEStringAttributeMatcher in a type-safe way.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeMatch
 * 
 */
public class EClassWithEStringAttributeMatcherFactory extends BaseGeneratedMatcherFactory<EClassWithEStringAttributeMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassWithEStringAttributeMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassWithEStringAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EClassWithEStringAttributeMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute";
    
  }
  
  private EClassWithEStringAttributeMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EClassWithEStringAttributeMatcherFactory> {
    @Override
    public EClassWithEStringAttributeMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EClassWithEStringAttributeMatcherFactory INSTANCE = make();
    
    public static EClassWithEStringAttributeMatcherFactory make() {
      try {
      	return new EClassWithEStringAttributeMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
