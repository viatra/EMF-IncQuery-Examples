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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.CoursesOfTeacherMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<CoursesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.coursesOfTeacher";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T","C");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("C", "school.Course"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private CoursesOfTeacherQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_C = body.getOrCreateVariableByName("C");
      new ExportedParameter(body, var_T, "T");
      new ExportedParameter(body, var_C, "C");
      new TypeBinary(body, context, var_T, var_C, getFeatureLiteral("http://school.ecore", "Teacher", "courses"), "http://school.ecore/Teacher.courses");
      body.setSymbolicParameters(Arrays.asList(var_T, var_C));
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoursesOfTeacherQuerySpecification> {
    @Override
    public CoursesOfTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesOfTeacherQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherQuerySpecification make() {
      try {
      	return new CoursesOfTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
