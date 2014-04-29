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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.IncreasingAlphabeticalFriendshipChainTCMatcher;
import school.util.AlphabeticallyAfterFriendQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate IncreasingAlphabeticalFriendshipChainTCMatcher in a type-safe way.
 * 
 * @see IncreasingAlphabeticalFriendshipChainTCMatcher
 * @see IncreasingAlphabeticalFriendshipChainTCMatch
 * 
 */
@SuppressWarnings("all")
public final class IncreasingAlphabeticalFriendshipChainTCQuerySpecification extends BaseGeneratedQuerySpecification<IncreasingAlphabeticalFriendshipChainTCMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncreasingAlphabeticalFriendshipChainTCQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected IncreasingAlphabeticalFriendshipChainTCMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainTCMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.increasingAlphabeticalFriendshipChainTC";
    
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
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
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
      new BinaryTransitiveClosure(body, new FlatTuple(var_S1, var_S2), AlphabeticallyAfterFriendQuerySpecification.instance().instance());
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<IncreasingAlphabeticalFriendshipChainTCQuerySpecification> {
    @Override
    public IncreasingAlphabeticalFriendshipChainTCQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static IncreasingAlphabeticalFriendshipChainTCQuerySpecification INSTANCE = make();
    
    public static IncreasingAlphabeticalFriendshipChainTCQuerySpecification make() {
      return new IncreasingAlphabeticalFriendshipChainTCQuerySpecification();					
      
    }
  }
  
}
