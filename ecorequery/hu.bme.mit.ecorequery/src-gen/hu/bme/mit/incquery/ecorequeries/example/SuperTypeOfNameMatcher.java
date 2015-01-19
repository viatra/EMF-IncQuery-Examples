package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfNameMatch;
import hu.bme.mit.incquery.ecorequeries.example.util.SuperTypeOfNameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SuperTypeOfNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SuperTypeOfName(SuperName,SubName) = {
 * 	EClass.eSuperTypes(Sub,Super);
 * 	EClass.name(Super, SuperName);
 * 	EClass.name(Sub, SubName);
 * }
 * </pre></code>
 * 
 * @see SuperTypeOfNameMatch
 * @see SuperTypeOfNameProcessor
 * @see SuperTypeOfNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SuperTypeOfNameMatcher extends BaseMatcher<SuperTypeOfNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SuperTypeOfNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SuperTypeOfNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SuperTypeOfNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SUPERNAME = 0;
  
  private final static int POSITION_SUBNAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SuperTypeOfNameMatcher.class);
  
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
  public SuperTypeOfNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SuperTypeOfNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return matches represented as a SuperTypeOfNameMatch object.
   * 
   */
  public Collection<SuperTypeOfNameMatch> getAllMatches(final String pSuperName, final String pSubName) {
    return rawGetAllMatches(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return a match represented as a SuperTypeOfNameMatch object, or null if no match is found.
   * 
   */
  public SuperTypeOfNameMatch getOneArbitraryMatch(final String pSuperName, final String pSubName) {
    return rawGetOneArbitraryMatch(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pSuperName, final String pSubName) {
    return rawHasMatch(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pSuperName, final String pSubName) {
    return rawCountMatches(new Object[]{pSuperName, pSubName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pSuperName, final String pSubName, final IMatchProcessor<? super SuperTypeOfNameMatch> processor) {
    rawForEachMatch(new Object[]{pSuperName, pSubName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pSuperName, final String pSubName, final IMatchProcessor<? super SuperTypeOfNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSuperName, pSubName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SuperTypeOfNameMatch newMatch(final String pSuperName, final String pSubName) {
    return SuperTypeOfNameMatch.newMatch(pSuperName, pSubName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfSuperName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SUPERNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName() {
    return rawAccumulateAllValuesOfSuperName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName(final SuperTypeOfNameMatch partialMatch) {
    return rawAccumulateAllValuesOfSuperName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SuperName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSuperName(final String pSubName) {
    return rawAccumulateAllValuesOfSuperName(new Object[]{
    null, 
    pSubName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfSubName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SUBNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName() {
    return rawAccumulateAllValuesOfSubName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName(final SuperTypeOfNameMatch partialMatch) {
    return rawAccumulateAllValuesOfSubName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for SubName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfSubName(final String pSuperName) {
    return rawAccumulateAllValuesOfSubName(new Object[]{
    pSuperName, 
    null
    });
  }
  
  @Override
  protected SuperTypeOfNameMatch tupleToMatch(final Tuple t) {
    try {
    	return SuperTypeOfNameMatch.newMatch((java.lang.String) t.get(POSITION_SUPERNAME), (java.lang.String) t.get(POSITION_SUBNAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SuperTypeOfNameMatch arrayToMatch(final Object[] match) {
    try {
    	return SuperTypeOfNameMatch.newMatch((java.lang.String) match[POSITION_SUPERNAME], (java.lang.String) match[POSITION_SUBNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SuperTypeOfNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SuperTypeOfNameMatch.newMutableMatch((java.lang.String) match[POSITION_SUPERNAME], (java.lang.String) match[POSITION_SUBNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SuperTypeOfNameMatcher> querySpecification() throws IncQueryException {
    return SuperTypeOfNameQuerySpecification.instance();
  }
}
