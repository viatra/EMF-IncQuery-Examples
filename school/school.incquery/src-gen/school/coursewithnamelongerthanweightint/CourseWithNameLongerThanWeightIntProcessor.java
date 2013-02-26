package school.coursewithnamelongerthanweightint;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.coursewithnamelongerthanweightint.CourseWithNameLongerThanWeightIntMatch;

/**
 * A match processor tailored for the school.courseWithNameLongerThanWeightInt pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CourseWithNameLongerThanWeightIntProcessor implements IMatchProcessor<CourseWithNameLongerThanWeightIntMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pW the value of pattern parameter W in the currently processed match 
   * 
   */
  public abstract void process(final Integer W);
  
  @Override
  public void process(final CourseWithNameLongerThanWeightIntMatch match) {
    process(match.getW());  				
    
  }
}
