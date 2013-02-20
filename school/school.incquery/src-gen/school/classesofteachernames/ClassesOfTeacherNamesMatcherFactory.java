package school.classesofteachernames;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.classesofteachernames.ClassesOfTeacherNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate ClassesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherNamesMatcher
 * @see ClassesOfTeacherNamesMatch
 * 
 */
public final class ClassesOfTeacherNamesMatcherFactory extends BaseGeneratedMatcherFactory<ClassesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ClassesOfTeacherNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.classesOfTeacherNames";
    
  }
  
  private ClassesOfTeacherNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ClassesOfTeacherNamesMatcherFactory> {
    @Override
    public ClassesOfTeacherNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ClassesOfTeacherNamesMatcherFactory INSTANCE = make();
    
    public static ClassesOfTeacherNamesMatcherFactory make() {
      try {
      	return new ClassesOfTeacherNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
