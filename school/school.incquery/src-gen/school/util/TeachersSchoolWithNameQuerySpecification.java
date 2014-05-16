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
import school.TeachersSchoolWithNameMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersSchoolWithNameMatcher in a type-safe way.
 * 
 * @see TeachersSchoolWithNameMatcher
 * @see TeachersSchoolWithNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersSchoolWithNameQuerySpecification extends BaseGeneratedQuerySpecification<TeachersSchoolWithNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersSchoolWithNameQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected TeachersSchoolWithNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersSchoolWithNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.TeachersSchoolWithName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("teacher","school","name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("teacher", "school.Teacher"),new PParameter("school", "school.School"),new PParameter("name", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_teacher = body.getOrCreateVariableByName("teacher");
      PVariable var_school = body.getOrCreateVariableByName("school");
      PVariable var_name = body.getOrCreateVariableByName("name");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_teacher, "teacher"), 
        new ExportedParameter(body, var_school, "school"), 
        new ExportedParameter(body, var_name, "name")
      ));
      
      
      
      new TypeBinary(body, CONTEXT, var_teacher, var_school, getFeatureLiteral("http://school.ecore", "Teacher", "school"), "http://school.ecore/Teacher.school");
      new TypeBinary(body, CONTEXT, var_school, var_name, getFeatureLiteral("http://school.ecore", "School", "name"), "http://school.ecore/School.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersSchoolWithNameQuerySpecification INSTANCE = make();
    
    public static TeachersSchoolWithNameQuerySpecification make() {
      return new TeachersSchoolWithNameQuerySpecification();					
      
    }
  }
  
}
