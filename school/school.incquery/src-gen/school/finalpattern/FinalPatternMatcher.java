package school.finalpattern;

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
import school.Course;
import school.Student;
import school.Teacher;
import school.Year;
import school.finalpattern.FinalPatternMatch;
import school.finalpattern.FinalPatternMatcherFactory;

/**
 * Generated pattern matcher API of the finalPattern pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * // Step 7: combine everything, {@literal @}PatternUI, {@literal @}ObservableValue, {@literal @}Handler
 * 
 *     
 *     {@literal @}PatternUI(message="The busiest teacher $T.name$ taught the most sociable student $S.name$ in $Y.startingDate$")
 *     {@literal @}ObservableValue(name = "Year", expression="Y.startingDate")
 *     {@literal @}ObservableValue(name = "Teacher", expression="T.name")
 *     {@literal @}ObservableValue(name = "Student", expression="S.name")
 *     {@literal @}Handler(fileExtension = "school")
 *     pattern finalPattern(Y:Year,C:Course,T:Teacher,S:Student) = {
 *     	Year.schoolClasses.courses(Y,C);
 *     	Course.teacher(C,T);
 *     	Student.schoolClass.courses(S,C);
 *     	
 *     	find theOnesWithTheBiggestCircle(S);
 *     	find teachesTheMostCourses(T);
 *     }
 * </pre></code>
 * 
 * @see FinalPatternMatch
 * @see FinalPatternMatcherFactory
 * @see FinalPatternProcessor
 * 
 */
public class FinalPatternMatcher extends BaseGeneratedMatcher<FinalPatternMatch> implements IncQueryMatcher<FinalPatternMatch> {
  private final static int POSITION_Y = 0;
  
  private final static int POSITION_C = 1;
  
  private final static int POSITION_T = 2;
  
  private final static int POSITION_S = 3;
  
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
  public FinalPatternMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public FinalPatternMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return matches represented as a FinalPatternMatch object.
   * 
   */
  public Collection<FinalPatternMatch> getAllMatches(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return rawGetAllMatches(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return a match represented as a FinalPatternMatch object, or null if no match is found.
   * 
   */
  public FinalPatternMatch getOneArbitraryMatch(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return rawGetOneArbitraryMatch(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return rawHasMatch(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return rawCountMatches(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Year pY, final Course pC, final Teacher pT, final Student pS, final IMatchProcessor<? super FinalPatternMatch> processor) {
    rawForEachMatch(new Object[]{pY, pC, pT, pS}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Year pY, final Course pC, final Teacher pT, final Student pS, final IMatchProcessor<? super FinalPatternMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pY, pC, pT, pS}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<FinalPatternMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pY the fixed value of pattern parameter Y, or null if not bound.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param pT the fixed value of pattern parameter T, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FinalPatternMatch newMatch(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    return new FinalPatternMatch(pY, pC, pT, pS);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for Y.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Year> rawAccumulateAllValuesOfY(final Object[] parameters) {
    Set<Year> results = new HashSet<Year>();
    rawAccumulateAllValues(POSITION_Y, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Y.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Year> getAllValuesOfY() {
    return rawAccumulateAllValuesOfY(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Y.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Year> getAllValuesOfY(final FinalPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfY(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Y.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Year> getAllValuesOfY(final Course pC, final Teacher pT, final Student pS) {
    Year pY = null;
    return rawAccumulateAllValuesOfY(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> rawAccumulateAllValuesOfC(final Object[] parameters) {
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
  public Set<Course> getAllValuesOfC(final FinalPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfC(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for C.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Course> getAllValuesOfC(final Year pY, final Teacher pT, final Student pS) {
    Course pC = null;
    return rawAccumulateAllValuesOfC(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> rawAccumulateAllValuesOfT(final Object[] parameters) {
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
  public Set<Teacher> getAllValuesOfT(final FinalPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfT(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for T.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Teacher> getAllValuesOfT(final Year pY, final Course pC, final Student pS) {
    Teacher pT = null;
    return rawAccumulateAllValuesOfT(new Object[]{pY, pC, pT, pS});
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> rawAccumulateAllValuesOfS(final Object[] parameters) {
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
  public Set<Student> getAllValuesOfS(final FinalPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS(final Year pY, final Course pC, final Teacher pT) {
    Student pS = null;
    return rawAccumulateAllValuesOfS(new Object[]{pY, pC, pT, pS});
  }
  
  @Override
  public FinalPatternMatch tupleToMatch(final Tuple t) {
    try {
    	return new FinalPatternMatch((school.Year) t.get(POSITION_Y), (school.Course) t.get(POSITION_C), (school.Teacher) t.get(POSITION_T), (school.Student) t.get(POSITION_S));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public FinalPatternMatch arrayToMatch(final Object[] match) {
    try {
    	return new FinalPatternMatch((school.Year) match[POSITION_Y], (school.Course) match[POSITION_C], (school.Teacher) match[POSITION_T], (school.Student) match[POSITION_S]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<FinalPatternMatcher> factory() throws IncQueryException {
    return FinalPatternMatcherFactory.instance();
  }
}
