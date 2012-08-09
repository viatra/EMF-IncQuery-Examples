package school.coursewithteacher;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.coursewithteacher.CourseWithTeacherMatcher;

/**
 * A pattern-specific matcher factory that can instantiate CourseWithTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithTeacherMatcher
 * @see CourseWithTeacherMatch
 * 
 */
public class CourseWithTeacherMatcherFactory extends BaseGeneratedMatcherFactory<CourseWithTeacherMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithTeacherMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new CourseWithTeacherMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.CourseWithTeacher";
    
  }
  
  private CourseWithTeacherMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<CourseWithTeacherMatcherFactory> {
    @Override
    public CourseWithTeacherMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static CourseWithTeacherMatcherFactory INSTANCE = make();
    
    public static CourseWithTeacherMatcherFactory make() {
      try {
      	return new CourseWithTeacherMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
