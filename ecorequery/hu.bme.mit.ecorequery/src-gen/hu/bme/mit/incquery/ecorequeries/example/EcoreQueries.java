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
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public final class EcoreQueries extends BaseGeneratedPatternGroup {
  public EcoreQueries() throws IncQueryException {
    querySpecifications.add(SampleQuery2Matcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithOneMultiplicityNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithOneMultiplicityMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementNameMatcher.querySpecification());
    querySpecifications.add(EClassMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfMatcher.querySpecification());
    querySpecifications.add(IsEStringMatcher.querySpecification());
    querySpecifications.add(EClassAttributeMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityMatcher.querySpecification());
    querySpecifications.add(IsInECoreMatcher.querySpecification());
    querySpecifications.add(EObjectMatcher.querySpecification());
    querySpecifications.add(EClassNameMatcher.querySpecification());
    querySpecifications.add(SampleQueryMatcher.querySpecification());
    querySpecifications.add(EClassWithEStringAttributeMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementMatcher.querySpecification());
    
  }
}
