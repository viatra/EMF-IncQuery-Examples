package school.theoneswiththebiggestcircle;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.Student;
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatch;

/**
 * A match processor tailored for the theOnesWithTheBiggestCircle pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TheOnesWithTheBiggestCircleProcessor implements IMatchProcessor<TheOnesWithTheBiggestCircleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS the value of pattern parameter S in the currently processed match 
   * 
   */
  public abstract void process(final Student S);
  
  @Override
  public void process(final TheOnesWithTheBiggestCircleMatch match) {
    process(match.getS());  				
    
  }
}
