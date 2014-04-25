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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.StudentOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate StudentOfSchoolMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class StudentOfSchoolQuerySpecification extends BaseGeneratedQuerySpecification<StudentOfSchoolMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected StudentOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.studentOfSchool";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S","Sch");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S", "school.Student"),new PParameter("Sch", "school.School"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S, "S"), 
        new ExportedParameter(body, var_Sch, "Sch")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_S, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Student", "schoolClass"), "http://school.ecore/Student.schoolClass");
      new TypeBinary(body, CONTEXT, var__virtual_0_, var__virtual_1_, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      new TypeBinary(body, CONTEXT, var__virtual_1_, var_Sch, getFeatureLiteral("http://school.ecore", "Course", "school"), "http://school.ecore/Course.school");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<StudentOfSchoolQuerySpecification> {
    @Override
    public StudentOfSchoolQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static StudentOfSchoolQuerySpecification INSTANCE = make();
    
    public static StudentOfSchoolQuerySpecification make() {
      return new StudentOfSchoolQuerySpecification();					
      
    }
  }
  
}
