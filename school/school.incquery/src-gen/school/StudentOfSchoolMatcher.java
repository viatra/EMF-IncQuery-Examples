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
import school.Student;
import school.StudentOfSchoolMatch;
import school.util.StudentOfSchoolQuerySpecification;

/**
 * Generated pattern matcher API of the school.studentOfSchool pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StudentOfSchoolMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Step 3: path expressions
 * 
 *  
 * pattern studentOfSchool(S, Sch) {
 * 	Student.schoolClass.courses.school(S, Sch);
 * 	// logically equivalent: School.courses.schoolClass.students(Sch,S);
 * }
 * </pre></code>
 * 
 * @see StudentOfSchoolMatch
 * @see StudentOfSchoolProcessor
 * @see StudentOfSchoolQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StudentOfSchoolMatcher extends BaseMatcher<StudentOfSchoolMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<StudentOfSchoolMatcher> querySpecification() throws IncQueryException {
    return StudentOfSchoolQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StudentOfSchoolMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    StudentOfSchoolMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new StudentOfSchoolMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S = 0;
  
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
  public StudentOfSchoolMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public StudentOfSchoolMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return matches represented as a StudentOfSchoolMatch object.
   * 
   */
  public Collection<StudentOfSchoolMatch> getAllMatches(final Student pS, final School pSch) {
    return rawGetAllMatches(new Object[]{pS, pSch});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return a match represented as a StudentOfSchoolMatch object, or null if no match is found.
   * 
   */
  public StudentOfSchoolMatch getOneArbitraryMatch(final Student pS, final School pSch) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pSch});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Student pS, final School pSch) {
    return rawHasMatch(new Object[]{pS, pSch});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Student pS, final School pSch) {
    return rawCountMatches(new Object[]{pS, pSch});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Student pS, final School pSch, final IMatchProcessor<? super StudentOfSchoolMatch> processor) {
    rawForEachMatch(new Object[]{pS, pSch}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Student pS, final School pSch, final IMatchProcessor<? super StudentOfSchoolMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pSch}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<StudentOfSchoolMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Student pS, final School pSch) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS, pSch});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StudentOfSchoolMatch newMatch(final Student pS, final School pSch) {
    return new StudentOfSchoolMatch.Immutable(pS, pSch);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Student> rawAccumulateAllValuesOfS(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS() {
    return rawAccumulateAllValuesOfS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS(final StudentOfSchoolMatch partialMatch) {
    return rawAccumulateAllValuesOfS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS(final School pSch) {
    return rawAccumulateAllValuesOfS(new Object[]{null, pSch});
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
  public Set<School> getAllValuesOfSch(final StudentOfSchoolMatch partialMatch) {
    return rawAccumulateAllValuesOfSch(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Sch.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<School> getAllValuesOfSch(final Student pS) {
    return rawAccumulateAllValuesOfSch(new Object[]{pS, null});
  }
  
  @Override
  protected StudentOfSchoolMatch tupleToMatch(final Tuple t) {
    try {
    	return new StudentOfSchoolMatch.Immutable((school.Student) t.get(POSITION_S), (school.School) t.get(POSITION_SCH));
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StudentOfSchoolMatch arrayToMatch(final Object[] match) {
    try {
    	return new StudentOfSchoolMatch.Immutable((school.Student) match[POSITION_S], (school.School) match[POSITION_SCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected StudentOfSchoolMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new StudentOfSchoolMatch.Mutable((school.Student) match[POSITION_S], (school.School) match[POSITION_SCH]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
