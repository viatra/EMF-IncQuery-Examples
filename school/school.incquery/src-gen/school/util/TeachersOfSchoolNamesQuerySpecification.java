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
import school.TeachersOfSchoolNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see TeachersOfSchoolNamesMatcher
 * @see TeachersOfSchoolNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersOfSchoolNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeachersOfSchoolNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersOfSchoolNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teachersOfSchoolNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("TName","SName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("SName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private TeachersOfSchoolNamesQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_TName = body.getOrCreateVariableByName("TName");
      PVariable var_SName = body.getOrCreateVariableByName("SName");
      PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      PVariable var_T = body.getOrCreateVariableByName("T");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_TName, "TName"), 
        new ExportedParameter(body, var_SName, "SName")
      ));
      
      
      new TypeBinary(body, context, var_Sch, var_T, getFeatureLiteral("http://school.ecore", "School", "teachers"), "http://school.ecore/School.teachers");
      new TypeBinary(body, context, var_Sch, var_SName, getFeatureLiteral("http://school.ecore", "School", "name"), "http://school.ecore/School.name");
      new TypeBinary(body, context, var_T, var_TName, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TeachersOfSchoolNamesQuerySpecification> {
    @Override
    public TeachersOfSchoolNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersOfSchoolNamesQuerySpecification INSTANCE = make();
    
    public static TeachersOfSchoolNamesQuerySpecification make() {
      try {
      	return new TeachersOfSchoolNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
