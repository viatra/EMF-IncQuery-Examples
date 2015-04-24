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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.CourseWithNameLongerThanWeightIntMatch;
import school.CourseWithNameLongerThanWeightIntMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithNameLongerThanWeightIntMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightIntMatcher
 * @see CourseWithNameLongerThanWeightIntMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithNameLongerThanWeightIntQuerySpecification extends BaseGeneratedEMFQuerySpecification<CourseWithNameLongerThanWeightIntMatcher> {
  private CourseWithNameLongerThanWeightIntQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightIntQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CourseWithNameLongerThanWeightIntMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightIntMatcher.on(engine);
  }
  
  @Override
  public CourseWithNameLongerThanWeightIntMatch newEmptyMatch() {
    return CourseWithNameLongerThanWeightIntMatch.newEmptyMatch();
  }
  
  @Override
  public CourseWithNameLongerThanWeightIntMatch newMatch(final Object... parameters) {
    return CourseWithNameLongerThanWeightIntMatch.newMatch((java.lang.Integer) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightIntQuerySpecification INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightIntQuerySpecification make() {
      return new CourseWithNameLongerThanWeightIntQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CourseWithNameLongerThanWeightIntQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.courseWithNameLongerThanWeightInt";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("W");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("W", "java.lang.Integer"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_W = body.getOrCreateVariableByName("W");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var_CName = body.getOrCreateVariableByName("CName");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_W, "W")
      	));
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "subject")));
      	new Equality(body, var__virtual_0_, var_CName);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "weight")));
      	new Equality(body, var__virtual_1_, var_W);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern courseWithNameLongerThanWeightInt";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("CName", "W");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String CName = (java.lang.String) provider.getValue("CName");
      			java.lang.Integer W = (java.lang.Integer) provider.getValue("W");
      			return evaluateExpression_1_1(CName, W);
      		}
      
      },  null); 
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
  
  private static boolean evaluateExpression_1_1(final String CName, final Integer W) {
    int _length = CName.length();
    boolean _greaterThan = (_length > (W).intValue());
    return _greaterThan;
  }
}
