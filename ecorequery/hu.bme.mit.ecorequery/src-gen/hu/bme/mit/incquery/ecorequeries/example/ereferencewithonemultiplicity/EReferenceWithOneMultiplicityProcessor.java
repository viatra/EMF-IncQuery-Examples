package hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity;

import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity.EReferenceWithOneMultiplicityMatch;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the EReferenceWithOneMultiplicity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EReferenceWithOneMultiplicityProcessor implements IMatchProcessor<EReferenceWithOneMultiplicityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pERef the value of pattern parameter ERef in the currently processed match 
   * 
   */
  public abstract void process(final EReference ERef);
  
  @Override
  public void process(final EReferenceWithOneMultiplicityMatch match) {
    process(match.getERef());  				
    
  }
}
