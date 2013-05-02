package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.eclass.EClassMatcher;
import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.eclassname.EClassNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname.ECoreNamedElementNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.eobject.EObjectMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity.EReferenceWithOneMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicityname.EReferenceWithOneMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity.EReferenceWithStarMultiplicityMatcher;
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicityname.EReferenceWithStarMultiplicityNameMatcher;
import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatcher;
import hu.bme.mit.incquery.ecorequeries.example.isinecore.IsInECoreMatcher;
import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatcher;
import hu.bme.mit.incquery.ecorequeries.example.samplequery2.SampleQuery2Matcher;
import hu.bme.mit.incquery.ecorequeries.example.supertypeof.SuperTypeOfMatcher;
import hu.bme.mit.incquery.ecorequeries.example.supertypeofname.SuperTypeOfNameMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public final class GroupOfFileQueries extends BaseGeneratedPatternGroup {
  public GroupOfFileQueries() throws IncQueryException {
    querySpecifications.add(EReferenceWithOneMultiplicityMatcher.querySpecification());
    querySpecifications.add(EClassAttributeMatcher.querySpecification());
    querySpecifications.add(IsEStringMatcher.querySpecification());
    querySpecifications.add(EClassNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityMatcher.querySpecification());
    querySpecifications.add(IsInECoreMatcher.querySpecification());
    querySpecifications.add(EObjectMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfNameMatcher.querySpecification());
    querySpecifications.add(SampleQuery2Matcher.querySpecification());
    querySpecifications.add(EClassWithEStringAttributeMatcher.querySpecification());
    querySpecifications.add(EClassMatcher.querySpecification());
    querySpecifications.add(SampleQueryMatcher.querySpecification());
    querySpecifications.add(EReferenceWithStarMultiplicityNameMatcher.querySpecification());
    querySpecifications.add(SuperTypeOfMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementMatcher.querySpecification());
    querySpecifications.add(ECoreNamedElementNameMatcher.querySpecification());
    querySpecifications.add(EReferenceWithOneMultiplicityNameMatcher.querySpecification());
    
  }
}
