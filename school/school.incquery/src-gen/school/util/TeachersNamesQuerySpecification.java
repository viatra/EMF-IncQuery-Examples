package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TeachersNamesMatch;
import school.TeachersNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersNamesMatcher in a type-safe way.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeachersNamesMatcher> {
  private TeachersNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeachersNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersNamesMatcher.on(engine);
  }
  
  @Override
  public TeachersNamesMatch newEmptyMatch() {
    return TeachersNamesMatch.newEmptyMatch();
  }
  
  @Override
  public TeachersNamesMatch newMatch(final Object... parameters) {
    return TeachersNamesMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TeachersNamesQuerySpecification INSTANCE = make();
    
    public static TeachersNamesQuerySpecification make() {
      return new TeachersNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeachersNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.teachersNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("TN");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("TN", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_TN = body.getOrCreateVariableByName("TN");
      	PVariable var__T = body.getOrCreateVariableByName("_T");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_TN, "TN")
      	));
      	new TypeConstraint(body, new FlatTuple(var__T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var__T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "name")));
      	new Equality(body, var__virtual_0_, var_TN);
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
