package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.CourseWithWeightThirtyMatcher;

/**
 * A pattern-specific query specification that can instantiate CourseWithWeightThirtyMatcher in a type-safe way.
 * 
 * @see CourseWithWeightThirtyMatcher
 * @see CourseWithWeightThirtyMatch
 * 
 */
@SuppressWarnings("all")
public final class CourseWithWeightThirtyQuerySpecification extends BaseGeneratedQuerySpecification<CourseWithWeightThirtyMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CourseWithWeightThirtyQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CourseWithWeightThirtyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithWeightThirtyMatcher.on(engine);
  }
  
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
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new ConstantValue(body, var__virtual_0_, 30);
      new TypeBinary(body, context, var_C, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
      bodies.add(body);
    }
    return bodies;
  }
  
  private CourseWithWeightThirtyQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CourseWithWeightThirtyQuerySpecification> {
    @Override
    public CourseWithWeightThirtyQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithWeightThirtyQuerySpecification INSTANCE = make();
    
    public static CourseWithWeightThirtyQuerySpecification make() {
      try {
      	return new CourseWithWeightThirtyQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
