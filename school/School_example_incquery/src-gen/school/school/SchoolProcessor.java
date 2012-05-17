package school.school;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.school.SchoolMatch;

/**
 * A match processor tailored for the school pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SchoolProcessor implements IMatchProcessor<SchoolMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match 
   * 
   */
  public abstract void process(final Object S);
  
  @Override
  public void process(final SchoolMatch match) {
    process(match.getS());  				
    
  }
}
