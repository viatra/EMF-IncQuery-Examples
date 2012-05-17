package school.schoolname;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.schoolname.SchoolNameMatch;

/**
 * A match processor tailored for the schoolName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SchoolNameProcessor implements IMatchProcessor<SchoolNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match 
   * @param pName the value of pattern parameter Name in the currently processed match 
   * 
   */
  public abstract void process(final Object S, final Object Name);
  
  @Override
  public void process(final SchoolNameMatch match) {
    process(match.getS(), match.getName());  				
    
  }
}
