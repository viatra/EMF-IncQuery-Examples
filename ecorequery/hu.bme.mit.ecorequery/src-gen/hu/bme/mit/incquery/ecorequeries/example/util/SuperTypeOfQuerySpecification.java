package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatcher;
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
 * A pattern-specific query specification that can instantiate SuperTypeOfMatcher in a type-safe way.
 * 
 * @see SuperTypeOfMatcher
 * @see SuperTypeOfMatch
 * 
 */
@SuppressWarnings("all")
public final class SuperTypeOfQuerySpecification extends BaseGeneratedQuerySpecification<SuperTypeOfMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypeOfQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SuperTypeOfMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SuperTypeOfMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Super","Sub");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Super", "org.eclipse.emf.ecore.EClass"),new PParameter("Sub", "org.eclipse.emf.ecore.EClass"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Super = body.getOrCreateVariableByName("Super");
      PVariable var_Sub = body.getOrCreateVariableByName("Sub");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Super, "Super"), 
        new ExportedParameter(body, var_Sub, "Sub")
      ));
      
      
      new TypeBinary(body, context, var_Sub, var_Super, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eSuperTypes");
      bodies.add(body);
    }
    return bodies;
  }
  
  private SuperTypeOfQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SuperTypeOfQuerySpecification> {
    @Override
    public SuperTypeOfQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SuperTypeOfQuerySpecification INSTANCE = make();
    
    public static SuperTypeOfQuerySpecification make() {
      try {
      	return new SuperTypeOfQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
