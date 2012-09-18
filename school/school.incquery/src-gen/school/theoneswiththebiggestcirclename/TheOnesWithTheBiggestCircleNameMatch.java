package school.theoneswiththebiggestcirclename;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the theOnesWithTheBiggestCircleName pattern, 
 * to be used in conjunction with TheOnesWithTheBiggestCircleNameMatcher.
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
public final class TheOnesWithTheBiggestCircleNameMatch extends BasePatternMatch {
  private String fSName;
  
  private static String[] parameterNames = {"SName"};
  
  TheOnesWithTheBiggestCircleNameMatch(final String pSName) {
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
    if ("SName".equals(parameterName) ) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSName(final String pSName) {
    this.fSName = pSName;
    
  }
  
  @Override
  public String patternName() {
    return "theOnesWithTheBiggestCircleName";
    
  }
  
  @Override
  public String[] parameterNames() {
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!TheOnesWithTheBiggestCircleNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    TheOnesWithTheBiggestCircleNameMatch other = (TheOnesWithTheBiggestCircleNameMatch) obj;
    if (fSName == null) {if (other.fSName != null) return false;}
    else if (!fSName.equals(other.fSName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TheOnesWithTheBiggestCircleNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
