package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.ClassesOfTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherMatch
 * 
 */
public final class ClassesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.classesOfTeacher";
    
  }
  
  private ClassesOfTeacherQuerySpecification() throws IncQueryException {
    super();
  }
  public static class Provider implements IQuerySpecificationProvider<ClassesOfTeacherQuerySpecification> {
    @Override
    public ClassesOfTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static ClassesOfTeacherQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherQuerySpecification make() {
      try {
      	return new ClassesOfTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
