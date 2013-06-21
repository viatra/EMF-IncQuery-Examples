package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityMatch;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EReferenceWithOneMultiplicityProcessor implements IMatchProcessor<EReferenceWithOneMultiplicityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pERef the value of pattern parameter ERef in the currently processed match 
   * 
   */
  public abstract void process(final EReference pERef);
  
  @Override
  public void process(final EReferenceWithOneMultiplicityMatch match) {
    process(match.getERef());
    
  }
}
