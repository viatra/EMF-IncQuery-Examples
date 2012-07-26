package school.coursesofteacher;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.Teacher;
import school.coursesofteacher.CoursesOfTeacherMatch;

/**
 * A match processor tailored for the coursesOfTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CoursesOfTeacherProcessor implements IMatchProcessor<CoursesOfTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Teacher T, final Course C);
  
  @Override
  public void process(final CoursesOfTeacherMatch match) {
    process(match.getT(), match.getC());  				
    
  }
}
