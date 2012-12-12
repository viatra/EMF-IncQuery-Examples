package hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity;

import java.util.Arrays;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity pattern, 
 * to be used in conjunction with EReferenceWithOneMultiplicityMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EReferenceWithOneMultiplicityMatcher
 * @see EReferenceWithOneMultiplicityProcessor
 * 
 */
public final class EReferenceWithOneMultiplicityMatch extends BasePatternMatch {
  private EReference fERef;
  
  private static String[] parameterNames = {"ERef"};
  
  EReferenceWithOneMultiplicityMatch(final EReference pERef) {
    this.fERef = pERef;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ERef".equals(parameterName)) return this.fERef;
    return null;
    
  }
  
  public EReference getERef() {
    return this.fERef;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("ERef".equals(parameterName) ) {
    	this.fERef = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setERef(final EReference pERef) {
    this.fERef = pERef;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EReferenceWithOneMultiplicityMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fERef};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ERef\"=" + prettyPrintValue(fERef));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fERef == null) ? 0 : fERef.hashCode()); 
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
    if (!EReferenceWithOneMultiplicityMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EReferenceWithOneMultiplicityMatch other = (EReferenceWithOneMultiplicityMatch) obj;
    if (fERef == null) {if (other.fERef != null) return false;}
    else if (!fERef.equals(other.fERef)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EReferenceWithOneMultiplicityMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
