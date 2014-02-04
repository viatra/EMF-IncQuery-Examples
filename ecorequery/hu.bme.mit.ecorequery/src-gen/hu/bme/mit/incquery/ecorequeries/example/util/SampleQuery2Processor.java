package hu.bme.mit.incquery.ecorequeries.example.util;

import hu.bme.mit.incquery.ecorequeries.example.SampleQuery2Match;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.SampleQuery2 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SampleQuery2Processor implements IMatchProcessor<SampleQuery2Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pXElement the value of pattern parameter XElement in the currently processed match
   * @param pYElement the value of pattern parameter YElement in the currently processed match
   * @param pRelates1 the value of pattern parameter Relates1 in the currently processed match
   * @param pRelates2 the value of pattern parameter Relates2 in the currently processed match
   * @param pLabel1 the value of pattern parameter Label1 in the currently processed match
   * @param pLabel2 the value of pattern parameter Label2 in the currently processed match
   * 
   */
  public abstract void process(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2);
  
  @Override
  public void process(final SampleQuery2Match match) {
    process(match.getXElement(), match.getYElement(), match.getRelates1(), match.getRelates2(), match.getLabel1(), match.getLabel2());
    
  }
}
