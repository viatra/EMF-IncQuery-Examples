package school.classesofschool;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.classesofschool.ClassesOfSchoolMatch;

/**
 * A match processor tailored for the school.classesOfSchool pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ClassesOfSchoolProcessor implements IMatchProcessor<ClassesOfSchoolMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSC the value of pattern parameter SC in the currently processed match 
   * 
   */
  public abstract void process(final Object SC);
  
  @Override
  public void process(final ClassesOfSchoolMatch match) {
    process(match.getSC());  				
    
  }
}
