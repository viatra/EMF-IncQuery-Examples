package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithOneMultiplicityQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SampleQuery2Matcher in a type-safe way.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Match
 * 
 */
@SuppressWarnings("all")
public final class SampleQuery2QuerySpecification extends BaseGeneratedQuerySpecification<SampleQuery2Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SampleQuery2QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected SampleQuery2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
  }
  
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
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private SampleQuery2QuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_XElement = body.getOrCreateVariableByName("XElement");
      PVariable var_YElement = body.getOrCreateVariableByName("YElement");
      PVariable var_Relates1 = body.getOrCreateVariableByName("Relates1");
      PVariable var_Relates2 = body.getOrCreateVariableByName("Relates2");
      PVariable var_Label1 = body.getOrCreateVariableByName("Label1");
      PVariable var_Label2 = body.getOrCreateVariableByName("Label2");
      new ExportedParameter(body, var_XElement, "XElement");
      new ExportedParameter(body, var_YElement, "YElement");
      new ExportedParameter(body, var_Relates1, "Relates1");
      new ExportedParameter(body, var_Relates2, "Relates2");
      new ExportedParameter(body, var_Label1, "Label1");
      new ExportedParameter(body, var_Label2, "Label2");
      new TypeBinary(body, context, var_XElement, var_Relates1, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eStructuralFeatures"), "http://www.eclipse.org/emf/2002/Ecore/EClass.eStructuralFeatures");
      new TypeBinary(body, context, var_Relates1, var_Relates2, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference", "eOpposite"), "http://www.eclipse.org/emf/2002/Ecore/EReference.eOpposite");
      new TypeUnary(body, var_YElement, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass"), "http://www.eclipse.org/emf/2002/Ecore/EClass");
      new TypeBinary(body, context, var_Relates1, var_YElement, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "eType"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.eType");
      new PositivePatternCall(body, new FlatTuple(var_Relates1), EReferenceWithStarMultiplicityQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_Relates2), EReferenceWithOneMultiplicityQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_XElement, var_Label1), EClassWithEStringAttributeQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_YElement, var_Label2), EClassWithEStringAttributeQuerySpecification.instance());
      new NegativePatternCall(body, new FlatTuple(var_XElement), IsInECoreQuerySpecification.instance());
      new NegativePatternCall(body, new FlatTuple(var_YElement), IsInECoreQuerySpecification.instance());
      body.setSymbolicParameters(Arrays.asList(var_XElement, var_YElement, var_Relates1, var_Relates2, var_Label1, var_Label2));
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SampleQuery2QuerySpecification> {
    @Override
    public SampleQuery2QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SampleQuery2QuerySpecification INSTANCE = make();
    
    public static SampleQuery2QuerySpecification make() {
      try {
      	return new SampleQuery2QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
