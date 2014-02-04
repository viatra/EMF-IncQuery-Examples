package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.TheOnesWithTheBiggestCircleNameQuerySpecification;

/**
 * Pattern-specific match representation of the school.theOnesWithTheBiggestCircleName pattern,
 * to be used in conjunction with {@link TheOnesWithTheBiggestCircleNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TheOnesWithTheBiggestCircleNameMatcher
 * @see TheOnesWithTheBiggestCircleNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TheOnesWithTheBiggestCircleNameMatch extends BasePatternMatch {
  private String fSName;
  
  private static List<String> parameterNames = makeImmutableList("SName");
  
  private TheOnesWithTheBiggestCircleNameMatch(final String pSName) {
    this.fSName = pSName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SName".equals(parameterName)) return this.fSName;
    return null;
    
  }
  
  public String getSName() {
    return this.fSName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("SName".equals(parameterName) ) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSName(final String pSName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSName = pSName;
    
  }
  
  @Override
  public String patternName() {
    return "school.theOnesWithTheBiggestCircleName";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return TheOnesWithTheBiggestCircleNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SName\"=" + prettyPrintValue(fSName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSName == null) ? 0 : fSName.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TheOnesWithTheBiggestCircleNameMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TheOnesWithTheBiggestCircleNameMatch other = (TheOnesWithTheBiggestCircleNameMatch) obj;
    if (fSName == null) {if (other.fSName != null) return false;}
    else if (!fSName.equals(other.fSName)) return false;
    return true;
  }
  
  @Override
  public TheOnesWithTheBiggestCircleNameQuerySpecification specification() {
    try {
    	return TheOnesWithTheBiggestCircleNameQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends TheOnesWithTheBiggestCircleNameMatch {
    Mutable(final String pSName) {
      super(pSName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends TheOnesWithTheBiggestCircleNameMatch {
    Immutable(final String pSName) {
      super(pSName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
