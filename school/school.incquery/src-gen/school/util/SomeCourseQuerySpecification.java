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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import school.SomeCourseMatcher;

/**
 * A pattern-specific query specification that can instantiate SomeCourseMatcher in a type-safe way.
 * 
 * @see SomeCourseMatcher
 * @see SomeCourseMatch
 * 
 */
@SuppressWarnings("all")
public final class SomeCourseQuerySpecification extends BaseGeneratedQuerySpecification<SomeCourseMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SomeCourseQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SomeCourseMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SomeCourseMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.SomeCourse";
    
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
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "SpecialisationCourse"), "http://school.ecore/SpecialisationCourse");
      bodies.add(body);
    }{
      PBody body = new PBody(this);
      PVariable var_C = body.getOrCreateVariableByName("C");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_C, "C")
      ));
      
      new TypeUnary(body, var_C, getClassifierLiteral("http://school.ecore", "LimitedCapacityCourse"), "http://school.ecore/LimitedCapacityCourse");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private SomeCourseQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SomeCourseQuerySpecification> {
    @Override
    public SomeCourseQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SomeCourseQuerySpecification INSTANCE = make();
    
    public static SomeCourseQuerySpecification make() {
      try {
      	return new SomeCourseQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
