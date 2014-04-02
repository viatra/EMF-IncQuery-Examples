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
import school.CourseWithNameLongerThanWeightMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithNameLongerThanWeightMatcher in a type-safe way.
 * 
 * @see CourseWithNameLongerThanWeightMatcher
 * @see CourseWithNameLongerThanWeightMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithNameLongerThanWeightQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithNameLongerThanWeightMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithNameLongerThanWeightQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithNameLongerThanWeightMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.courseWithNameLongerThanWeight";
    
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
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var_CName = body.getOrCreateVariableByName("CName");
      PVariable var_W = body.getOrCreateVariableByName("W");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeBinary(body, context, var_C, var_CName, getFeatureLiteral("http://school.ecore", "Course", "subject"), "http://school.ecore/Course.subject");
      new TypeBinary(body, context, var_C, var_W, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern courseWithNameLongerThanWeight";
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
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private CourseWithNameLongerThanWeightQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithNameLongerThanWeightQuerySpecification> {
    @Override
    public CourseWithNameLongerThanWeightQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithNameLongerThanWeightQuerySpecification INSTANCE = make();
    
    public static CourseWithNameLongerThanWeightQuerySpecification make() {
      try {
      	return new CourseWithNameLongerThanWeightQuerySpecification();
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
