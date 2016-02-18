package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementNameMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElementName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ECoreNamedElementNameProcessor implements IMatchProcessor<ECoreNamedElementNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pName the value of pattern parameter Name in the currently processed match
   * 
   */
  public abstract void process(final String pName);
  
  @Override
  public void process(final ECoreNamedElementNameMatch match) {
    process(match.getName());
  }
}
