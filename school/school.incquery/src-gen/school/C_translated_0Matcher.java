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
import school.C_translated_0Match;
import school.Student;
import school.util.C_translated_0QuerySpecification;

/**
 * Generated pattern matcher API of the school.C_translated_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link C_translated_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern C_translated_0(
 * 	temp1 : Student,
 * 	string_1
 * ) {
 * 		Student.name(temp1, eString_0);
 * 		string_0 == "Istvan Rath";
 * 		eString_0 == string_0;
 * 		string == "almafa";
 * 		string == string_1;
 * 	} or {
 * 		Student.name(temp1, eString_0);
 * 		string_0 == "Istvan Rath";
 * 		eString_0 != string_0;
 * 		Student.name(temp1, eString);
 * 		eString == string_1;
 * }
 * </pre></code>
 * 
 * @see C_translated_0Match
 * @see C_translated_0Processor
 * @see C_translated_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class C_translated_0Matcher extends BaseMatcher<C_translated_0Match> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<C_translated_0Matcher> querySpecification() throws IncQueryException {
    return C_translated_0QuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static C_translated_0Matcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    C_translated_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new C_translated_0Matcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TEMP1 = 0;
  
  private final static int POSITION_STRING_1 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(C_translated_0Matcher.class);
  
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
  public C_translated_0Matcher(final Notifier emfRoot) throws IncQueryException {
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
  public C_translated_0Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return matches represented as a C_translated_0Match object.
   * 
   */
  public Collection<C_translated_0Match> getAllMatches(final Student pTemp1, final String pString_1) {
    return rawGetAllMatches(new Object[]{pTemp1, pString_1});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return a match represented as a C_translated_0Match object, or null if no match is found.
   * 
   */
  public C_translated_0Match getOneArbitraryMatch(final Student pTemp1, final String pString_1) {
    return rawGetOneArbitraryMatch(new Object[]{pTemp1, pString_1});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Student pTemp1, final String pString_1) {
    return rawHasMatch(new Object[]{pTemp1, pString_1});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Student pTemp1, final String pString_1) {
    return rawCountMatches(new Object[]{pTemp1, pString_1});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Student pTemp1, final String pString_1, final IMatchProcessor<? super C_translated_0Match> processor) {
    rawForEachMatch(new Object[]{pTemp1, pString_1}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Student pTemp1, final String pString_1, final IMatchProcessor<? super C_translated_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTemp1, pString_1}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<C_translated_0Match> newFilteredDeltaMonitor(final boolean fillAtStart, final Student pTemp1, final String pString_1) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTemp1, pString_1});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTemp1 the fixed value of pattern parameter temp1, or null if not bound.
   * @param pString_1 the fixed value of pattern parameter string_1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public C_translated_0Match newMatch(final Student pTemp1, final String pString_1) {
    return new C_translated_0Match.Immutable(pTemp1, pString_1);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for temp1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOftemp1(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_TEMP1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for temp1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOftemp1() {
    return rawAccumulateAllValuesOftemp1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for temp1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOftemp1(final C_translated_0Match partialMatch) {
    return rawAccumulateAllValuesOftemp1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for temp1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOftemp1(final String pString_1) {
    return rawAccumulateAllValuesOftemp1(new Object[]{null, pString_1});
  }
  
  /**
   * Retrieve the set of values that occur in matches for string_1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfstring_1(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_STRING_1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for string_1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfstring_1() {
    return rawAccumulateAllValuesOfstring_1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for string_1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfstring_1(final C_translated_0Match partialMatch) {
    return rawAccumulateAllValuesOfstring_1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for string_1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfstring_1(final Student pTemp1) {
    return rawAccumulateAllValuesOfstring_1(new Object[]{pTemp1, null});
  }
  
  @Override
  protected C_translated_0Match tupleToMatch(final Tuple t) {
    try {
      return new C_translated_0Match.Immutable((school.Student) t.get(POSITION_TEMP1), (java.lang.String) t.get(POSITION_STRING_1));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected C_translated_0Match arrayToMatch(final Object[] match) {
    try {
      return new C_translated_0Match.Immutable((school.Student) match[POSITION_TEMP1], (java.lang.String) match[POSITION_STRING_1]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected C_translated_0Match arrayToMatchMutable(final Object[] match) {
    try {
      return new C_translated_0Match.Mutable((school.Student) match[POSITION_TEMP1], (java.lang.String) match[POSITION_STRING_1]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
