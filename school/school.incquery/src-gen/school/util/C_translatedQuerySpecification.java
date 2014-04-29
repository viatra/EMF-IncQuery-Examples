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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.C_translatedMatcher;
import school.util.C_translated_0QuerySpecification;

/**
 * A pattern-specific query specification that can instantiate C_translatedMatcher in a type-safe way.
 * 
 * @see C_translatedMatcher
 * @see C_translatedMatch
 * 
 */
@SuppressWarnings("all")
public final class C_translatedQuerySpecification extends BaseGeneratedQuerySpecification<C_translatedMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static C_translatedQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected C_translatedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return C_translatedMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.C_translated";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("self","string_1");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("self", "school.SchoolClass"),new PParameter("string_1", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_self = body.getOrCreateVariableByName("self");
      PVariable var_string_1 = body.getOrCreateVariableByName("string_1");
      PVariable var_student = body.getOrCreateVariableByName("student");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_self, "self"), 
        new ExportedParameter(body, var_string_1, "string_1")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_self, var_student, getFeatureLiteral("http://school.ecore", "SchoolClass", "students"), "http://school.ecore/SchoolClass.students");
      new PositivePatternCall(body, new FlatTuple(var_student, var_string_1), C_translated_0QuerySpecification.instance());
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<C_translatedQuerySpecification> {
    @Override
    public C_translatedQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static C_translatedQuerySpecification INSTANCE = make();
    
    public static C_translatedQuerySpecification make() {
      return new C_translatedQuerySpecification();					
      
    }
  }
  
}
