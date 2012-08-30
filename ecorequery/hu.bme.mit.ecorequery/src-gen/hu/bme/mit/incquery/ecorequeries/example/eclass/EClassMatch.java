package hu.bme.mit.incquery.ecorequeries.example.eclass;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the EClass pattern, 
 * to be used in conjunction with EClassMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassMatcher
 * @see EClassProcessor
 * 
 */
public final class EClassMatch extends BasePatternMatch implements IPatternMatch {
  private EClass fEClass;
  
  private static String[] parameterNames = {"EClass"};
  
  EClassMatch(final EClass pEClass) {
    this.fEClass = pEClass;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("EClass".equals(parameterName)) return this.fEClass;
    return null;
    
  }
  
  public EClass getEClass() {
    return this.fEClass;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("EClass".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EClass) {
    	this.fEClass = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setEClass(final EClass pEClass) {
    this.fEClass = pEClass;
    
  }
  
  @Override
  public String patternName() {
    return "EClass";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EClassMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEClass};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"EClass\"=" + prettyPrintValue(fEClass));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEClass == null) ? 0 : fEClass.hashCode()); 
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
    if (!EClassMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EClassMatch other = (EClassMatch) obj;
    if (fEClass == null) {if (other.fEClass != null) return false;}
    else if (!fEClass.equals(other.fEClass)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EClassMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
