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
import school.A_translated_1Match;
import school.Student;
import school.util.A_translated_1QuerySpecification;

/**
 * Generated pattern matcher API of the school.A_translated_1 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link A_translated_1Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern A_translated_1(
 * 	s2 : Student,
 * 	s1 : Student
 * ) {
 * 	s1 != s2;
 * }
 * </pre></code>
 * 
 * @see A_translated_1Match
 * @see A_translated_1Processor
 * @see A_translated_1QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class A_translated_1Matcher extends BaseMatcher<A_translated_1Match> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<A_translated_1Matcher> querySpecification() throws IncQueryException {
    return A_translated_1QuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static A_translated_1Matcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    A_translated_1Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new A_translated_1Matcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S2 = 0;
  
  private final static int POSITION_S1 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(A_translated_1Matcher.class);
  
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
  public A_translated_1Matcher(final Notifier emfRoot) throws IncQueryException {
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
  public A_translated_1Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return matches represented as a A_translated_1Match object.
   * 
   */
  public Collection<A_translated_1Match> getAllMatches(final Student pS2, final Student pS1) {
    return rawGetAllMatches(new Object[]{pS2, pS1});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return a match represented as a A_translated_1Match object, or null if no match is found.
   * 
   */
  public A_translated_1Match getOneArbitraryMatch(final Student pS2, final Student pS1) {
    return rawGetOneArbitraryMatch(new Object[]{pS2, pS1});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Student pS2, final Student pS1) {
    return rawHasMatch(new Object[]{pS2, pS1});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Student pS2, final Student pS1) {
    return rawCountMatches(new Object[]{pS2, pS1});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Student pS2, final Student pS1, final IMatchProcessor<? super A_translated_1Match> processor) {
    rawForEachMatch(new Object[]{pS2, pS1}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Student pS2, final Student pS1, final IMatchProcessor<? super A_translated_1Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS2, pS1}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<A_translated_1Match> newFilteredDeltaMonitor(final boolean fillAtStart, final Student pS2, final Student pS1) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS2, pS1});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public A_translated_1Match newMatch(final Student pS2, final Student pS1) {
    return new A_translated_1Match.Immutable(pS2, pS1);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfs2(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs2() {
    return rawAccumulateAllValuesOfs2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs2(final A_translated_1Match partialMatch) {
    return rawAccumulateAllValuesOfs2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs2(final Student pS1) {
    return rawAccumulateAllValuesOfs2(new Object[]{null, pS1});
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfs1(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs1() {
    return rawAccumulateAllValuesOfs1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs1(final A_translated_1Match partialMatch) {
    return rawAccumulateAllValuesOfs1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfs1(final Student pS2) {
    return rawAccumulateAllValuesOfs1(new Object[]{pS2, null});
  }
  
  @Override
  protected A_translated_1Match tupleToMatch(final Tuple t) {
    try {
      return new A_translated_1Match.Immutable((school.Student) t.get(POSITION_S2), (school.Student) t.get(POSITION_S1));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected A_translated_1Match arrayToMatch(final Object[] match) {
    try {
      return new A_translated_1Match.Immutable((school.Student) match[POSITION_S2], (school.Student) match[POSITION_S1]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected A_translated_1Match arrayToMatchMutable(final Object[] match) {
    try {
      return new A_translated_1Match.Mutable((school.Student) match[POSITION_S2], (school.Student) match[POSITION_S1]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
