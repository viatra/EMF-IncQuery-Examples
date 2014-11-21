package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EObjectMatch;
import hu.bme.mit.incquery.ecorequeries.example.EObjectMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate EObjectMatcher in a type-safe way.
 * 
 * @see EObjectMatcher
 * @see EObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class EObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<EObjectMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EObjectQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected EObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EObjectMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EObject";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("E");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("E", "org.eclipse.emf.ecore.EObject"));
  }
  
  @Override
  public EObjectMatch newEmptyMatch() {
    return EObjectMatch.newEmptyMatch();
  }
  
  @Override
  public EObjectMatch newMatch(final Object... parameters) {
    return EObjectMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_E = body.getOrCreateVariableByName("E");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_E, "E")
      ));
      
      new TypeUnary(body, var_E, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject"), "http://www.eclipse.org/emf/2002/Ecore/EObject");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static EObjectQuerySpecification INSTANCE = make();
    
    public static EObjectQuerySpecification make() {
      return new EObjectQuerySpecification();					
      
    }
  }
}
