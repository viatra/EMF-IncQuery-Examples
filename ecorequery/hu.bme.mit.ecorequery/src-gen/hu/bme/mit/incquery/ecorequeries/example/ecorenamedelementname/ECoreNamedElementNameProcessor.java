package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname;

import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname.ECoreNamedElementNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the ECoreNamedElementName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ECoreNamedElementNameProcessor implements IMatchProcessor<ECoreNamedElementNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pName the value of pattern parameter Name in the currently processed match 
   * 
   */
  public abstract void process(final String Name);
  
  @Override
  public void process(final ECoreNamedElementNameMatch match) {
    process(match.getName());  				
    
  }
}
