package school.coursesofteachernames;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import school.coursesofteachernames.CoursesOfTeacherNamesMatch;
import school.coursesofteachernames.CoursesOfTeacherNamesMatcherFactory;

/**
 * Generated pattern matcher API of the coursesOfTeacherNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern coursesOfTeacherNames(TName, CName) {
 * 	Teacher.courses(T, C);
 * 	Teacher.name(T, TName);
 * 	Course.subject(C, CName);
 * }
 * </pre></code>
 * 
 * @see CoursesOfTeacherNamesMatch
 * @see CoursesOfTeacherNamesMatcherFactory
 * @see CoursesOfTeacherNamesProcessor
 * 
 */
public class CoursesOfTeacherNamesMatcher extends BaseGeneratedMatcher<CoursesOfTeacherNamesMatch> implements IncQueryMatcher<CoursesOfTeacherNamesMatch> {
  private final static int POSITION_TNAME = 0;
  
  private final static int POSITION_CNAME = 1;
  
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
  public CoursesOfTeacherNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CoursesOfTeacherNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return matches represented as a CoursesOfTeacherNamesMatch object.
   * 
   */
  public Collection<CoursesOfTeacherNamesMatch> getAllMatches(final String pTName, final String pCName) {
    return rawGetAllMatches(new Object[]{pTName, pCName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return a match represented as a CoursesOfTeacherNamesMatch object, or null if no match is found.
   * 
   */
  public CoursesOfTeacherNamesMatch getOneArbitraryMatch(final String pTName, final String pCName) {
    return rawGetOneArbitraryMatch(new Object[]{pTName, pCName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pTName, final String pCName) {
    return rawHasMatch(new Object[]{pTName, pCName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pTName, final String pCName) {
    return rawCountMatches(new Object[]{pTName, pCName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pTName, final String pCName, final IMatchProcessor<? super CoursesOfTeacherNamesMatch> processor) {
    rawForEachMatch(new Object[]{pTName, pCName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pTName, final String pCName, final IMatchProcessor<? super CoursesOfTeacherNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTName, pCName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<CoursesOfTeacherNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pTName, final String pCName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTName, pCName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pCName the fixed value of pattern parameter CName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CoursesOfTeacherNamesMatch newMatch(final String pTName, final String pCName) {
    return new CoursesOfTeacherNamesMatch(pTName, pCName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfTName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName() {
    return rawAccumulateAllValuesOfTName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final CoursesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfTName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final String pCName) {
    String pTName = null;
    return rawAccumulateAllValuesOfTName(new Object[]{pTName, pCName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfCName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName() {
    return rawAccumulateAllValuesOfCName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName(final CoursesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfCName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for CName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfCName(final String pTName) {
    String pCName = null;
    return rawAccumulateAllValuesOfCName(new Object[]{pTName, pCName});
  }
  
  @Override
  public CoursesOfTeacherNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new CoursesOfTeacherNamesMatch((java.lang.String) t.get(POSITION_TNAME), (java.lang.String) t.get(POSITION_CNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public CoursesOfTeacherNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new CoursesOfTeacherNamesMatch((java.lang.String) match[POSITION_TNAME], (java.lang.String) match[POSITION_CNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<CoursesOfTeacherNamesMatcher> factory() throws IncQueryException {
    return CoursesOfTeacherNamesMatcherFactory.instance();
  }
}
