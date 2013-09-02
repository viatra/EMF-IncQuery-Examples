package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.StudentOfSchoolNamesMatch;

/**
 * A match processor tailored for the school.studentOfSchoolNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StudentOfSchoolNamesProcessor implements IMatchProcessor<StudentOfSchoolNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSName the value of pattern parameter SName in the currently processed match 
   * @param pSchName the value of pattern parameter SchName in the currently processed match 
   * 
   */
  public abstract void process(final String pSName, final String pSchName);
  
  @Override
  public void process(final StudentOfSchoolNamesMatch match) {
    process(match.getSName(), match.getSchName());
    
  }
}
