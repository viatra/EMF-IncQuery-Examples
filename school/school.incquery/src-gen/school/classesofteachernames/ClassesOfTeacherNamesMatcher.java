package school.classesofteachernames;

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
import school.classesofteachernames.ClassesOfTeacherNamesMatch;
import school.classesofteachernames.ClassesOfTeacherNamesMatcherFactory;

/**
 * Generated pattern matcher API of the classesOfTeacherNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classesOfTeacherNames(TName, SCName) = {
 *  	find coursesOfTeacher(T,C);
 *  	Teacher.name(T, TName);
 *  	Course.schoolClass(C,SC);
 *  	SchoolClass.code(SC, SCName); 	
 *  }
 * </pre></code>
 * 
 * @see ClassesOfTeacherNamesMatch
 * @see ClassesOfTeacherNamesMatcherFactory
 * @see ClassesOfTeacherNamesProcessor
 * 
 */
public class ClassesOfTeacherNamesMatcher extends BaseGeneratedMatcher<ClassesOfTeacherNamesMatch> implements IncQueryMatcher<ClassesOfTeacherNamesMatch> {
  private final static int POSITION_TNAME = 0;
  
  private final static int POSITION_SCNAME = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public ClassesOfTeacherNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesOfTeacherNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
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
   * 
   */
  public DeltaMonitor<ClassesOfTeacherNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pTName, final Character pSCName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTName, pSCName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSCName the fixed value of pattern parameter SCName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesOfTeacherNamesMatch newMatch(final String pTName, final Character pSCName) {
    return new ClassesOfTeacherNamesMatch(pTName, pSCName);
    
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
  public Set<String> getAllValuesOfTName(final ClassesOfTeacherNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfTName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for TName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTName(final Character pSCName) {
    String pTName = null;
    return rawAccumulateAllValuesOfTName(new Object[]{pTName, pSCName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for SCName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Character> rawAccumulateAllValuesOfSCName(final Object[] parameters) {
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
    Character pSCName = null;
    return rawAccumulateAllValuesOfSCName(new Object[]{pTName, pSCName});
  }
  
  @Override
  public ClassesOfTeacherNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new ClassesOfTeacherNamesMatch((java.lang.String) t.get(POSITION_TNAME), (java.lang.Character) t.get(POSITION_SCNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public ClassesOfTeacherNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new ClassesOfTeacherNamesMatch((java.lang.String) match[POSITION_TNAME], (java.lang.Character) match[POSITION_SCNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<ClassesOfTeacherNamesMatcher> factory() throws IncQueryException {
    return ClassesOfTeacherNamesMatcherFactory.instance();
  }
}
