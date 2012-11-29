package hu.bme.mit.incquery.ecorequeries.example.isinecore;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the IsInECore pattern, 
 * to be used in conjunction with IsInECoreMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IsInECoreMatcher
 * @see IsInECoreProcessor
 * 
 */
public final class IsInECoreMatch extends BasePatternMatch {
  private EClassifier fElement;
  
  private static String[] parameterNames = {"Element"};
  
  IsInECoreMatch(final EClassifier pElement) {
    this.fElement = pElement;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Element".equals(parameterName)) return this.fElement;
    return null;
    
  }
  
  public EClassifier getElement() {
    return this.fElement;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Element".equals(parameterName) ) {
    	this.fElement = (org.eclipse.emf.ecore.EClassifier) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setElement(final EClassifier pElement) {
    this.fElement = pElement;
    
  }
  
  @Override
  public String patternName() {
    return "IsInECore";
    
  }
  
  @Override
  public String[] parameterNames() {
    return IsInECoreMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElement};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Element\"=" + prettyPrintValue(fElement));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fElement == null) ? 0 : fElement.hashCode()); 
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
    if (!IsInECoreMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    IsInECoreMatch other = (IsInECoreMatch) obj;
    if (fElement == null) {if (other.fElement != null) return false;}
    else if (!fElement.equals(other.fElement)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return IsInECoreMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
