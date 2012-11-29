package school.teachersofschool;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teachersofschool.TeachersOfSchoolMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachersOfSchoolMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolMatch
 * 
 */
public class TeachersOfSchoolMatcherFactory extends BaseGeneratedMatcherFactory<TeachersOfSchoolMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeachersOfSchoolMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachersOfSchool";
    
  }
  
  private TeachersOfSchoolMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeachersOfSchoolMatcherFactory> {
    @Override
    public TeachersOfSchoolMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachersOfSchoolMatcherFactory INSTANCE = make();
    
    public static TeachersOfSchoolMatcherFactory make() {
      try {
      	return new TeachersOfSchoolMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
