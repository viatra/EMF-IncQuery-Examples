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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TheOnesWithTheBiggestCircleNameMatch;
import school.TheOnesWithTheBiggestCircleNameMatcher;
import school.util.MoreFriendsThanQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TheOnesWithTheBiggestCircleNameMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleNameMatcher
 * @see TheOnesWithTheBiggestCircleNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TheOnesWithTheBiggestCircleNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<TheOnesWithTheBiggestCircleNameMatcher> {
  private TheOnesWithTheBiggestCircleNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcher.on(engine);
  }
  
  @Override
  public TheOnesWithTheBiggestCircleNameMatch newEmptyMatch() {
    return TheOnesWithTheBiggestCircleNameMatch.newEmptyMatch();
  }
  
  @Override
  public TheOnesWithTheBiggestCircleNameMatch newMatch(final Object... parameters) {
    return TheOnesWithTheBiggestCircleNameMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleNameQuerySpecification INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleNameQuerySpecification make() {
      return new TheOnesWithTheBiggestCircleNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TheOnesWithTheBiggestCircleNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.theOnesWithTheBiggestCircleName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("SName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("SName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_SName = body.getOrCreateVariableByName("SName");
      	PVariable var__Sx = body.getOrCreateVariableByName("_Sx");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_SName, "SName")
      	));
      	new NegativePatternCall(body, new FlatTuple(var__Sx, var_S), MoreFriendsThanQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "name")));
      	new Equality(body, var__virtual_0_, var_SName);
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
