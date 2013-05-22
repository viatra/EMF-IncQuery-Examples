package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.ClassesOfTeacherNamesMatch;

/**
 * A match processor tailored for the school.classesOfTeacherNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ClassesOfTeacherNamesProcessor implements IMatchProcessor<ClassesOfTeacherNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTName the value of pattern parameter TName in the currently processed match 
   * @param pSCName the value of pattern parameter SCName in the currently processed match 
   * 
   */
  public abstract void process(final String pTName, final Character pSCName);
  
  @Override
  public void process(final ClassesOfTeacherNamesMatch match) {
    process(match.getTName(), match.getSCName());  				
    
  }
}
