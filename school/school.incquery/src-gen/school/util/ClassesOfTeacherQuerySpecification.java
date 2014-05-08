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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.ClassesOfTeacherMatcher;
import school.util.CoursesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected ClassesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.classesOfTeacher";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T","SC");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("SC", "school.SchoolClass"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_SC = body.getOrCreateVariableByName("SC");
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_T, "T"), 
        new ExportedParameter(body, var_SC, "SC")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_T, var_C), CoursesOfTeacherQuerySpecification.instance());
      new TypeBinary(body, CONTEXT, var_C, var_SC, getFeatureLiteral("http://school.ecore", "Course", "schoolClass"), "http://school.ecore/Course.schoolClass");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ClassesOfTeacherQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherQuerySpecification make() {
      return new ClassesOfTeacherQuerySpecification();					
      
    }
  }
  
}
