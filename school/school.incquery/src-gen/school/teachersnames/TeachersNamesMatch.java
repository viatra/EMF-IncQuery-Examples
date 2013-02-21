package school.teachersnames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.teachersNames pattern, 
 * to be used in conjunction with {@link TeachersNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesProcessor
 * 
 */
public abstract class TeachersNamesMatch extends BasePatternMatch {
  private String fTN;
  
  private static String[] parameterNames = {"TN"};
  
  private TeachersNamesMatch(final String pTN) {
    this.fTN = pTN;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TN".equals(parameterName)) return this.fTN;
    return null;
    
  }
  
  public String getTN() {
    return this.fTN;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TN".equals(parameterName) ) {
    	this.fTN = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTN(final String pTN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTN = pTN;
    
  }
  
  @Override
  public String patternName() {
    return "school.teachersNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeachersNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTN};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TN\"=" + prettyPrintValue(fTN));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTN == null) ? 0 : fTN.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeachersNamesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TeachersNamesMatch other = (TeachersNamesMatch) obj;
    if (fTN == null) {if (other.fTN != null) return false;}
    else if (!fTN.equals(other.fTN)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeachersNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends TeachersNamesMatch {
    Mutable(final String pTN) {
      super(pTN);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends TeachersNamesMatch {
    Immutable(final String pTN) {
      super(pTN);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
