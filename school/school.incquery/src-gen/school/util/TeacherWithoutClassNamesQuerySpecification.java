package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.TeacherWithoutClassNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeacherWithoutClassNamesMatcher in a type-safe way.
 * 
 * @see TeacherWithoutClassNamesMatcher
 * @see TeacherWithoutClassNamesMatch
 * 
 */
public final class TeacherWithoutClassNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeacherWithoutClassNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeacherWithoutClassNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeacherWithoutClassNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeacherWithoutClassNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.teacherWithoutClassNames";
    
  }
  
  private TeacherWithoutClassNamesQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<TeacherWithoutClassNamesQuerySpecification> {
    @Override
    public TeacherWithoutClassNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static TeacherWithoutClassNamesQuerySpecification INSTANCE = make();
    
    public static TeacherWithoutClassNamesQuerySpecification make() {
      try {
      	return new TeacherWithoutClassNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
