package school.studentofschool;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.Student;
import school.studentofschool.StudentOfSchoolMatch;

/**
 * A match processor tailored for the studentOfSchool pattern.
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
  public abstract void process(final Student S, final School Sch);
  
  @Override
  public void process(final StudentOfSchoolMatch match) {
    process(match.getS(), match.getSch());  				
    
  }
}
