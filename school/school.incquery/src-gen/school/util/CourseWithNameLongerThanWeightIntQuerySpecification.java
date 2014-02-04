package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery.PQueryStatus;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.CourseWithNameLongerThanWeightIntMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithNameLongerThanWeightIntMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightIntMatcher
 * @see CourseWithNameLongerThanWeightIntMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithNameLongerThanWeightIntQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithNameLongerThanWeightIntMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightIntQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightIntMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightIntMatcher.on(engine);
  }
  
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
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private CourseWithNameLongerThanWeightIntQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_W = body.getOrCreateVariableByName("W");
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var_CName = body.getOrCreateVariableByName("CName");
      new ExportedParameter(body, var_W, "W");
      new TypeBinary(body, context, var_C, var_CName, getFeatureLiteral("http://school.ecore", "Course", "subject"), "http://school.ecore/Course.subject");
      new TypeBinary(body, context, var_C, var_W, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
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
      body.setSymbolicParameters(Arrays.asList(var_W));
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithNameLongerThanWeightIntQuerySpecification> {
    @Override
    public CourseWithNameLongerThanWeightIntQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightIntQuerySpecification INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightIntQuerySpecification make() {
      try {
      	return new CourseWithNameLongerThanWeightIntQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
  
  private boolean evaluateExpression_1_1(final String CName, final Integer W) {
    int _length = CName.length();
    boolean _greaterThan = (_length > (W).intValue());
    return _greaterThan;
  }
}
