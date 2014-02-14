package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.IsEStringMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.ECoreNamedElementQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsInECoreQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.PQuery.PQueryStatus;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate IsEStringMatcher in a type-safe way.
 * 
 * @see IsEStringMatcher
 * @see IsEStringMatch
 * 
 */
@SuppressWarnings("all")
public final class IsEStringQuerySpecification extends BaseGeneratedQuerySpecification<IsEStringMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsEStringQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IsEStringMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IsEStringMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.IsEString";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Element");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Element", "org.eclipse.emf.ecore.EClassifier"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private IsEStringQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_Element = body.getOrCreateVariableByName("Element");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_Element, "Element")
      ));
      
      new PositivePatternCall(body, new FlatTuple(var_Element), IsInECoreQuerySpecification.instance());
      new ConstantValue(body, var__virtual_0_, "EString");
      new PositivePatternCall(body, new FlatTuple(var_Element, var__virtual_0_), ECoreNamedElementQuerySpecification.instance());
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<IsEStringQuerySpecification> {
    @Override
    public IsEStringQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static IsEStringQuerySpecification INSTANCE = make();
    
    public static IsEStringQuerySpecification make() {
      try {
      	return new IsEStringQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
