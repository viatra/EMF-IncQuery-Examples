package school.classesofteacher;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.classesofteacher.ClassesOfTeacherMatcher;

/**
 * A pattern-specific matcher factory that can instantiate ClassesOfTeacherMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherMatch
 * 
 */
public final class ClassesOfTeacherMatcherFactory extends BaseGeneratedMatcherFactory<ClassesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ClassesOfTeacherMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.classesOfTeacher";
    
  }
  
  private ClassesOfTeacherMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ClassesOfTeacherMatcherFactory> {
    @Override
    public ClassesOfTeacherMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ClassesOfTeacherMatcherFactory INSTANCE = make();
    
    public static ClassesOfTeacherMatcherFactory make() {
      try {
      	return new ClassesOfTeacherMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
