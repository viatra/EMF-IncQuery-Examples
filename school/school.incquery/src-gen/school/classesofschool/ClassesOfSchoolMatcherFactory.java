package school.classesofschool;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.classesofschool.ClassesOfSchoolMatcher;

/**
 * A pattern-specific matcher factory that can instantiate ClassesOfSchoolMatcher in a type-safe way.
 * 
 * @see ClassesOfSchoolMatcher
 * @see ClassesOfSchoolMatch
 * 
 */
public class ClassesOfSchoolMatcherFactory extends BaseGeneratedMatcherFactory<ClassesOfSchoolMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfSchoolMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new ClassesOfSchoolMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.classesOfSchool";
    
  }
  
  private ClassesOfSchoolMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<ClassesOfSchoolMatcherFactory> {
    @Override
    public ClassesOfSchoolMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ClassesOfSchoolMatcherFactory INSTANCE = make();
    
    public static ClassesOfSchoolMatcherFactory make() {
      try {
      	return new ClassesOfSchoolMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
