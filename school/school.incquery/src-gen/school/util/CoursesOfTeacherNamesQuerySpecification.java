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
import school.CoursesOfTeacherNamesMatch;
import school.CoursesOfTeacherNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate CoursesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class CoursesOfTeacherNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<CoursesOfTeacherNamesMatcher> {
  private CoursesOfTeacherNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoursesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CoursesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherNamesMatcher.on(engine);
  }
  
  @Override
  public CoursesOfTeacherNamesMatch newEmptyMatch() {
    return CoursesOfTeacherNamesMatch.newEmptyMatch();
  }
  
  @Override
  public CoursesOfTeacherNamesMatch newMatch(final Object... parameters) {
    return CoursesOfTeacherNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CoursesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static CoursesOfTeacherNamesQuerySpecification make() {
      return new CoursesOfTeacherNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CoursesOfTeacherNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.coursesOfTeacherNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("TName","CName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("CName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_TName = body.getOrCreateVariableByName("TName");
      	PVariable var_CName = body.getOrCreateVariableByName("CName");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_TName, "TName"),
      				
      		new ExportedParameter(body, var_CName, "CName")
      	));
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "courses")));
      	new Equality(body, var__virtual_0_, var_C);
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "name")));
      	new Equality(body, var__virtual_1_, var_TName);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "subject")));
      	new Equality(body, var__virtual_2_, var_CName);
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
