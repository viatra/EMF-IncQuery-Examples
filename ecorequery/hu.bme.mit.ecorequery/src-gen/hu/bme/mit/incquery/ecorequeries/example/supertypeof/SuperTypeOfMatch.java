package hu.bme.mit.incquery.ecorequeries.example.supertypeof;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the SuperTypeOf pattern, 
 * to be used in conjunction with SuperTypeOfMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SuperTypeOfMatcher
 * @see SuperTypeOfProcessor
 * 
 */
public final class SuperTypeOfMatch extends BasePatternMatch {
  private EClass fSuper;
  
  private EClass fSub;
  
  private static String[] parameterNames = {"Super", "Sub"};
  
  SuperTypeOfMatch(final EClass pSuper, final EClass pSub) {
    this.fSuper = pSuper;
    this.fSub = pSub;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Super".equals(parameterName)) return this.fSuper;
    if ("Sub".equals(parameterName)) return this.fSub;
    return null;
    
  }
  
  public EClass getSuper() {
    return this.fSuper;
    
  }
  
  public EClass getSub() {
    return this.fSub;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Super".equals(parameterName) ) {
    	this.fSuper = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Sub".equals(parameterName) ) {
    	this.fSub = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSuper(final EClass pSuper) {
    this.fSuper = pSuper;
    
  }
  
  public void setSub(final EClass pSub) {
    this.fSub = pSub;
    
  }
  
  @Override
  public String patternName() {
    return "SuperTypeOf";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SuperTypeOfMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSuper, fSub};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Super\"=" + prettyPrintValue(fSuper) + ", ");
    result.append("\"Sub\"=" + prettyPrintValue(fSub));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSuper == null) ? 0 : fSuper.hashCode()); 
    result = prime * result + ((fSub == null) ? 0 : fSub.hashCode()); 
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
    if (!SuperTypeOfMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    SuperTypeOfMatch other = (SuperTypeOfMatch) obj;
    if (fSuper == null) {if (other.fSuper != null) return false;}
    else if (!fSuper.equals(other.fSuper)) return false;
    if (fSub == null) {if (other.fSub != null) return false;}
    else if (!fSub.equals(other.fSub)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SuperTypeOfMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
