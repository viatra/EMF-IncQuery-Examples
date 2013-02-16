package school.theoneswiththebiggestcirclename;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.theoneswiththebiggestcirclename.TheOnesWithTheBiggestCircleNameMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TheOnesWithTheBiggestCircleNameMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleNameMatcher
 * @see TheOnesWithTheBiggestCircleNameMatch
 * 
 */
public final class TheOnesWithTheBiggestCircleNameMatcherFactory extends BaseGeneratedMatcherFactory<TheOnesWithTheBiggestCircleNameMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleNameMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TheOnesWithTheBiggestCircleNameMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.theOnesWithTheBiggestCircleName";
    
  }
  
  private TheOnesWithTheBiggestCircleNameMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TheOnesWithTheBiggestCircleNameMatcherFactory> {
    @Override
    public TheOnesWithTheBiggestCircleNameMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleNameMatcherFactory INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleNameMatcherFactory make() {
      try {
      	return new TheOnesWithTheBiggestCircleNameMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
