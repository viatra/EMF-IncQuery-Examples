package school.theoneswiththebiggestcircle;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TheOnesWithTheBiggestCircleMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleMatcher
 * @see TheOnesWithTheBiggestCircleMatch
 * 
 */
public class TheOnesWithTheBiggestCircleMatcherFactory extends BaseGeneratedMatcherFactory<TheOnesWithTheBiggestCircleMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TheOnesWithTheBiggestCircleMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.theOnesWithTheBiggestCircle";
    
  }
  
  private TheOnesWithTheBiggestCircleMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TheOnesWithTheBiggestCircleMatcherFactory> {
    @Override
    public TheOnesWithTheBiggestCircleMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleMatcherFactory INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleMatcherFactory make() {
      try {
      	return new TheOnesWithTheBiggestCircleMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
