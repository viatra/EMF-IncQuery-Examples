package hu.bme.mit.incquery.ecorequeries.example.isinecore;

import hu.bme.mit.incquery.ecorequeries.example.isinecore.IsInECoreMatch;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.IsInECore pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IsInECoreProcessor implements IMatchProcessor<IsInECoreMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pElement the value of pattern parameter Element in the currently processed match 
   * 
   */
  public abstract void process(final EClassifier Element);
  
  @Override
  public void process(final IsInECoreMatch match) {
    process(match.getElement());  				
    
  }
}
