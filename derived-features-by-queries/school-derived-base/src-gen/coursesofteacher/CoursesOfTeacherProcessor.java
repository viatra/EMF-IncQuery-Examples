package coursesofteacher;

import coursesofteacher.CoursesOfTeacherMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the coursesOfTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CoursesOfTeacherProcessor implements IMatchProcessor<CoursesOfTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeacher the value of pattern parameter Teacher in the currently processed match 
   * @param pCourse the value of pattern parameter Course in the currently processed match 
   * 
   */
  public abstract void process(final Object Teacher, final Object Course);
  
  @Override
  public void process(final CoursesOfTeacherMatch match) {
    process(match.getTeacher(), match.getCourse());  				
    
  }
}
