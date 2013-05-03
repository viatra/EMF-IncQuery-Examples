package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.TeacherWithoutClassNamesMatch;

/**
 * A match processor tailored for the school.teacherWithoutClassNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeacherWithoutClassNamesProcessor implements IMatchProcessor<TeacherWithoutClassNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTNames the value of pattern parameter TNames in the currently processed match 
   * 
   */
  public abstract void process(final String TNames);
  
  @Override
  public void process(final TeacherWithoutClassNamesMatch match) {
    process(match.getTNames());  				
    
  }
}
