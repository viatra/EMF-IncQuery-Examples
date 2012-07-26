package school.inthecircleoffriendsnames;

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
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatch;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatcherFactory;

/**
 * Generated pattern matcher API of the inTheCircleOfFriendsNames pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 *    
 *    pattern inTheCircleOfFriendsNames(S1Name,SomeoneName) = {
 *    	find friendlyTo+(S1,Someone);
 *    	S1!=Someone; // we do not allow self loops
 *    	Student.name(S1, S1Name);
 *    	Student.name(Someone, SomeoneName);
 *    }
 * 
 * @see InTheCircleOfFriendsNamesMatch
 * @see InTheCircleOfFriendsNamesMatcherFactory
 * @see InTheCircleOfFriendsNamesProcessor
 * 
 */
public class InTheCircleOfFriendsNamesMatcher extends BaseGeneratedMatcher<InTheCircleOfFriendsNamesMatch> implements IncQueryMatcher<InTheCircleOfFriendsNamesMatch> {
  private final static int POSITION_S1NAME = 0;
  
  private final static int POSITION_SOMEONENAME = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public InTheCircleOfFriendsNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InTheCircleOfFriendsNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return matches represented as a InTheCircleOfFriendsNamesMatch object.
   * 
   */
  public Collection<InTheCircleOfFriendsNamesMatch> getAllMatches(final String pS1Name, final String pSomeoneName) {
    return rawGetAllMatches(new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return a match represented as a InTheCircleOfFriendsNamesMatch object, or null if no match is found.
   * 
   */
  public InTheCircleOfFriendsNamesMatch getOneArbitraryMatch(final String pS1Name, final String pSomeoneName) {
    return rawGetOneArbitraryMatch(new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pS1Name, final String pSomeoneName) {
    return rawHasMatch(new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pS1Name, final String pSomeoneName) {
    return rawCountMatches(new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pS1Name, final String pSomeoneName, final IMatchProcessor<? super InTheCircleOfFriendsNamesMatch> processor) {
    rawForEachMatch(new Object[]{pS1Name, pSomeoneName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pS1Name, final String pSomeoneName, final IMatchProcessor<? super InTheCircleOfFriendsNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1Name, pSomeoneName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<InTheCircleOfFriendsNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pS1Name, final String pSomeoneName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pS1Name the fixed value of pattern parameter S1Name, or null if not bound.
   * @param pSomeoneName the fixed value of pattern parameter SomeoneName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InTheCircleOfFriendsNamesMatch newMatch(final String pS1Name, final String pSomeoneName) {
    return new InTheCircleOfFriendsNamesMatch(pS1Name, pSomeoneName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfS1Name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_S1NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfS1Name() {
    return rawAccumulateAllValuesOfS1Name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfS1Name(final InTheCircleOfFriendsNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfS1Name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for S1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfS1Name(final String pSomeoneName) {
    String pS1Name = null;
    return rawAccumulateAllValuesOfS1Name(new Object[]{pS1Name, pSomeoneName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for SomeoneName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> rawAccumulateAllValuesOfSomeoneName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SOMEONENAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SomeoneName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSomeoneName() {
    return rawAccumulateAllValuesOfSomeoneName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SomeoneName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSomeoneName(final InTheCircleOfFriendsNamesMatch partialMatch) {
    return rawAccumulateAllValuesOfSomeoneName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SomeoneName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSomeoneName(final String pS1Name) {
    String pSomeoneName = null;
    return rawAccumulateAllValuesOfSomeoneName(new Object[]{pS1Name, pSomeoneName});
  }
  
  @Override
  public InTheCircleOfFriendsNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new InTheCircleOfFriendsNamesMatch((java.lang.String) t.get(POSITION_S1NAME), (java.lang.String) t.get(POSITION_SOMEONENAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public InTheCircleOfFriendsNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new InTheCircleOfFriendsNamesMatch((java.lang.String) match[POSITION_S1NAME], (java.lang.String) match[POSITION_SOMEONENAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<InTheCircleOfFriendsNamesMatcher> factory() throws IncQueryException {
    return InTheCircleOfFriendsNamesMatcherFactory.instance();
  }
}
