package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatch;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate SuperTypeOfMatcher in a type-safe way.
 * 
 * @see SuperTypeOfMatcher
 * @see SuperTypeOfMatch
 * 
 */
@SuppressWarnings("all")
public final class SuperTypeOfQuerySpecification extends BaseGeneratedEMFQuerySpecification<SuperTypeOfMatcher> {
  private SuperTypeOfQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SuperTypeOfMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfMatcher.on(engine);
  }
  
  @Override
  public SuperTypeOfMatch newEmptyMatch() {
    return SuperTypeOfMatch.newEmptyMatch();
  }
  
  @Override
  public SuperTypeOfMatch newMatch(final Object... parameters) {
    return SuperTypeOfMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SuperTypeOfQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfQuerySpecification make() {
      return new SuperTypeOfQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SuperTypeOfQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Super","Sub");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Super", "org.eclipse.emf.ecore.EClass"),new PParameter("Sub", "org.eclipse.emf.ecore.EClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_Super = body.getOrCreateVariableByName("Super");
      	PVariable var_Sub = body.getOrCreateVariableByName("Sub");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_Super, "Super"),
      				
      		new ExportedParameter(body, var_Sub, "Sub")
      	));
      	new TypeBinary(body, CONTEXT, var_Sub, var_Super, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eSuperTypes");
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
