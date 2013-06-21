package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EClassMatch;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EClass pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EClassProcessor implements IMatchProcessor<EClassMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEClass the value of pattern parameter EClass in the currently processed match 
   * 
   */
  public abstract void process(final EClass pEClass);
  
  @Override
  public void process(final EClassMatch match) {
    process(match.getEClass());
    
  }
}
