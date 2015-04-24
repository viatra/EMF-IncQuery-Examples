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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.CourseWithTeacherMatch;
import school.CourseWithTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithTeacherMatcher in a type-safe way.
 * 
 * @see CourseWithTeacherMatcher
 * @see CourseWithTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithTeacherQuerySpecification extends BaseGeneratedEMFQuerySpecification<CourseWithTeacherMatcher> {
  private CourseWithTeacherQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithTeacherQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CourseWithTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithTeacherMatcher.on(engine);
  }
  
  @Override
  public CourseWithTeacherMatch newEmptyMatch() {
    return CourseWithTeacherMatch.newEmptyMatch();
  }
  
  @Override
  public CourseWithTeacherMatch newMatch(final Object... parameters) {
    return CourseWithTeacherMatch.newMatch((school.Course) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CourseWithTeacherQuerySpecification INSTANCE = make();
    
    public static CourseWithTeacherQuerySpecification make() {
      return new CourseWithTeacherQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CourseWithTeacherQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.CourseWithTeacher";
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
      	PVariable var__T = body.getOrCreateVariableByName("_T");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "teacher")));
      	new Equality(body, var__virtual_0_, var__T);
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
}
