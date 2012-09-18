package hu.bme.mit.incquery.ecorequeries.example.supertypeofname;

import hu.bme.mit.incquery.ecorequeries.example.supertypeofname.SuperTypeOfNameMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the SuperTypeOfName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SuperTypeOfNameProcessor implements IMatchProcessor<SuperTypeOfNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSuperName the value of pattern parameter SuperName in the currently processed match 
   * @param pSubName the value of pattern parameter SubName in the currently processed match 
   * 
   */
  public abstract void process(final String SuperName, final String SubName);
  
  @Override
  public void process(final SuperTypeOfNameMatch match) {
    process(match.getSuperName(), match.getSubName());  				
    
  }
}
