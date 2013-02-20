package school.teacherwithoutclass;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Teacher;
import school.teacherwithoutclass.TeacherWithoutClassMatch;

/**
 * A match processor tailored for the school.teacherWithoutClass pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeacherWithoutClassProcessor implements IMatchProcessor<TeacherWithoutClassMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * 
   */
  public abstract void process(final Teacher T);
  
  @Override
  public void process(final TeacherWithoutClassMatch match) {
    process(match.getT());  				
    
  }
}
