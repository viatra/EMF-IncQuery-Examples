package school.coursesofteacher;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryEngineManager;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import school.Course;
import school.Teacher;
import school.coursesofteacher.CoursesOfTeacherMatch;
import school.coursesofteacher.CoursesOfTeacherQuerySpecification;

/**
 * Generated pattern matcher API of the school.coursesOfTeacher pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * // Step 2: pattern calls, negative application conditions
 * 
 *  
 * pattern coursesOfTeacher(T, C) {
 * 	Teacher.courses(T, C);
 * }
 * </pre></code>
 * 
 * @see CoursesOfTeacherMatch
 * @see CoursesOfTeacherQuerySpecification
 * @see CoursesOfTeacherProcessor
 * 
 */
public class CoursesOfTeacherMatcher extends BaseGeneratedMatcher<CoursesOfTeacherMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CoursesOfTeacherMatcher on(final IncQueryEngine engine) throws IncQueryException {
    return new CoursesOfTeacherMatcher(engine);
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_C = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public CoursesOfTeacherMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public CoursesOfTeacherMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return matches represented as a CoursesOfTeacherMatch object.
   * 
   */
  public Collection<CoursesOfTeacherMatch> getAllMatches(final Teacher pT, final Course pC) {
    return rawGetAllMatches(new Object[]{pT, pC});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return a match represented as a CoursesOfTeacherMatch object, or null if no match is found.
   * 
   */
  public CoursesOfTeacherMatch getOneArbitraryMatch(final Teacher pT, final Course pC) {
    return rawGetOneArbitraryMatch(new Object[]{pT, pC});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Teacher pT, final Course pC) {
    return rawHasMatch(new Object[]{pT, pC});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Teacher pT, final Course pC) {
    return rawCountMatches(new Object[]{pT, pC});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Teacher pT, final Course pC, final IMatchProcessor<? super CoursesOfTeacherMatch> processor) {
    rawForEachMatch(new Object[]{pT, pC}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Teacher pT, final Course pC, final IMatchProcessor<? super CoursesOfTeacherMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pC}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<CoursesOfTeacherMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Teacher pT, final Course pC) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pT, pC});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CoursesOfTeacherMatch newMatch(final Teacher pT, final Course pC) {
    return new CoursesOfTeacherMatch.Immutable(pT, pC);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Teacher> rawAccumulateAllValuesOfT(final Object[] parameters) {
    Set<Teacher> results = new HashSet<Teacher>();
    rawAccumulateAllValues(POSITION_T, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT() {
    return rawAccumulateAllValuesOfT(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT(final CoursesOfTeacherMatch partialMatch) {
    return rawAccumulateAllValuesOfT(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT(final Course pC) {
    return rawAccumulateAllValuesOfT(new Object[]{null, pC});
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Course> rawAccumulateAllValuesOfC(final Object[] parameters) {
    Set<Course> results = new HashSet<Course>();
    rawAccumulateAllValues(POSITION_C, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> getAllValuesOfC() {
    return rawAccumulateAllValuesOfC(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> getAllValuesOfC(final CoursesOfTeacherMatch partialMatch) {
    return rawAccumulateAllValuesOfC(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> getAllValuesOfC(final Teacher pT) {
    return rawAccumulateAllValuesOfC(new Object[]{pT, null});
  }
  
  @Override
  protected CoursesOfTeacherMatch tupleToMatch(final Tuple t) {
    try {
    	return new CoursesOfTeacherMatch.Immutable((school.Teacher) t.get(POSITION_T), (school.Course) t.get(POSITION_C));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherMatch arrayToMatch(final Object[] match) {
    try {
    	return new CoursesOfTeacherMatch.Immutable((school.Teacher) match[POSITION_T], (school.Course) match[POSITION_C]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected CoursesOfTeacherMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new CoursesOfTeacherMatch.Mutable((school.Teacher) match[POSITION_T], (school.Course) match[POSITION_C]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CoursesOfTeacherMatcher> querySpecification() throws IncQueryException {
    return CoursesOfTeacherQuerySpecification.instance();
  }
}
