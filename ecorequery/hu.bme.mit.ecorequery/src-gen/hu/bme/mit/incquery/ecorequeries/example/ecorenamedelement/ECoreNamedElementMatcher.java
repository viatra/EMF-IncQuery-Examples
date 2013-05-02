package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement;

import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementMatch;
import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryEngineManager;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ECoreNamedElement(Element,Name) = {
 *        ENamedElement(Element);
 *        ENamedElement.name(Element,Name);
 * }
 * </pre></code>
 * 
 * @see ECoreNamedElementMatch
 * @see ECoreNamedElementQuerySpecification
 * @see ECoreNamedElementProcessor
 * 
 */
public class ECoreNamedElementMatcher extends BaseGeneratedMatcher<ECoreNamedElementMatch> {
  private final static int POSITION_ELEMENT = 0;
  
  private final static int POSITION_NAME = 1;
  
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
  public ECoreNamedElementMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ECoreNamedElementMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return matches represented as a ECoreNamedElementMatch object.
   * 
   */
  public Collection<ECoreNamedElementMatch> getAllMatches(final ENamedElement pElement, final String pName) {
    return rawGetAllMatches(new Object[]{pElement, pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return a match represented as a ECoreNamedElementMatch object, or null if no match is found.
   * 
   */
  public ECoreNamedElementMatch getOneArbitraryMatch(final ENamedElement pElement, final String pName) {
    return rawGetOneArbitraryMatch(new Object[]{pElement, pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ENamedElement pElement, final String pName) {
    return rawHasMatch(new Object[]{pElement, pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ENamedElement pElement, final String pName) {
    return rawCountMatches(new Object[]{pElement, pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ENamedElement pElement, final String pName, final IMatchProcessor<? super ECoreNamedElementMatch> processor) {
    rawForEachMatch(new Object[]{pElement, pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ENamedElement pElement, final String pName, final IMatchProcessor<? super ECoreNamedElementMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pElement, pName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ECoreNamedElementMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final ENamedElement pElement, final String pName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pElement, pName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ECoreNamedElementMatch newMatch(final ENamedElement pElement, final String pName) {
    return new ECoreNamedElementMatch.Immutable(pElement, pName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ENamedElement> rawAccumulateAllValuesOfElement(final Object[] parameters) {
    Set<ENamedElement> results = new HashSet<ENamedElement>();
    rawAccumulateAllValues(POSITION_ELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ENamedElement> getAllValuesOfElement() {
    return rawAccumulateAllValuesOfElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ENamedElement> getAllValuesOfElement(final ECoreNamedElementMatch partialMatch) {
    return rawAccumulateAllValuesOfElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Element.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ENamedElement> getAllValuesOfElement(final String pName) {
    return rawAccumulateAllValuesOfElement(new Object[]{null, pName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName() {
    return rawAccumulateAllValuesOfName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName(final ECoreNamedElementMatch partialMatch) {
    return rawAccumulateAllValuesOfName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName(final ENamedElement pElement) {
    return rawAccumulateAllValuesOfName(new Object[]{pElement, null});
  }
  
  @Override
  protected ECoreNamedElementMatch tupleToMatch(final Tuple t) {
    try {
    	return new ECoreNamedElementMatch.Immutable((org.eclipse.emf.ecore.ENamedElement) t.get(POSITION_ELEMENT), (java.lang.String) t.get(POSITION_NAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ECoreNamedElementMatch arrayToMatch(final Object[] match) {
    try {
    	return new ECoreNamedElementMatch.Immutable((org.eclipse.emf.ecore.ENamedElement) match[POSITION_ELEMENT], (java.lang.String) match[POSITION_NAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ECoreNamedElementMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new ECoreNamedElementMatch.Mutable((org.eclipse.emf.ecore.ENamedElement) match[POSITION_ELEMENT], (java.lang.String) match[POSITION_NAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ECoreNamedElementMatcher> querySpecification() throws IncQueryException {
    return ECoreNamedElementQuerySpecification.instance();
  }
}
