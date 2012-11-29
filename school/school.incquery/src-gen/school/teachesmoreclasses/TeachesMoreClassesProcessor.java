package school.teachesmoreclasses;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Teacher;
import school.teachesmoreclasses.TeachesMoreClassesMatch;

/**
 * A match processor tailored for the teachesMoreClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class TeachesMoreClassesProcessor implements IMatchProcessor<TeachesMoreClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT1 the value of pattern parameter T1 in the currently processed match 
   * @param pT2 the value of pattern parameter T2 in the currently processed match 
   * 
   */
  public abstract void process(final Teacher T1, final Teacher T2);
  
  @Override
  public void process(final TeachesMoreClassesMatch match) {
    process(match.getT1(), match.getT2());  				
    
  }
}
