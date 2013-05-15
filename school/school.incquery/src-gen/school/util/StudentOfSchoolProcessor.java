package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.Student;
import school.StudentOfSchoolMatch;

/**
 * A match processor tailored for the school.studentOfSchool pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class StudentOfSchoolProcessor implements IMatchProcessor<StudentOfSchoolMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match 
   * @param pSch the value of pattern parameter Sch in the currently processed match 
   * 
   */
  public abstract void process(final Student pS, final School pSch);
  
  @Override
  public void process(final StudentOfSchoolMatch match) {
    process(match.getS(), match.getSch());  				
    
  }
}
