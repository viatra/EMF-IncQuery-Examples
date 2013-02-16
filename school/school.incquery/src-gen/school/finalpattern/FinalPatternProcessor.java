package school.finalpattern;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.finalpattern.FinalPatternMatch;

/**
 * A match processor tailored for the school.finalPattern pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class FinalPatternProcessor implements IMatchProcessor<FinalPatternMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pY the value of pattern parameter Y in the currently processed match 
   * @param pC the value of pattern parameter C in the currently processed match 
   * @param pT the value of pattern parameter T in the currently processed match 
   * @param pS the value of pattern parameter S in the currently processed match 
   * 
   */
  public abstract void process(final Object Y, final Object C, final Object T, final Object S);
  
  @Override
  public void process(final FinalPatternMatch match) {
    process(match.getY(), match.getC(), match.getT(), match.getS());  				
    
  }
}
