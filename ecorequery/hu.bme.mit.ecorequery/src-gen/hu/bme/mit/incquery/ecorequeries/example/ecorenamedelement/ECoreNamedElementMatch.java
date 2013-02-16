package hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement pattern, 
 * to be used in conjunction with ECoreNamedElementMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ECoreNamedElementMatcher
 * @see ECoreNamedElementProcessor
 * 
 */
public final class ECoreNamedElementMatch extends BasePatternMatch {
  private Object fElement;
  
  private String fName;
  
  private static String[] parameterNames = {"Element", "Name"};
  
  ECoreNamedElementMatch(final Object pElement, final String pName) {
    this.fElement = pElement;
    this.fName = pName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Element".equals(parameterName)) return this.fElement;
    if ("Name".equals(parameterName)) return this.fName;
    return null;
    
  }
  
  public Object getElement() {
    return this.fElement;
    
  }
  
  public String getName() {
    return this.fName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Element".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fElement = (java.lang.Object) newValue;
    	return true;
    }
    if ("Name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setElement(final Object pElement) {
    this.fElement = pElement;
    
  }
  
  public void setName(final String pName) {
    this.fName = pName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ECoreNamedElementMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElement, fName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
    result.append("\"Name\"=" + prettyPrintValue(fName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fElement == null) ? 0 : fElement.hashCode()); 
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
    if (!ECoreNamedElementMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ECoreNamedElementMatch other = (ECoreNamedElementMatch) obj;
    if (fElement == null) {if (other.fElement != null) return false;}
    else if (!fElement.equals(other.fElement)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ECoreNamedElementMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
