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
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.CourseWithPrimeWeightMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithPrimeWeightMatcher in a type-safe way.
 * 
 * @see CourseWithPrimeWeightMatcher
 * @see CourseWithPrimeWeightMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithPrimeWeightQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithPrimeWeightMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithPrimeWeightQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithPrimeWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithPrimeWeightMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.courseWithPrimeWeight";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("C");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("C", "school.Course"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var_W = body.getOrCreateVariableByName("W");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeBinary(body, context, var_C, var_W, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern courseWithPrimeWeight";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("W");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.Integer W = (java.lang.Integer) provider.getValue("W");
        	return evaluateExpression_1_1(W);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private CourseWithPrimeWeightQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithPrimeWeightQuerySpecification> {
    @Override
    public CourseWithPrimeWeightQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithPrimeWeightQuerySpecification INSTANCE = make();
    
    public static CourseWithPrimeWeightQuerySpecification make() {
      try {
      	return new CourseWithPrimeWeightQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
  
  private boolean evaluateExpression_1_1(final Integer W) {
    boolean _xifexpression = false;
    if ((((W).intValue() % 2) == 0)) {
      _xifexpression = false;
    } else {
      boolean _xblockexpression = false;
      {
        double _sqrt = Math.sqrt((W).intValue());
        Float _float = new Float(_sqrt);
        Integer maxValue = Integer.valueOf(Math.round((_float).floatValue()));
        Integer divisor = Integer.valueOf(3);
        boolean _lessEqualsThan = (divisor.compareTo(maxValue) <= 0);
        boolean _while = _lessEqualsThan;
        while (_while) {
          if ((((W).intValue() % (divisor).intValue()) == 0)) {
            return false;
          } else {
            divisor = Integer.valueOf(((divisor).intValue() + 2));
          }
          boolean _lessEqualsThan_1 = (divisor.compareTo(maxValue) <= 0);
          _while = _lessEqualsThan_1;
        }
        _xblockexpression = true;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
