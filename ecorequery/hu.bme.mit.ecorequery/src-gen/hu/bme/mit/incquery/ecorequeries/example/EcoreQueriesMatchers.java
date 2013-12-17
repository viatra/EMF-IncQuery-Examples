package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EClassAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EObjectMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.IsEStringMatcher;
import hu.bme.mit.incquery.ecorequeries.example.IsInECoreMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.SampleQueryMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatcher;
import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

@SuppressWarnings("all")
public final class EcoreQueriesMatchers {
  private IncQueryEngine engine;
  
  public EcoreQueriesMatchers(final IncQueryEngine engine) {
    this.engine = engine;
    
  }
  
  public EClassNameMatcher getEClassNameMatcher() throws IncQueryException {
    return EClassNameMatcher.on(engine);
  }
  
  public EClassMatcher getEClassMatcher() throws IncQueryException {
    return EClassMatcher.on(engine);
  }
  
  public ECoreNamedElementNameMatcher getECoreNamedElementNameMatcher() throws IncQueryException {
    return ECoreNamedElementNameMatcher.on(engine);
  }
  
  public EClassAttributeMatcher getEClassAttributeMatcher() throws IncQueryException {
    return EClassAttributeMatcher.on(engine);
  }
  
  public EReferenceWithOneMultiplicityMatcher getEReferenceWithOneMultiplicityMatcher() throws IncQueryException {
    return EReferenceWithOneMultiplicityMatcher.on(engine);
  }
  
  public SuperTypeOfMatcher getSuperTypeOfMatcher() throws IncQueryException {
    return SuperTypeOfMatcher.on(engine);
  }
  
  public ECoreNamedElementMatcher getECoreNamedElementMatcher() throws IncQueryException {
    return ECoreNamedElementMatcher.on(engine);
  }
  
  public IsEStringMatcher getIsEStringMatcher() throws IncQueryException {
    return IsEStringMatcher.on(engine);
  }
  
  public EObjectMatcher getEObjectMatcher() throws IncQueryException {
    return EObjectMatcher.on(engine);
  }
  
  public IsInECoreMatcher getIsInECoreMatcher() throws IncQueryException {
    return IsInECoreMatcher.on(engine);
  }
  
  public SampleQuery2Matcher getSampleQuery2Matcher() throws IncQueryException {
    return SampleQuery2Matcher.on(engine);
  }
  
  public SampleQueryMatcher getSampleQueryMatcher() throws IncQueryException {
    return SampleQueryMatcher.on(engine);
  }
  
  public EReferenceWithOneMultiplicityNameMatcher getEReferenceWithOneMultiplicityNameMatcher() throws IncQueryException {
    return EReferenceWithOneMultiplicityNameMatcher.on(engine);
  }
  
  public EClassWithEStringAttributeMatcher getEClassWithEStringAttributeMatcher() throws IncQueryException {
    return EClassWithEStringAttributeMatcher.on(engine);
  }
  
  public EReferenceWithStarMultiplicityMatcher getEReferenceWithStarMultiplicityMatcher() throws IncQueryException {
    return EReferenceWithStarMultiplicityMatcher.on(engine);
  }
  
  public SuperTypeOfNameMatcher getSuperTypeOfNameMatcher() throws IncQueryException {
    return SuperTypeOfNameMatcher.on(engine);
  }
  
  public EReferenceWithStarMultiplicityNameMatcher getEReferenceWithStarMultiplicityNameMatcher() throws IncQueryException {
    return EReferenceWithStarMultiplicityNameMatcher.on(engine);
  }
}
