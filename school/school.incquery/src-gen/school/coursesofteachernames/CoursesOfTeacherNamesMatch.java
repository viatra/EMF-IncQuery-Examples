package school.coursesofteachernames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.coursesOfTeacherNames pattern, 
 * to be used in conjunction with CoursesOfTeacherNamesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesProcessor
 * 
 */
public final class CoursesOfTeacherNamesMatch extends BasePatternMatch {
  private String fTName;
  
  private String fCName;
  
  private static String[] parameterNames = {"TName", "CName"};
  
  CoursesOfTeacherNamesMatch(final String pTName, final String pCName) {
    this.fTName = pTName;
    this.fCName = pCName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TName".equals(parameterName)) return this.fTName;
    if ("CName".equals(parameterName)) return this.fCName;
    return null;
    
  }
  
  public String getTName() {
    return this.fTName;
    
  }
  
  public String getCName() {
    return this.fCName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("TName".equals(parameterName) ) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("CName".equals(parameterName) ) {
    	this.fCName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTName(final String pTName) {
    this.fTName = pTName;
    
  }
  
  public void setCName(final String pCName) {
    this.fCName = pCName;
    
  }
  
  @Override
  public String patternName() {
    return "school.coursesOfTeacherNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CoursesOfTeacherNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTName, fCName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TName\"=" + prettyPrintValue(fTName) + ", ");
    result.append("\"CName\"=" + prettyPrintValue(fCName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTName == null) ? 0 : fTName.hashCode()); 
    result = prime * result + ((fCName == null) ? 0 : fCName.hashCode()); 
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
    if (!CoursesOfTeacherNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    CoursesOfTeacherNamesMatch other = (CoursesOfTeacherNamesMatch) obj;
    if (fTName == null) {if (other.fTName != null) return false;}
    else if (!fTName.equals(other.fTName)) return false;
    if (fCName == null) {if (other.fCName != null) return false;}
    else if (!fCName.equals(other.fCName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CoursesOfTeacherNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
