package school.schools;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.School;
import school.schools.SchoolsMatch;

/**
 * A match processor tailored for the schools pattern.
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
  public abstract void process(final School Sch);
  
  @Override
  public void process(final SchoolsMatch match) {
    process(match.getSch());  				
    
  }
}
