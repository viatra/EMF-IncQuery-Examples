package school.coursewithprimeweight;

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
import school.coursewithprimeweight.CourseWithPrimeWeightMatch;
import school.coursewithprimeweight.CourseWithPrimeWeightMatcherFactory;

/**
 * Generated pattern matcher API of the courseWithPrimeWeight pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern courseWithPrimeWeight(C:Course) = {
 *  	Course.weight(C,W);
 *  	check({ // make sure the check() expression returns a boolean value on all execution paths
 *  		var Integer weight = (W as Integer) 
 *  		if (weight%2==0) false
 *  		else {
 * 	 		var Integer maxValue = Math::round(new Float(Math::sqrt( weight )))
 * 	 		var Integer divisor = 3
 * 	 		var divisorFound = false
 * 	 		while (divisor{@literal <}=maxValue) {
 * 	 			if (weight%divisor==0) {
 * 	 			// we have found a divisor
 * 	 				divisorFound = true
 * 	 				//break // TODO why is this not allowed here?
 * 	 			}
 * 	 			else divisor = divisor + 2;
 * 	 			}
 * 	 		!divisorFound	
 * 	 	//	true // we have found a prime number	
 * 	 		}
 *  		}
 *  	);
 *  }
 * </pre></code>
 * 
 * @see CourseWithPrimeWeightMatch
 * @see CourseWithPrimeWeightMatcherFactory
 * @see CourseWithPrimeWeightProcessor
 * 
 */
public class CourseWithPrimeWeightMatcher extends BaseGeneratedMatcher<CourseWithPrimeWeightMatch> implements IncQueryMatcher<CourseWithPrimeWeightMatch> {
  private final static int POSITION_C = 0;
  
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
  public CourseWithPrimeWeightMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CourseWithPrimeWeightMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return matches represented as a CourseWithPrimeWeightMatch object.
   * 
   */
  public Collection<CourseWithPrimeWeightMatch> getAllMatches(final Course pC) {
    return rawGetAllMatches(new Object[]{pC});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return a match represented as a CourseWithPrimeWeightMatch object, or null if no match is found.
   * 
   */
  public CourseWithPrimeWeightMatch getOneArbitraryMatch(final Course pC) {
    return rawGetOneArbitraryMatch(new Object[]{pC});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Course pC) {
    return rawHasMatch(new Object[]{pC});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Course pC) {
    return rawCountMatches(new Object[]{pC});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Course pC, final IMatchProcessor<? super CourseWithPrimeWeightMatch> processor) {
    rawForEachMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Course pC, final IMatchProcessor<? super CourseWithPrimeWeightMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pC}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<CourseWithPrimeWeightMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Course pC) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pC});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * @param pC the fixed value of pattern parameter C, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CourseWithPrimeWeightMatch newMatch(final Course pC) {
    return new CourseWithPrimeWeightMatch(pC);
    
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
  
  @Override
  public CourseWithPrimeWeightMatch tupleToMatch(final Tuple t) {
    try {
    	return new CourseWithPrimeWeightMatch((school.Course) t.get(POSITION_C));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public CourseWithPrimeWeightMatch arrayToMatch(final Object[] match) {
    try {
    	return new CourseWithPrimeWeightMatch((school.Course) match[POSITION_C]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<CourseWithPrimeWeightMatcher> factory() throws IncQueryException {
    return CourseWithPrimeWeightMatcherFactory.instance();
  }
}
