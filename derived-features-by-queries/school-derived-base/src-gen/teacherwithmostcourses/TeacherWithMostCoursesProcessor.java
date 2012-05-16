package teacherwithmostcourses;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import teacherwithmostcourses.TeacherWithMostCoursesMatch;

/**
 * A match processor tailored for the teacherWithMostCourses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeacherWithMostCoursesProcessor implements IMatchProcessor<TeacherWithMostCoursesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSchool the value of pattern parameter School in the currently processed match 
   * @param pTeacher the value of pattern parameter Teacher in the currently processed match 
   * 
   */
  public abstract void process(final Object School, final Object Teacher);
  
  @Override
  public void process(final TeacherWithMostCoursesMatch match) {
    process(match.getSchool(), match.getTeacher());  				
    
  }
}
