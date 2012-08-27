package school.inthecircleoffriends;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.inthecircleoffriends.InTheCircleOfFriendsMatcher;

/**
 * A pattern-specific matcher factory that can instantiate InTheCircleOfFriendsMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsMatcher
 * @see InTheCircleOfFriendsMatch
 * 
 */
public class InTheCircleOfFriendsMatcherFactory extends BaseGeneratedMatcherFactory<InTheCircleOfFriendsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected InTheCircleOfFriendsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new InTheCircleOfFriendsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.inTheCircleOfFriends";
    
  }
  
  private InTheCircleOfFriendsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<InTheCircleOfFriendsMatcherFactory> {
    @Override
    public InTheCircleOfFriendsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsMatcherFactory INSTANCE = make();
    
    public static InTheCircleOfFriendsMatcherFactory make() {
      try {
      	return new InTheCircleOfFriendsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
