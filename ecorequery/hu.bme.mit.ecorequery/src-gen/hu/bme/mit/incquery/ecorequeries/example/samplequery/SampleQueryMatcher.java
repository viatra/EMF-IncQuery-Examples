package hu.bme.mit.incquery.ecorequeries.example.samplequery;

import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatch;
import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * Generated pattern matcher API of the SampleQuery pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SampleQuery(XElement, YElement, Relates, Label1, Label2) = {
 * 	// structural block, defining the basic pattern body
 * 	EClass(XElement);
 * 	EClass.eStructuralFeatures(XElement,Relates);
 * 	EReference(Relates);
 * 	EClass(YElement);
 * 	ETypedElement.eType(Relates,YElement);
 * 
 * 	// express the multiplicity of the ERef between X and Y
 * 	find EReferenceWithStarMultiplicity(Relates);
 * 	// express that both X and Y have got an attribute of type EString
 * 	find EClassWithEStringAttribute(XElement, Label1);
 * 	find EClassWithEStringAttribute(YElement, Label2);
 * 	
 * 	// filter out matching to Ecore.ecore (as the pattern would also have matches there)
 * 	neg find IsInECore(XElement);
 * 	neg find IsInECore(YElement);
 * }
 * </pre></code>
 * 
 * @see SampleQueryMatch
 * @see SampleQueryMatcherFactory
 * @see SampleQueryProcessor
 * 
 */
public class SampleQueryMatcher extends BaseGeneratedMatcher<SampleQueryMatch> implements IncQueryMatcher<SampleQueryMatch> {
  private final static int POSITION_XELEMENT = 0;
  
  private final static int POSITION_YELEMENT = 1;
  
  private final static int POSITION_RELATES = 2;
  
  private final static int POSITION_LABEL1 = 3;
  
  private final static int POSITION_LABEL2 = 4;
  
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
  public SampleQueryMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SampleQueryMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return matches represented as a SampleQueryMatch object.
   * 
   */
  public Collection<SampleQueryMatch> getAllMatches(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawGetAllMatches(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return a match represented as a SampleQueryMatch object, or null if no match is found.
   * 
   */
  public SampleQueryMatch getOneArbitraryMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawGetOneArbitraryMatch(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawHasMatch(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawCountMatches(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2, final IMatchProcessor<? super SampleQueryMatch> processor) {
    rawForEachMatch(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2, final IMatchProcessor<? super SampleQueryMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<SampleQueryMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pXElement the fixed value of pattern parameter XElement, or null if not bound.
   * @param pYElement the fixed value of pattern parameter YElement, or null if not bound.
   * @param pRelates the fixed value of pattern parameter Relates, or null if not bound.
   * @param pLabel1 the fixed value of pattern parameter Label1, or null if not bound.
   * @param pLabel2 the fixed value of pattern parameter Label2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SampleQueryMatch newMatch(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    return new SampleQueryMatch(pXElement, pYElement, pRelates, pLabel1, pLabel2);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> rawAccumulateAllValuesOfXElement(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_XELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement() {
    return rawAccumulateAllValuesOfXElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement(final SampleQueryMatch partialMatch) {
    return rawAccumulateAllValuesOfXElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for XElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfXElement(final EClass pYElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    EClass pXElement = null;
    return rawAccumulateAllValuesOfXElement(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> rawAccumulateAllValuesOfYElement(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_YELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement() {
    return rawAccumulateAllValuesOfYElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement(final SampleQueryMatch partialMatch) {
    return rawAccumulateAllValuesOfYElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for YElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfYElement(final EClass pXElement, final EReference pRelates, final EAttribute pLabel1, final EAttribute pLabel2) {
    EClass pYElement = null;
    return rawAccumulateAllValuesOfYElement(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> rawAccumulateAllValuesOfRelates(final Object[] parameters) {
    Set<EReference> results = new HashSet<EReference>();
    rawAccumulateAllValues(POSITION_RELATES, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates() {
    return rawAccumulateAllValuesOfRelates(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates(final SampleQueryMatch partialMatch) {
    return rawAccumulateAllValuesOfRelates(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Relates.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EReference> getAllValuesOfRelates(final EClass pXElement, final EClass pYElement, final EAttribute pLabel1, final EAttribute pLabel2) {
    EReference pRelates = null;
    return rawAccumulateAllValuesOfRelates(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> rawAccumulateAllValuesOfLabel1(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_LABEL1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1() {
    return rawAccumulateAllValuesOfLabel1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1(final SampleQueryMatch partialMatch) {
    return rawAccumulateAllValuesOfLabel1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel1(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel2) {
    EAttribute pLabel1 = null;
    return rawAccumulateAllValuesOfLabel1(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> rawAccumulateAllValuesOfLabel2(final Object[] parameters) {
    Set<EAttribute> results = new HashSet<EAttribute>();
    rawAccumulateAllValues(POSITION_LABEL2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2() {
    return rawAccumulateAllValuesOfLabel2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2(final SampleQueryMatch partialMatch) {
    return rawAccumulateAllValuesOfLabel2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Label2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EAttribute> getAllValuesOfLabel2(final EClass pXElement, final EClass pYElement, final EReference pRelates, final EAttribute pLabel1) {
    EAttribute pLabel2 = null;
    return rawAccumulateAllValuesOfLabel2(new Object[]{pXElement, pYElement, pRelates, pLabel1, pLabel2});
  }
  
  @Override
  public SampleQueryMatch tupleToMatch(final Tuple t) {
    try {
    	return new SampleQueryMatch((org.eclipse.emf.ecore.EClass) t.get(POSITION_XELEMENT), (org.eclipse.emf.ecore.EClass) t.get(POSITION_YELEMENT), (org.eclipse.emf.ecore.EReference) t.get(POSITION_RELATES), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_LABEL1), (org.eclipse.emf.ecore.EAttribute) t.get(POSITION_LABEL2));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public SampleQueryMatch arrayToMatch(final Object[] match) {
    try {
    	return new SampleQueryMatch((org.eclipse.emf.ecore.EClass) match[POSITION_XELEMENT], (org.eclipse.emf.ecore.EClass) match[POSITION_YELEMENT], (org.eclipse.emf.ecore.EReference) match[POSITION_RELATES], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL1], (org.eclipse.emf.ecore.EAttribute) match[POSITION_LABEL2]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<SampleQueryMatcher> factory() throws IncQueryException {
    return SampleQueryMatcherFactory.instance();
  }
}
