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
import school.StudentOfSchoolNamesMatch;
import school.StudentOfSchoolNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate StudentOfSchoolNamesMatcher in a type-safe way.
 * 
 * @see StudentOfSchoolNamesMatcher
 * @see StudentOfSchoolNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class StudentOfSchoolNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<StudentOfSchoolNamesMatcher> {
  private StudentOfSchoolNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StudentOfSchoolNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected StudentOfSchoolNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolNamesMatcher.on(engine);
  }
  
  @Override
  public StudentOfSchoolNamesMatch newEmptyMatch() {
    return StudentOfSchoolNamesMatch.newEmptyMatch();
  }
  
  @Override
  public StudentOfSchoolNamesMatch newMatch(final Object... parameters) {
    return StudentOfSchoolNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static StudentOfSchoolNamesQuerySpecification INSTANCE = make();
    
    public static StudentOfSchoolNamesQuerySpecification make() {
      return new StudentOfSchoolNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static StudentOfSchoolNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.studentOfSchoolNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("SName","SchName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("SName", "java.lang.String"),new PParameter("SchName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_SName = body.getOrCreateVariableByName("SName");
      	PVariable var_SchName = body.getOrCreateVariableByName("SchName");
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var_Sch = body.getOrCreateVariableByName("Sch");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_SName, "SName"),
      				
      		new ExportedParameter(body, var_SchName, "SchName")
      	));
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "schoolClass")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "courses")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "school")));
      	new Equality(body, var__virtual_2_, var_Sch);
      	new TypeConstraint(body, new FlatTuple(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Student")));
      	new TypeConstraint(body, new FlatTuple(var_S, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Student", "name")));
      	new Equality(body, var__virtual_3_, var_SName);
      	new TypeConstraint(body, new FlatTuple(var_Sch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "School")));
      	new TypeConstraint(body, new FlatTuple(var_Sch, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "School", "name")));
      	new Equality(body, var__virtual_4_, var_SchName);
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
