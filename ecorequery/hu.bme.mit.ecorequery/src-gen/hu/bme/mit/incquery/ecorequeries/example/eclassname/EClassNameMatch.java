package hu.bme.mit.incquery.ecorequeries.example.eclassname;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EClassName pattern, 
 * to be used in conjunction with EClassNameMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassNameMatcher
 * @see EClassNameProcessor
 * 
 */
public final class EClassNameMatch extends BasePatternMatch {
  private String fEName;
  
  private static String[] parameterNames = {"EName"};
  
  EClassNameMatch(final String pEName) {
    this.fEName = pEName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("EName".equals(parameterName)) return this.fEName;
    return null;
    
  }
  
  public String getEName() {
    return this.fEName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("EName".equals(parameterName) ) {
    	this.fEName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setEName(final String pEName) {
    this.fEName = pEName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassName";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EClassNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"EName\"=" + prettyPrintValue(fEName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEName == null) ? 0 : fEName.hashCode()); 
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
    if (!EClassNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EClassNameMatch other = (EClassNameMatch) obj;
    if (fEName == null) {if (other.fEName != null) return false;}
    else if (!fEName.equals(other.fEName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EClassNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
