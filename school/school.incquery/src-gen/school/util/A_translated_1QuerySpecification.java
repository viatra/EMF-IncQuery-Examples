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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.A_translated_1Matcher;

/**
 * A pattern-specific query specification that can instantiate A_translated_1Matcher in a type-safe way.
 * 
 * @see A_translated_1Matcher
 * @see A_translated_1Match
 * 
 */
@SuppressWarnings("all")
public final class A_translated_1QuerySpecification extends BaseGeneratedQuerySpecification<A_translated_1Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static A_translated_1QuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected A_translated_1Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return A_translated_1Matcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.A_translated_1";
    
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
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_s2, "s2"), 
        new ExportedParameter(body, var_s1, "s1")
      ));
      
      new TypeUnary(body, var_s2, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      
      new TypeUnary(body, var_s1, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      new Inequality(body, var_s1, var_s2);
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<A_translated_1QuerySpecification> {
    @Override
    public A_translated_1QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static A_translated_1QuerySpecification INSTANCE = make();
    
    public static A_translated_1QuerySpecification make() {
      return new A_translated_1QuerySpecification();					
      
    }
  }
  
}
