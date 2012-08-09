package school.teachers;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teachers.TeachersMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeachersMatcher in a type-safe way.
 * 
 * @see TeachersMatcher
 * @see TeachersMatch
 * 
 */
public class TeachersMatcherFactory extends BaseGeneratedMatcherFactory<TeachersMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeachersMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teachers";
    
  }
  
  private TeachersMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeachersMatcherFactory> {
    @Override
    public TeachersMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachersMatcherFactory INSTANCE = make();
    
    public static TeachersMatcherFactory make() {
      try {
      	return new TeachersMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
