package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;

/**
 * A pattern-specific query specification that can instantiate ECoreNamedElementMatcher in a type-safe way.
 * 
 * @see ECoreNamedElementMatcher
 * @see ECoreNamedElementMatch
 * 
 */
@SuppressWarnings("all")
public final class ECoreNamedElementQuerySpecification extends BaseGeneratedQuerySpecification<ECoreNamedElementMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ECoreNamedElementQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ECoreNamedElementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ECoreNamedElementMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Element","Name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Element", "org.eclipse.emf.ecore.ENamedElement"),new PParameter("Name", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Element = body.getOrCreateVariableByName("Element");
      PVariable var_Name = body.getOrCreateVariableByName("Name");
      body.setExportedParameters(Arrays.asList(
        new ExportedParameter(body, var_Element, "Element"), 
        new ExportedParameter(body, var_Name, "Name")
      ));
      
      
      new TypeBinary(body, context, var_Element, var_Name, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private ECoreNamedElementQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ECoreNamedElementQuerySpecification> {
    @Override
    public ECoreNamedElementQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ECoreNamedElementQuerySpecification INSTANCE = make();
    
    public static ECoreNamedElementQuerySpecification make() {
      try {
      	return new ECoreNamedElementQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
