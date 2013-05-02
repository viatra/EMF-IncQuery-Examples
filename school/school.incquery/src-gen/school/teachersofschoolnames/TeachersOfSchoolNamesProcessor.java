package school.teachersofschoolnames;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.teachersofschoolnames.TeachersOfSchoolNamesMatch;

/**
 * A match processor tailored for the school.teachersOfSchoolNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachersOfSchoolNamesProcessor implements IMatchProcessor<TeachersOfSchoolNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTName the value of pattern parameter TName in the currently processed match 
   * @param pSName the value of pattern parameter SName in the currently processed match 
   * 
   */
  public abstract void process(final String TName, final String SName);
  
  @Override
  public void process(final TeachersOfSchoolNamesMatch match) {
    process(match.getTName(), match.getSName());  				
    
  }
}
