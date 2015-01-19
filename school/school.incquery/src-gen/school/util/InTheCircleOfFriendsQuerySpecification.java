package school.util;

import com.google.common.collect.Sets;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.InTheCircleOfFriendsMatch;
import school.InTheCircleOfFriendsMatcher;
import school.util.FriendlyToQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate InTheCircleOfFriendsMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsMatcher
 * @see InTheCircleOfFriendsMatch
 * 
 */
@SuppressWarnings("all")
public final class InTheCircleOfFriendsQuerySpecification extends BaseGeneratedEMFQuerySpecification<InTheCircleOfFriendsMatcher> {
  private InTheCircleOfFriendsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InTheCircleOfFriendsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsMatcher.on(engine);
  }
  
  @Override
  public InTheCircleOfFriendsMatch newEmptyMatch() {
    return InTheCircleOfFriendsMatch.newEmptyMatch();
  }
  
  @Override
  public InTheCircleOfFriendsMatch newMatch(final Object... parameters) {
    return InTheCircleOfFriendsMatch.newMatch((school.Student) parameters[0], (school.Student) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static InTheCircleOfFriendsQuerySpecification INSTANCE = make();
    
    public static InTheCircleOfFriendsQuerySpecification make() {
      return new InTheCircleOfFriendsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InTheCircleOfFriendsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.inTheCircleOfFriends";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S1","Someone");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("S1", "school.Student"),new PParameter("Someone", "school.Student"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_S1 = body.getOrCreateVariableByName("S1");
      	PVariable var_Someone = body.getOrCreateVariableByName("Someone");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_Someone, "Someone")
      	));
      	new TypeUnary(body, var_S1, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new TypeUnary(body, var_Someone, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new BinaryTransitiveClosure(body, new FlatTuple(var_S1, var_Someone), FriendlyToQuerySpecification.instance().getInternalQueryRepresentation());
      	new Inequality(body, var_S1, var_Someone);
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
