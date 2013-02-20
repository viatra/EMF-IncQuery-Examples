package hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicityname;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicityname.EReferenceWithStarMultiplicityNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EReferenceWithStarMultiplicityNameMatcher in a type-safe way.
 * 
 * @see EReferenceWithStarMultiplicityNameMatcher
 * @see EReferenceWithStarMultiplicityNameMatch
 * 
 */
public final class EReferenceWithStarMultiplicityNameMatcherFactory extends BaseGeneratedMatcherFactory<EReferenceWithStarMultiplicityNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithStarMultiplicityNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EReferenceWithStarMultiplicityNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityName";
    
  }
  
  private EReferenceWithStarMultiplicityNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EReferenceWithStarMultiplicityNameMatcherFactory> {
    @Override
    public EReferenceWithStarMultiplicityNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EReferenceWithStarMultiplicityNameMatcherFactory INSTANCE = make();
    
    public static EReferenceWithStarMultiplicityNameMatcherFactory make() {
      try {
      	return new EReferenceWithStarMultiplicityNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
