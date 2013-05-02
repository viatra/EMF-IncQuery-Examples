package school.coursewithweightthirty;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.coursewithweightthirty.CourseWithWeightThirtyMatch;

/**
 * A match processor tailored for the school.courseWithWeightThirty pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CourseWithWeightThirtyProcessor implements IMatchProcessor<CourseWithWeightThirtyMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Course C);
  
  @Override
  public void process(final CourseWithWeightThirtyMatch match) {
    process(match.getC());  				
    
  }
}
