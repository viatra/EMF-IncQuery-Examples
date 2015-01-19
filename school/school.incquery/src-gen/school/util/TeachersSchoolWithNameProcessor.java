package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.Teacher;
import school.TeachersSchoolWithNameMatch;

/**
 * A match processor tailored for the school.TeachersSchoolWithName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersSchoolWithNameProcessor implements IMatchProcessor<TeachersSchoolWithNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeacher the value of pattern parameter teacher in the currently processed match
   * @param pSchool the value of pattern parameter school in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final Teacher pTeacher, final School pSchool, final String pName);
  
  @Override
  public void process(final TeachersSchoolWithNameMatch match) {
    process(match.getTeacher(), match.getSchool(), match.getName());
  }
}
