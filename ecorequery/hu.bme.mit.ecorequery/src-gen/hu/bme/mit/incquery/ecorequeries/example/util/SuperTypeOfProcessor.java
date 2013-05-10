package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfMatch;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SuperTypeOfProcessor implements IMatchProcessor<SuperTypeOfMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSuper the value of pattern parameter Super in the currently processed match 
   * @param pSub the value of pattern parameter Sub in the currently processed match 
   * 
   */
  public abstract void process(final EClass Super, final EClass Sub);
  
  @Override
  public void process(final SuperTypeOfMatch match) {
    process(match.getSuper(), match.getSub());  				
    
  }
}
