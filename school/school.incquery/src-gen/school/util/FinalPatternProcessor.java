package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.FinalPatternMatch;
import school.Student;
import school.Teacher;
import school.Year;

/**
 * A match processor tailored for the school.finalPattern pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FinalPatternProcessor implements IMatchProcessor<FinalPatternMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pY the value of pattern parameter Y in the currently processed match
   * @param pC the value of pattern parameter C in the currently processed match
   * @param pT the value of pattern parameter T in the currently processed match
   * @param pS the value of pattern parameter S in the currently processed match
   * 
   */
  public abstract void process(final Year pY, final Course pC, final Teacher pT, final Student pS);
  
  @Override
  public void process(final FinalPatternMatch match) {
    process(match.getY(), match.getC(), match.getT(), match.getS());
    
  }
}
