package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.SchoolsNamesMatch;

/**
 * A match processor tailored for the school.schoolsNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SchoolsNamesProcessor implements IMatchProcessor<SchoolsNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSchName the value of pattern parameter SchName in the currently processed match 
   * 
   */
  public abstract void process(final String SchName);
  
  @Override
  public void process(final SchoolsNamesMatch match) {
    process(match.getSchName());  				
    
  }
}
