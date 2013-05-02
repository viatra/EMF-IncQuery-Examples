package school.inthecircleoffriendsnames;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate InTheCircleOfFriendsNamesMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsNamesMatcher
 * @see InTheCircleOfFriendsNamesMatch
 * 
 */
public final class InTheCircleOfFriendsNamesQuerySpecification extends BaseGeneratedQuerySpecification<InTheCircleOfFriendsNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsNamesQuerySpecification instance() throws IncQueryException {
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
  
  private InTheCircleOfFriendsNamesQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<InTheCircleOfFriendsNamesQuerySpecification> {
    @Override
    public InTheCircleOfFriendsNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsNamesQuerySpecification INSTANCE = make();
    
    public static InTheCircleOfFriendsNamesQuerySpecification make() {
      try {
      	return new InTheCircleOfFriendsNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
