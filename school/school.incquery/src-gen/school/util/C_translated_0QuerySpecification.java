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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.C_translated_0Matcher;

/**
 * A pattern-specific query specification that can instantiate C_translated_0Matcher in a type-safe way.
 * 
 * @see C_translated_0Matcher
 * @see C_translated_0Match
 * 
 */
@SuppressWarnings("all")
public final class C_translated_0QuerySpecification extends BaseGeneratedQuerySpecification<C_translated_0Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static C_translated_0QuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected C_translated_0Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return C_translated_0Matcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.C_translated_0";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("temp1","string_1");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("temp1", "school.Student"),new PParameter("string_1", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_temp1 = body.getOrCreateVariableByName("temp1");
      PVariable var_string_1 = body.getOrCreateVariableByName("string_1");
      PVariable var_string_0 = body.getOrCreateVariableByName("string_0");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_temp1, "temp1"), 
        new ExportedParameter(body, var_string_1, "string_1")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_temp1, var_string_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new ConstantValue(body, var_string_0, "Istvan Rath");
      new ConstantValue(body, var_string_1, "almafa");
      bodies.add(body);
    }
    {
      PBody body = new PBody(this);
      PVariable var_temp1 = body.getOrCreateVariableByName("temp1");
      PVariable var_string_1 = body.getOrCreateVariableByName("string_1");
      PVariable var_eString_0 = body.getOrCreateVariableByName("eString_0");
      PVariable var_string_0 = body.getOrCreateVariableByName("string_0");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_temp1, "temp1"), 
        new ExportedParameter(body, var_string_1, "string_1")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_temp1, var_eString_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new ConstantValue(body, var_string_0, "Istvan Rath");
      new Inequality(body, var_eString_0, var_string_0);
      new TypeBinary(body, CONTEXT, var_temp1, var_string_1, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<C_translated_0QuerySpecification> {
    @Override
    public C_translated_0QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static C_translated_0QuerySpecification INSTANCE = make();
    
    public static C_translated_0QuerySpecification make() {
      return new C_translated_0QuerySpecification();					
      
    }
  }
  
}
