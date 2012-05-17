package school.studentname;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import school.studentname.StudentNameMatch;

/**
 * Generated pattern matcher API of the studentName pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * 	 
 *    	pattern studentName(S, Name) = {
 *   		Student.name(S, Name);
 *  	}
 * 
 * @see StudentNameMatch
 * @see StudentNameMatcherFactory
 * @see StudentNameProcessor
 * 
 */
public class StudentNameMatcher extends BaseGeneratedMatcher<StudentNameMatch> implements IncQueryMatcher<StudentNameMatch> {
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates from the given EMF root and below.
   * <p>Note: if emfRoot is a resourceSet, the scope will include even those resources that are not part of the resourceSet but are referenced. 
   * This is mainly to support nsURI-based instance-level references to registered EPackages.
   * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryRuntimeException if an error occurs during pattern matcher creation
   * 
   */
  public StudentNameMatcher(final Notifier notifier) throws IncQueryRuntimeException {
    this(EngineManager.getInstance().getIncQueryEngine(notifier));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryRuntimeException if an error occurs during pattern matcher creation
   * 
   */
  public StudentNameMatcher(final IncQueryEngine engine) throws IncQueryRuntimeException {
    super(engine, FACTORY);
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return matches represented as a StudentNameMatch object.
   * 
   */
  public Collection<StudentNameMatch> getAllMatches(final Object pS, final Object pName) {
    return rawGetAllMatches(new Object[]{pS, pName});
    
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return a match represented as a StudentNameMatch object, or null if no match is found.
   * 
   */
  public StudentNameMatch getOneArbitraryMatch(final Object pS, final Object pName) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pName});
    
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pS, final Object pName) {
    return rawHasMatch(new Object[]{pS, pName});
    
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pS, final Object pName) {
    return rawCountMatches(new Object[]{pS, pName});
    
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pS, final Object pName, final IMatchProcessor<? super StudentNameMatch> processor) {
    rawForEachMatch(new Object[]{pS, pName}, processor);
    
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pS, final Object pName, final IMatchProcessor<? super StudentNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pName}, processor);
    
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * 	 @return the delta monitor.
   * 
   */
  public DeltaMonitor<StudentNameMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pS, final Object pName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pS, pName});
    
  }
  
  @Override
  public StudentNameMatch tupleToMatch(final Tuple t) {
    try {
    	return new StudentNameMatch((java.lang.Object) t.get(0), (java.lang.Object) t.get(1));	
    } catch(ClassCastException e) {System.err.println("Error when executing tupleToMatch in StudentNameMatcher:" + e.getMessage());
    	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public StudentNameMatch arrayToMatch(final Object[] match) {
    try {
    	return new StudentNameMatch((java.lang.Object) match[0], (java.lang.Object) match[1]);
    } catch(ClassCastException e) {System.err.println("Error when executing arrayToMatch in StudentNameMatcher:" + e.getMessage());
    }
    		//throw new IncQueryRuntimeException(e.getMessage());
    		return null;
    
  }
  
  public final static IMatcherFactory<StudentNameMatch,StudentNameMatcher> FACTORY =  new StudentNameMatcherFactory();
}
