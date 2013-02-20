package school.studentofschool;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.studentofschool.StudentOfSchoolMatcher;

/**
 * A pattern-specific matcher factory that can instantiate StudentOfSchoolMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolMatch
 * 
 */
public final class StudentOfSchoolMatcherFactory extends BaseGeneratedMatcherFactory<StudentOfSchoolMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StudentOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StudentOfSchoolMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentOfSchool";
    
  }
  
  private StudentOfSchoolMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StudentOfSchoolMatcherFactory> {
    @Override
    public StudentOfSchoolMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StudentOfSchoolMatcherFactory INSTANCE = make();
    
    public static StudentOfSchoolMatcherFactory make() {
      try {
      	return new StudentOfSchoolMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
