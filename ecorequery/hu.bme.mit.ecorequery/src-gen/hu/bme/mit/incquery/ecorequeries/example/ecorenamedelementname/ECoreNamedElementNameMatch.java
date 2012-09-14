package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelementname;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the ECoreNamedElementName pattern, 
 * to be used in conjunction with ECoreNamedElementNameMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ECoreNamedElementNameMatcher
 * @see ECoreNamedElementNameProcessor
 * 
 */
public final class ECoreNamedElementNameMatch extends BasePatternMatch {
  private Object fName;
  
  private static String[] parameterNames = {"Name"};
  
  ECoreNamedElementNameMatch(final Object pName) {
    this.fName = pName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Name".equals(parameterName)) return this.fName;
    return null;
    
  }
  
  public Object getName() {
    return this.fName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Name".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fName = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setName(final Object pName) {
    this.fName = pName;
    
  }
  
  @Override
  public String patternName() {
    return "ECoreNamedElementName";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ECoreNamedElementNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Name\"=" + prettyPrintValue(fName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fName == null) ? 0 : fName.hashCode()); 
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
    if (!ECoreNamedElementNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ECoreNamedElementNameMatch other = (ECoreNamedElementNameMatch) obj;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ECoreNamedElementNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
