package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.CoursesMatch;

/**
 * A match processor tailored for the school.courses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CoursesProcessor implements IMatchProcessor<CoursesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Course pC);
  
  @Override
  public void process(final CoursesMatch match) {
    process(match.getC());  				
    
  }
}
