package school.insameschooldifferentyears;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.insameschooldifferentyears.InSameSchoolDifferentYearsMatch;

/**
 * A match processor tailored for the inSameSchoolDifferentYears pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class InSameSchoolDifferentYearsProcessor implements IMatchProcessor<InSameSchoolDifferentYearsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param ElderStudent the value of pattern parameter ElderStudent in the currently processed match 
   * @param YoungerStudent the value of pattern parameter YoungerStudent in the currently processed match 
   * 
   */
  public abstract void process(final Object ElderStudent, final Object YoungerStudent);
  
  @Override
  public void process(final InSameSchoolDifferentYearsMatch match) {
    process(match.getElderStudent(), match.getYoungerStudent());  				
    
  }
}
