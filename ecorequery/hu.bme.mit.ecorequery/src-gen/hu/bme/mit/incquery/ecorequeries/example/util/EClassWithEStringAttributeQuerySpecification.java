package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatch;
import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsEStringQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EClassWithEStringAttributeMatcher in a type-safe way.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class EClassWithEStringAttributeQuerySpecification extends BaseGeneratedEMFQuerySpecification<EClassWithEStringAttributeMatcher> {
  private EClassWithEStringAttributeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EClassWithEStringAttributeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EClassWithEStringAttributeMatcher instantiate(final ViatraQueryEngine engine) throws IncQueryException {
    return EClassWithEStringAttributeMatcher.on(engine);
  }
  
  @Override
  public EClassWithEStringAttributeMatch newEmptyMatch() {
    return EClassWithEStringAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public EClassWithEStringAttributeMatch newMatch(final Object... parameters) {
    return EClassWithEStringAttributeMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EAttribute) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EClassWithEStringAttributeQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link EClassWithEStringAttributeQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EClassWithEStringAttributeQuerySpecification INSTANCE = new EClassWithEStringAttributeQuerySpecification();
    
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
    private final static EClassWithEStringAttributeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("E","Attr");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("E", "org.eclipse.emf.ecore.EClass"),new PParameter("Attr", "org.eclipse.emf.ecore.EAttribute"));
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
      		   new ExportedParameter(body, var_Attr, "Attr")
      		));
      		// 	EClass(E)
      		new TypeConstraint(body, new FlatTuple(var_E), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		// 	find EClassAttribute(E,Attr,Type)
      		new PositivePatternCall(body, new FlatTuple(var_E, var_Attr, var_Type), EClassAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find IsEString(Type)
      		new PositivePatternCall(body, new FlatTuple(var_Type), IsEStringQuerySpecification.instance().getInternalQueryRepresentation());
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
