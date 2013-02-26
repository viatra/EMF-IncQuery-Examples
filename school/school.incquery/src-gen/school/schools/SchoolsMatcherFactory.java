package school.schools;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.schools.SchoolsMatcher;

/**
 * A pattern-specific matcher factory that can instantiate SchoolsMatcher in a type-safe way.
 * 
 * @see SchoolsMatcher
 * @see SchoolsMatch
 * 
 */
public final class SchoolsMatcherFactory extends BaseGeneratedMatcherFactory<SchoolsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SchoolsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new SchoolsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.schools";
    
  }
  
  private SchoolsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<SchoolsMatcherFactory> {
    @Override
    public SchoolsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static SchoolsMatcherFactory INSTANCE = make();
    
    public static SchoolsMatcherFactory make() {
      try {
      	return new SchoolsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
