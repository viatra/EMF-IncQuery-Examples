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
import org.eclipse.incquery.runtime.matchers.psystem.PQuery.PQueryStatus;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
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
public final class FinalPattern2QuerySpecification extends BaseGeneratedQuerySpecification<FinalPattern2Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FinalPattern2QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FinalPattern2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FinalPattern2Matcher.on(engine);
  }
  
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
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_YDate = body.getOrCreateVariableByName("YDate");
      PVariable var_CSub = body.getOrCreateVariableByName("CSub");
      PVariable var_TName = body.getOrCreateVariableByName("TName");
      PVariable var_SName = body.getOrCreateVariableByName("SName");
      PVariable var_Y = body.getOrCreateVariableByName("Y");
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_YDate, "YDate"), 
        new ExportedParameter(body, var_CSub, "CSub"), 
        new ExportedParameter(body, var_TName, "TName"), 
        new ExportedParameter(body, var_SName, "SName")
      ));
      
      
      
      
      new TypeBinary(body, context, var_Y, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Year", "schoolClasses"), "http://school.ecore/Year.schoolClasses");
      new TypeBinary(body, context, var__virtual_0_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      new TypeBinary(body, context, var_C, var_T, getFeatureLiteral("http://school.ecore", "Course", "teacher"), "http://school.ecore/Course.teacher");
      new TypeBinary(body, context, var_S, var__virtual_3_, getFeatureLiteral("http://school.ecore", "Student", "schoolClass"), "http://school.ecore/Student.schoolClass");
      new TypeBinary(body, context, var__virtual_3_, var_C, getFeatureLiteral("http://school.ecore", "SchoolClass", "courses"), "http://school.ecore/SchoolClass.courses");
      new PositivePatternCall(body, new FlatTuple(var_S), TheOnesWithTheBiggestCircleQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_T), TeachesTheMostCoursesQuerySpecification.instance());
      new TypeBinary(body, context, var_Y, var_YDate, getFeatureLiteral("http://school.ecore", "Year", "startingDate"), "http://school.ecore/Year.startingDate");
      new TypeBinary(body, context, var_C, var_CSub, getFeatureLiteral("http://school.ecore", "Course", "subject"), "http://school.ecore/Course.subject");
      new TypeBinary(body, context, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      new TypeBinary(body, context, var_S, var_SName, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }{
      PAnnotation annotation = new PAnnotation("QueryExplorer");
      annotation.addAttribute("message","The busiest teacher $TName$ taught the most sociable student $SName$ in $YDate$");
      annotation.addAttribute("display",true);
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","YDate");
      annotation.addAttribute("name","Year");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","TName");
      annotation.addAttribute("name","Teacher");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("ObservableValue");
      annotation.addAttribute("expression","SName");
      annotation.addAttribute("name","Student");
      addAnnotation(annotation);
    }
    {
      PAnnotation annotation = new PAnnotation("Handler");
      annotation.addAttribute("fileExtension","school");
      addAnnotation(annotation);
    }
    setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private FinalPattern2QuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FinalPattern2QuerySpecification> {
    @Override
    public FinalPattern2QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FinalPattern2QuerySpecification INSTANCE = make();
    
    public static FinalPattern2QuerySpecification make() {
      try {
      	return new FinalPattern2QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
