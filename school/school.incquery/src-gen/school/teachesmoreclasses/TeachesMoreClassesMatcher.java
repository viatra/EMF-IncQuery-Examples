package school.teachesmoreclasses;

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
import school.Teacher;
import school.teachesmoreclasses.TeachesMoreClassesMatch;
import school.teachesmoreclasses.TeachesMoreClassesMatcherFactory;

/**
 * Generated pattern matcher API of the teachesMoreClasses pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * // for the limitations on check() expressions, see https://viatra.inf.mit.bme.hu/incquery/language#Limitations
 *  // for details on Xbase expressions, see http://www.eclipse.org/Xtext/documentation/2_1_0/199h-xbase-language-reference-expressions.php
 *  
 *  // Step 5: counting (match cardinalities)
 *   
 *    
 *   {@literal @}QueryExplorer(display = false)
 *   pattern teachesMoreClasses(T1:Teacher, T2:Teacher) = {
 *   	N == count find classesOfTeacher(T1,_SC1);
 *   	M == count find classesOfTeacher(T2,_SC2);
 *   	check((N as Integer) {@literal >} (M as Integer));
 *   }
 * </pre></code>
 * 
 * @see TeachesMoreClassesMatch
 * @see TeachesMoreClassesMatcherFactory
 * @see TeachesMoreClassesProcessor
 * 
 */
public class TeachesMoreClassesMatcher extends BaseGeneratedMatcher<TeachesMoreClassesMatch> implements IncQueryMatcher<TeachesMoreClassesMatch> {
  private final static int POSITION_T1 = 0;
  
  private final static int POSITION_T2 = 1;
  
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
  public TeachesMoreClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TeachesMoreClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return matches represented as a TeachesMoreClassesMatch object.
   * 
   */
  public Collection<TeachesMoreClassesMatch> getAllMatches(final Teacher pT1, final Teacher pT2) {
    return rawGetAllMatches(new Object[]{pT1, pT2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return a match represented as a TeachesMoreClassesMatch object, or null if no match is found.
   * 
   */
  public TeachesMoreClassesMatch getOneArbitraryMatch(final Teacher pT1, final Teacher pT2) {
    return rawGetOneArbitraryMatch(new Object[]{pT1, pT2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Teacher pT1, final Teacher pT2) {
    return rawHasMatch(new Object[]{pT1, pT2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Teacher pT1, final Teacher pT2) {
    return rawCountMatches(new Object[]{pT1, pT2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Teacher pT1, final Teacher pT2, final IMatchProcessor<? super TeachesMoreClassesMatch> processor) {
    rawForEachMatch(new Object[]{pT1, pT2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Teacher pT1, final Teacher pT2, final IMatchProcessor<? super TeachesMoreClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT1, pT2}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<TeachesMoreClassesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Teacher pT1, final Teacher pT2) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pT1, pT2});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pT1 the fixed value of pattern parameter T1, or null if not bound.
   * @param pT2 the fixed value of pattern parameter T2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeachesMoreClassesMatch newMatch(final Teacher pT1, final Teacher pT2) {
    return new TeachesMoreClassesMatch(pT1, pT2);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for T1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> rawAccumulateAllValuesOfT1(final Object[] parameters) {
    Set<Teacher> results = new HashSet<Teacher>();
    rawAccumulateAllValues(POSITION_T1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for T1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT1() {
    return rawAccumulateAllValuesOfT1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT1(final TeachesMoreClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfT1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT1(final Teacher pT2) {
    Teacher pT1 = null;
    return rawAccumulateAllValuesOfT1(new Object[]{pT1, pT2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for T2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> rawAccumulateAllValuesOfT2(final Object[] parameters) {
    Set<Teacher> results = new HashSet<Teacher>();
    rawAccumulateAllValues(POSITION_T2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for T2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT2() {
    return rawAccumulateAllValuesOfT2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT2(final TeachesMoreClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfT2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT2(final Teacher pT1) {
    Teacher pT2 = null;
    return rawAccumulateAllValuesOfT2(new Object[]{pT1, pT2});
  }
  
  @Override
  public TeachesMoreClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeachesMoreClassesMatch((school.Teacher) t.get(POSITION_T1), (school.Teacher) t.get(POSITION_T2));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public TeachesMoreClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeachesMoreClassesMatch((school.Teacher) match[POSITION_T1], (school.Teacher) match[POSITION_T2]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<TeachesMoreClassesMatcher> factory() throws IncQueryException {
    return TeachesMoreClassesMatcherFactory.instance();
  }
}
