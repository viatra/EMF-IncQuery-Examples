package eclassnames;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the EClassNames pattern, 
 * to be used in conjunction with EClassNamesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassNamesMatcher
 * @see EClassNamesProcessor
 * 
 */
public final class EClassNamesMatch extends BasePatternMatch implements IPatternMatch {
  private EClass fC;
  
  private String fN;
  
  private static String[] parameterNames = {"C", "N"};
  
  public EClassNamesMatch(final EClass pC, final String pN) {
    this.fC = pC;
    this.fN = pN;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("C".equals(parameterName)) return this.fC;
    if ("N".equals(parameterName)) return this.fN;
    return null;
    
  }
  
  public EClass getC() {
    return this.fC;
    
  }
  
  public String getN() {
    return this.fN;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("C".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EClass) {
    	this.fC = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("N".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fN = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setC(final EClass pC) {
    this.fC = pC;
    
  }
  
  public void setN(final String pN) {
    this.fN = pN;
    
  }
  
  @Override
  public String patternName() {
    return "EClassNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EClassNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC, fN};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"C\"=" + prettyPrintValue(fC) + "\n");
    result.append("\"N\"=" + prettyPrintValue(fN) + "\n");
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
    result = prime * result + ((fN == null) ? 0 : fN.hashCode()); 
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
    if (!EClassNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				EClassNamesMatch other = (EClassNamesMatch) obj;
    				if (fC == null) {if (other.fC != null) return false;}
    				else if (!fC.equals(other.fC)) return false;
    				if (fN == null) {if (other.fN != null) return false;}
    				else if (!fN.equals(other.fN)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return EClassNamesMatcher.FACTORY.getPattern();
  }
}
