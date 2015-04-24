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
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.FinalPattern2Match;
import school.FinalPattern2Matcher;
import school.util.TeachesTheMostCoursesQuerySpecification;
import school.util.TheOnesWithTheBiggestCircleQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FinalPattern2Matcher in a type-safe way.
 * 
 * @see FinalPattern2Matcher
 * @see FinalPattern2Match
 * 
 */
@SuppressWarnings("all")
public final class FinalPattern2QuerySpecification extends BaseGeneratedEMFQuerySpecification<FinalPattern2Matcher> {
  private FinalPattern2QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPattern2QuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FinalPattern2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FinalPattern2Matcher.on(engine);
  }
  
  @Override
  public FinalPattern2Match newEmptyMatch() {
    return FinalPattern2Match.newEmptyMatch();
  }
  
  @Override
  public FinalPattern2Match newMatch(final Object... parameters) {
    return FinalPattern2Match.newMatch((java.lang.Integer) parameters[0], (java.lang.String) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static FinalPattern2QuerySpecification INSTANCE = make();
    
    public static FinalPattern2QuerySpecification make() {
      return new FinalPattern2QuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FinalPattern2QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.finalPattern2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("YDate","CSub","TName","SName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("YDate", "java.lang.Integer"),new PParameter("CSub", "java.lang.String"),new PParameter("TName", "java.lang.String"),new PParameter("SName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_YDate = body.getOrCreateVariableByName("YDate");
      	PVariable var_CSub = body.getOrCreateVariableByName("CSub");
      	PVariable var_TName = body.getOrCreateVariableByName("TName");
      	PVariable var_SName = body.getOrCreateVariableByName("SName");
      	PVariable var_Y = body.getOrCreateVariableByName("Y");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      	PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      	PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_YDate, "YDate"),
      				
      		new ExportedParameter(body, var_CSub, "CSub"),
      				
      		new ExportedParameter(body, var_TName, "TName"),
      				
      		new ExportedParameter(body, var_SName, "SName")
      	));
      	new TypeConstraint(body, new FlatTuple(var_Y), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Year")));
      	new TypeConstraint(body, new FlatTuple(var_Y, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Year", "schoolClasses")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "courses")));
      	new Equality(body, var__virtual_1_, var_C);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "teacher")));
      	new Equality(body, var__virtual_2_, var_T);
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "schoolClass")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "courses")));
      	new Equality(body, var__virtual_4_, var_C);
      	new PositivePatternCall(body, new FlatTuple(var_S), TheOnesWithTheBiggestCircleQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_T), TeachesTheMostCoursesQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_Y), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Year")));
      	new TypeConstraint(body, new FlatTuple(var_Y, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Year", "startingDate")));
      	new Equality(body, var__virtual_5_, var_YDate);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "subject")));
      	new Equality(body, var__virtual_6_, var_CSub);
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "name")));
      	new Equality(body, var__virtual_7_, var_TName);
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "name")));
      	new Equality(body, var__virtual_8_, var_SName);
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("QueryExplorer");
      	annotation.addAttribute("display", true);
      	annotation.addAttribute("message", "The busiest teacher $TName$ taught the most sociable student $SName$ in $YDate$");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "YDate");
      	annotation.addAttribute("name", "Year");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "TName");
      	annotation.addAttribute("name", "Teacher");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("ObservableValue");
      	annotation.addAttribute("expression", "SName");
      	annotation.addAttribute("name", "Student");
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
}
