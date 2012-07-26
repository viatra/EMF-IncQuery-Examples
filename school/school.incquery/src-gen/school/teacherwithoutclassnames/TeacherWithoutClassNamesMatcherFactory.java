package school.teacherwithoutclassnames;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.teacherwithoutclassnames.TeacherWithoutClassNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate TeacherWithoutClassNamesMatcher in a type-safe way.
 * 
 * @see TeacherWithoutClassNamesMatcher
 * @see TeacherWithoutClassNamesMatch
 * 
 */
public class TeacherWithoutClassNamesMatcherFactory extends BaseGeneratedMatcherFactory<TeacherWithoutClassNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeacherWithoutClassNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeacherWithoutClassNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new TeacherWithoutClassNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teacherWithoutClassNames";
    
  }
  
  private TeacherWithoutClassNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<TeacherWithoutClassNamesMatcherFactory> {
    @Override
    public TeacherWithoutClassNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeacherWithoutClassNamesMatcherFactory INSTANCE = make();
    
    public static TeacherWithoutClassNamesMatcherFactory make() {
      try {
      	return new TeacherWithoutClassNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
