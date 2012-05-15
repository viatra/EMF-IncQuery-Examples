package lastyear;

import java.util.Collection;
import lastyear.LastYearMatch;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the lastYear pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern lastYear(School, Year) = {
 *    Year(Year);
 *    EInt(Date);
 *    Year.startingDate(Year, Date);
 *    School.currentYear(School, Date);
 * }
 * 
 * @see LastYearMatch
 * @see LastYearMatcherFactory
 * @see LastYearProcessor
 * 
 */
public class LastYearMatcher extends BaseGeneratedMatcher<LastYearMatch> implements IncQueryMatcher<LastYearMatch> {
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
  public LastYearMatcher(final Notifier notifier) throws IncQueryRuntimeException {
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
  public LastYearMatcher(final IncQueryEngine engine) throws IncQueryRuntimeException {
    super(engine, FACTORY);
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @return matches represented as a LastYearMatch object.
   * 
   */
  public Collection<LastYearMatch> getAllMatches(final Object pSchool, final Object pYear) {
    return rawGetAllMatches(new Object[]{pSchool, pYear});
    
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @return a match represented as a LastYearMatch object, or null if no match is found.
   * 
   */
  public LastYearMatch getOneArbitraryMatch(final Object pSchool, final Object pYear) {
    return rawGetOneArbitraryMatch(new Object[]{pSchool, pYear});
    
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pSchool, final Object pYear) {
    return rawHasMatch(new Object[]{pSchool, pYear});
    
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pSchool, final Object pYear) {
    return rawCountMatches(new Object[]{pSchool, pYear});
    
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pSchool, final Object pYear, final IMatchProcessor<? super LastYearMatch> processor) {
    rawForEachMatch(new Object[]{pSchool, pYear}, processor);
    
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param School the fixed value of pattern parameter School, or null if not bound.
   * @param Year the fixed value of pattern parameter Year, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pSchool, final Object pYear, final IMatchProcessor<? super LastYearMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSchool, pYear}, processor);
    
  }
  
  @Override
  public LastYearMatch tupleToMatch(final Tuple t) {
    try {
    	return new LastYearMatch((java.lang.Object) t.get(0), (java.lang.Object) t.get(1));	
    } catch(ClassCastException e) {System.err.println("Error when executing tupleToMatch in LastYearMatcher:" + e.getMessage());
    	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public LastYearMatch arrayToMatch(final Object[] match) {
    try {
    	return new LastYearMatch((java.lang.Object) match[0], (java.lang.Object) match[1]);
    } catch(ClassCastException e) {System.err.println("Error when executing arrayToMatch in LastYearMatcher:" + e.getMessage());
    }
    		//throw new IncQueryRuntimeException(e.getMessage());
    		return null;
    
  }
  
  public final static IMatcherFactory<LastYearMatch,LastYearMatcher> FACTORY =  new LastYearMatcherFactory();
}
