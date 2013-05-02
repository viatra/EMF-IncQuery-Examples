package school.teachers;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.teachers.TeachersMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersMatcher in a type-safe way.
 * 
 * @see TeachersMatcher
 * @see TeachersMatch
 * 
 */
public final class TeachersQuerySpecification extends BaseGeneratedQuerySpecification<TeachersMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersQuerySpecification instance() throws IncQueryException {
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
  
  private TeachersQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TeachersQuerySpecification> {
    @Override
    public TeachersQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeachersQuerySpecification INSTANCE = make();
    
    public static TeachersQuerySpecification make() {
      try {
      	return new TeachersQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
