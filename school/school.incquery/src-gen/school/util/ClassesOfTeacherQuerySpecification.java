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
import school.ClassesOfTeacherMatcher;
import school.util.CoursesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfTeacherQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfTeacherMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.classesOfTeacher";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T","SC");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("SC", "school.SchoolClass"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_SC = body.getOrCreateVariableByName("SC");
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_T, "T"), 
        new ExportedParameter(body, var_SC, "SC")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_T, var_C), CoursesOfTeacherQuerySpecification.instance());
      new TypeBinary(body, context, var_C, var_SC, getFeatureLiteral("http://school.ecore", "Course", "schoolClass"), "http://school.ecore/Course.schoolClass");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private ClassesOfTeacherQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ClassesOfTeacherQuerySpecification> {
    @Override
    public ClassesOfTeacherQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ClassesOfTeacherQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherQuerySpecification make() {
      try {
      	return new ClassesOfTeacherQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
