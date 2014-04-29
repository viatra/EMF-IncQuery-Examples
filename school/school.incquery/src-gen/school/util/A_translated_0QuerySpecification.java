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
import school.A_translated_0Matcher;

/**
 * A pattern-specific query specification that can instantiate A_translated_0Matcher in a type-safe way.
 * 
 * @see A_translated_0Matcher
 * @see A_translated_0Match
 * 
 */
@SuppressWarnings("all")
public final class A_translated_0QuerySpecification extends BaseGeneratedQuerySpecification<A_translated_0Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static A_translated_0QuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected A_translated_0Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return A_translated_0Matcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.A_translated_0";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("s2","s1");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("s2", "school.Student"),new PParameter("s1", "school.Student"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_s2 = body.getOrCreateVariableByName("s2");
      PVariable var_s1 = body.getOrCreateVariableByName("s1");
      PVariable var_eString_0 = body.getOrCreateVariableByName("eString_0");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_s2, "s2"), 
        new ExportedParameter(body, var_s1, "s1")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_s2, var_eString_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new TypeBinary(body, CONTEXT, var_s1, var_eString_0, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<A_translated_0QuerySpecification> {
    @Override
    public A_translated_0QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static A_translated_0QuerySpecification INSTANCE = make();
    
    public static A_translated_0QuerySpecification make() {
      return new A_translated_0QuerySpecification();					
      
    }
  }
  
}
