package school.classesofschool;

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
import school.SchoolClass;
import school.classesofschool.ClassesOfSchoolMatch;
import school.classesofschool.ClassesOfSchoolMatcherFactory;

/**
 * Generated pattern matcher API of the classesOfSchool pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classesOfSchool(SC)= {
 *  	SchoolClass(SC);
 *  }
 * </pre></code>
 * 
 * @see ClassesOfSchoolMatch
 * @see ClassesOfSchoolMatcherFactory
 * @see ClassesOfSchoolProcessor
 * 
 */
public class ClassesOfSchoolMatcher extends BaseGeneratedMatcher<ClassesOfSchoolMatch> implements IncQueryMatcher<ClassesOfSchoolMatch> {
  private final static int POSITION_SC = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ClassesOfSchoolMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesOfSchoolMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return matches represented as a ClassesOfSchoolMatch object.
   * 
   */
  public Collection<ClassesOfSchoolMatch> getAllMatches(final SchoolClass pSC) {
    return rawGetAllMatches(new Object[]{pSC});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return a match represented as a ClassesOfSchoolMatch object, or null if no match is found.
   * 
   */
  public ClassesOfSchoolMatch getOneArbitraryMatch(final SchoolClass pSC) {
    return rawGetOneArbitraryMatch(new Object[]{pSC});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SchoolClass pSC) {
    return rawHasMatch(new Object[]{pSC});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SchoolClass pSC) {
    return rawCountMatches(new Object[]{pSC});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SchoolClass pSC, final IMatchProcessor<? super ClassesOfSchoolMatch> processor) {
    rawForEachMatch(new Object[]{pSC}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SchoolClass pSC, final IMatchProcessor<? super ClassesOfSchoolMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSC}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<ClassesOfSchoolMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final SchoolClass pSC) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSC});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pSC the fixed value of pattern parameter SC, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesOfSchoolMatch newMatch(final SchoolClass pSC) {
    return new ClassesOfSchoolMatch(pSC);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for SC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SchoolClass> rawAccumulateAllValuesOfSC(final Object[] parameters) {
    Set<SchoolClass> results = new HashSet<SchoolClass>();
    rawAccumulateAllValues(POSITION_SC, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SC.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SchoolClass> getAllValuesOfSC() {
    return rawAccumulateAllValuesOfSC(emptyArray());
  }
  
  @Override
  public ClassesOfSchoolMatch tupleToMatch(final Tuple t) {
    try {
    	return new ClassesOfSchoolMatch((school.SchoolClass) t.get(POSITION_SC));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ClassesOfSchoolMatch arrayToMatch(final Object[] match) {
    try {
    	return new ClassesOfSchoolMatch((school.SchoolClass) match[POSITION_SC]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ClassesOfSchoolMatcher> factory() throws IncQueryException {
    return ClassesOfSchoolMatcherFactory.instance();
  }
}
