package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassAttributeMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;

/**
 * A pattern-specific query specification that can instantiate EClassAttributeMatcher in a type-safe way.
 * 
 * @see EClassAttributeMatcher
 * @see EClassAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassAttributeQuerySpecification extends BaseGeneratedQuerySpecification<EClassAttributeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassAttributeQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EClassAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EClassAttributeMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassAttribute";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("E","Attr","Type");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("E", "org.eclipse.emf.ecore.EClass"),new PParameter("Attr", "org.eclipse.emf.ecore.EAttribute"),new PParameter("Type", "org.eclipse.emf.ecore.EClassifier"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_E = body.getOrCreateVariableByName("E");
      PVariable var_Attr = body.getOrCreateVariableByName("Attr");
      PVariable var_Type = body.getOrCreateVariableByName("Type");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_E, "E"), 
        new ExportedParameter(body, var_Attr, "Attr"), 
        new ExportedParameter(body, var_Type, "Type")
      ));
      
      
      
      new TypeBinary(body, context, var_E, var_Attr, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eStructuralFeatures");
      new TypeUnary(body, var_Attr, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute"), "http://www.eclipse.org/emf/2002/Ecore/EAttribute");
      new TypeBinary(body, context, var_Attr, var_Type, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.eType");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private EClassAttributeQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EClassAttributeQuerySpecification> {
    @Override
    public EClassAttributeQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EClassAttributeQuerySpecification INSTANCE = make();
    
    public static EClassAttributeQuerySpecification make() {
      try {
      	return new EClassAttributeQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
