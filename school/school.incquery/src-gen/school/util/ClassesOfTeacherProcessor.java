package school.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.ClassesOfTeacherMatch;
import school.SchoolClass;
import school.Teacher;

/**
 * A match processor tailored for the school.classesOfTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class ClassesOfTeacherProcessor implements IMatchProcessor<ClassesOfTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter T in the currently processed match 
   * @param pSC the value of pattern parameter SC in the currently processed match 
   * 
   */
  public abstract void process(final Teacher pT, final SchoolClass pSC);
  
  @Override
  public void process(final ClassesOfTeacherMatch match) {
    process(match.getT(), match.getSC());  				
    
  }
}
