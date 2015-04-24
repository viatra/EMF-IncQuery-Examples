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
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.ClassesOfSchoolMatch;
import school.ClassesOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate ClassesOfSchoolMatcher in a type-safe way.
 * 
 * @see ClassesOfSchoolMatcher
 * @see ClassesOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfSchoolQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassesOfSchoolMatcher> {
  private ClassesOfSchoolQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfSchoolQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassesOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfSchoolMatcher.on(engine);
  }
  
  @Override
  public ClassesOfSchoolMatch newEmptyMatch() {
    return ClassesOfSchoolMatch.newEmptyMatch();
  }
  
  @Override
  public ClassesOfSchoolMatch newMatch(final Object... parameters) {
    return ClassesOfSchoolMatch.newMatch((school.SchoolClass) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static ClassesOfSchoolQuerySpecification INSTANCE = make();
    
    public static ClassesOfSchoolQuerySpecification make() {
      return new ClassesOfSchoolQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ClassesOfSchoolQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.classesOfSchool";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("SC");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("SC", "school.SchoolClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_SC = body.getOrCreateVariableByName("SC");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_SC, "SC")
      	));
      	new TypeConstraint(body, new FlatTuple(var_SC), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "SchoolClass")));
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
