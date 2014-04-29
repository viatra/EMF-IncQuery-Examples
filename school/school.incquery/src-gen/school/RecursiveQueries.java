package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.AlphabeticallyAfterFriendMatcher;
import school.IncreasingAlphabeticalFriendshipChainRecMatcher;
import school.IncreasingAlphabeticalFriendshipChainTCMatcher;
import school.util.AlphabeticallyAfterFriendQuerySpecification;
import school.util.IncreasingAlphabeticalFriendshipChainRecQuerySpecification;
import school.util.IncreasingAlphabeticalFriendshipChainTCQuerySpecification;

/**
 * A pattern group formed of all patterns defined in recursiveQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file recursiveQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package school, the group contains the definition of the following patterns: <ul>
 * <li>alphabeticallyAfterFriend</li>
 * <li>increasingAlphabeticalFriendshipChainRec</li>
 * <li>increasingAlphabeticalFriendshipChainTC</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class RecursiveQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RecursiveQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new RecursiveQueries();
    }
    return INSTANCE;
    
  }
  
  private static RecursiveQueries INSTANCE;
  
  private RecursiveQueries() throws IncQueryException {
    querySpecifications.add(AlphabeticallyAfterFriendQuerySpecification.instance());
    querySpecifications.add(IncreasingAlphabeticalFriendshipChainRecQuerySpecification.instance());
    querySpecifications.add(IncreasingAlphabeticalFriendshipChainTCQuerySpecification.instance());
    
  }
  
  public AlphabeticallyAfterFriendQuerySpecification getAlphabeticallyAfterFriend() throws IncQueryException {
    return AlphabeticallyAfterFriendQuerySpecification.instance();
  }
  
  public AlphabeticallyAfterFriendMatcher getAlphabeticallyAfterFriend(final IncQueryEngine engine) throws IncQueryException {
    return AlphabeticallyAfterFriendMatcher.on(engine);
  }
  
  public IncreasingAlphabeticalFriendshipChainRecQuerySpecification getIncreasingAlphabeticalFriendshipChainRec() throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainRecQuerySpecification.instance();
  }
  
  public IncreasingAlphabeticalFriendshipChainRecMatcher getIncreasingAlphabeticalFriendshipChainRec(final IncQueryEngine engine) throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainRecMatcher.on(engine);
  }
  
  public IncreasingAlphabeticalFriendshipChainTCQuerySpecification getIncreasingAlphabeticalFriendshipChainTC() throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainTCQuerySpecification.instance();
  }
  
  public IncreasingAlphabeticalFriendshipChainTCMatcher getIncreasingAlphabeticalFriendshipChainTC(final IncQueryEngine engine) throws IncQueryException {
    return IncreasingAlphabeticalFriendshipChainTCMatcher.on(engine);
  }
}
