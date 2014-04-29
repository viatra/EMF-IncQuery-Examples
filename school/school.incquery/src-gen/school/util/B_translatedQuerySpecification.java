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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.B_translatedMatcher;

/**
 * A pattern-specific query specification that can instantiate B_translatedMatcher in a type-safe way.
 * 
 * @see B_translatedMatcher
 * @see B_translatedMatch
 * 
 */
@SuppressWarnings("all")
public final class B_translatedQuerySpecification extends BaseGeneratedQuerySpecification<B_translatedMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static B_translatedQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected B_translatedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return B_translatedMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.B_translated";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("self","student2","student1","name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("self", "school.SchoolClass"),new PParameter("student2", "school.Student"),new PParameter("student1", "school.Student"),new PParameter("name", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_self = body.getOrCreateVariableByName("self");
      PVariable var_student = body.getOrCreateVariableByName("student");
      PVariable var_eString_0 = body.getOrCreateVariableByName("eString_0");
      PVariable var_student_0 = body.getOrCreateVariableByName("student_0");
      PVariable var_eString_1 = body.getOrCreateVariableByName("eString_1");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_self, "self"), 
        new ExportedParameter(body, var_student_0, "student2"), 
        new ExportedParameter(body, var_student, "student1"), 
        new ExportedParameter(body, var_eString_1, "name")
      ));
      
      
      
      
      new TypeBinary(body, CONTEXT, var_self, var_student, getFeatureLiteral("http://school.ecore", "SchoolClass", "students"), "http://school.ecore/SchoolClass.students");
      new TypeBinary(body, CONTEXT, var_student_0, var_eString_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new TypeBinary(body, CONTEXT, var_student, var_eString_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new Inequality(body, var_student, var_student_0);
      new TypeBinary(body, CONTEXT, var_self, var_student_0, getFeatureLiteral("http://school.ecore", "SchoolClass", "students"), "http://school.ecore/SchoolClass.students");
      new TypeBinary(body, CONTEXT, var_student, var_eString_1, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<B_translatedQuerySpecification> {
    @Override
    public B_translatedQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static B_translatedQuerySpecification INSTANCE = make();
    
    public static B_translatedQuerySpecification make() {
      return new B_translatedQuerySpecification();					
      
    }
  }
  
}
