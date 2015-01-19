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
import school.TeachesMoreClassesMatch;
import school.TeachesMoreClassesMatcher;
import school.util.ClassesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TeachesMoreClassesMatcher in a type-safe way.
 * 
 * @see TeachesMoreClassesMatcher
 * @see TeachesMoreClassesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachesMoreClassesQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeachesMoreClassesMatcher> {
  private TeachesMoreClassesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesMoreClassesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeachesMoreClassesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachesMoreClassesMatcher.on(engine);
  }
  
  @Override
  public TeachesMoreClassesMatch newEmptyMatch() {
    return TeachesMoreClassesMatch.newEmptyMatch();
  }
  
  @Override
  public TeachesMoreClassesMatch newMatch(final Object... parameters) {
    return TeachesMoreClassesMatch.newMatch((school.Teacher) parameters[0], (school.Teacher) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TeachesMoreClassesQuerySpecification INSTANCE = make();
    
    public static TeachesMoreClassesQuerySpecification make() {
      return new TeachesMoreClassesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeachesMoreClassesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.teachesMoreClasses";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T1","T2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("T1", "school.Teacher"),new PParameter("T2", "school.Teacher"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_T1 = body.getOrCreateVariableByName("T1");
      	PVariable var_T2 = body.getOrCreateVariableByName("T2");
      	PVariable var_N = body.getOrCreateVariableByName("N");
      	PVariable var__SC1 = body.getOrCreateVariableByName("_SC1");
      	PVariable var_M = body.getOrCreateVariableByName("M");
      	PVariable var__SC2 = body.getOrCreateVariableByName("_SC2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_T1, "T1"),
      				
      		new ExportedParameter(body, var_T2, "T2")
      	));
      	new TypeUnary(body, var_T1, getClassifierLiteral("http://school.ecore", "Teacher"), "http://school.ecore/Teacher");
      	new TypeUnary(body, var_T2, getClassifierLiteral("http://school.ecore", "Teacher"), "http://school.ecore/Teacher");
      	new PatternMatchCounter(body, new FlatTuple(var_T1, var__SC1), ClassesOfTeacherQuerySpecification.instance().getInternalQueryRepresentation(), var_N);
      	new PatternMatchCounter(body, new FlatTuple(var_T2, var__SC2), ClassesOfTeacherQuerySpecification.instance().getInternalQueryRepresentation(), var_M);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern teachesMoreClasses";
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
