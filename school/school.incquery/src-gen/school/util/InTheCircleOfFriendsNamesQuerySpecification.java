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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.InTheCircleOfFriendsNamesMatcher;
import school.util.FriendlyToQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate InTheCircleOfFriendsNamesMatcher in a type-safe way.
 * 
 * @see InTheCircleOfFriendsNamesMatcher
 * @see InTheCircleOfFriendsNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class InTheCircleOfFriendsNamesQuerySpecification extends BaseGeneratedQuerySpecification<InTheCircleOfFriendsNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InTheCircleOfFriendsNamesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected InTheCircleOfFriendsNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.inTheCircleOfFriendsNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S1Name","SomeoneName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S1Name", "java.lang.String"),new PParameter("SomeoneName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S1Name = body.getOrCreateVariableByName("S1Name");
      PVariable var_SomeoneName = body.getOrCreateVariableByName("SomeoneName");
      PVariable var_S1 = body.getOrCreateVariableByName("S1");
      PVariable var_Someone = body.getOrCreateVariableByName("Someone");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S1Name, "S1Name"), 
        new ExportedParameter(body, var_SomeoneName, "SomeoneName")
      ));
      
      
      new BinaryTransitiveClosure(body, new FlatTuple(var_S1, var_Someone), FriendlyToQuerySpecification.instance().instance());
      new Inequality(body, var_S1, var_Someone);
      new TypeBinary(body, context, var_S1, var_S1Name, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      new TypeBinary(body, context, var_Someone, var_SomeoneName, getFeatureLiteral("http://school.ecore", "Student", "name"), "http://school.ecore/Student.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  private InTheCircleOfFriendsNamesQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<InTheCircleOfFriendsNamesQuerySpecification> {
    @Override
    public InTheCircleOfFriendsNamesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static InTheCircleOfFriendsNamesQuerySpecification INSTANCE = make();
    
    public static InTheCircleOfFriendsNamesQuerySpecification make() {
      try {
      	return new InTheCircleOfFriendsNamesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
