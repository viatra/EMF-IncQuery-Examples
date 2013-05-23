package hu.bme.mit.incquery.ecorequeries.example;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName pattern, 
 * to be used in conjunction with {@link SuperTypeOfNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameProcessor
 * 
 */
public abstract class SuperTypeOfNameMatch extends BasePatternMatch {
  private String fSuperName;
  
  private String fSubName;
  
  private static List<String> parameterNames = makeImmutableList("SuperName", "SubName");
  
  private SuperTypeOfNameMatch(final String pSuperName, final String pSubName) {
    this.fSuperName = pSuperName;
    this.fSubName = pSubName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SuperName".equals(parameterName)) return this.fSuperName;
    if ("SubName".equals(parameterName)) return this.fSubName;
    return null;
    
  }
  
  public String getSuperName() {
    return this.fSuperName;
    
  }
  
  public String getSubName() {
    return this.fSubName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("SuperName".equals(parameterName) ) {
    	this.fSuperName = (java.lang.String) newValue;
    	return true;
    }
    if ("SubName".equals(parameterName) ) {
    	this.fSubName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSuperName(final String pSuperName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSuperName = pSuperName;
    
  }
  
  public void setSubName(final String pSubName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSubName = pSubName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SuperTypeOfNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSuperName, fSubName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SuperName\"=" + prettyPrintValue(fSuperName) + ", ");
    result.append("\"SubName\"=" + prettyPrintValue(fSubName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSuperName == null) ? 0 : fSuperName.hashCode()); 
    result = prime * result + ((fSubName == null) ? 0 : fSubName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SuperTypeOfNameMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SuperTypeOfNameMatch other = (SuperTypeOfNameMatch) obj;
    if (fSuperName == null) {if (other.fSuperName != null) return false;}
    else if (!fSuperName.equals(other.fSuperName)) return false;
    if (fSubName == null) {if (other.fSubName != null) return false;}
    else if (!fSubName.equals(other.fSubName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SuperTypeOfNameMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends SuperTypeOfNameMatch {
    Mutable(final String pSuperName, final String pSubName) {
      super(pSuperName, pSubName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends SuperTypeOfNameMatch {
    Immutable(final String pSuperName, final String pSubName) {
      super(pSuperName, pSubName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
