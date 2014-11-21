package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementNameMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate ECoreNamedElementNameMatcher in a type-safe way.
 * 
 * @see ECoreNamedElementNameMatcher
 * @see ECoreNamedElementNameMatch
 * 
 */
@SuppressWarnings("all")
public final class ECoreNamedElementNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<ECoreNamedElementNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ECoreNamedElementNameQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected ECoreNamedElementNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ECoreNamedElementNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Name", "java.lang.String"));
  }
  
  @Override
  public ECoreNamedElementNameMatch newEmptyMatch() {
    return ECoreNamedElementNameMatch.newEmptyMatch();
  }
  
  @Override
  public ECoreNamedElementNameMatch newMatch(final Object... parameters) {
    return ECoreNamedElementNameMatch.newMatch((java.lang.String) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Name = body.getOrCreateVariableByName("Name");
      PVariable var_Element = body.getOrCreateVariableByName("Element");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Name, "Name")
      ));
      
      new TypeBinary(body, CONTEXT, var_Element, var_Name, getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name"), "http://www.eclipse.org/emf/2002/Ecore/ENamedElement.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static ECoreNamedElementNameQuerySpecification INSTANCE = make();
    
    public static ECoreNamedElementNameQuerySpecification make() {
      return new ECoreNamedElementNameQuerySpecification();					
      
    }
  }
}
