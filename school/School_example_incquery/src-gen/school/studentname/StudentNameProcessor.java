package school.studentname;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.studentname.StudentNameMatch;

/**
 * A match processor tailored for the studentName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class StudentNameProcessor implements IMatchProcessor<StudentNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param S the value of pattern parameter S in the currently processed match 
   * @param Name the value of pattern parameter Name in the currently processed match 
   * 
   */
  public abstract void process(final Object S, final Object Name);
  
  @Override
  public void process(final StudentNameMatch match) {
    process(match.getS(), match.getName());  				
    
  }
}
