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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.ClassesOfTeacherNamesMatch;
import school.ClassesOfTeacherNamesMatcher;
import school.util.CoursesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ClassesOfTeacherNamesMatcher in a type-safe way.
 * 
 * @see ClassesOfTeacherNamesMatcher
 * @see ClassesOfTeacherNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfTeacherNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassesOfTeacherNamesMatcher> {
  private ClassesOfTeacherNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfTeacherNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassesOfTeacherNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherNamesMatcher.on(engine);
  }
  
  @Override
  public ClassesOfTeacherNamesMatch newEmptyMatch() {
    return ClassesOfTeacherNamesMatch.newEmptyMatch();
  }
  
  @Override
  public ClassesOfTeacherNamesMatch newMatch(final Object... parameters) {
    return ClassesOfTeacherNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.Character) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ClassesOfTeacherNamesQuerySpecification INSTANCE = make();
    
    public static ClassesOfTeacherNamesQuerySpecification make() {
      return new ClassesOfTeacherNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ClassesOfTeacherNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.classesOfTeacherNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("TName","SCName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("TName", "java.lang.String"),new PParameter("SCName", "java.lang.Character"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_TName = body.getOrCreateVariableByName("TName");
      	PVariable var_SCName = body.getOrCreateVariableByName("SCName");
      	PVariable var_T = body.getOrCreateVariableByName("T");
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_SC = body.getOrCreateVariableByName("SC");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_TName, "TName"),
      				
      		new ExportedParameter(body, var_SCName, "SCName")
      	));
      	new PositivePatternCall(body, new FlatTuple(var_T, var_C), CoursesOfTeacherQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Teacher")));
      	new TypeConstraint(body, new FlatTuple(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Teacher", "name")));
      	new Equality(body, var__virtual_0_, var_TName);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "schoolClass")));
      	new Equality(body, var__virtual_1_, var_SC);
      	new TypeConstraint(body, new FlatTuple(var_SC), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "SchoolClass")));
      	new TypeConstraint(body, new FlatTuple(var_SC, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "SchoolClass", "code")));
      	new Equality(body, var__virtual_2_, var_SCName);
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
