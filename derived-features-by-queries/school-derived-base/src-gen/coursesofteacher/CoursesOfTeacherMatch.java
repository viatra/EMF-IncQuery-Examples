package coursesofteacher;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the coursesOfTeacher pattern, 
 * to be used in conjunction with CoursesOfTeacherMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CoursesOfTeacherMatcher
 * @see CoursesOfTeacherProcessor
 * 
 */
public final class CoursesOfTeacherMatch extends BasePatternMatch implements IPatternMatch {
  private Object fTeacher;
  
  private Object fCourse;
  
  private static String[] parameterNames = {"Teacher", "Course"};
  
  public CoursesOfTeacherMatch(final Object pTeacher, final Object pCourse) {
    this.fTeacher = pTeacher;
    this.fCourse = pCourse;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Teacher".equals(parameterName)) return this.fTeacher;
    if ("Course".equals(parameterName)) return this.fCourse;
    return null;
    
  }
  
  public Object getTeacher() {
    return this.fTeacher;
    
  }
  
  public Object getCourse() {
    return this.fCourse;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Teacher".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fTeacher = (java.lang.Object) newValue;
    	return true;
    }
    if ("Course".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fCourse = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTeacher(final Object pTeacher) {
    this.fTeacher = pTeacher;
    
  }
  
  public void setCourse(final Object pCourse) {
    this.fCourse = pCourse;
    
  }
  
  @Override
  public String patternName() {
    return "coursesOfTeacher";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CoursesOfTeacherMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeacher, fCourse};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Teacher\"=" + prettyPrintValue(fTeacher) + ", ");
    
    result.append("\"Course\"=" + prettyPrintValue(fCourse)
    );return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeacher == null) ? 0 : fTeacher.hashCode()); 
    result = prime * result + ((fCourse == null) ? 0 : fCourse.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!CoursesOfTeacherMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				CoursesOfTeacherMatch other = (CoursesOfTeacherMatch) obj;
    				if (fTeacher == null) {if (other.fTeacher != null) return false;}
    				else if (!fTeacher.equals(other.fTeacher)) return false;
    				if (fCourse == null) {if (other.fCourse != null) return false;}
    				else if (!fCourse.equals(other.fCourse)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return CoursesOfTeacherMatcher.FACTORY.getPattern();
  }
}
