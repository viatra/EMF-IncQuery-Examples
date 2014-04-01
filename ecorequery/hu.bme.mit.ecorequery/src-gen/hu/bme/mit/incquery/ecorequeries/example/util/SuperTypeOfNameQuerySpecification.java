package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;

/**
 * A pattern-specific query specification that can instantiate SuperTypeOfNameMatcher in a type-safe way.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameMatch
 * 
 */
@SuppressWarnings("all")
public final class SuperTypeOfNameQuerySpecification extends BaseGeneratedQuerySpecification<SuperTypeOfNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("SuperName","SubName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("SuperName", "java.lang.String"),new PParameter("SubName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_SuperName = body.getOrCreateVariableByName("SuperName");
      PVariable var_SubName = body.getOrCreateVariableByName("SubName");
      PVariable var_Sub = body.getOrCreateVariableByName("Sub");
      PVariable var_Super = body.getOrCreateVariableByName("Super");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_SuperName, "SuperName"), 
        new ExportedParameter(body, var_SubName, "SubName")
      ));
      
      
      new TypeBinary(body, context, var_Sub, var_Super, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eSuperTypes");
      new TypeBinary(body, context, var_Super, var_SuperName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      new TypeBinary(body, context, var_Sub, var_SubName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private SuperTypeOfNameQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SuperTypeOfNameQuerySpecification> {
    @Override
    public SuperTypeOfNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SuperTypeOfNameQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfNameQuerySpecification make() {
      try {
      	return new SuperTypeOfNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
