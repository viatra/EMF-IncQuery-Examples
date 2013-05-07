package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.TeachersNamesMatch;

/**
 * A match processor tailored for the school.teachersNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachersNamesProcessor implements IMatchProcessor<TeachersNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTN the value of pattern parameter TN in the currently processed match 
   * 
   */
  public abstract void process(final String TN);
  
  @Override
  public void process(final TeachersNamesMatch match) {
    process(match.getTN());  				
    
  }
}
