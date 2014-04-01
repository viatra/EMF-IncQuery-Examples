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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.ClassesOfTeacherNamesMatcher;
import school.util.CoursesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherNamesMatcher
 * @see ClassesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfTeacherNamesQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfTeacherNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.classesOfTeacherNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("TName","SCName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("SCName", "java.lang.Character"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_TName = body.getOrCreateVariableByName("TName");
      PVariable var_SCName = body.getOrCreateVariableByName("SCName");
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var_SC = body.getOrCreateVariableByName("SC");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_TName, "TName"), 
        new ExportedParameter(body, var_SCName, "SCName")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_T, var_C), CoursesOfTeacherQuerySpecification.instance());
      new TypeBinary(body, context, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      new TypeBinary(body, context, var_C, var_SC, getFeatureLiteral("http://school.ecore", "Course", "schoolClass"), "http://school.ecore/Course.schoolClass");
      new TypeBinary(body, context, var_SC, var_SCName, getFeatureLiteral("http://school.ecore", "SchoolClass", "code"), "http://school.ecore/SchoolClass.code");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private ClassesOfTeacherNamesQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ClassesOfTeacherNamesQuerySpecification> {
    @Override
    public ClassesOfTeacherNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ClassesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherNamesQuerySpecification make() {
      try {
      	return new ClassesOfTeacherNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
