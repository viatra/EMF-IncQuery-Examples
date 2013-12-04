package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.CourseWithTeacherMatch;

/**
 * A match processor tailored for the school.CourseWithTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CourseWithTeacherProcessor implements IMatchProcessor<CourseWithTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Course pC);
  
  @Override
  public void process(final CourseWithTeacherMatch match) {
    process(match.getC());
    
  }
}
