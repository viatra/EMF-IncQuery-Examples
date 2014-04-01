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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.CoursesOfTeacherNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesOfTeacherNamesQuerySpecification extends BaseGeneratedQuerySpecification<CoursesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.coursesOfTeacherNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("TName","CName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("CName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_TName = body.getOrCreateVariableByName("TName");
      PVariable var_CName = body.getOrCreateVariableByName("CName");
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_TName, "TName"), 
        new ExportedParameter(body, var_CName, "CName")
      ));
      
      
      new TypeBinary(body, context, var_T, var_C, getFeatureLiteral("http://school.ecore", "Teacher", "courses"), "http://school.ecore/Teacher.courses");
      new TypeBinary(body, context, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      new TypeBinary(body, context, var_C, var_CName, getFeatureLiteral("http://school.ecore", "Course", "subject"), "http://school.ecore/Course.subject");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private CoursesOfTeacherNamesQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoursesOfTeacherNamesQuerySpecification> {
    @Override
    public CoursesOfTeacherNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoursesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherNamesQuerySpecification make() {
      try {
      	return new CoursesOfTeacherNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
