package school.studentofschool;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
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
   * @param pStudent the value of pattern parameter Student in the currently processed match 
   * @param pSchool the value of pattern parameter School in the currently processed match 
   * @param pYear the value of pattern parameter Year in the currently processed match 
   * @param pSchoolClass the value of pattern parameter SchoolClass in the currently processed match 
   * 
   */
  public abstract void process(final Object Student, final Object School, final Object Year, final Object SchoolClass);
  
  @Override
  public void process(final StudentOfSchoolMatch match) {
    process(match.getStudent(), match.getSchool(), match.getYear(), match.getSchoolClass());  				
    
  }
}
