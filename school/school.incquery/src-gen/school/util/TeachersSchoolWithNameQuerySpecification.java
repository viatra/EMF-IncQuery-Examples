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
import school.TeachersSchoolWithNameMatch;
import school.TeachersSchoolWithNameMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersSchoolWithNameMatcher in a type-safe way.
 * 
 * @see TeachersSchoolWithNameMatcher
 * @see TeachersSchoolWithNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersSchoolWithNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<TeachersSchoolWithNameMatcher> {
  private TeachersSchoolWithNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersSchoolWithNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TeachersSchoolWithNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersSchoolWithNameMatcher.on(engine);
  }
  
  @Override
  public TeachersSchoolWithNameMatch newEmptyMatch() {
    return TeachersSchoolWithNameMatch.newEmptyMatch();
  }
  
  @Override
  public TeachersSchoolWithNameMatch newMatch(final Object... parameters) {
    return TeachersSchoolWithNameMatch.newMatch((school.Teacher) parameters[0], (school.School) parameters[1], (java.lang.String) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static TeachersSchoolWithNameQuerySpecification INSTANCE = make();
    
    public static TeachersSchoolWithNameQuerySpecification make() {
      return new TeachersSchoolWithNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TeachersSchoolWithNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.TeachersSchoolWithName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("teacher","school","name");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("teacher", "school.Teacher"),new PParameter("school", "school.School"),new PParameter("name", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_teacher = body.getOrCreateVariableByName("teacher");
      	PVariable var_school = body.getOrCreateVariableByName("school");
      	PVariable var_name = body.getOrCreateVariableByName("name");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_teacher, "teacher"),
      				
      		new ExportedParameter(body, var_school, "school"),
      				
      		new ExportedParameter(body, var_name, "name")
      	));
      	new TypeConstraint(body, new FlatTuple(var_teacher), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_teacher, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "school")));
      	new Equality(body, var__virtual_0_, var_school);
      	new TypeConstraint(body, new FlatTuple(var_school), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "School")));
      	new TypeConstraint(body, new FlatTuple(var_school, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "School", "name")));
      	new Equality(body, var__virtual_1_, var_name);
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
