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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.CourseWithWeightThirtyMatch;
import school.CourseWithWeightThirtyMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithWeightThirtyMatcher in a type-safe way.
 * 
 * @see CourseWithWeightThirtyMatcher
 * @see CourseWithWeightThirtyMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithWeightThirtyQuerySpecification extends BaseGeneratedEMFQuerySpecification<CourseWithWeightThirtyMatcher> {
  private CourseWithWeightThirtyQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithWeightThirtyQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CourseWithWeightThirtyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithWeightThirtyMatcher.on(engine);
  }
  
  @Override
  public CourseWithWeightThirtyMatch newEmptyMatch() {
    return CourseWithWeightThirtyMatch.newEmptyMatch();
  }
  
  @Override
  public CourseWithWeightThirtyMatch newMatch(final Object... parameters) {
    return CourseWithWeightThirtyMatch.newMatch((school.Course) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CourseWithWeightThirtyQuerySpecification INSTANCE = make();
    
    public static CourseWithWeightThirtyQuerySpecification make() {
      return new CourseWithWeightThirtyQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CourseWithWeightThirtyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "school.courseWithWeightThirty";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("C");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("C", "school.Course"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_C = body.getOrCreateVariableByName("C");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_C, "C")
      	));
      	new ConstantValue(body, var__virtual_0_, 30);
      	new TypeConstraint(body, new FlatTuple(var_C), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://school.ecore", "Course")));
      	new TypeConstraint(body, new FlatTuple(var_C, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://school.ecore", "Course", "weight")));
      	new Equality(body, var__virtual_1_, var__virtual_0_);
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
