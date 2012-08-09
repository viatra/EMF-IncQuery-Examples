package school.finalpattern2;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.finalpattern2.FinalPattern2Matcher;

/**
 * A pattern-specific matcher factory that can instantiate FinalPattern2Matcher in a type-safe way.
 * 
 * @see FinalPattern2Matcher
 * @see FinalPattern2Match
 * 
 */
public class FinalPattern2MatcherFactory extends BaseGeneratedMatcherFactory<FinalPattern2Matcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPattern2MatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FinalPattern2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new FinalPattern2Matcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.finalPattern2";
    
  }
  
  private FinalPattern2MatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<FinalPattern2MatcherFactory> {
    @Override
    public FinalPattern2MatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static FinalPattern2MatcherFactory INSTANCE = make();
    
    public static FinalPattern2MatcherFactory make() {
      try {
      	return new FinalPattern2MatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
