package school.coursesofteachernames;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.coursesofteachernames.CoursesOfTeacherNamesMatch;

/**
 * A match processor tailored for the school.coursesOfTeacherNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CoursesOfTeacherNamesProcessor implements IMatchProcessor<CoursesOfTeacherNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTName the value of pattern parameter TName in the currently processed match 
   * @param pCName the value of pattern parameter CName in the currently processed match 
   * 
   */
  public abstract void process(final String TName, final String CName);
  
  @Override
  public void process(final CoursesOfTeacherNamesMatch match) {
    process(match.getTName(), match.getCName());  				
    
  }
}
