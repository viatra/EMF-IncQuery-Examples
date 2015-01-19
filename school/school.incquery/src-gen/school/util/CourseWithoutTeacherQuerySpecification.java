package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.CourseWithoutTeacherMatch;
import school.CourseWithoutTeacherMatcher;
import school.util.CourseWithTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate CourseWithoutTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithoutTeacherMatcher
 * @see CourseWithoutTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithoutTeacherQuerySpecification extends BaseGeneratedEMFQuerySpecification<CourseWithoutTeacherMatcher> {
  private CourseWithoutTeacherQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithoutTeacherQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CourseWithoutTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithoutTeacherMatcher.on(engine);
  }
  
  @Override
  public CourseWithoutTeacherMatch newEmptyMatch() {
    return CourseWithoutTeacherMatch.newEmptyMatch();
  }
  
  @Override
  public CourseWithoutTeacherMatch newMatch(final Object... parameters) {
    return CourseWithoutTeacherMatch.newMatch((school.Course) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CourseWithoutTeacherQuerySpecification INSTANCE = make();
    
    public static CourseWithoutTeacherQuerySpecification make() {
      return new CourseWithoutTeacherQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CourseWithoutTeacherQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.CourseWithoutTeacher";
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "Course"), "http://school.ecore/Course");
      	new NegativePatternCall(body, new FlatTuple(var_C), CourseWithTeacherQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Constraint");
      	annotation.addAttribute("message", "$C.subject$ does not have a teacher");
      	annotation.addAttribute("location", new ParameterReference("C"));
      	annotation.addAttribute("severity", "warning");
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
