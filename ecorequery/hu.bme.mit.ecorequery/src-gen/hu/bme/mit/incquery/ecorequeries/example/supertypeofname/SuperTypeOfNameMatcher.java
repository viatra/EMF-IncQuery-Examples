package hu.bme.mit.incquery.ecorequeries.example.supertypeofname;

import hu.bme.mit.incquery.ecorequeries.example.supertypeofname.SuperTypeOfNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.supertypeofname.SuperTypeOfNameMatcherFactory;
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

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SuperTypeOfName(SuperName,SubName) = {
 * 	EClass.eSuperTypes(Sub,Super);
 * 	EClass.name(Super, SuperName);
 * 	EClass.name(Sub, SubName);
 * }
 * </pre></code>
 * 
 * @see SuperTypeOfNameMatch
 * @see SuperTypeOfNameMatcherFactory
 * @see SuperTypeOfNameProcessor
 * 
 */
public class SuperTypeOfNameMatcher extends BaseGeneratedMatcher<SuperTypeOfNameMatch> {
  private final static int POSITION_SUPERNAME = 0;
  
  private final static int POSITION_SUBNAME = 1;
  
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
  public SuperTypeOfNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SuperTypeOfNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return matches represented as a SuperTypeOfNameMatch object.
   * 
   */
  public Collection<SuperTypeOfNameMatch> getAllMatches(final String pSuperName, final String pSubName) {
    return rawGetAllMatches(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return a match represented as a SuperTypeOfNameMatch object, or null if no match is found.
   * 
   */
  public SuperTypeOfNameMatch getOneArbitraryMatch(final String pSuperName, final String pSubName) {
    return rawGetOneArbitraryMatch(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pSuperName, final String pSubName) {
    return rawHasMatch(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pSuperName, final String pSubName) {
    return rawCountMatches(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pSuperName, final String pSubName, final IMatchProcessor<? super SuperTypeOfNameMatch> processor) {
    rawForEachMatch(new Object[]{pSuperName, pSubName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pSuperName, final String pSubName, final IMatchProcessor<? super SuperTypeOfNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSuperName, pSubName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<SuperTypeOfNameMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pSuperName, final String pSubName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SuperTypeOfNameMatch newMatch(final String pSuperName, final String pSubName) {
    return new SuperTypeOfNameMatch(pSuperName, pSubName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfSuperName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SUPERNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName() {
    return rawAccumulateAllValuesOfSuperName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName(final SuperTypeOfNameMatch partialMatch) {
    return rawAccumulateAllValuesOfSuperName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName(final String pSubName) {
    return rawAccumulateAllValuesOfSuperName(new Object[]{null, pSubName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfSubName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SUBNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName() {
    return rawAccumulateAllValuesOfSubName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName(final SuperTypeOfNameMatch partialMatch) {
    return rawAccumulateAllValuesOfSubName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName(final String pSuperName) {
    return rawAccumulateAllValuesOfSubName(new Object[]{pSuperName, null});
  }
  
  @Override
  public SuperTypeOfNameMatch tupleToMatch(final Tuple t) {
    try {
    	return new SuperTypeOfNameMatch((java.lang.String) t.get(POSITION_SUPERNAME), (java.lang.String) t.get(POSITION_SUBNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public SuperTypeOfNameMatch arrayToMatch(final Object[] match) {
    try {
    	return new SuperTypeOfNameMatch((java.lang.String) match[POSITION_SUPERNAME], (java.lang.String) match[POSITION_SUBNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<SuperTypeOfNameMatcher> factory() throws IncQueryException {
    return SuperTypeOfNameMatcherFactory.instance();
  }
}
