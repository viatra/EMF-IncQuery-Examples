package hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute;

import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class EClassWithEStringAttributeProcessor implements IMatchProcessor<EClassWithEStringAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pE the value of pattern parameter E in the currently processed match 
   * @param pAttr the value of pattern parameter Attr in the currently processed match 
   * 
   */
  public abstract void process(final Object E, final Object Attr);
  
  @Override
  public void process(final EClassWithEStringAttributeMatch match) {
    process(match.getE(), match.getAttr());  				
    
  }
}
