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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.InTheCircleOfFriendsNamesMatch;
import school.InTheCircleOfFriendsNamesMatcher;
import school.util.FriendlyToQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate InTheCircleOfFriendsNamesMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsNamesMatcher
 * @see InTheCircleOfFriendsNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class InTheCircleOfFriendsNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<InTheCircleOfFriendsNamesMatcher> {
  private InTheCircleOfFriendsNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InTheCircleOfFriendsNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsNamesMatcher.on(engine);
  }
  
  @Override
  public InTheCircleOfFriendsNamesMatch newEmptyMatch() {
    return InTheCircleOfFriendsNamesMatch.newEmptyMatch();
  }
  
  @Override
  public InTheCircleOfFriendsNamesMatch newMatch(final Object... parameters) {
    return InTheCircleOfFriendsNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsNamesQuerySpecification INSTANCE = make();
    
    public static InTheCircleOfFriendsNamesQuerySpecification make() {
      return new InTheCircleOfFriendsNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InTheCircleOfFriendsNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.inTheCircleOfFriendsNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S1Name","SomeoneName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("S1Name", "java.lang.String"),new PParameter("SomeoneName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_S1Name = body.getOrCreateVariableByName("S1Name");
      	PVariable var_SomeoneName = body.getOrCreateVariableByName("SomeoneName");
      	PVariable var_S1 = body.getOrCreateVariableByName("S1");
      	PVariable var_Someone = body.getOrCreateVariableByName("Someone");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1Name, "S1Name"),
      				
      		new ExportedParameter(body, var_SomeoneName, "SomeoneName")
      	));
      	new BinaryTransitiveClosure(body, new FlatTuple(var_S1, var_Someone), FriendlyToQuerySpecification.instance().getInternalQueryRepresentation());
      	new Inequality(body, var_S1, var_Someone);
      	new TypeConstraint(body, new FlatTuple(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "name")));
      	new Equality(body, var__virtual_0_, var_S1Name);
      	new TypeConstraint(body, new FlatTuple(var_Someone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_Someone, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "name")));
      	new Equality(body, var__virtual_1_, var_SomeoneName);
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
