package school.inthecircleoffriendsnames;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate InTheCircleOfFriendsNamesMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsNamesMatcher
 * @see InTheCircleOfFriendsNamesMatch
 * 
 */
public class InTheCircleOfFriendsNamesMatcherFactory extends BaseGeneratedMatcherFactory<InTheCircleOfFriendsNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected InTheCircleOfFriendsNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new InTheCircleOfFriendsNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.inTheCircleOfFriendsNames";
    
  }
  
  private InTheCircleOfFriendsNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<InTheCircleOfFriendsNamesMatcherFactory> {
    @Override
    public InTheCircleOfFriendsNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsNamesMatcherFactory INSTANCE = make();
    
    public static InTheCircleOfFriendsNamesMatcherFactory make() {
      try {
      	return new InTheCircleOfFriendsNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
