package school.teachers;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Teacher;
import school.teachers.TeachersMatch;

/**
 * A match processor tailored for the school.teachers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachersProcessor implements IMatchProcessor<TeachersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * 
   */
  public abstract void process(final Teacher T);
  
  @Override
  public void process(final TeachersMatch match) {
    process(match.getT());  				
    
  }
}
