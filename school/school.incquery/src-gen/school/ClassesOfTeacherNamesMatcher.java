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
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import school.ClassesOfTeacherNamesMatch;
import school.util.ClassesOfTeacherNamesQuerySpecification;

/**
 * Generated pattern matcher API of the school.classesOfTeacherNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassesOfTeacherNamesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classesOfTeacherNames(TName, SCName) {
 * 	find coursesOfTeacher(T, C);
 * 	Teacher.name(T, TName);
 * 	Course.schoolClass(C, SC);
 * 	SchoolClass.code(SC, SCName);
 * }
 * </pre></code>
 * 
 * @see ClassesOfTeacherNamesMatch
 * @see ClassesOfTeacherNamesProcessor
 * @see ClassesOfTeacherNamesQuerySpecification
 * 
 */
public class ClassesOfTeacherNamesMatcher extends BaseMatcher<ClassesOfTeacherNamesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassesOfTeacherNamesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ClassesOfTeacherNamesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ClassesOfTeacherNamesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_TNAME = 0;
  
  private final static int POSITION_SCNAME = 1;
  
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
  public ClassesOfTeacherNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesOfTeacherNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return matches represented as a ClassesOfTeacherNamesMatch object.
   * 
   */
  public Collection<ClassesOfTeacherNamesMatch> getAllMatches(final String pTName, final Character pSCName) {
    return rawGetAllMatches(new Object[]{pTName, pSCName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return a match represented as a ClassesOfTeacherNamesMatch object, or null if no match is found.
   * 
   */
  public ClassesOfTeacherNamesMatch getOneArbitraryMatch(final String pTName, final Character pSCName) {
    return rawGetOneArbitraryMatch(new Object[]{pTName, pSCName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pTName, final Character pSCName) {
    return rawHasMatch(new Object[]{pTName, pSCName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pTName, final Character pSCName) {
    return rawCountMatches(new Object[]{pTName, pSCName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pTName, final Character pSCName, final IMatchProcessor<? super ClassesOfTeacherNamesMatch> processor) {
    rawForEachMatch(new Object[]{pTName, pSCName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pTName, final Character pSCName, final IMatchProcessor<? super ClassesOfTeacherNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTName, pSCName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ClassesOfTeacherNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pTName, final Character pSCName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTName, pSCName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesOfTeacherNamesMatch newMatch(final String pTName, final Character pSCName) {
    return new ClassesOfTeacherNamesMatch.Immutable(pTName, pSCName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfTName(final Object[] parameters) {
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
  public Set<String> getAllValuesOfTName(final ClassesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfTName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final Character pSCName) {
    return rawAccumulateAllValuesOfTName(new Object[]{null, pSCName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for SCName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Character> rawAccumulateAllValuesOfSCName(final Object[] parameters) {
    Set<Character> results = new HashSet<Character>();
    rawAccumulateAllValues(POSITION_SCNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SCName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Character> getAllValuesOfSCName() {
    return rawAccumulateAllValuesOfSCName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SCName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Character> getAllValuesOfSCName(final ClassesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfSCName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SCName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Character> getAllValuesOfSCName(final String pTName) {
    return rawAccumulateAllValuesOfSCName(new Object[]{pTName, null});
  }
  
  @Override
  protected ClassesOfTeacherNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new ClassesOfTeacherNamesMatch.Immutable((java.lang.String) t.get(POSITION_TNAME), (java.lang.Character) t.get(POSITION_SCNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new ClassesOfTeacherNamesMatch.Immutable((java.lang.String) match[POSITION_TNAME], (java.lang.Character) match[POSITION_SCNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected ClassesOfTeacherNamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new ClassesOfTeacherNamesMatch.Mutable((java.lang.String) match[POSITION_TNAME], (java.lang.Character) match[POSITION_SCNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ClassesOfTeacherNamesMatcher> querySpecification() throws IncQueryException {
    return ClassesOfTeacherNamesQuerySpecification.instance();
  }
}
