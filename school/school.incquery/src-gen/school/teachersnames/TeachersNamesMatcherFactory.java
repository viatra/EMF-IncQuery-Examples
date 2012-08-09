package school.teachersnames;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teachersnames.TeachersNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachersNamesMatcher in a type-safe way.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesMatch
 * 
 */
public class TeachersNamesMatcherFactory extends BaseGeneratedMatcherFactory<TeachersNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeachersNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachersNames";
    
  }
  
  private TeachersNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeachersNamesMatcherFactory> {
    @Override
    public TeachersNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachersNamesMatcherFactory INSTANCE = make();
    
    public static TeachersNamesMatcherFactory make() {
      try {
      	return new TeachersNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
