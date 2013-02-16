package school.coursesofteacher;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.coursesOfTeacher pattern, 
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
public final class CoursesOfTeacherMatch extends BasePatternMatch {
  private Object fT;
  
  private Object fC;
  
  private static String[] parameterNames = {"T", "C"};
  
  CoursesOfTeacherMatch(final Object pT, final Object pC) {
    this.fT = pT;
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("C".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public Object getT() {
    return this.fT;
    
  }
  
  public Object getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("T".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fT = (java.lang.Object) newValue;
    	return true;
    }
    if ("C".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fC = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Object pT) {
    this.fT = pT;
    
  }
  
  public void setC(final Object pC) {
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "school.coursesOfTeacher";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CoursesOfTeacherMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"C\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
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
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CoursesOfTeacherMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
