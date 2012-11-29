package school.inthecircleoffriendsnames;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatch;

/**
 * A match processor tailored for the inTheCircleOfFriendsNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class InTheCircleOfFriendsNamesProcessor implements IMatchProcessor<InTheCircleOfFriendsNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1Name the value of pattern parameter S1Name in the currently processed match 
   * @param pSomeoneName the value of pattern parameter SomeoneName in the currently processed match 
   * 
   */
  public abstract void process(final String S1Name, final String SomeoneName);
  
  @Override
  public void process(final InTheCircleOfFriendsNamesMatch match) {
    process(match.getS1Name(), match.getSomeoneName());  				
    
  }
}
