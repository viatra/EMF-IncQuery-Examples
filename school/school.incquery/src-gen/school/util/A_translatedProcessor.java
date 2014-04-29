package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.A_translatedMatch;
import school.SchoolClass;
import school.Student;

/**
 * A match processor tailored for the school.A_translated pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class A_translatedProcessor implements IMatchProcessor<A_translatedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSelf the value of pattern parameter self in the currently processed match
   * @param pStudent2 the value of pattern parameter student2 in the currently processed match
   * @param pStudent1 the value of pattern parameter student1 in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName);
  
  @Override
  public void process(final A_translatedMatch match) {
    process(match.getSelf(), match.getStudent2(), match.getStudent1(), match.getName());
    
  }
}
