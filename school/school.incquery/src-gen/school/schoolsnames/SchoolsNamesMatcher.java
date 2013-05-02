package school.schoolsnames;

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
import school.schoolsnames.SchoolsNamesMatch;
import school.schoolsnames.SchoolsNamesQuerySpecification;

/**
 * Generated pattern matcher API of the school.schoolsNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern schoolsNames(SchName) {
 * 	School.name(_Sch, SchName);
 * }
 * </pre></code>
 * 
 * @see SchoolsNamesMatch
 * @see SchoolsNamesQuerySpecification
 * @see SchoolsNamesProcessor
 * 
 */
public class SchoolsNamesMatcher extends BaseGeneratedMatcher<SchoolsNamesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SchoolsNamesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    return new SchoolsNamesMatcher(engine);
  }
  
  private final static int POSITION_SCHNAME = 0;
  
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
  public SchoolsNamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SchoolsNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return matches represented as a SchoolsNamesMatch object.
   * 
   */
  public Collection<SchoolsNamesMatch> getAllMatches(final String pSchName) {
    return rawGetAllMatches(new Object[]{pSchName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return a match represented as a SchoolsNamesMatch object, or null if no match is found.
   * 
   */
  public SchoolsNamesMatch getOneArbitraryMatch(final String pSchName) {
    return rawGetOneArbitraryMatch(new Object[]{pSchName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pSchName) {
    return rawHasMatch(new Object[]{pSchName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pSchName) {
    return rawCountMatches(new Object[]{pSchName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pSchName, final IMatchProcessor<? super SchoolsNamesMatch> processor) {
    rawForEachMatch(new Object[]{pSchName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pSchName, final IMatchProcessor<? super SchoolsNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSchName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<SchoolsNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pSchName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSchName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SchoolsNamesMatch newMatch(final String pSchName) {
    return new SchoolsNamesMatch.Immutable(pSchName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for SchName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfSchName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SCHNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SchName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSchName() {
    return rawAccumulateAllValuesOfSchName(emptyArray());
  }
  
  @Override
  protected SchoolsNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new SchoolsNamesMatch.Immutable((java.lang.String) t.get(POSITION_SCHNAME));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected SchoolsNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new SchoolsNamesMatch.Immutable((java.lang.String) match[POSITION_SCHNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected SchoolsNamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new SchoolsNamesMatch.Mutable((java.lang.String) match[POSITION_SCHNAME]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SchoolsNamesMatcher> querySpecification() throws IncQueryException {
    return SchoolsNamesQuerySpecification.instance();
  }
}
