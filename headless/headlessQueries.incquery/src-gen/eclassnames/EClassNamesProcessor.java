package eclassnames;

import eclassnames.EClassNamesMatch;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the EClassNames pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EClassNamesProcessor implements IMatchProcessor<EClassNamesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * @param pN the value of pattern parameter N in the currently processed match 
   * 
   */
  public abstract void process(final EClass C, final String N);
  
  @Override
  public void process(final EClassNamesMatch match) {
    process(match.getC(), match.getN());  				
    
  }
}
