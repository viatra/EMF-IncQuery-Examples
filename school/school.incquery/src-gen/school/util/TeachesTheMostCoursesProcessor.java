package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Teacher;
import school.TeachesTheMostCoursesMatch;

/**
 * A match processor tailored for the school.teachesTheMostCourses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachesTheMostCoursesProcessor implements IMatchProcessor<TeachesTheMostCoursesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * 
   */
  public abstract void process(final Teacher pT);
  
  @Override
  public void process(final TeachesTheMostCoursesMatch match) {
    process(match.getT());  				
    
  }
}
