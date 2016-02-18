package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Match;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsInECoreQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SampleQuery2Matcher in a type-safe way.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Match
 * 
 */
@SuppressWarnings("all")
public final class SampleQuery2QuerySpecification extends BaseGeneratedEMFQuerySpecification<SampleQuery2Matcher> {
  private SampleQuery2QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQuery2QuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SampleQuery2Matcher instantiate(final ViatraQueryEngine engine) throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
  }
  
  @Override
  public SampleQuery2Match newEmptyMatch() {
    return SampleQuery2Match.newEmptyMatch();
  }
  
  @Override
  public SampleQuery2Match newMatch(final Object... parameters) {
    return SampleQuery2Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1], (org.eclipse.emf.ecore.EReference) parameters[2], (org.eclipse.emf.ecore.EReference) parameters[3], (org.eclipse.emf.ecore.EAttribute) parameters[4], (org.eclipse.emf.ecore.EAttribute) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SampleQuery2QuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link SampleQuery2QuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SampleQuery2QuerySpecification INSTANCE = new SampleQuery2QuerySpecification();
    
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
    private final static SampleQuery2QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("XElement","YElement","Relates1","Relates2","Label1","Label2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("XElement", "org.eclipse.emf.ecore.EClass"),new PParameter("YElement", "org.eclipse.emf.ecore.EClass"),new PParameter("Relates1", "org.eclipse.emf.ecore.EReference"),new PParameter("Relates2", "org.eclipse.emf.ecore.EReference"),new PParameter("Label1", "org.eclipse.emf.ecore.EAttribute"),new PParameter("Label2", "org.eclipse.emf.ecore.EAttribute"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_XElement = body.getOrCreateVariableByName("XElement");
      		PVariable var_YElement = body.getOrCreateVariableByName("YElement");
      		PVariable var_Relates1 = body.getOrCreateVariableByName("Relates1");
      		PVariable var_Relates2 = body.getOrCreateVariableByName("Relates2");
      		PVariable var_Label1 = body.getOrCreateVariableByName("Label1");
      		PVariable var_Label2 = body.getOrCreateVariableByName("Label2");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_XElement, "XElement"),
      		   new ExportedParameter(body, var_YElement, "YElement"),
      		   new ExportedParameter(body, var_Relates1, "Relates1"),
      		   new ExportedParameter(body, var_Relates2, "Relates2"),
      		   new ExportedParameter(body, var_Label1, "Label1"),
      		   new ExportedParameter(body, var_Label2, "Label2")
      		));
      		// 	// structural block, defining the basic pattern body	EClass(XElement)
      		new TypeConstraint(body, new FlatTuple(var_XElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		// 	EClass.eStructuralFeatures(XElement,Relates1)
      		new TypeConstraint(body, new FlatTuple(var_XElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_XElement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures")));
      		new Equality(body, var__virtual_0_, var_Relates1);
      		// 	EReference(Relates1)
      		new TypeConstraint(body, new FlatTuple(var_Relates1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
      		// 		EReference.eOpposite(Relates1,Relates2)
      		new TypeConstraint(body, new FlatTuple(var_Relates1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_Relates1, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference", "eOpposite")));
      		new Equality(body, var__virtual_1_, var_Relates2);
      		// 	EReference(Relates2)
      		new TypeConstraint(body, new FlatTuple(var_Relates2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
      		// 		EClass(YElement)
      		new TypeConstraint(body, new FlatTuple(var_YElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
      		// 	ETypedElement.eType(Relates1,YElement)
      		new TypeConstraint(body, new FlatTuple(var_Relates1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_Relates1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType")));
      		new Equality(body, var__virtual_2_, var_YElement);
      		// 		// express the multiplicity of the ERef between X and Y	find EReferenceWithStarMultiplicity(Relates1)
      		new PositivePatternCall(body, new FlatTuple(var_Relates1), EReferenceWithStarMultiplicityQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find EReferenceWithOneMultiplicity(Relates2)
      		new PositivePatternCall(body, new FlatTuple(var_Relates2), EReferenceWithOneMultiplicityQuerySpecification.instance().getInternalQueryRepresentation());
      		// 		// express that both X and Y have got an attribute of type EString	find EClassWithEStringAttribute(XElement, Label1)
      		new PositivePatternCall(body, new FlatTuple(var_XElement, var_Label1), EClassWithEStringAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find EClassWithEStringAttribute(YElement, Label2)
      		new PositivePatternCall(body, new FlatTuple(var_YElement, var_Label2), EClassWithEStringAttributeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 		// filter out matching to Ecore.ecore (as the pattern would also have matches there)	neg find IsInECore(XElement)
      		new NegativePatternCall(body, new FlatTuple(var_XElement), IsInECoreQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find IsInECore(YElement)
      		new NegativePatternCall(body, new FlatTuple(var_YElement), IsInECoreQuerySpecification.instance().getInternalQueryRepresentation());
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
