package school.schools;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.schools.SchoolsMatch;

/**
 * A match processor tailored for the school.schools pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SchoolsProcessor implements IMatchProcessor<SchoolsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSch the value of pattern parameter Sch in the currently processed match 
   * 
   */
  public abstract void process(final Object Sch);
  
  @Override
  public void process(final SchoolsMatch match) {
    process(match.getSch());  				
    
  }
}
