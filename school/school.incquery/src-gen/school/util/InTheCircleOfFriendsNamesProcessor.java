package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.InTheCircleOfFriendsNamesMatch;

/**
 * A match processor tailored for the school.inTheCircleOfFriendsNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InTheCircleOfFriendsNamesProcessor implements IMatchProcessor<InTheCircleOfFriendsNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1Name the value of pattern parameter S1Name in the currently processed match 
   * @param pSomeoneName the value of pattern parameter SomeoneName in the currently processed match 
   * 
   */
  public abstract void process(final String pS1Name, final String pSomeoneName);
  
  @Override
  public void process(final InTheCircleOfFriendsNamesMatch match) {
    process(match.getS1Name(), match.getSomeoneName());
    
  }
}
