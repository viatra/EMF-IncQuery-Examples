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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.CourseWithTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithTeacherMatcher
 * @see CourseWithTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithTeacherQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CourseWithTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithTeacherMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.CourseWithTeacher";
    
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
      PVariable var__T = body.getOrCreateVariableByName("_T");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeBinary(body, CONTEXT, var_C, var__T, getFeatureLiteral("http://school.ecore", "Course", "teacher"), "http://school.ecore/Course.teacher");
      bodies.add(body);
    }
    {
      PAnnotation annotation = new PAnnotation("QueryExplorer");
      annotation.addAttribute("display",false);
      addAnnotation(annotation);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithTeacherQuerySpecification INSTANCE = make();
    
    public static CourseWithTeacherQuerySpecification make() {
      return new CourseWithTeacherQuerySpecification();					
      
    }
  }
  
}
