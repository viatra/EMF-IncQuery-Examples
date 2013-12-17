package school;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import school.School;
import school.Teacher;
import school.TeachersOfSchoolMatch;
import school.util.TeachersOfSchoolQuerySpecification;

/**
 * Generated pattern matcher API of the school.teachersOfSchool pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TeachersOfSchoolMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern teachersOfSchool(T : Teacher, Sch : School) {
 * 	School.teachers(Sch, T);
 * 	// note that there is no restriction on the direction of navigation:
 * 	// all "Sch"s can be queried from Ts and vice-versa
 * }
 * </pre></code>
 * 
 * @see TeachersOfSchoolMatch
 * @see TeachersOfSchoolProcessor
 * @see TeachersOfSchoolQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TeachersOfSchoolMatcher extends BaseMatcher<TeachersOfSchoolMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TeachersOfSchoolMatcher> querySpecification() throws IncQueryException {
    return TeachersOfSchoolQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TeachersOfSchoolMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TeachersOfSchoolMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TeachersOfSchoolMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_SCH = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
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
  public TeachersOfSchoolMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public TeachersOfSchoolMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return matches represented as a TeachersOfSchoolMatch object.
   * 
   */
  public Collection<TeachersOfSchoolMatch> getAllMatches(final Teacher pT, final School pSch) {
    return rawGetAllMatches(new Object[]{pT, pSch});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return a match represented as a TeachersOfSchoolMatch object, or null if no match is found.
   * 
   */
  public TeachersOfSchoolMatch getOneArbitraryMatch(final Teacher pT, final School pSch) {
    return rawGetOneArbitraryMatch(new Object[]{pT, pSch});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Teacher pT, final School pSch) {
    return rawHasMatch(new Object[]{pT, pSch});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Teacher pT, final School pSch) {
    return rawCountMatches(new Object[]{pT, pSch});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Teacher pT, final School pSch, final IMatchProcessor<? super TeachersOfSchoolMatch> processor) {
    rawForEachMatch(new Object[]{pT, pSch}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Teacher pT, final School pSch, final IMatchProcessor<? super TeachersOfSchoolMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pSch}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<TeachersOfSchoolMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Teacher pT, final School pSch) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pT, pSch});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeachersOfSchoolMatch newMatch(final Teacher pT, final School pSch) {
    return new TeachersOfSchoolMatch.Immutable(pT, pSch);
    
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
  public Set<Teacher> getAllValuesOfT(final TeachersOfSchoolMatch partialMatch) {
    return rawAccumulateAllValuesOfT(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT(final School pSch) {
    return rawAccumulateAllValuesOfT(new Object[]{null, pSch});
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sch.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<School> rawAccumulateAllValuesOfSch(final Object[] parameters) {
    Set<School> results = new HashSet<School>();
    rawAccumulateAllValues(POSITION_SCH, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sch.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<School> getAllValuesOfSch() {
    return rawAccumulateAllValuesOfSch(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sch.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<School> getAllValuesOfSch(final TeachersOfSchoolMatch partialMatch) {
    return rawAccumulateAllValuesOfSch(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sch.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<School> getAllValuesOfSch(final Teacher pT) {
    return rawAccumulateAllValuesOfSch(new Object[]{pT, null});
  }
  
  @Override
  protected TeachersOfSchoolMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeachersOfSchoolMatch.Immutable((school.Teacher) t.get(POSITION_T), (school.School) t.get(POSITION_SCH));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeachersOfSchoolMatch.Immutable((school.Teacher) match[POSITION_T], (school.School) match[POSITION_SCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeachersOfSchoolMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TeachersOfSchoolMatch.Mutable((school.Teacher) match[POSITION_T], (school.School) match[POSITION_SCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
