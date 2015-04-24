package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.SchoolsNamesMatch;
import school.SchoolsNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate SchoolsNamesMatcher in a type-safe way.
 * 
 * @see SchoolsNamesMatcher
 * @see SchoolsNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class SchoolsNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<SchoolsNamesMatcher> {
  private SchoolsNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SchoolsNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SchoolsNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsNamesMatcher.on(engine);
  }
  
  @Override
  public SchoolsNamesMatch newEmptyMatch() {
    return SchoolsNamesMatch.newEmptyMatch();
  }
  
  @Override
  public SchoolsNamesMatch newMatch(final Object... parameters) {
    return SchoolsNamesMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static SchoolsNamesQuerySpecification INSTANCE = make();
    
    public static SchoolsNamesQuerySpecification make() {
      return new SchoolsNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SchoolsNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_SchName = body.getOrCreateVariableByName("SchName");
      	PVariable var__Sch = body.getOrCreateVariableByName("_Sch");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_SchName, "SchName")
      	));
      	new TypeConstraint(body, new FlatTuple(var__Sch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "School")));
      	new TypeConstraint(body, new FlatTuple(var__Sch, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "School", "name")));
      	new Equality(body, var__virtual_0_, var_SchName);
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
