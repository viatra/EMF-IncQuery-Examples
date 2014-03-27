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
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.FinalPatternMatcher;
import school.util.TeachesTheMostCoursesQuerySpecification;
import school.util.TheOnesWithTheBiggestCircleQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FinalPatternMatcher in a type-safe way.
 * 
 * @see FinalPatternMatcher
 * @see FinalPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class FinalPatternQuerySpecification extends BaseGeneratedQuerySpecification<FinalPatternMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPatternQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FinalPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FinalPatternMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.finalPattern";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Y","C","T","S");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Y", "school.Year"),new PParameter("C", "school.Course"),new PParameter("T", "school.Teacher"),new PParameter("S", "school.Student"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Y = body.getOrCreateVariableByName("Y");
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Y, "Y"), 
        new ExportedParameter(body, var_C, "C"), 
        new ExportedParameter(body, var_T, "T"), 
        new ExportedParameter(body, var_S, "S")
      ));
      
      
      
      
      new TypeBinary(body, context, var_Y, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Year", "schoolClasses"), "http://school.ecore/Year.schoolClasses");
      new TypeBinary(body, context, var__virtual_0_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      new TypeBinary(body, context, var_C, var_T, getFeatureLiteral("http://school.ecore", "Course", "teacher"), "http://school.ecore/Course.teacher");
      new TypeBinary(body, context, var_S, var__virtual_3_, getFeatureLiteral("http://school.ecore", "Student", "schoolClass"), "http://school.ecore/Student.schoolClass");
      new TypeBinary(body, context, var__virtual_3_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      new PositivePatternCall(body, new FlatTuple(var_S), TheOnesWithTheBiggestCircleQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_T), TeachesTheMostCoursesQuerySpecification.instance());
      bodies.add(body);
    }{
      PAnnotation annotation = new PAnnotation("QueryExplorer");
      annotation.addAttribute("message","The busiest teacher $T.name$ taught the most sociable student $S.name$ in $Y.startingDate$");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","Y.startingDate");
      annotation.addAttribute("name","Year");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","T.name");
      annotation.addAttribute("name","Teacher");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","S.name");
      annotation.addAttribute("name","Student");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("Handler");
      annotation.addAttribute("fileExtension","school");
      addAnnotation(annotation);
    }
    
    return bodies;
  }
  
  private FinalPatternQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FinalPatternQuerySpecification> {
    @Override
    public FinalPatternQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FinalPatternQuerySpecification INSTANCE = make();
    
    public static FinalPatternQuerySpecification make() {
      try {
      	return new FinalPatternQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
