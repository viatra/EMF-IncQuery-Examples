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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.IncreasingAlphabeticalFriendshipChainRecMatch;
import school.IncreasingAlphabeticalFriendshipChainRecMatcher;
import school.util.AlphabeticallyAfterFriendQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate IncreasingAlphabeticalFriendshipChainRecMatcher in a type-safe way.
 * 
 * @see IncreasingAlphabeticalFriendshipChainRecMatcher
 * @see IncreasingAlphabeticalFriendshipChainRecMatch
 * 
 */
@SuppressWarnings("all")
public final class IncreasingAlphabeticalFriendshipChainRecQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncreasingAlphabeticalFriendshipChainRecMatcher> {
  private IncreasingAlphabeticalFriendshipChainRecQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncreasingAlphabeticalFriendshipChainRecQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncreasingAlphabeticalFriendshipChainRecMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainRecMatcher.on(engine);
  }
  
  @Override
  public IncreasingAlphabeticalFriendshipChainRecMatch newEmptyMatch() {
    return IncreasingAlphabeticalFriendshipChainRecMatch.newEmptyMatch();
  }
  
  @Override
  public IncreasingAlphabeticalFriendshipChainRecMatch newMatch(final Object... parameters) {
    return IncreasingAlphabeticalFriendshipChainRecMatch.newMatch((school.Student) parameters[0], (school.Student) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static IncreasingAlphabeticalFriendshipChainRecQuerySpecification INSTANCE = make();
    
    public static IncreasingAlphabeticalFriendshipChainRecQuerySpecification make() {
      return new IncreasingAlphabeticalFriendshipChainRecQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IncreasingAlphabeticalFriendshipChainRecQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.increasingAlphabeticalFriendshipChainRec";
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_S2, "S2")
      	));
      	new TypeUnary(body, var_S1, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new TypeUnary(body, var_S2, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new PositivePatternCall(body, new FlatTuple(var_S1, var_S2), AlphabeticallyAfterFriendQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_S1 = body.getOrCreateVariableByName("S1");
      	PVariable var_S2 = body.getOrCreateVariableByName("S2");
      	PVariable var_S3 = body.getOrCreateVariableByName("S3");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_S2, "S2")
      	));
      	new TypeUnary(body, var_S1, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new TypeUnary(body, var_S2, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new PositivePatternCall(body, new FlatTuple(var_S1, var_S3), AlphabeticallyAfterFriendQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_S3, var_S2), this);
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
