package hu.bme.mit.incquery.ecorequeries.example.eobject;

import hu.bme.mit.incquery.ecorequeries.example.eobject.EObjectMatch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the EObject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EObjectProcessor implements IMatchProcessor<EObjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter E in the currently processed match 
   * 
   */
  public abstract void process(final EObject E);
  
  @Override
  public void process(final EObjectMatch match) {
    process(match.getE());  				
    
  }
}
