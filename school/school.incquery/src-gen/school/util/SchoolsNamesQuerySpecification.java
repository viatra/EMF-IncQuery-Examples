package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
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
    return LazyHolder.INSTANCE;
    
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
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_SchName = body.getOrCreateVariableByName("SchName");
      PVariable var__Sch = body.getOrCreateVariableByName("_Sch");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_SchName, "SchName")
      ));
      
      new TypeBinary(body, CONTEXT, var__Sch, var_SchName, getFeatureLiteral("http://school.ecore", "School", "name"), "http://school.ecore/School.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SchoolsNamesQuerySpecification INSTANCE = make();
    
    public static SchoolsNamesQuerySpecification make() {
      return new SchoolsNamesQuerySpecification();					
      
    }
  }
  
}
