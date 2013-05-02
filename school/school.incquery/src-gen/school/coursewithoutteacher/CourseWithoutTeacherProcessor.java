package school.coursewithoutteacher;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.coursewithoutteacher.CourseWithoutTeacherMatch;

/**
 * A match processor tailored for the school.CourseWithoutTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CourseWithoutTeacherProcessor implements IMatchProcessor<CourseWithoutTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Course C);
  
  @Override
  public void process(final CourseWithoutTeacherMatch match) {
    process(match.getC());  				
    
  }
}
