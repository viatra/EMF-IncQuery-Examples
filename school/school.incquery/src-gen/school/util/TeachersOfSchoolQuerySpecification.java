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
import school.TeachersOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersOfSchoolQuerySpecification extends BaseGeneratedQuerySpecification<TeachersOfSchoolMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teachersOfSchool";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T","Sch");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"),new PParameter("Sch", "school.School"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_T, "T"), 
        new ExportedParameter(body, var_Sch, "Sch")
      ));
      
      
      new TypeBinary(body, context, var_Sch, var_T, getFeatureLiteral("http://school.ecore", "School", "teachers"), "http://school.ecore/School.teachers");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private TeachersOfSchoolQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TeachersOfSchoolQuerySpecification> {
    @Override
    public TeachersOfSchoolQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersOfSchoolQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolQuerySpecification make() {
      try {
      	return new TeachersOfSchoolQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
