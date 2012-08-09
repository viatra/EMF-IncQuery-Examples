package school.teachersofschool;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.Teacher;
import school.teachersofschool.TeachersOfSchoolMatch;

/**
 * A match processor tailored for the teachersOfSchool pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachersOfSchoolProcessor implements IMatchProcessor<TeachersOfSchoolMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * @param pSch the value of pattern parameter Sch in the currently processed match 
   * 
   */
  public abstract void process(final Teacher T, final School Sch);
  
  @Override
  public void process(final TeachersOfSchoolMatch match) {
    process(match.getT(), match.getSch());  				
    
  }
}
