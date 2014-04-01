package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityNameMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithOneMultiplicityNameMatcher in a type-safe way.
 * 
 * @see EReferenceWithOneMultiplicityNameMatcher
 * @see EReferenceWithOneMultiplicityNameMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithOneMultiplicityNameQuerySpecification extends BaseGeneratedQuerySpecification<EReferenceWithOneMultiplicityNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithOneMultiplicityNameQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EReferenceWithOneMultiplicityNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithOneMultiplicityNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("ERefName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("ERefName", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_ERefName = body.getOrCreateVariableByName("ERefName");
      PVariable var_ERef = body.getOrCreateVariableByName("ERef");
      PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_ERefName, "ERefName")
      ));
      
      new TypeUnary(body, var_ERef, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference"), "http://www.eclipse.org/emf/2002/Ecore/EReference");
      new TypeBinary(body, context, var_ERef, var_ERefName, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      new ConstantValue(body, var__virtual_1_, 1);
      new TypeBinary(body, context, var_ERef, var__virtual_1_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "lowerBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.lowerBound");
      new ConstantValue(body, var__virtual_3_, 1);
      new TypeBinary(body, context, var_ERef, var__virtual_3_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "upperBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.upperBound");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private EReferenceWithOneMultiplicityNameQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EReferenceWithOneMultiplicityNameQuerySpecification> {
    @Override
    public EReferenceWithOneMultiplicityNameQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EReferenceWithOneMultiplicityNameQuerySpecification INSTANCE = make();
    
    public static EReferenceWithOneMultiplicityNameQuerySpecification make() {
      try {
      	return new EReferenceWithOneMultiplicityNameQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
