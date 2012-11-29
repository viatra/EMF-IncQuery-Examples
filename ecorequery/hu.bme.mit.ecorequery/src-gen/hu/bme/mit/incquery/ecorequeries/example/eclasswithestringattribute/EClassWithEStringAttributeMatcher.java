package hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatch;
import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
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
 * Generated pattern matcher API of the EClassWithEStringAttribute pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EClassWithEStringAttribute(E,Attr) = {
 * 	EClass(E);
 * 	find EClassAttribute(E,Attr,Type);
 * 	find IsEString(Type);
 * }
 * </pre></code>
 * 
 * @see EClassWithEStringAttributeMatch
 * @see EClassWithEStringAttributeMatcherFactory
 * @see EClassWithEStringAttributeProcessor
 * 
 */
public class EClassWithEStringAttributeMatcher extends BaseGeneratedMatcher<EClassWithEStringAttributeMatch> implements IncQueryMatcher<EClassWithEStringAttributeMatch> {
  private final static int POSITION_E = 0;
  
  private final static int POSITION_ATTR = 1;
  
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
  public EClassWithEStringAttributeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EClassWithEStringAttributeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return matches represented as a EClassWithEStringAttributeMatch object.
   * 
   */
  public Collection<EClassWithEStringAttributeMatch> getAllMatches(final EClass pE, final EAttribute pAttr) {
    return rawGetAllMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return a match represented as a EClassWithEStringAttributeMatch object, or null if no match is found.
   * 
   */
  public EClassWithEStringAttributeMatch getOneArbitraryMatch(final EClass pE, final EAttribute pAttr) {
    return rawGetOneArbitraryMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pE, final EAttribute pAttr) {
    return rawHasMatch(new Object[]{pE, pAttr});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pE, final EAttribute pAttr) {
    return rawCountMatches(new Object[]{pE, pAttr});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pE, final EAttribute pAttr, final IMatchProcessor<? super EClassWithEStringAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pE, final EAttribute pAttr, final IMatchProcessor<? super EClassWithEStringAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE, pAttr}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EClassWithEStringAttributeMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pE, final EAttribute pAttr) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pE, pAttr});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EClassWithEStringAttributeMatch newMatch(final EClass pE, final EAttribute pAttr) {
    return new EClassWithEStringAttributeMatch(pE, pAttr);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> rawAccumulateAllValuesOfE(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_E, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE() {
    return rawAccumulateAllValuesOfE(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE(final EClassWithEStringAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE(final EAttribute pAttr) {
    EClass pE = null;
    return rawAccumulateAllValuesOfE(new Object[]{pE, pAttr});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> rawAccumulateAllValuesOfAttr(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_ATTR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr() {
    return rawAccumulateAllValuesOfAttr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr(final EClassWithEStringAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfAttr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfAttr(final EClass pE) {
    EAttribute pAttr = null;
    return rawAccumulateAllValuesOfAttr(new Object[]{pE, pAttr});
  }
  
  @Override
  public EClassWithEStringAttributeMatch tupleToMatch(final Tuple t) {
    try {
    	return new EClassWithEStringAttributeMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_E), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_ATTR));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public EClassWithEStringAttributeMatch arrayToMatch(final Object[] match) {
    try {
    	return new EClassWithEStringAttributeMatch((org.eclipse.emf.ecore.EClass) match[POSITION_E], (org.eclipse.emf.ecore.EAttribute) match[POSITION_ATTR]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<EClassWithEStringAttributeMatcher> factory() throws IncQueryException {
    return EClassWithEStringAttributeMatcherFactory.instance();
  }
}
