package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityNameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityName pattern, 
 * providing pattern-specific query methods.
 * 
 * Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EReferenceWithStarMultiplicityNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EReferenceWithStarMultiplicityName(ERefName) = {
 * 	EReference.name(ERef, ERefName);
 * 	ETypedElement.lowerBound(ERef,0); 
 * 	ETypedElement.upperBound(ERef,-1);
 * }
 * </pre></code>
 * 
 * @see EReferenceWithStarMultiplicityNameMatch
 * @see EReferenceWithStarMultiplicityNameProcessor
 * @see EReferenceWithStarMultiplicityNameQuerySpecification
 * 
 */
public class EReferenceWithStarMultiplicityNameMatcher extends BaseMatcher<EReferenceWithStarMultiplicityNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EReferenceWithStarMultiplicityNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EReferenceWithStarMultiplicityNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EReferenceWithStarMultiplicityNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_EREFNAME = 0;
  
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
  public EReferenceWithStarMultiplicityNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EReferenceWithStarMultiplicityNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return matches represented as a EReferenceWithStarMultiplicityNameMatch object.
   * 
   */
  public Collection<EReferenceWithStarMultiplicityNameMatch> getAllMatches(final String pERefName) {
    return rawGetAllMatches(new Object[]{pERefName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return a match represented as a EReferenceWithStarMultiplicityNameMatch object, or null if no match is found.
   * 
   */
  public EReferenceWithStarMultiplicityNameMatch getOneArbitraryMatch(final String pERefName) {
    return rawGetOneArbitraryMatch(new Object[]{pERefName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pERefName) {
    return rawHasMatch(new Object[]{pERefName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pERefName) {
    return rawCountMatches(new Object[]{pERefName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pERefName, final IMatchProcessor<? super EReferenceWithStarMultiplicityNameMatch> processor) {
    rawForEachMatch(new Object[]{pERefName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pERefName, final IMatchProcessor<? super EReferenceWithStarMultiplicityNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pERefName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EReferenceWithStarMultiplicityNameMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pERefName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pERefName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pERefName the fixed value of pattern parameter ERefName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EReferenceWithStarMultiplicityNameMatch newMatch(final String pERefName) {
    return new EReferenceWithStarMultiplicityNameMatch.Immutable(pERefName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERefName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfERefName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_EREFNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERefName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfERefName() {
    return rawAccumulateAllValuesOfERefName(emptyArray());
  }
  
  @Override
  protected EReferenceWithStarMultiplicityNameMatch tupleToMatch(final Tuple t) {
    try {
    	return new EReferenceWithStarMultiplicityNameMatch.Immutable((java.lang.String) t.get(POSITION_EREFNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityNameMatch arrayToMatch(final Object[] match) {
    try {
    	return new EReferenceWithStarMultiplicityNameMatch.Immutable((java.lang.String) match[POSITION_EREFNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EReferenceWithStarMultiplicityNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new EReferenceWithStarMultiplicityNameMatch.Mutable((java.lang.String) match[POSITION_EREFNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<EReferenceWithStarMultiplicityNameMatcher> querySpecification() throws IncQueryException {
    return EReferenceWithStarMultiplicityNameQuerySpecification.instance();
  }
}
