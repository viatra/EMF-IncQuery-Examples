package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import school.SchoolsMatch;
import school.SchoolsMatcher;

/**
 * A pattern-specific query specification that can instantiate SchoolsMatcher in a type-safe way.
 * 
 * @see SchoolsMatcher
 * @see SchoolsMatch
 * 
 */
@SuppressWarnings("all")
public final class SchoolsQuerySpecification extends BaseGeneratedEMFQuerySpecification<SchoolsMatcher> {
  private SchoolsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SchoolsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsMatcher.on(engine);
  }
  
  @Override
  public SchoolsMatch newEmptyMatch() {
    return SchoolsMatch.newEmptyMatch();
  }
  
  @Override
  public SchoolsMatch newMatch(final Object... parameters) {
    return SchoolsMatch.newMatch((school.School) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static SchoolsQuerySpecification INSTANCE = make();
    
    public static SchoolsQuerySpecification make() {
      return new SchoolsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SchoolsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_Sch, "Sch")
      	));
      	new TypeUnary(body, var_Sch, getClassifierLiteral("http://school.ecore", "School"), "http://school.ecore/School");
      	bodies.add(body);
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
