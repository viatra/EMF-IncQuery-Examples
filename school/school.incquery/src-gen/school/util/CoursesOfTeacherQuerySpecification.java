package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.CoursesOfTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CoursesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CoursesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.coursesOfTeacher";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T","C");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("C", "school.Course"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_T, "T"), 
        new ExportedParameter(body, var_C, "C")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_T, var_C, getFeatureLiteral("http://school.ecore", "Teacher", "courses"), "http://school.ecore/Teacher.courses");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesOfTeacherQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherQuerySpecification make() {
      return new CoursesOfTeacherQuerySpecification();					
      
    }
  }
  
}
