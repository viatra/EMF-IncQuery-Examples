package school.studentofschool;

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
import school.studentofschool.StudentOfSchoolMatch;

/**
 * Generated pattern matcher API of the studentOfSchool pattern, 
 * providing pattern-specific query methods.
 * 
 * 		
 *  	
 *  	 
 *  	pattern studentOfSchool(Student, School, Year, SchoolClass) = {
 *  		School(School);
 *  		School.years(School, Year);
 *  		Year(Year);
 *  		Year.schoolClasses(Year, SchoolClass);
 *  		SchoolClass(SchoolClass);
 *  		SchoolClass.students(SchoolClass, Student);
 *  		Student(Student);
 *  		
 *  	}
 * 
 * @see StudentOfSchoolMatch
 * @see StudentOfSchoolMatcherFactory
 * @see StudentOfSchoolProcessor
 * 
 */
public class StudentOfSchoolMatcher extends BaseGeneratedMatcher<StudentOfSchoolMatch> implements IncQueryMatcher<StudentOfSchoolMatch> {
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
  public StudentOfSchoolMatcher(final Notifier notifier) throws IncQueryRuntimeException {
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
  public StudentOfSchoolMatcher(final IncQueryEngine engine) throws IncQueryRuntimeException {
    super(engine, FACTORY);
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @return matches represented as a StudentOfSchoolMatch object.
   * 
   */
  public Collection<StudentOfSchoolMatch> getAllMatches(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    return rawGetAllMatches(new Object[]{pStudent, pSchool, pYear, pSchoolClass});
    
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @return a match represented as a StudentOfSchoolMatch object, or null if no match is found.
   * 
   */
  public StudentOfSchoolMatch getOneArbitraryMatch(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    return rawGetOneArbitraryMatch(new Object[]{pStudent, pSchool, pYear, pSchoolClass});
    
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    return rawHasMatch(new Object[]{pStudent, pSchool, pYear, pSchoolClass});
    
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    return rawCountMatches(new Object[]{pStudent, pSchool, pYear, pSchoolClass});
    
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass, final IMatchProcessor<? super StudentOfSchoolMatch> processor) {
    rawForEachMatch(new Object[]{pStudent, pSchool, pYear, pSchoolClass}, processor);
    
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass, final IMatchProcessor<? super StudentOfSchoolMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pStudent, pSchool, pYear, pSchoolClass}, processor);
    
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pStudent the fixed value of pattern parameter Student, or null if not bound.
   * @param pSchool the fixed value of pattern parameter School, or null if not bound.
   * @param pYear the fixed value of pattern parameter Year, or null if not bound.
   * @param pSchoolClass the fixed value of pattern parameter SchoolClass, or null if not bound.
   * 	 @return the delta monitor.
   * 
   */
  public DeltaMonitor<StudentOfSchoolMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pStudent, pSchool, pYear, pSchoolClass});
    
  }
  
  @Override
  public StudentOfSchoolMatch tupleToMatch(final Tuple t) {
    try {
    	return new StudentOfSchoolMatch((java.lang.Object) t.get(0), (java.lang.Object) t.get(1), (java.lang.Object) t.get(2), (java.lang.Object) t.get(3));	
    } catch(ClassCastException e) {System.err.println("Error when executing tupleToMatch in StudentOfSchoolMatcher:" + e.getMessage());
    	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public StudentOfSchoolMatch arrayToMatch(final Object[] match) {
    try {
    	return new StudentOfSchoolMatch((java.lang.Object) match[0], (java.lang.Object) match[1], (java.lang.Object) match[2], (java.lang.Object) match[3]);
    } catch(ClassCastException e) {System.err.println("Error when executing arrayToMatch in StudentOfSchoolMatcher:" + e.getMessage());
    }
    		//throw new IncQueryRuntimeException(e.getMessage());
    		return null;
    
  }
  
  public final static IMatcherFactory<StudentOfSchoolMatch,StudentOfSchoolMatcher> FACTORY =  new StudentOfSchoolMatcherFactory();
}
