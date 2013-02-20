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
    matcherFactories.add(ECoreNamedElementMatcher.factory());
    matcherFactories.add(EClassAttributeMatcher.factory());
    matcherFactories.add(EReferenceWithStarMultiplicityNameMatcher.factory());
    matcherFactories.add(EReferenceWithStarMultiplicityMatcher.factory());
    matcherFactories.add(EReferenceWithOneMultiplicityNameMatcher.factory());
    matcherFactories.add(EReferenceWithOneMultiplicityMatcher.factory());
    matcherFactories.add(EClassMatcher.factory());
    matcherFactories.add(EClassNameMatcher.factory());
    matcherFactories.add(EObjectMatcher.factory());
    matcherFactories.add(IsInECoreMatcher.factory());
    matcherFactories.add(SampleQuery2Matcher.factory());
    matcherFactories.add(SuperTypeOfNameMatcher.factory());
    matcherFactories.add(ECoreNamedElementNameMatcher.factory());
    matcherFactories.add(IsEStringMatcher.factory());
    matcherFactories.add(EClassWithEStringAttributeMatcher.factory());
    matcherFactories.add(SampleQueryMatcher.factory());
    matcherFactories.add(SuperTypeOfMatcher.factory());
    
  }
}
