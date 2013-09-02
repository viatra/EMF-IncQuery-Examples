package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.FriendlyToMatcher;

/**
 * A pattern-specific query specification that can instantiate FriendlyToMatcher in a type-safe way.
 * 
 * @see FriendlyToMatcher
 * @see FriendlyToMatch
 * 
 */
@SuppressWarnings("all")
public final class FriendlyToQuerySpecification extends BaseGeneratedQuerySpecification<FriendlyToMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FriendlyToQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FriendlyToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FriendlyToMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.friendlyTo";
    
  }
  
  private FriendlyToQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FriendlyToQuerySpecification> {
    @Override
    public FriendlyToQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FriendlyToQuerySpecification INSTANCE = make();
    
    public static FriendlyToQuerySpecification make() {
      try {
      	return new FriendlyToQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
