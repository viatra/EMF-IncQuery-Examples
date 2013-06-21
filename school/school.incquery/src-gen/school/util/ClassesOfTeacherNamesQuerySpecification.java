package school.util;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import school.ClassesOfTeacherNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherNamesMatcher
 * @see ClassesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfTeacherNamesQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherNamesMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "school.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "school.classesOfTeacherNames";
    
  }
  
  private ClassesOfTeacherNamesQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ClassesOfTeacherNamesQuerySpecification> {
    @Override
    public ClassesOfTeacherNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ClassesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherNamesQuerySpecification make() {
      try {
      	return new ClassesOfTeacherNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
