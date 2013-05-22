package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.studentOfSchoolNames pattern, 
 * to be used in conjunction with {@link StudentOfSchoolNamesMatcher}.
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
public abstract class StudentOfSchoolNamesMatch extends BasePatternMatch {
  private String fSName;
  
  private String fSchName;
  
  private static List<String> parameterNames = makeImmutableList("SName", "SchName");
  
  private StudentOfSchoolNamesMatch(final String pSName, final String pSchName) {
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSName = pSName;
    
  }
  
  public void setSchName(final String pSchName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSchName = pSchName;
    
  }
  
  @Override
  public String patternName() {
    return "school.studentOfSchoolNames";
    
  }
  
  @Override
  public List<String> parameterNames() {
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
    if (!(obj instanceof StudentOfSchoolNamesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
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
    	return StudentOfSchoolNamesMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends StudentOfSchoolNamesMatch {
    Mutable(final String pSName, final String pSchName) {
      super(pSName, pSchName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends StudentOfSchoolNamesMatch {
    Immutable(final String pSName, final String pSchName) {
      super(pSName, pSchName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
