package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityMatch;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EReferenceWithStarMultiplicityProcessor implements IMatchProcessor<EReferenceWithStarMultiplicityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pERef the value of pattern parameter ERef in the currently processed match 
   * 
   */
  public abstract void process(final EReference pERef);
  
  @Override
  public void process(final EReferenceWithStarMultiplicityMatch match) {
    process(match.getERef());  				
    
  }
}
