package hu.bme.mit.incquery.ecorequeries.example.supertypeofname;

import hu.bme.mit.incquery.ecorequeries.example.supertypeofname.SuperTypeOfNameMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate SuperTypeOfNameMatcher in a type-safe way.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameMatch
 * 
 */
public class SuperTypeOfNameMatcherFactory extends BaseGeneratedMatcherFactory<SuperTypeOfNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SuperTypeOfNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
    
  }
  
  private SuperTypeOfNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SuperTypeOfNameMatcherFactory> {
    @Override
    public SuperTypeOfNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfNameMatcherFactory INSTANCE = make();
    
    public static SuperTypeOfNameMatcherFactory make() {
      try {
      	return new SuperTypeOfNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
