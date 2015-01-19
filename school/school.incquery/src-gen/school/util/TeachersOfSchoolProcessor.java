package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.Teacher;
import school.TeachersOfSchoolMatch;

/**
 * A match processor tailored for the school.teachersOfSchool pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersOfSchoolProcessor implements IMatchProcessor<TeachersOfSchoolMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pSch the value of pattern parameter Sch in the currently processed match
   * 
   */
  public abstract void process(final Teacher pT, final School pSch);
  
  @Override
  public void process(final TeachersOfSchoolMatch match) {
    process(match.getT(), match.getSch());
  }
}
