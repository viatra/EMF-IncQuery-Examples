package hu.bme.mit.incquery.ecorequeries.example.eclassname;

import hu.bme.mit.incquery.ecorequeries.example.eclassname.EClassNameMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EClassNameMatcher in a type-safe way.
 * 
 * @see EClassNameMatcher
 * @see EClassNameMatch
 * 
 */
public class EClassNameMatcherFactory extends BaseGeneratedMatcherFactory<EClassNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EClassNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassName";
    
  }
  
  private EClassNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EClassNameMatcherFactory> {
    @Override
    public EClassNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EClassNameMatcherFactory INSTANCE = make();
    
    public static EClassNameMatcherFactory make() {
      try {
      	return new EClassNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
