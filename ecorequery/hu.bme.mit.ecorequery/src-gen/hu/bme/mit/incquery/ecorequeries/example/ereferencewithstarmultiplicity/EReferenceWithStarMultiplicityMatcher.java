package hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity.EReferenceWithStarMultiplicityMatch;
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity.EReferenceWithStarMultiplicityMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the EReferenceWithStarMultiplicity pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EReferenceWithStarMultiplicity(ERef) = {
 * 	EReference(ERef);
 * 	ETypedElement.lowerBound(ERef,0); 
 * 	ETypedElement.upperBound(ERef,-1);
 * }
 * </pre></code>
 * 
 * @see EReferenceWithStarMultiplicityMatch
 * @see EReferenceWithStarMultiplicityMatcherFactory
 * @see EReferenceWithStarMultiplicityProcessor
 * 
 */
public class EReferenceWithStarMultiplicityMatcher extends BaseGeneratedMatcher<EReferenceWithStarMultiplicityMatch> implements IncQueryMatcher<EReferenceWithStarMultiplicityMatch> {
  private final static int POSITION_EREF = 0;
  
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
  public EReferenceWithStarMultiplicityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EReferenceWithStarMultiplicityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return matches represented as a EReferenceWithStarMultiplicityMatch object.
   * 
   */
  public Collection<EReferenceWithStarMultiplicityMatch> getAllMatches(final EReference pERef) {
    return rawGetAllMatches(new Object[]{pERef});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return a match represented as a EReferenceWithStarMultiplicityMatch object, or null if no match is found.
   * 
   */
  public EReferenceWithStarMultiplicityMatch getOneArbitraryMatch(final EReference pERef) {
    return rawGetOneArbitraryMatch(new Object[]{pERef});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EReference pERef) {
    return rawHasMatch(new Object[]{pERef});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EReference pERef) {
    return rawCountMatches(new Object[]{pERef});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EReference pERef, final IMatchProcessor<? super EReferenceWithStarMultiplicityMatch> processor) {
    rawForEachMatch(new Object[]{pERef}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EReference pERef, final IMatchProcessor<? super EReferenceWithStarMultiplicityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pERef}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EReferenceWithStarMultiplicityMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EReference pERef) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pERef});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EReferenceWithStarMultiplicityMatch newMatch(final EReference pERef) {
    return new EReferenceWithStarMultiplicityMatch(pERef);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERef.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> rawAccumulateAllValuesOfERef(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_EREF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ERef.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfERef() {
    return rawAccumulateAllValuesOfERef(emptyArray());
  }
  
  @Override
  public EReferenceWithStarMultiplicityMatch tupleToMatch(final Tuple t) {
    try {
    	return new EReferenceWithStarMultiplicityMatch((org.eclipse.emf.ecore.EReference) t.get(POSITION_EREF));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public EReferenceWithStarMultiplicityMatch arrayToMatch(final Object[] match) {
    try {
    	return new EReferenceWithStarMultiplicityMatch((org.eclipse.emf.ecore.EReference) match[POSITION_EREF]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<EReferenceWithStarMultiplicityMatcher> factory() throws IncQueryException {
    return EReferenceWithStarMultiplicityMatcherFactory.instance();
  }
}
