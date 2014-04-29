package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.A_translatedMatcher;
import school.util.A_translated_0QuerySpecification;
import school.util.A_translated_1QuerySpecification;

/**
 * A pattern-specific query specification that can instantiate A_translatedMatcher in a type-safe way.
 * 
 * @see A_translatedMatcher
 * @see A_translatedMatch
 * 
 */
@SuppressWarnings("all")
public final class A_translatedQuerySpecification extends BaseGeneratedQuerySpecification<A_translatedMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static A_translatedQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected A_translatedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return A_translatedMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.A_translated";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("self","student2","student1","name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("self", "school.SchoolClass"),new PParameter("student2", "school.Student"),new PParameter("student1", "school.Student"),new PParameter("name", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_self = body.getOrCreateVariableByName("self");
      PVariable var_student = body.getOrCreateVariableByName("student");
      PVariable var_eInt = body.getOrCreateVariableByName("eInt");
      PVariable var_eBoolean = body.getOrCreateVariableByName("eBoolean");
      PVariable var_eInt_0 = body.getOrCreateVariableByName("eInt_0");
      PVariable var_eBoolean_0 = body.getOrCreateVariableByName("eBoolean_0");
      PVariable var_boolean_0 = body.getOrCreateVariableByName("boolean_0");
      PVariable var_student_0 = body.getOrCreateVariableByName("student_0");
      PVariable var_eString_1 = body.getOrCreateVariableByName("eString_1");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_self, "self"), 
        new ExportedParameter(body, var_student_0, "student2"), 
        new ExportedParameter(body, var_student, "student1"), 
        new ExportedParameter(body, var_eString_1, "name")
      ));
      
      
      
      
      new TypeBinary(body, CONTEXT, var_self, var_student, getFeatureLiteral("http://school.ecore", "SchoolClass", "students"), "http://school.ecore/SchoolClass.students");
      new PatternMatchCounter(body, new FlatTuple(var_student_0, var_student), A_translated_0QuerySpecification.instance().instance(), var_eInt);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern A_translated";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("eInt");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.Integer eInt = (java.lang.Integer) provider.getValue("eInt");
        	return evaluateExpression_1_1(eInt);
        }
        
        },  var_eBoolean ); 
      new PatternMatchCounter(body, new FlatTuple(var_student_0, var_student), A_translated_1QuerySpecification.instance().instance(), var_eInt_0);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern A_translated";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("eInt_0");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.Integer eInt_0 = (java.lang.Integer) provider.getValue("eInt_0");
        	return evaluateExpression_1_2(eInt_0);
        }
        
        },  var_eBoolean_0 ); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern A_translated";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("eBoolean", "eBoolean_0");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.Boolean eBoolean = (java.lang.Boolean) provider.getValue("eBoolean");
        	java.lang.Boolean eBoolean_0 = (java.lang.Boolean) provider.getValue("eBoolean_0");
        	return evaluateExpression_1_3(eBoolean, eBoolean_0);
        }
        
        },  var_boolean_0 ); 
      new ConstantValue(body, var_boolean_0, true);
      new TypeBinary(body, CONTEXT, var_self, var_student_0, getFeatureLiteral("http://school.ecore", "SchoolClass", "students"), "http://school.ecore/SchoolClass.students");
      new TypeBinary(body, CONTEXT, var_student, var_eString_1, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<A_translatedQuerySpecification> {
    @Override
    public A_translatedQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static A_translatedQuerySpecification INSTANCE = make();
    
    public static A_translatedQuerySpecification make() {
      return new A_translatedQuerySpecification();					
      
    }
  }
  
  
  private boolean evaluateExpression_1_1(final Integer eInt) {
    return ((eInt).intValue() > 0);
  }
  
  private boolean evaluateExpression_1_2(final Integer eInt_0) {
    return ((eInt_0).intValue() > 0);
  }
  
  private boolean evaluateExpression_1_3(final Boolean eBoolean, final Boolean eBoolean_0) {
    boolean _and = false;
    if (!(((Boolean) eBoolean)).booleanValue()) {
      _and = false;
    } else {
      _and = (((Boolean) eBoolean_0)).booleanValue();
    }
    return _and;
  }
}
