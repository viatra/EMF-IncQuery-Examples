package school.teachersnames;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import school.teachersnames.TeachersNamesMatch;
import school.teachersnames.TeachersNamesMatcherFactory;

/**
 * Generated pattern matcher API of the school.teachersNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern teachersNames(TN) {
 * 	Teacher.name(_T, TN);
 * }
 * </pre></code>
 * 
 * @see TeachersNamesMatch
 * @see TeachersNamesMatcherFactory
 * @see TeachersNamesProcessor
 * 
 */
public class TeachersNamesMatcher extends BaseGeneratedMatcher<TeachersNamesMatch> {
  private final static int POSITION_TN = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public TeachersNamesMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public TeachersNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return matches represented as a TeachersNamesMatch object.
   * 
   */
  public Collection<TeachersNamesMatch> getAllMatches(final String pTN) {
    return rawGetAllMatches(new Object[]{pTN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return a match represented as a TeachersNamesMatch object, or null if no match is found.
   * 
   */
  public TeachersNamesMatch getOneArbitraryMatch(final String pTN) {
    return rawGetOneArbitraryMatch(new Object[]{pTN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pTN) {
    return rawHasMatch(new Object[]{pTN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pTN) {
    return rawCountMatches(new Object[]{pTN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pTN, final IMatchProcessor<? super TeachersNamesMatch> processor) {
    rawForEachMatch(new Object[]{pTN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pTN, final IMatchProcessor<? super TeachersNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTN}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TeachersNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pTN) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTN});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTN the fixed value of pattern parameter TN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeachersNamesMatch newMatch(final String pTN) {
    return new TeachersNamesMatch.Immutable(pTN);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for TN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfTN(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTN() {
    return rawAccumulateAllValuesOfTN(emptyArray());
  }
  
  @Override
  protected TeachersNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeachersNamesMatch.Immutable((java.lang.String) t.get(POSITION_TN));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeachersNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeachersNamesMatch.Immutable((java.lang.String) match[POSITION_TN]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeachersNamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TeachersNamesMatch.Mutable((java.lang.String) match[POSITION_TN]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TeachersNamesMatcher> factory() throws IncQueryException {
    return TeachersNamesMatcherFactory.instance();
  }
}
