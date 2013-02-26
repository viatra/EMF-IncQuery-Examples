package school.coursesofteacher;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursesofteacher.CoursesOfTeacherMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CoursesOfTeacherMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherMatch
 * 
 */
public final class CoursesOfTeacherMatcherFactory extends BaseGeneratedMatcherFactory<CoursesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CoursesOfTeacherMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.coursesOfTeacher";
    
  }
  
  private CoursesOfTeacherMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CoursesOfTeacherMatcherFactory> {
    @Override
    public CoursesOfTeacherMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CoursesOfTeacherMatcherFactory INSTANCE = make();
    
    public static CoursesOfTeacherMatcherFactory make() {
      try {
      	return new CoursesOfTeacherMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
