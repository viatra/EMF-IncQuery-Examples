package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicityName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EReferenceWithOneMultiplicityNameProcessor implements IMatchProcessor<EReferenceWithOneMultiplicityNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pERefName the value of pattern parameter ERefName in the currently processed match 
   * 
   */
  public abstract void process(final String pERefName);
  
  @Override
  public void process(final EReferenceWithOneMultiplicityNameMatch match) {
    process(match.getERefName());  				
    
  }
}
