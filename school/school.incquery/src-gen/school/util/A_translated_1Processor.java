package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.A_translated_1Match;
import school.Student;

/**
 * A match processor tailored for the school.A_translated_1 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class A_translated_1Processor implements IMatchProcessor<A_translated_1Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS2 the value of pattern parameter s2 in the currently processed match
   * @param pS1 the value of pattern parameter s1 in the currently processed match
   * 
   */
  public abstract void process(final Student pS2, final Student pS1);
  
  @Override
  public void process(final A_translated_1Match match) {
    process(match.getS2(), match.getS1());
    
  }
}
