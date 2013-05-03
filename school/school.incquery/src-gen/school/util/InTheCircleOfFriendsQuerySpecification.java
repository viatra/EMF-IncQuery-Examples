package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.InTheCircleOfFriendsMatcher;

/**
 * A pattern-specific query specification that can instantiate InTheCircleOfFriendsMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsMatcher
 * @see InTheCircleOfFriendsMatch
 * 
 */
public final class InTheCircleOfFriendsQuerySpecification extends BaseGeneratedQuerySpecification<InTheCircleOfFriendsMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected InTheCircleOfFriendsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.inTheCircleOfFriends";
    
  }
  
  private InTheCircleOfFriendsQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<InTheCircleOfFriendsQuerySpecification> {
    @Override
    public InTheCircleOfFriendsQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsQuerySpecification INSTANCE = make();
    
    public static InTheCircleOfFriendsQuerySpecification make() {
      try {
      	return new InTheCircleOfFriendsQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
