package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.MoreFriendsThanMatch;
import school.MoreFriendsThanMatcher;
import school.util.InTheCircleOfFriendsQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate MoreFriendsThanMatcher in a type-safe way.
 * 
 * @see MoreFriendsThanMatcher
 * @see MoreFriendsThanMatch
 * 
 */
@SuppressWarnings("all")
public final class MoreFriendsThanQuerySpecification extends BaseGeneratedEMFQuerySpecification<MoreFriendsThanMatcher> {
  private MoreFriendsThanQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoreFriendsThanQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoreFriendsThanMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MoreFriendsThanMatcher.on(engine);
  }
  
  @Override
  public MoreFriendsThanMatch newEmptyMatch() {
    return MoreFriendsThanMatch.newEmptyMatch();
  }
  
  @Override
  public MoreFriendsThanMatch newMatch(final Object... parameters) {
    return MoreFriendsThanMatch.newMatch((school.Student) parameters[0], (school.Student) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MoreFriendsThanQuerySpecification INSTANCE = make();
    
    public static MoreFriendsThanQuerySpecification make() {
      return new MoreFriendsThanQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MoreFriendsThanQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.moreFriendsThan";
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
      	PVariable var_N = body.getOrCreateVariableByName("N");
      	PVariable var__Sx1 = body.getOrCreateVariableByName("_Sx1");
      	PVariable var_M = body.getOrCreateVariableByName("M");
      	PVariable var__Sx2 = body.getOrCreateVariableByName("_Sx2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S1, "S1"),
      				
      		new ExportedParameter(body, var_S2, "S2")
      	));
      	new TypeUnary(body, var_S1, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new TypeUnary(body, var_S2, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      	new PatternMatchCounter(body, new FlatTuple(var_S1, var__Sx1), InTheCircleOfFriendsQuerySpecification.instance().getInternalQueryRepresentation(), var_N);
      	new PatternMatchCounter(body, new FlatTuple(var_S2, var__Sx2), InTheCircleOfFriendsQuerySpecification.instance().getInternalQueryRepresentation(), var_M);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern moreFriendsThan";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("M", "N");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer M = (java.lang.Integer) provider.getValue("M");
      			java.lang.Integer N = (java.lang.Integer) provider.getValue("N");
      			return evaluateExpression_1_1(M, N);
      		}
      
      },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer M, final Integer N) {
    boolean _greaterThan = (N.compareTo(M) > 0);
    return _greaterThan;
  }
}
