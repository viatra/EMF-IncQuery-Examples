package school.morefriendsthan;

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
import school.Student;
import school.morefriendsthan.MoreFriendsThanMatch;
import school.morefriendsthan.MoreFriendsThanMatcherFactory;

/**
 * Generated pattern matcher API of the moreFriendsThan pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryExplorer(display = false)
 *    pattern moreFriendsThan(S1:Student,S2:Student) = {
 *    	N == count find inTheCircleOfFriends(S1,_Sx1);
 *    	M == count find inTheCircleOfFriends(S2,_Sx2);
 *    	check ((N as Integer) {@literal >} (M as Integer));
 *    }
 * </pre></code>
 * 
 * @see MoreFriendsThanMatch
 * @see MoreFriendsThanMatcherFactory
 * @see MoreFriendsThanProcessor
 * 
 */
public class MoreFriendsThanMatcher extends BaseGeneratedMatcher<MoreFriendsThanMatch> implements IncQueryMatcher<MoreFriendsThanMatch> {
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
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
  public MoreFriendsThanMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MoreFriendsThanMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return matches represented as a MoreFriendsThanMatch object.
   * 
   */
  public Collection<MoreFriendsThanMatch> getAllMatches(final Student pS1, final Student pS2) {
    return rawGetAllMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return a match represented as a MoreFriendsThanMatch object, or null if no match is found.
   * 
   */
  public MoreFriendsThanMatch getOneArbitraryMatch(final Student pS1, final Student pS2) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Student pS1, final Student pS2) {
    return rawHasMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Student pS1, final Student pS2) {
    return rawCountMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Student pS1, final Student pS2, final IMatchProcessor<? super MoreFriendsThanMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Student pS1, final Student pS2, final IMatchProcessor<? super MoreFriendsThanMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<MoreFriendsThanMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Student pS1, final Student pS2) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS1, pS2});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MoreFriendsThanMatch newMatch(final Student pS1, final Student pS2) {
    return new MoreFriendsThanMatch(pS1, pS2);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> rawAccumulateAllValuesOfS1(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1() {
    return rawAccumulateAllValuesOfS1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1(final MoreFriendsThanMatch partialMatch) {
    return rawAccumulateAllValuesOfS1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS1(final Student pS2) {
    Student pS1 = null;
    return rawAccumulateAllValuesOfS1(new Object[]{pS1, pS2});
  }
  
  /**
   * Retrieve the set of values that occur in matches for S2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> rawAccumulateAllValuesOfS2(final Object[] parameters) {
    Set<Student> results = new HashSet<Student>();
    rawAccumulateAllValues(POSITION_S2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS2() {
    return rawAccumulateAllValuesOfS2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS2(final MoreFriendsThanMatch partialMatch) {
    return rawAccumulateAllValuesOfS2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Student> getAllValuesOfS2(final Student pS1) {
    Student pS2 = null;
    return rawAccumulateAllValuesOfS2(new Object[]{pS1, pS2});
  }
  
  @Override
  public MoreFriendsThanMatch tupleToMatch(final Tuple t) {
    try {
    	return new MoreFriendsThanMatch((school.Student) t.get(POSITION_S1), (school.Student) t.get(POSITION_S2));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public MoreFriendsThanMatch arrayToMatch(final Object[] match) {
    try {
    	return new MoreFriendsThanMatch((school.Student) match[POSITION_S1], (school.Student) match[POSITION_S2]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<MoreFriendsThanMatcher> factory() throws IncQueryException {
    return MoreFriendsThanMatcherFactory.instance();
  }
}
