package teachers;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import teachers.TeachersMatch;

/**
 * A match processor tailored for the teachers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachersProcessor implements IMatchProcessor<TeachersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param School the value of pattern parameter School in the currently processed match 
   * @param Teacher the value of pattern parameter Teacher in the currently processed match 
   * 
   */
  public abstract void process(final Object School, final Object Teacher);
  
  @Override
  public void process(final TeachersMatch match) {
    process(match.getSchool(), match.getTeacher());  				
    
  }
}
