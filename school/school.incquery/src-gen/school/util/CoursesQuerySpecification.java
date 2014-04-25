package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.CoursesMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesMatcher in a type-safe way.
 * 
 * @see CoursesMatcher
 * @see CoursesMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesQuerySpecification extends BaseGeneratedQuerySpecification<CoursesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.courses";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("C");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("C", "school.Course"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "Course"), "http://school.ecore/Course");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoursesQuerySpecification> {
    @Override
    public CoursesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesQuerySpecification INSTANCE = make();
    
    public static CoursesQuerySpecification make() {
      return new CoursesQuerySpecification();					
      
    }
  }
  
}
