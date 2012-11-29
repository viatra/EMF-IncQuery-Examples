package hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute;

import java.util.Arrays;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the EClassWithEStringAttribute pattern, 
 * to be used in conjunction with EClassWithEStringAttributeMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeProcessor
 * 
 */
public final class EClassWithEStringAttributeMatch extends BasePatternMatch {
  private EClass fE;
  
  private EAttribute fAttr;
  
  private static String[] parameterNames = {"E", "Attr"};
  
  EClassWithEStringAttributeMatch(final EClass pE, final EAttribute pAttr) {
    this.fE = pE;
    this.fAttr = pAttr;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("E".equals(parameterName)) return this.fE;
    if ("Attr".equals(parameterName)) return this.fAttr;
    return null;
    
  }
  
  public EClass getE() {
    return this.fE;
    
  }
  
  public EAttribute getAttr() {
    return this.fAttr;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("E".equals(parameterName) ) {
    	this.fE = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Attr".equals(parameterName) ) {
    	this.fAttr = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setE(final EClass pE) {
    this.fE = pE;
    
  }
  
  public void setAttr(final EAttribute pAttr) {
    this.fAttr = pAttr;
    
  }
  
  @Override
  public String patternName() {
    return "EClassWithEStringAttribute";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EClassWithEStringAttributeMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE, fAttr};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"E\"=" + prettyPrintValue(fE) + ", ");
    result.append("\"Attr\"=" + prettyPrintValue(fAttr));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode()); 
    result = prime * result + ((fAttr == null) ? 0 : fAttr.hashCode()); 
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
    if (!EClassWithEStringAttributeMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EClassWithEStringAttributeMatch other = (EClassWithEStringAttributeMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    if (fAttr == null) {if (other.fAttr != null) return false;}
    else if (!fAttr.equals(other.fAttr)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EClassWithEStringAttributeMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
