package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement;

import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementMatch;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ECoreNamedElementProcessor implements IMatchProcessor<ECoreNamedElementMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pElement the value of pattern parameter Element in the currently processed match 
   * @param pName the value of pattern parameter Name in the currently processed match 
   * 
   */
  public abstract void process(final ENamedElement Element, final String Name);
  
  @Override
  public void process(final ECoreNamedElementMatch match) {
    process(match.getElement(), match.getName());  				
    
  }
}
