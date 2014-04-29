package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.C_translatedMatch;
import school.SchoolClass;

/**
 * A match processor tailored for the school.C_translated pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class C_translatedProcessor implements IMatchProcessor<C_translatedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSelf the value of pattern parameter self in the currently processed match
   * @param pString_1 the value of pattern parameter string_1 in the currently processed match
   * 
   */
  public abstract void process(final SchoolClass pSelf, final String pString_1);
  
  @Override
  public void process(final C_translatedMatch match) {
    process(match.getSelf(), match.getString_1());
    
  }
}
