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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TheOnesWithTheBiggestCircleNameMatcher;
import school.util.MoreFriendsThanQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TheOnesWithTheBiggestCircleNameMatcher in a type-safe way.
 * 
 * @see TheOnesWithTheBiggestCircleNameMatcher
 * @see TheOnesWithTheBiggestCircleNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TheOnesWithTheBiggestCircleNameQuerySpecification extends BaseGeneratedQuerySpecification<TheOnesWithTheBiggestCircleNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TheOnesWithTheBiggestCircleNameQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected TheOnesWithTheBiggestCircleNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.theOnesWithTheBiggestCircleName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("SName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("SName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_SName = body.getOrCreateVariableByName("SName");
      PVariable var__Sx = body.getOrCreateVariableByName("_Sx");
      PVariable var_S = body.getOrCreateVariableByName("S");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_SName, "SName")
      ));
      
      new NegativePatternCall(body, new FlatTuple(var__Sx, var_S), MoreFriendsThanQuerySpecification.instance().instance());
      new TypeBinary(body, CONTEXT, var_S, var_SName, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TheOnesWithTheBiggestCircleNameQuerySpecification INSTANCE = make();
    
    public static TheOnesWithTheBiggestCircleNameQuerySpecification make() {
      return new TheOnesWithTheBiggestCircleNameQuerySpecification();					
      
    }
  }
  
}
