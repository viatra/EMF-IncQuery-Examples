package hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity.EReferenceWithStarMultiplicityMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EReferenceWithStarMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithStarMultiplicityMatcher
 * @see EReferenceWithStarMultiplicityMatch
 * 
 */
public class EReferenceWithStarMultiplicityMatcherFactory extends BaseGeneratedMatcherFactory<EReferenceWithStarMultiplicityMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithStarMultiplicityMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EReferenceWithStarMultiplicityMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity";
    
  }
  
  private EReferenceWithStarMultiplicityMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EReferenceWithStarMultiplicityMatcherFactory> {
    @Override
    public EReferenceWithStarMultiplicityMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EReferenceWithStarMultiplicityMatcherFactory INSTANCE = make();
    
    public static EReferenceWithStarMultiplicityMatcherFactory make() {
      try {
      	return new EReferenceWithStarMultiplicityMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
