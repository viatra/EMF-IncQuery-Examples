package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.C_translated_0Match;
import school.Student;

/**
 * A match processor tailored for the school.C_translated_0 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class C_translated_0Processor implements IMatchProcessor<C_translated_0Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTemp1 the value of pattern parameter temp1 in the currently processed match
   * @param pString_1 the value of pattern parameter string_1 in the currently processed match
   * 
   */
  public abstract void process(final Student pTemp1, final String pString_1);
  
  @Override
  public void process(final C_translated_0Match match) {
    process(match.getTemp1(), match.getString_1());
    
  }
}
