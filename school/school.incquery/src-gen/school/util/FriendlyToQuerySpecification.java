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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import school.FriendlyToMatcher;

/**
 * A pattern-specific query specification that can instantiate FriendlyToMatcher in a type-safe way.
 * 
 * @see FriendlyToMatcher
 * @see FriendlyToMatch
 * 
 */
@SuppressWarnings("all")
public final class FriendlyToQuerySpecification extends BaseGeneratedQuerySpecification<FriendlyToMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FriendlyToQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected FriendlyToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FriendlyToMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.friendlyTo";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S1","S2");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S1", "school.Student"),new PParameter("S2", "school.Student"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S1 = body.getOrCreateVariableByName("S1");
      PVariable var_S2 = body.getOrCreateVariableByName("S2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S1, "S1"), 
        new ExportedParameter(body, var_S2, "S2")
      ));
      
      
      new TypeBinary(body, context, var_S1, var_S2, getFeatureLiteral("http://school.ecore", "Student", "friendsWith"), "http://school.ecore/Student.friendsWith");
      bodies.add(body);
    }{
      PBody body = new PBody(this);
      PVariable var_S1 = body.getOrCreateVariableByName("S1");
      PVariable var_S2 = body.getOrCreateVariableByName("S2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S1, "S1"), 
        new ExportedParameter(body, var_S2, "S2")
      ));
      
      
      new TypeBinary(body, context, var_S2, var_S1, getFeatureLiteral("http://school.ecore", "Student", "friendsWith"), "http://school.ecore/Student.friendsWith");
      bodies.add(body);
    }{
      PAnnotation annotation = new PAnnotation("QueryExplorer");
      annotation.addAttribute("display",false);
      addAnnotation(annotation);
    }
    setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private FriendlyToQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<FriendlyToQuerySpecification> {
    @Override
    public FriendlyToQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static FriendlyToQuerySpecification INSTANCE = make();
    
    public static FriendlyToQuerySpecification make() {
      try {
      	return new FriendlyToQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
