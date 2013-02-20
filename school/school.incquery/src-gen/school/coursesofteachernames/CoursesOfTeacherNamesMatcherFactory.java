package school.coursesofteachernames;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursesofteachernames.CoursesOfTeacherNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CoursesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesMatch
 * 
 */
public final class CoursesOfTeacherNamesMatcherFactory extends BaseGeneratedMatcherFactory<CoursesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CoursesOfTeacherNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.coursesOfTeacherNames";
    
  }
  
  private CoursesOfTeacherNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CoursesOfTeacherNamesMatcherFactory> {
    @Override
    public CoursesOfTeacherNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CoursesOfTeacherNamesMatcherFactory INSTANCE = make();
    
    public static CoursesOfTeacherNamesMatcherFactory make() {
      try {
      	return new CoursesOfTeacherNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
