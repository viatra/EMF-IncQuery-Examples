package school.friendlyto;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.friendlyto.FriendlyToMatcher;

/**
 * A pattern-specific matcher factory that can instantiate FriendlyToMatcher in a type-safe way.
 * 
 * @see FriendlyToMatcher
 * @see FriendlyToMatch
 * 
 */
public class FriendlyToMatcherFactory extends BaseGeneratedMatcherFactory<FriendlyToMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FriendlyToMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FriendlyToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new FriendlyToMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.friendlyTo";
    
  }
  
  private FriendlyToMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<FriendlyToMatcherFactory> {
    @Override
    public FriendlyToMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static FriendlyToMatcherFactory INSTANCE = make();
    
    public static FriendlyToMatcherFactory make() {
      try {
      	return new FriendlyToMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
