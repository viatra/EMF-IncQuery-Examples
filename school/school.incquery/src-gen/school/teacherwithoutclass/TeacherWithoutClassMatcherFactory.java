package school.teacherwithoutclass;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teacherwithoutclass.TeacherWithoutClassMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeacherWithoutClassMatcher in a type-safe way.
 * 
 * @see TeacherWithoutClassMatcher
 * @see TeacherWithoutClassMatch
 * 
 */
public class TeacherWithoutClassMatcherFactory extends BaseGeneratedMatcherFactory<TeacherWithoutClassMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeacherWithoutClassMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeacherWithoutClassMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeacherWithoutClassMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teacherWithoutClass";
    
  }
  
  private TeacherWithoutClassMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeacherWithoutClassMatcherFactory> {
    @Override
    public TeacherWithoutClassMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeacherWithoutClassMatcherFactory INSTANCE = make();
    
    public static TeacherWithoutClassMatcherFactory make() {
      try {
      	return new TeacherWithoutClassMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
