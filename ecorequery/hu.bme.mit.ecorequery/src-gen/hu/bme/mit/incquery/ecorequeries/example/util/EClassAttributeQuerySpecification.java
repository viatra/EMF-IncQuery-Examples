package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassAttributeMatch;
import hu.bme.mit.incquery.ecorequeries.example.EClassAttributeMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EClassAttributeMatcher in a type-safe way.
 * 
 * @see EClassAttributeMatcher
 * @see EClassAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassAttributeQuerySpecification extends BaseGeneratedEMFQuerySpecification<EClassAttributeMatcher> {
  private EClassAttributeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassAttributeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EClassAttributeMatcher instantiate(final ViatraQueryEngine engine) throws IncQueryException {
    return EClassAttributeMatcher.on(engine);
  }
  
  @Override
  public EClassAttributeMatch newEmptyMatch() {
    return EClassAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public EClassAttributeMatch newMatch(final Object... parameters) {
    return EClassAttributeMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EAttribute) parameters[1], (org.eclipse.emf.ecore.EClassifier) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EClassAttributeQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link EClassAttributeQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EClassAttributeQuerySpecification INSTANCE = new EClassAttributeQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EClassAttributeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_E = body.getOrCreateVariableByName("E");
      		PVariable var_Attr = body.getOrCreateVariableByName("Attr");
      		PVariable var_Type = body.getOrCreateVariableByName("Type");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_E, "E"),
      		   new ExportedParameter(body, var_Attr, "Attr"),
      		   new ExportedParameter(body, var_Type, "Type")
      		));
      		// 	EClass(E)
      		new TypeConstraint(body, new FlatTuple(var_E), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		//  	EClass.eStructuralFeatures(E,Attr)
      		new TypeConstraint(body, new FlatTuple(var_E), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_E, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
      		new Equality(body, var__virtual_0_, var_Attr);
      		// 	EAttribute(Attr)
      		new TypeConstraint(body, new FlatTuple(var_Attr), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EAttribute")));
      		// 	ETypedElement.eType(Attr,Type)
      		new TypeConstraint(body, new FlatTuple(var_Attr), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_Attr, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType")));
      		new Equality(body, var__virtual_1_, var_Type);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
