package school.morefriendsthan;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.morefriendsthan.MoreFriendsThanMatcher;

/**
 * A pattern-specific matcher factory that can instantiate MoreFriendsThanMatcher in a type-safe way.
 * 
 * @see MoreFriendsThanMatcher
 * @see MoreFriendsThanMatch
 * 
 */
public final class MoreFriendsThanMatcherFactory extends BaseGeneratedMatcherFactory<MoreFriendsThanMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoreFriendsThanMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected MoreFriendsThanMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new MoreFriendsThanMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.moreFriendsThan";
    
  }
  
  private MoreFriendsThanMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<MoreFriendsThanMatcherFactory> {
    @Override
    public MoreFriendsThanMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static MoreFriendsThanMatcherFactory INSTANCE = make();
    
    public static MoreFriendsThanMatcherFactory make() {
      try {
      	return new MoreFriendsThanMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
