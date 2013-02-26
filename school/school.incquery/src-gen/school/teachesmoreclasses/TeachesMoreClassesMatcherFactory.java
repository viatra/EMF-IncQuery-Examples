package school.teachesmoreclasses;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teachesmoreclasses.TeachesMoreClassesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachesMoreClassesMatcher in a type-safe way.
 * 
 * @see TeachesMoreClassesMatcher
 * @see TeachesMoreClassesMatch
 * 
 */
public final class TeachesMoreClassesMatcherFactory extends BaseGeneratedMatcherFactory<TeachesMoreClassesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesMoreClassesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachesMoreClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeachesMoreClassesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachesMoreClasses";
    
  }
  
  private TeachesMoreClassesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeachesMoreClassesMatcherFactory> {
    @Override
    public TeachesMoreClassesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachesMoreClassesMatcherFactory INSTANCE = make();
    
    public static TeachesMoreClassesMatcherFactory make() {
      try {
      	return new TeachesMoreClassesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
