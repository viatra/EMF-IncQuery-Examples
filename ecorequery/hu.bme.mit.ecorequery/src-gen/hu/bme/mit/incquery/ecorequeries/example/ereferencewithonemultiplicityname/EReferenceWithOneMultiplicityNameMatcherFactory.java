package hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicityname;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicityname.EReferenceWithOneMultiplicityNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EReferenceWithOneMultiplicityNameMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityNameMatcher
 * @see EReferenceWithOneMultiplicityNameMatch
 * 
 */
public final class EReferenceWithOneMultiplicityNameMatcherFactory extends BaseGeneratedMatcherFactory<EReferenceWithOneMultiplicityNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EReferenceWithOneMultiplicityNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityName";
    
  }
  
  private EReferenceWithOneMultiplicityNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EReferenceWithOneMultiplicityNameMatcherFactory> {
    @Override
    public EReferenceWithOneMultiplicityNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityNameMatcherFactory INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityNameMatcherFactory make() {
      try {
      	return new EReferenceWithOneMultiplicityNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
