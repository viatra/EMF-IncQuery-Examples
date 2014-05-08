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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.SchoolsMatcher;

/**
 * A pattern-specific query specification that can instantiate SchoolsMatcher in a type-safe way.
 * 
 * @see SchoolsMatcher
 * @see SchoolsMatch
 * 
 */
@SuppressWarnings("all")
public final class SchoolsQuerySpecification extends BaseGeneratedQuerySpecification<SchoolsMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SchoolsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.schools";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Sch");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Sch", "school.School"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Sch, "Sch")
      ));
      
      new TypeUnary(body, var_Sch, getClassifierLiteral("http://school.ecore", "School"), "http://school.ecore/School");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SchoolsQuerySpecification INSTANCE = make();
    
    public static SchoolsQuerySpecification make() {
      return new SchoolsQuerySpecification();					
      
    }
  }
  
}
