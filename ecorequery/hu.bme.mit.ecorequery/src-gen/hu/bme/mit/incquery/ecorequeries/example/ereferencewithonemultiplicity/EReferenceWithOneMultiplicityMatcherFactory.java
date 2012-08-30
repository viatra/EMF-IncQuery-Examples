package hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity.EReferenceWithOneMultiplicityMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate EReferenceWithOneMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityMatcher
 * @see EReferenceWithOneMultiplicityMatch
 * 
 */
public class EReferenceWithOneMultiplicityMatcherFactory extends BaseGeneratedMatcherFactory<EReferenceWithOneMultiplicityMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new EReferenceWithOneMultiplicityMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.ecorequery";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity";
    
  }
  
  private EReferenceWithOneMultiplicityMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<EReferenceWithOneMultiplicityMatcherFactory> {
    @Override
    public EReferenceWithOneMultiplicityMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityMatcherFactory INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityMatcherFactory make() {
      try {
      	return new EReferenceWithOneMultiplicityMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
