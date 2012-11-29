package school.schoolsnames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the schoolsNames pattern, 
 * to be used in conjunction with SchoolsNamesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolsNamesMatcher
 * @see SchoolsNamesProcessor
 * 
 */
public final class SchoolsNamesMatch extends BasePatternMatch {
  private String fSchName;
  
  private static String[] parameterNames = {"SchName"};
  
  SchoolsNamesMatch(final String pSchName) {
    this.fSchName = pSchName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SchName".equals(parameterName)) return this.fSchName;
    return null;
    
  }
  
  public String getSchName() {
    return this.fSchName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("SchName".equals(parameterName) ) {
    	this.fSchName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSchName(final String pSchName) {
    this.fSchName = pSchName;
    
  }
  
  @Override
  public String patternName() {
    return "schoolsNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SchoolsNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSchName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SchName\"=" + prettyPrintValue(fSchName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    if (!SchoolsNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    SchoolsNamesMatch other = (SchoolsNamesMatch) obj;
    if (fSchName == null) {if (other.fSchName != null) return false;}
    else if (!fSchName.equals(other.fSchName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SchoolsNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
