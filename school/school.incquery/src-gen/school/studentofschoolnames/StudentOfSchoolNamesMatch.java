package school.studentofschoolnames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.studentOfSchoolNames pattern, 
 * to be used in conjunction with StudentOfSchoolNamesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StudentOfSchoolNamesMatcher
 * @see StudentOfSchoolNamesProcessor
 * 
 */
public final class StudentOfSchoolNamesMatch extends BasePatternMatch {
  private String fSName;
  
  private String fSchName;
  
  private static String[] parameterNames = {"SName", "SchName"};
  
  StudentOfSchoolNamesMatch(final String pSName, final String pSchName) {
    this.fSName = pSName;
    this.fSchName = pSchName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SName".equals(parameterName)) return this.fSName;
    if ("SchName".equals(parameterName)) return this.fSchName;
    return null;
    
  }
  
  public String getSName() {
    return this.fSName;
    
  }
  
  public String getSchName() {
    return this.fSchName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("SName".equals(parameterName) ) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    if ("SchName".equals(parameterName) ) {
    	this.fSchName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSName(final String pSName) {
    this.fSName = pSName;
    
  }
  
  public void setSchName(final String pSchName) {
    this.fSchName = pSchName;
    
  }
  
  @Override
  public String patternName() {
    return "school.studentOfSchoolNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return StudentOfSchoolNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSName, fSchName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SName\"=" + prettyPrintValue(fSName) + ", ");
    result.append("\"SchName\"=" + prettyPrintValue(fSchName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSName == null) ? 0 : fSName.hashCode()); 
    result = prime * result + ((fSchName == null) ? 0 : fSchName.hashCode()); 
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
    if (!StudentOfSchoolNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    StudentOfSchoolNamesMatch other = (StudentOfSchoolNamesMatch) obj;
    if (fSName == null) {if (other.fSName != null) return false;}
    else if (!fSName.equals(other.fSName)) return false;
    if (fSchName == null) {if (other.fSchName != null) return false;}
    else if (!fSchName.equals(other.fSchName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return StudentOfSchoolNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
