package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttributeMatch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EClassWithEStringAttributeProcessor implements IMatchProcessor<EClassWithEStringAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter E in the currently processed match
   * @param pAttr the value of pattern parameter Attr in the currently processed match
   * 
   */
  public abstract void process(final EClass pE, final EAttribute pAttr);
  
  @Override
  public void process(final EClassWithEStringAttributeMatch match) {
    process(match.getE(), match.getAttr());
  }
}
