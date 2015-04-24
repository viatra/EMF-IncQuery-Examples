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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.FriendlyToMatch;
import school.FriendlyToMatcher;

/**
 * A pattern-specific query specification that can instantiate FriendlyToMatcher in a type-safe way.
 * 
 * @see FriendlyToMatcher
 * @see FriendlyToMatch
 * 
 */
@SuppressWarnings("all")
public final class FriendlyToQuerySpecification extends BaseGeneratedEMFQuerySpecification<FriendlyToMatcher> {
  private FriendlyToQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FriendlyToQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FriendlyToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FriendlyToMatcher.on(engine);
  }
  
  @Override
  public FriendlyToMatch newEmptyMatch() {
    return FriendlyToMatch.newEmptyMatch();
  }
  
  @Override
  public FriendlyToMatch newMatch(final Object... parameters) {
    return FriendlyToMatch.newMatch((school.Student) parameters[0], (school.Student) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static FriendlyToQuerySpecification INSTANCE = make();
    
    public static FriendlyToQuerySpecification make() {
      return new FriendlyToQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FriendlyToQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.friendlyTo";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S1","S2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("S1", "school.Student"),new PParameter("S2", "school.Student"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_S1 = body.getOrCreateVariableByName("S1");
      	PVariable var_S2 = body.getOrCreateVariableByName("S2");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_S2, "S2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "friendsWith")));
      	new Equality(body, var__virtual_0_, var_S2);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_S1 = body.getOrCreateVariableByName("S1");
      	PVariable var_S2 = body.getOrCreateVariableByName("S2");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_S2, "S2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S2, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "friendsWith")));
      	new Equality(body, var__virtual_0_, var_S1);
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("QueryExplorer");
      	annotation.addAttribute("display", false);
      	addAnnotation(annotation);
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
