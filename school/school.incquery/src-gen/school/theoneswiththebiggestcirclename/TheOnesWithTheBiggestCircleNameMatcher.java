package school.theoneswiththebiggestcirclename;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import school.theoneswiththebiggestcirclename.TheOnesWithTheBiggestCircleNameMatch;
import school.theoneswiththebiggestcirclename.TheOnesWithTheBiggestCircleNameMatcherFactory;

/**
 * Generated pattern matcher API of the theOnesWithTheBiggestCircleName pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern theOnesWithTheBiggestCircleName(SName) = {
 *    	neg find moreFriendsThan(_Sx,S);
 *    	Student.name(S, SName);
 *    }
 * </pre></code>
 * 
 * @see TheOnesWithTheBiggestCircleNameMatch
 * @see TheOnesWithTheBiggestCircleNameMatcherFactory
 * @see TheOnesWithTheBiggestCircleNameProcessor
 * 
 */
public class TheOnesWithTheBiggestCircleNameMatcher extends BaseGeneratedMatcher<TheOnesWithTheBiggestCircleNameMatch> implements IncQueryMatcher<TheOnesWithTheBiggestCircleNameMatch> {
  private final static int POSITION_SNAME = 0;
  
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
  public TheOnesWithTheBiggestCircleNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TheOnesWithTheBiggestCircleNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return matches represented as a TheOnesWithTheBiggestCircleNameMatch object.
   * 
   */
  public Collection<TheOnesWithTheBiggestCircleNameMatch> getAllMatches(final Object pSName) {
    return rawGetAllMatches(new Object[]{pSName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return a match represented as a TheOnesWithTheBiggestCircleNameMatch object, or null if no match is found.
   * 
   */
  public TheOnesWithTheBiggestCircleNameMatch getOneArbitraryMatch(final Object pSName) {
    return rawGetOneArbitraryMatch(new Object[]{pSName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pSName) {
    return rawHasMatch(new Object[]{pSName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pSName) {
    return rawCountMatches(new Object[]{pSName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pSName, final IMatchProcessor<? super TheOnesWithTheBiggestCircleNameMatch> processor) {
    rawForEachMatch(new Object[]{pSName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pSName, final IMatchProcessor<? super TheOnesWithTheBiggestCircleNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TheOnesWithTheBiggestCircleNameMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pSName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TheOnesWithTheBiggestCircleNameMatch newMatch(final Object pSName) {
    return new TheOnesWithTheBiggestCircleNameMatch(pSName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> rawAccumulateAllValuesOfSName(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_SNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfSName() {
    return rawAccumulateAllValuesOfSName(emptyArray());
  }
  
  @Override
  public TheOnesWithTheBiggestCircleNameMatch tupleToMatch(final Tuple t) {
    try {
    	return new TheOnesWithTheBiggestCircleNameMatch((java.lang.Object) t.get(POSITION_SNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public TheOnesWithTheBiggestCircleNameMatch arrayToMatch(final Object[] match) {
    try {
    	return new TheOnesWithTheBiggestCircleNameMatch((java.lang.Object) match[POSITION_SNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TheOnesWithTheBiggestCircleNameMatcher> factory() throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcherFactory.instance();
  }
}
