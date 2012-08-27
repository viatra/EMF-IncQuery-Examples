package school.studentofschoolnames;

import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.IMatcherFactoryProvider;
import school.studentofschoolnames.StudentOfSchoolNamesMatcher;

/**
 * A pattern-specific matcher factory that can instantiate StudentOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolNamesMatcher
 * @see StudentOfSchoolNamesMatch
 * 
 */
public class StudentOfSchoolNamesMatcherFactory extends BaseGeneratedMatcherFactory<StudentOfSchoolNamesMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolNamesMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected StudentOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new StudentOfSchoolNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.studentOfSchoolNames";
    
  }
  
  private StudentOfSchoolNamesMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<StudentOfSchoolNamesMatcherFactory> {
    @Override
    public StudentOfSchoolNamesMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static StudentOfSchoolNamesMatcherFactory INSTANCE = make();
    
    public static StudentOfSchoolNamesMatcherFactory make() {
      try {
      	return new StudentOfSchoolNamesMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
