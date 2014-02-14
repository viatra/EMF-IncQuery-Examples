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
import school.SchoolsNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate SchoolsNamesMatcher in a type-safe way.
 * 
 * @see SchoolsNamesMatcher
 * @see SchoolsNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class SchoolsNamesQuerySpecification extends BaseGeneratedQuerySpecification<SchoolsNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SchoolsNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.schoolsNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("SchName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("SchName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private SchoolsNamesQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_SchName = body.getOrCreateVariableByName("SchName");
      PVariable var__Sch = body.getOrCreateVariableByName("_Sch");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_SchName, "SchName")
      ));
      
      new TypeBinary(body, context, var__Sch, var_SchName, getFeatureLiteral("http://school.ecore", "School", "name"), "http://school.ecore/School.name");
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SchoolsNamesQuerySpecification> {
    @Override
    public SchoolsNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SchoolsNamesQuerySpecification INSTANCE = make();
    
    public static SchoolsNamesQuerySpecification make() {
      try {
      	return new SchoolsNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
