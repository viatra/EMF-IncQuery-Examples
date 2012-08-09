package school.finalpattern;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.finalpattern.FinalPatternMatcher;

/**
 * A pattern-specific matcher factory that can instantiate FinalPatternMatcher in a type-safe way.
 * 
 * @see FinalPatternMatcher
 * @see FinalPatternMatch
 * 
 */
public class FinalPatternMatcherFactory extends BaseGeneratedMatcherFactory<FinalPatternMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPatternMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FinalPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new FinalPatternMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.finalPattern";
    
  }
  
  private FinalPatternMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<FinalPatternMatcherFactory> {
    @Override
    public FinalPatternMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static FinalPatternMatcherFactory INSTANCE = make();
    
    public static FinalPatternMatcherFactory make() {
      try {
      	return new FinalPatternMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
