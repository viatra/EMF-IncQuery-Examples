package school.samecodeclassdifferentyears;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.samecodeclassdifferentyears.SameCodeClassDifferentYearsMatch;

/**
 * A match processor tailored for the sameCodeClassDifferentYears pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SameCodeClassDifferentYearsProcessor implements IMatchProcessor<SameCodeClassDifferentYearsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pElderStudent the value of pattern parameter ElderStudent in the currently processed match 
   * @param pYoungerStudent the value of pattern parameter YoungerStudent in the currently processed match 
   * 
   */
  public abstract void process(final Object ElderStudent, final Object YoungerStudent);
  
  @Override
  public void process(final SameCodeClassDifferentYearsMatch match) {
    process(match.getElderStudent(), match.getYoungerStudent());  				
    
  }
}
