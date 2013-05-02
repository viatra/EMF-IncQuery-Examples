package school.morefriendsthan;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.morefriendsthan.MoreFriendsThanMatcher;

/**
 * A pattern-specific query specification that can instantiate MoreFriendsThanMatcher in a type-safe way.
 * 
 * @see MoreFriendsThanMatcher
 * @see MoreFriendsThanMatch
 * 
 */
public final class MoreFriendsThanQuerySpecification extends BaseGeneratedQuerySpecification<MoreFriendsThanMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoreFriendsThanQuerySpecification instance() throws IncQueryException {
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
  
  private MoreFriendsThanQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<MoreFriendsThanQuerySpecification> {
    @Override
    public MoreFriendsThanQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static MoreFriendsThanQuerySpecification INSTANCE = make();
    
    public static MoreFriendsThanQuerySpecification make() {
      try {
      	return new MoreFriendsThanQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
