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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import school.CourseWithPrimeWeightMatch;
import school.CourseWithPrimeWeightMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithPrimeWeightMatcher in a type-safe way.
 * 
 * @see CourseWithPrimeWeightMatcher
 * @see CourseWithPrimeWeightMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithPrimeWeightQuerySpecification extends BaseGeneratedEMFQuerySpecification<CourseWithPrimeWeightMatcher> {
  private CourseWithPrimeWeightQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithPrimeWeightQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CourseWithPrimeWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithPrimeWeightMatcher.on(engine);
  }
  
  @Override
  public CourseWithPrimeWeightMatch newEmptyMatch() {
    return CourseWithPrimeWeightMatch.newEmptyMatch();
  }
  
  @Override
  public CourseWithPrimeWeightMatch newMatch(final Object... parameters) {
    return CourseWithPrimeWeightMatch.newMatch((school.Course) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CourseWithPrimeWeightQuerySpecification INSTANCE = make();
    
    public static CourseWithPrimeWeightQuerySpecification make() {
      return new CourseWithPrimeWeightQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CourseWithPrimeWeightQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var_W = body.getOrCreateVariableByName("W");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new TypeBinary(body, CONTEXT, var_C, var_W, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
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
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer W) {
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
        while ((divisor.compareTo(maxValue) <= 0)) {
          if ((((W).intValue() % (divisor).intValue()) == 0)) {
            return false;
          } else {
            divisor = Integer.valueOf(((divisor).intValue() + 2));
          }
        }
        _xblockexpression = true;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
