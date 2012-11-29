package hu.bme.mit.incquery.ecorequeries.example.supertypeof;

import hu.bme.mit.incquery.ecorequeries.example.supertypeof.SuperTypeOfMatch;
import hu.bme.mit.incquery.ecorequeries.example.supertypeof.SuperTypeOfMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the SuperTypeOf pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SuperTypeOf(Super,Sub) = {
 * 	EClass.eSuperTypes(Sub,Super);
 * 	EClass(Super);
 * 	EClass(Sub);
 * }
 * </pre></code>
 * 
 * @see SuperTypeOfMatch
 * @see SuperTypeOfMatcherFactory
 * @see SuperTypeOfProcessor
 * 
 */
public class SuperTypeOfMatcher extends BaseGeneratedMatcher<SuperTypeOfMatch> implements IncQueryMatcher<SuperTypeOfMatch> {
  private final static int POSITION_SUPER = 0;
  
  private final static int POSITION_SUB = 1;
  
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
  public SuperTypeOfMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SuperTypeOfMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return matches represented as a SuperTypeOfMatch object.
   * 
   */
  public Collection<SuperTypeOfMatch> getAllMatches(final EClass pSuper, final EClass pSub) {
    return rawGetAllMatches(new Object[]{pSuper, pSub});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return a match represented as a SuperTypeOfMatch object, or null if no match is found.
   * 
   */
  public SuperTypeOfMatch getOneArbitraryMatch(final EClass pSuper, final EClass pSub) {
    return rawGetOneArbitraryMatch(new Object[]{pSuper, pSub});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pSuper, final EClass pSub) {
    return rawHasMatch(new Object[]{pSuper, pSub});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pSuper, final EClass pSub) {
    return rawCountMatches(new Object[]{pSuper, pSub});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pSuper, final EClass pSub, final IMatchProcessor<? super SuperTypeOfMatch> processor) {
    rawForEachMatch(new Object[]{pSuper, pSub}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pSuper, final EClass pSub, final IMatchProcessor<? super SuperTypeOfMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSuper, pSub}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<SuperTypeOfMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pSuper, final EClass pSub) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSuper, pSub});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SuperTypeOfMatch newMatch(final EClass pSuper, final EClass pSub) {
    return new SuperTypeOfMatch(pSuper, pSub);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Super.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> rawAccumulateAllValuesOfSuper(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_SUPER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Super.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSuper() {
    return rawAccumulateAllValuesOfSuper(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Super.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSuper(final SuperTypeOfMatch partialMatch) {
    return rawAccumulateAllValuesOfSuper(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Super.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSuper(final EClass pSub) {
    EClass pSuper = null;
    return rawAccumulateAllValuesOfSuper(new Object[]{pSuper, pSub});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> rawAccumulateAllValuesOfSub(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_SUB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSub() {
    return rawAccumulateAllValuesOfSub(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSub(final SuperTypeOfMatch partialMatch) {
    return rawAccumulateAllValuesOfSub(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sub.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfSub(final EClass pSuper) {
    EClass pSub = null;
    return rawAccumulateAllValuesOfSub(new Object[]{pSuper, pSub});
  }
  
  @Override
  public SuperTypeOfMatch tupleToMatch(final Tuple t) {
    try {
    	return new SuperTypeOfMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_SUPER), (org.eclipse.emf.ecore.EClass) t.get(POSITION_SUB));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public SuperTypeOfMatch arrayToMatch(final Object[] match) {
    try {
    	return new SuperTypeOfMatch((org.eclipse.emf.ecore.EClass) match[POSITION_SUPER], (org.eclipse.emf.ecore.EClass) match[POSITION_SUB]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<SuperTypeOfMatcher> factory() throws IncQueryException {
    return SuperTypeOfMatcherFactory.instance();
  }
}
