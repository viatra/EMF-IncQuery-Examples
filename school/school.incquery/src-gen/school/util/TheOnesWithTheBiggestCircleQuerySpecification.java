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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TheOnesWithTheBiggestCircleMatcher;
import school.util.MoreFriendsThanQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TheOnesWithTheBiggestCircleMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleMatcher
 * @see TheOnesWithTheBiggestCircleMatch
 * 
 */
@SuppressWarnings("all")
public final class TheOnesWithTheBiggestCircleQuerySpecification extends BaseGeneratedQuerySpecification<TheOnesWithTheBiggestCircleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.theOnesWithTheBiggestCircle";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S", "school.Student"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var__Sx = body.getOrCreateVariableByName("_Sx");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S, "S")
      ));
      
      new TypeUnary(body, var_S, getClassifierLiteral("http://school.ecore", "Student"), "http://school.ecore/Student");
      new NegativePatternCall(body, new FlatTuple(var__Sx, var_S), MoreFriendsThanQuerySpecification.instance().instance());
      bodies.add(body);
    }
    return bodies;
  }
  
  private TheOnesWithTheBiggestCircleQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TheOnesWithTheBiggestCircleQuerySpecification> {
    @Override
    public TheOnesWithTheBiggestCircleQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleQuerySpecification INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleQuerySpecification make() {
      try {
      	return new TheOnesWithTheBiggestCircleQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
