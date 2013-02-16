package hu.bme.mit.incquery.ecorequeries.example.isestring;

import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatch;
import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatcherFactory;
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
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.IsEString pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern IsEString(Element) = {
 * 	find IsInECore(Element);
 * 	find ECoreNamedElement(Element,"EString");
 * }
 * </pre></code>
 * 
 * @see IsEStringMatch
 * @see IsEStringMatcherFactory
 * @see IsEStringProcessor
 * 
 */
public class IsEStringMatcher extends BaseGeneratedMatcher<IsEStringMatch> {
  private final static int POSITION_ELEMENT = 0;
  
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
  public IsEStringMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public IsEStringMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return matches represented as a IsEStringMatch object.
   * 
   */
  public Collection<IsEStringMatch> getAllMatches(final Object pElement) {
    return rawGetAllMatches(new Object[]{pElement});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return a match represented as a IsEStringMatch object, or null if no match is found.
   * 
   */
  public IsEStringMatch getOneArbitraryMatch(final Object pElement) {
    return rawGetOneArbitraryMatch(new Object[]{pElement});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pElement) {
    return rawHasMatch(new Object[]{pElement});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pElement) {
    return rawCountMatches(new Object[]{pElement});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pElement, final IMatchProcessor<? super IsEStringMatch> processor) {
    rawForEachMatch(new Object[]{pElement}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pElement, final IMatchProcessor<? super IsEStringMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pElement}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<IsEStringMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pElement) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pElement});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public IsEStringMatch newMatch(final Object pElement) {
    return new IsEStringMatch(pElement);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> rawAccumulateAllValuesOfElement(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_ELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfElement() {
    return rawAccumulateAllValuesOfElement(emptyArray());
  }
  
  @Override
  public IsEStringMatch tupleToMatch(final Tuple t) {
    try {
    	return new IsEStringMatch((java.lang.Object) t.get(POSITION_ELEMENT));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public IsEStringMatch arrayToMatch(final Object[] match) {
    try {
    	return new IsEStringMatch((java.lang.Object) match[POSITION_ELEMENT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<IsEStringMatcher> factory() throws IncQueryException {
    return IsEStringMatcherFactory.instance();
  }
}
