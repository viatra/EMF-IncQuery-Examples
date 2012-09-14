package hu.bme.mit.incquery.ecorequeries.example.isestring;

import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatch;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the IsEString pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class IsEStringProcessor implements IMatchProcessor<IsEStringMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pElement the value of pattern parameter Element in the currently processed match 
   * 
   */
  public abstract void process(final EClassifier Element);
  
  @Override
  public void process(final IsEStringMatch match) {
    process(match.getElement());  				
    
  }
}
