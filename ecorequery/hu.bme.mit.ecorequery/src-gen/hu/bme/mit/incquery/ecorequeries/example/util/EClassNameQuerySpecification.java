package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.EClassNameMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate EClassNameMatcher in a type-safe way.
 * 
 * @see EClassNameMatcher
 * @see EClassNameMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<EClassNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassNameQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected EClassNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EClassNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("EName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("EName", "java.lang.String"));
  }
  
  @Override
  public EClassNameMatch newEmptyMatch() {
    return EClassNameMatch.newEmptyMatch();
  }
  
  @Override
  public EClassNameMatch newMatch(final Object... parameters) {
    return EClassNameMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_EName = body.getOrCreateVariableByName("EName");
      PVariable var__EClass = body.getOrCreateVariableByName("_EClass");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_EName, "EName")
      ));
      
      new TypeUnary(body, var__EClass, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
      new TypeBinary(body, CONTEXT, var__EClass, var_EName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static EClassNameQuerySpecification INSTANCE = make();
    
    public static EClassNameQuerySpecification make() {
      return new EClassNameQuerySpecification();					
      
    }
  }
}
