package coursesofteacher;

import coursesofteacher.CoursesOfTeacherMatch;
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

/**
 * Generated pattern matcher API of the coursesOfTeacher pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * pattern coursesOfTeacher(Teacher : Teacher, Course :  Course) = {
 *    Teacher.courses(Teacher,Course);
 * }
 * 
 * @see CoursesOfTeacherMatch
 * @see CoursesOfTeacherMatcherFactory
 * @see CoursesOfTeacherProcessor
 * 
 */
public class CoursesOfTeacherMatcher extends BaseGeneratedMatcher<CoursesOfTeacherMatch> implements IncQueryMatcher<CoursesOfTeacherMatch> {
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
  public CoursesOfTeacherMatcher(final Notifier notifier) throws IncQueryRuntimeException {
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
  public CoursesOfTeacherMatcher(final IncQueryEngine engine) throws IncQueryRuntimeException {
    super(engine, FACTORY);
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @return matches represented as a CoursesOfTeacherMatch object.
   * 
   */
  public Collection<CoursesOfTeacherMatch> getAllMatches(final Object pTeacher, final Object pCourse) {
    return rawGetAllMatches(new Object[]{pTeacher, pCourse});
    
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @return a match represented as a CoursesOfTeacherMatch object, or null if no match is found.
   * 
   */
  public CoursesOfTeacherMatch getOneArbitraryMatch(final Object pTeacher, final Object pCourse) {
    return rawGetOneArbitraryMatch(new Object[]{pTeacher, pCourse});
    
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pTeacher, final Object pCourse) {
    return rawHasMatch(new Object[]{pTeacher, pCourse});
    
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pTeacher, final Object pCourse) {
    return rawCountMatches(new Object[]{pTeacher, pCourse});
    
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pTeacher, final Object pCourse, final IMatchProcessor<? super CoursesOfTeacherMatch> processor) {
    rawForEachMatch(new Object[]{pTeacher, pCourse}, processor);
    
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pTeacher, final Object pCourse, final IMatchProcessor<? super CoursesOfTeacherMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeacher, pCourse}, processor);
    
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeacher the fixed value of pattern parameter Teacher, or null if not bound.
   * @param pCourse the fixed value of pattern parameter Course, or null if not bound.
   * 	 @return the delta monitor.
   * 
   */
  public DeltaMonitor<CoursesOfTeacherMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pTeacher, final Object pCourse) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeacher, pCourse});
    
  }
  
  @Override
  public CoursesOfTeacherMatch tupleToMatch(final Tuple t) {
    try {
    	return new CoursesOfTeacherMatch((java.lang.Object) t.get(0), (java.lang.Object) t.get(1));	
    } catch(ClassCastException e) {System.err.println("Error when executing tupleToMatch in CoursesOfTeacherMatcher:" + e.getMessage());
    	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public CoursesOfTeacherMatch arrayToMatch(final Object[] match) {
    try {
    	return new CoursesOfTeacherMatch((java.lang.Object) match[0], (java.lang.Object) match[1]);
    } catch(ClassCastException e) {System.err.println("Error when executing arrayToMatch in CoursesOfTeacherMatcher:" + e.getMessage());
    }
    		//throw new IncQueryRuntimeException(e.getMessage());
    		return null;
    
  }
  
  public final static IMatcherFactory<CoursesOfTeacherMatch,CoursesOfTeacherMatcher> FACTORY =  new CoursesOfTeacherMatcherFactory();
}
