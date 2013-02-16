package hu.bme.mit.incquery.ecorequeries.example.eclassattribute;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EClassAttribute pattern, 
 * to be used in conjunction with EClassAttributeMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassAttributeMatcher
 * @see EClassAttributeProcessor
 * 
 */
public final class EClassAttributeMatch extends BasePatternMatch {
  private Object fE;
  
  private Object fAttr;
  
  private Object fType;
  
  private static String[] parameterNames = {"E", "Attr", "Type"};
  
  EClassAttributeMatch(final Object pE, final Object pAttr, final Object pType) {
    this.fE = pE;
    this.fAttr = pAttr;
    this.fType = pType;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("E".equals(parameterName)) return this.fE;
    if ("Attr".equals(parameterName)) return this.fAttr;
    if ("Type".equals(parameterName)) return this.fType;
    return null;
    
  }
  
  public Object getE() {
    return this.fE;
    
  }
  
  public Object getAttr() {
    return this.fAttr;
    
  }
  
  public Object getType() {
    return this.fType;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("E".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fE = (java.lang.Object) newValue;
    	return true;
    }
    if ("Attr".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fAttr = (java.lang.Object) newValue;
    	return true;
    }
    if ("Type".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fType = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setE(final Object pE) {
    this.fE = pE;
    
  }
  
  public void setAttr(final Object pAttr) {
    this.fAttr = pAttr;
    
  }
  
  public void setType(final Object pType) {
    this.fType = pType;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassAttribute";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EClassAttributeMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE, fAttr, fType};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"E\"=" + prettyPrintValue(fE) + ", ");
    result.append("\"Attr\"=" + prettyPrintValue(fAttr) + ", ");
    result.append("\"Type\"=" + prettyPrintValue(fType));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode()); 
    result = prime * result + ((fAttr == null) ? 0 : fAttr.hashCode()); 
    result = prime * result + ((fType == null) ? 0 : fType.hashCode()); 
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
    if (!EClassAttributeMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EClassAttributeMatch other = (EClassAttributeMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    if (fAttr == null) {if (other.fAttr != null) return false;}
    else if (!fAttr.equals(other.fAttr)) return false;
    if (fType == null) {if (other.fType != null) return false;}
    else if (!fType.equals(other.fType)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EClassAttributeMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
