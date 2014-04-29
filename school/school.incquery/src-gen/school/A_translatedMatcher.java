package school;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import school.A_translatedMatch;
import school.SchoolClass;
import school.Student;
import school.util.A_translatedQuerySpecification;

/**
 * Generated pattern matcher API of the school.A_translated pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link A_translatedMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern A_translated(
 * 	self : SchoolClass,
 * 	student2 : Student,
 * 	student1 : Student,
 * 	name : EString
 * ) {
 * 	SchoolClass.students(self, student);
 * 	s1 == student;
 * 	eInt == count find A_translated_0(s2,s1);
 * 	eBoolean == eval(eInt {@literal >} 0);
 * 	eInt_0 == count find A_translated_1(s2,s1);
 * 	eBoolean_0 == eval(eInt_0 {@literal >} 0);
 * 	boolean_0 == eval((eBoolean as Boolean) && (eBoolean_0 as Boolean));
 * 	true == boolean_0;
 * 	SchoolClass.students(self, student_0);
 * 	s2 == student_0;
 * 	s2_0 == s2;
 * 	Student.name(s1, eString_1);
 * 	student1 == s1;
 * 	student2 == s2_0;
 * 	name == eString_1;
 * }
 * </pre></code>
 * 
 * @see A_translatedMatch
 * @see A_translatedProcessor
 * @see A_translatedQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class A_translatedMatcher extends BaseMatcher<A_translatedMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<A_translatedMatcher> querySpecification() throws IncQueryException {
    return A_translatedQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static A_translatedMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    A_translatedMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new A_translatedMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SELF = 0;
  
  private final static int POSITION_STUDENT2 = 1;
  
  private final static int POSITION_STUDENT1 = 2;
  
  private final static int POSITION_NAME = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(A_translatedMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public A_translatedMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public A_translatedMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return matches represented as a A_translatedMatch object.
   * 
   */
  public Collection<A_translatedMatch> getAllMatches(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return rawGetAllMatches(new Object[]{pSelf, pStudent2, pStudent1, pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return a match represented as a A_translatedMatch object, or null if no match is found.
   * 
   */
  public A_translatedMatch getOneArbitraryMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return rawGetOneArbitraryMatch(new Object[]{pSelf, pStudent2, pStudent1, pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return rawHasMatch(new Object[]{pSelf, pStudent2, pStudent1, pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return rawCountMatches(new Object[]{pSelf, pStudent2, pStudent1, pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName, final IMatchProcessor<? super A_translatedMatch> processor) {
    rawForEachMatch(new Object[]{pSelf, pStudent2, pStudent1, pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName, final IMatchProcessor<? super A_translatedMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSelf, pStudent2, pStudent1, pName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<A_translatedMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSelf, pStudent2, pStudent1, pName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pStudent2 the fixed value of pattern parameter student2, or null if not bound.
   * @param pStudent1 the fixed value of pattern parameter student1, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public A_translatedMatch newMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    return new A_translatedMatch.Immutable(pSelf, pStudent2, pStudent1, pName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SchoolClass> rawAccumulateAllValuesOfself(final Object[] parameters) {
    Set<SchoolClass> results = new HashSet<SchoolClass>();
    rawAccumulateAllValues(POSITION_SELF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SchoolClass> getAllValuesOfself() {
    return rawAccumulateAllValuesOfself(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SchoolClass> getAllValuesOfself(final A_translatedMatch partialMatch) {
    return rawAccumulateAllValuesOfself(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SchoolClass> getAllValuesOfself(final Student pStudent2, final Student pStudent1, final String pName) {
    return rawAccumulateAllValuesOfself(new Object[]{null, pStudent2, pStudent1, pName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for student2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfstudent2(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_STUDENT2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for student2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent2() {
    return rawAccumulateAllValuesOfstudent2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for student2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent2(final A_translatedMatch partialMatch) {
    return rawAccumulateAllValuesOfstudent2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for student2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent2(final SchoolClass pSelf, final Student pStudent1, final String pName) {
    return rawAccumulateAllValuesOfstudent2(new Object[]{pSelf, null, pStudent1, pName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for student1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfstudent1(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_STUDENT1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for student1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent1() {
    return rawAccumulateAllValuesOfstudent1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for student1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent1(final A_translatedMatch partialMatch) {
    return rawAccumulateAllValuesOfstudent1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for student1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfstudent1(final SchoolClass pSelf, final Student pStudent2, final String pName) {
    return rawAccumulateAllValuesOfstudent1(new Object[]{pSelf, pStudent2, null, pName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname() {
    return rawAccumulateAllValuesOfname(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final A_translatedMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1) {
    return rawAccumulateAllValuesOfname(new Object[]{pSelf, pStudent2, pStudent1, null});
  }
  
  @Override
  protected A_translatedMatch tupleToMatch(final Tuple t) {
    try {
      return new A_translatedMatch.Immutable((school.SchoolClass) t.get(POSITION_SELF), (school.Student) t.get(POSITION_STUDENT2), (school.Student) t.get(POSITION_STUDENT1), (java.lang.String) t.get(POSITION_NAME));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected A_translatedMatch arrayToMatch(final Object[] match) {
    try {
      return new A_translatedMatch.Immutable((school.SchoolClass) match[POSITION_SELF], (school.Student) match[POSITION_STUDENT2], (school.Student) match[POSITION_STUDENT1], (java.lang.String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected A_translatedMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new A_translatedMatch.Mutable((school.SchoolClass) match[POSITION_SELF], (school.Student) match[POSITION_STUDENT2], (school.Student) match[POSITION_STUDENT1], (java.lang.String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
