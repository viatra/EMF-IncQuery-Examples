package hu.bme.mit.incquery.ecorequeries.example.supertypeofname;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the SuperTypeOfName pattern, 
 * to be used in conjunction with SuperTypeOfNameMatcher.
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
public final class SuperTypeOfNameMatch extends BasePatternMatch {
  private String fSuperName;
  
  private String fSubName;
  
  private static String[] parameterNames = {"SuperName", "SubName"};
  
  SuperTypeOfNameMatch(final String pSuperName, final String pSubName) {
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
    this.fSuperName = pSuperName;
    
  }
  
  public void setSubName(final String pSubName) {
    this.fSubName = pSubName;
    
  }
  
  @Override
  public String patternName() {
    return "SuperTypeOfName";
    
  }
  
  @Override
  public String[] parameterNames() {
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!SuperTypeOfNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
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
    	return SuperTypeOfNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
