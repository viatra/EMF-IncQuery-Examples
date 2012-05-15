package lastyear;

import lastyear.LastYearMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the lastYear pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class LastYearProcessor implements IMatchProcessor<LastYearMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param School the value of pattern parameter School in the currently processed match 
   * @param Year the value of pattern parameter Year in the currently processed match 
   * 
   */
  public abstract void process(final Object School, final Object Year);
  
  @Override
  public void process(final LastYearMatch match) {
    process(match.getSchool(), match.getYear());  				
    
  }
}
