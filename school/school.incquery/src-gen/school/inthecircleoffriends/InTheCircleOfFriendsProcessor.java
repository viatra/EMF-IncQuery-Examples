package school.inthecircleoffriends;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Student;
import school.inthecircleoffriends.InTheCircleOfFriendsMatch;

/**
 * A match processor tailored for the school.inTheCircleOfFriends pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class InTheCircleOfFriendsProcessor implements IMatchProcessor<InTheCircleOfFriendsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter S1 in the currently processed match 
   * @param pSomeone the value of pattern parameter Someone in the currently processed match 
   * 
   */
  public abstract void process(final Student S1, final Student Someone);
  
  @Override
  public void process(final InTheCircleOfFriendsMatch match) {
    process(match.getS1(), match.getSomeone());  				
    
  }
}
