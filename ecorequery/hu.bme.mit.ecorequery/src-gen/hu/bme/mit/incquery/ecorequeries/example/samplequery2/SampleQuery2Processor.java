package hu.bme.mit.incquery.ecorequeries.example.samplequery2;

import hu.bme.mit.incquery.ecorequeries.example.samplequery2.SampleQuery2Match;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.SampleQuery2 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
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
  public abstract void process(final Object XElement, final Object YElement, final Object Relates1, final Object Relates2, final Object Label1, final Object Label2);
  
  @Override
  public void process(final SampleQuery2Match match) {
    process(match.getXElement(), match.getYElement(), match.getRelates1(), match.getRelates2(), match.getLabel1(), match.getLabel2());  				
    
  }
}
