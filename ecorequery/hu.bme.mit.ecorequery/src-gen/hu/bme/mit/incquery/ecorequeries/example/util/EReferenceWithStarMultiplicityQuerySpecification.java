package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatch;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate EReferenceWithStarMultiplicityMatcher in a type-safe way.
 * 
 * @see EReferenceWithStarMultiplicityMatcher
 * @see EReferenceWithStarMultiplicityMatch
 * 
 */
@SuppressWarnings("all")
public final class EReferenceWithStarMultiplicityQuerySpecification extends BaseGeneratedEMFQuerySpecification<EReferenceWithStarMultiplicityMatcher> {
  private EReferenceWithStarMultiplicityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EReferenceWithStarMultiplicityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EReferenceWithStarMultiplicityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EReferenceWithStarMultiplicityMatcher.on(engine);
  }
  
  @Override
  public EReferenceWithStarMultiplicityMatch newEmptyMatch() {
    return EReferenceWithStarMultiplicityMatch.newEmptyMatch();
  }
  
  @Override
  public EReferenceWithStarMultiplicityMatch newMatch(final Object... parameters) {
    return EReferenceWithStarMultiplicityMatch.newMatch((org.eclipse.emf.ecore.EReference) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EReferenceWithStarMultiplicityQuerySpecification INSTANCE = make();
    
    public static EReferenceWithStarMultiplicityQuerySpecification make() {
      return new EReferenceWithStarMultiplicityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EReferenceWithStarMultiplicityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity";
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_ERef = body.getOrCreateVariableByName("ERef");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_ERef, "ERef")
      	));
      	new TypeUnary(body, var_ERef, getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference"), "http://www.eclipse.org/emf/2002/Ecore/EReference");
      	new ConstantValue(body, var__virtual_0_, 0);
      	new TypeBinary(body, CONTEXT, var_ERef, var__virtual_0_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "lowerBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.lowerBound");
      	new ConstantValue(body, var__virtual_2_, -1);
      	new TypeBinary(body, CONTEXT, var_ERef, var__virtual_2_, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ETypedElement", "upperBound"), "http://www.eclipse.org/emf/2002/Ecore/ETypedElement.upperBound");
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
