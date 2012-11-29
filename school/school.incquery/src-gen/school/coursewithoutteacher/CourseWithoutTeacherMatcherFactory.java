package school.coursewithoutteacher;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithoutteacher.CourseWithoutTeacherMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithoutTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithoutTeacherMatcher
 * @see CourseWithoutTeacherMatch
 * 
 */
public class CourseWithoutTeacherMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithoutTeacherMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithoutTeacherMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithoutTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithoutTeacherMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.CourseWithoutTeacher";
    
  }
  
  private CourseWithoutTeacherMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithoutTeacherMatcherFactory> {
    @Override
    public CourseWithoutTeacherMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithoutTeacherMatcherFactory INSTANCE = make();
    
    public static CourseWithoutTeacherMatcherFactory make() {
      try {
      	return new CourseWithoutTeacherMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
