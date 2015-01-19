package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.IncreasingAlphabeticalFriendshipChainRecMatch;
import school.Student;

/**
 * A match processor tailored for the school.increasingAlphabeticalFriendshipChainRec pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class IncreasingAlphabeticalFriendshipChainRecProcessor implements IMatchProcessor<IncreasingAlphabeticalFriendshipChainRecMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter S1 in the currently processed match
   * @param pS2 the value of pattern parameter S2 in the currently processed match
   * 
   */
  public abstract void process(final Student pS1, final Student pS2);
  
  @Override
  public void process(final IncreasingAlphabeticalFriendshipChainRecMatch match) {
    process(match.getS1(), match.getS2());
  }
}
