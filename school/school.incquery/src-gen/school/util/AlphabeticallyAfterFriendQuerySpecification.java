package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.AlphabeticallyAfterFriendMatcher;
import school.util.FriendlyToQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate AlphabeticallyAfterFriendMatcher in a type-safe way.
 * 
 * @see AlphabeticallyAfterFriendMatcher
 * @see AlphabeticallyAfterFriendMatch
 * 
 */
@SuppressWarnings("all")
public final class AlphabeticallyAfterFriendQuerySpecification extends BaseGeneratedQuerySpecification<AlphabeticallyAfterFriendMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AlphabeticallyAfterFriendQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected AlphabeticallyAfterFriendMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AlphabeticallyAfterFriendMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.alphabeticallyAfterFriend";
    
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
      PVariable var_s1Name = body.getOrCreateVariableByName("s1Name");
      PVariable var_s2Name = body.getOrCreateVariableByName("s2Name");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S1, "S1"), 
        new ExportedParameter(body, var_S2, "S2")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_S1, var_S2), FriendlyToQuerySpecification.instance());
      new TypeBinary(body, CONTEXT, var_S1, var_s1Name, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new TypeBinary(body, CONTEXT, var_S2, var_s2Name, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern alphabeticallyAfterFriend";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("s1Name", "s2Name");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String s1Name = (java.lang.String) provider.getValue("s1Name");
        	java.lang.String s2Name = (java.lang.String) provider.getValue("s2Name");
        	return evaluateExpression_1_1(s1Name, s2Name);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static AlphabeticallyAfterFriendQuerySpecification INSTANCE = make();
    
    public static AlphabeticallyAfterFriendQuerySpecification make() {
      return new AlphabeticallyAfterFriendQuerySpecification();					
      
    }
  }
  
  
  private boolean evaluateExpression_1_1(final String s1Name, final String s2Name) {
    boolean _lessThan = (s1Name.compareTo(s2Name) < 0);
    return _lessThan;
  }
}
