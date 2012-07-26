package school.classesofteacher;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.SchoolClass;
import school.Teacher;
import school.classesofteacher.ClassesOfTeacherMatch;

/**
 * A match processor tailored for the classesOfTeacher pattern.
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
  public abstract void process(final Teacher T, final SchoolClass SC);
  
  @Override
  public void process(final ClassesOfTeacherMatch match) {
    process(match.getT(), match.getSC());  				
    
  }
}
