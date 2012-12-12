package hu.bme.mit.incquery.ecorequeries.example.eclassattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EClassAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EClassAttributeProcessor implements IMatchProcessor<EClassAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter E in the currently processed match 
   * @param pAttr the value of pattern parameter Attr in the currently processed match 
   * @param pType the value of pattern parameter Type in the currently processed match 
   * 
   */
  public abstract void process(final EClass E, final EAttribute Attr, final EClassifier Type);
  
  @Override
  public void process(final EClassAttributeMatch match) {
    process(match.getE(), match.getAttr(), match.getType());  				
    
  }
}
