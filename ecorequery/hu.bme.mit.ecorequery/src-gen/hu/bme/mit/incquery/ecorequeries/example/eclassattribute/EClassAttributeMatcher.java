package hu.bme.mit.incquery.ecorequeries.example.eclassattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatch;
import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * Generated pattern matcher API of the EClassAttribute pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EClassAttribute(E, Attr, Type) = {
 * 	EClass(E); 
 * 	EClass.eStructuralFeatures(E,Attr);
 * 	EAttribute(Attr);
 * 	ETypedElement.eType(Attr,Type);
 * }
 * </pre></code>
 * 
 * @see EClassAttributeMatch
 * @see EClassAttributeMatcherFactory
 * @see EClassAttributeProcessor
 * 
 */
public class EClassAttributeMatcher extends BaseGeneratedMatcher<EClassAttributeMatch> implements IncQueryMatcher<EClassAttributeMatch> {
  private final static int POSITION_E = 0;
  
  private final static int POSITION_ATTR = 1;
  
  private final static int POSITION_TYPE = 2;
  
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
  public EClassAttributeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EClassAttributeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return matches represented as a EClassAttributeMatch object.
   * 
   */
  public Collection<EClassAttributeMatch> getAllMatches(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return rawGetAllMatches(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return a match represented as a EClassAttributeMatch object, or null if no match is found.
   * 
   */
  public EClassAttributeMatch getOneArbitraryMatch(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return rawGetOneArbitraryMatch(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return rawHasMatch(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return rawCountMatches(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType, final IMatchProcessor<? super EClassAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pE, pAttr, pType}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType, final IMatchProcessor<? super EClassAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pE, pAttr, pType}, processor);
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
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EClassAttributeMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @param pType the fixed value of pattern parameter Type, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EClassAttributeMatch newMatch(final EClass pE, final EStructuralFeature pAttr, final EClassifier pType) {
    return new EClassAttributeMatch(pE, pAttr, pType);
    
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
  public Set<EClass> getAllValuesOfE(final EClassAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfE(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for E.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfE(final EStructuralFeature pAttr, final EClassifier pType) {
    EClass pE = null;
    return rawAccumulateAllValuesOfE(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EStructuralFeature> rawAccumulateAllValuesOfAttr(final Object[] parameters) {
    Set<EStructuralFeature> results = new HashSet<EStructuralFeature>();
    rawAccumulateAllValues(POSITION_ATTR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EStructuralFeature> getAllValuesOfAttr() {
    return rawAccumulateAllValuesOfAttr(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EStructuralFeature> getAllValuesOfAttr(final EClassAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfAttr(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Attr.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EStructuralFeature> getAllValuesOfAttr(final EClass pE, final EClassifier pType) {
    EStructuralFeature pAttr = null;
    return rawAccumulateAllValuesOfAttr(new Object[]{pE, pAttr, pType});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClassifier> rawAccumulateAllValuesOfType(final Object[] parameters) {
    Set<EClassifier> results = new HashSet<EClassifier>();
    rawAccumulateAllValues(POSITION_TYPE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClassifier> getAllValuesOfType() {
    return rawAccumulateAllValuesOfType(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClassifier> getAllValuesOfType(final EClassAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfType(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClassifier> getAllValuesOfType(final EClass pE, final EStructuralFeature pAttr) {
    EClassifier pType = null;
    return rawAccumulateAllValuesOfType(new Object[]{pE, pAttr, pType});
  }
  
  @Override
  public EClassAttributeMatch tupleToMatch(final Tuple t) {
    try {
    	return new EClassAttributeMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_E), (org.eclipse.emf.ecore.EStructuralFeature) t.get(POSITION_ATTR), (org.eclipse.emf.ecore.EClassifier) t.get(POSITION_TYPE));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public EClassAttributeMatch arrayToMatch(final Object[] match) {
    try {
    	return new EClassAttributeMatch((org.eclipse.emf.ecore.EClass) match[POSITION_E], (org.eclipse.emf.ecore.EStructuralFeature) match[POSITION_ATTR], (org.eclipse.emf.ecore.EClassifier) match[POSITION_TYPE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<EClassAttributeMatcher> factory() throws IncQueryException {
    return EClassAttributeMatcherFactory.instance();
  }
}
