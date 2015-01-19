package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.AllVariablesNamedMatch;
import school.Teacher;

/**
 * A match processor tailored for the school.allVariablesNamed pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllVariablesNamedProcessor implements IMatchProcessor<AllVariablesNamedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTeacher the value of pattern parameter teacher in the currently processed match
   * 
   */
  public abstract void process(final Teacher pTeacher);
  
  @Override
  public void process(final AllVariablesNamedMatch match) {
    process(match.getTeacher());
  }
}
