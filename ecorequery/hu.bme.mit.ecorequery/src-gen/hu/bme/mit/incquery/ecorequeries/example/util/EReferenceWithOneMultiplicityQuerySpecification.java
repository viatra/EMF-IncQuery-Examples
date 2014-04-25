package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithOneMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityMatcher
 * @see EReferenceWithOneMultiplicityMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithOneMultiplicityQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithOneMultiplicityMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("ERef");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("ERef", "org.eclipse.emf.ecore.EReference"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_ERef = body.getOrCreateVariableByName("ERef");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_ERef, "ERef")
      ));
      
      new TypeUnary(body, var_ERef, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference"), "http://www.eclipse.org/emf/2002/Ecore/EReference");
      new ConstantValue(body, var__virtual_0_, 1);
      new TypeBinary(body, CONTEXT, var_ERef, var__virtual_0_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "lowerBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.lowerBound");
      new ConstantValue(body, var__virtual_2_, 1);
      new TypeBinary(body, CONTEXT, var_ERef, var__virtual_2_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "upperBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.upperBound");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithOneMultiplicityQuerySpecification> {
    @Override
    public EReferenceWithOneMultiplicityQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityQuerySpecification INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityQuerySpecification make() {
      return new EReferenceWithOneMultiplicityQuerySpecification();					
      
    }
  }
  
}
