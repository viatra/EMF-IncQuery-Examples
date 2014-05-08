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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
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
    return LazyHolder.INSTANCE;
    
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
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new ConstantValue(body, var__virtual_0_, 30);
      new TypeBinary(body, CONTEXT, var_C, var__virtual_0_, getFeatureLiteral("http://school.ecore", "Course", "weight"), "http://school.ecore/Course.weight");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CourseWithWeightThirtyQuerySpecification INSTANCE = make();
    
    public static CourseWithWeightThirtyQuerySpecification make() {
      return new CourseWithWeightThirtyQuerySpecification();					
      
    }
  }
  
}
