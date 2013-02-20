package hu.bme.mit.incquery.ecorequeries.example.eclass;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EClass pattern, 
 * to be used in conjunction with {@link EClassMatcher}.
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
public abstract class EClassMatch extends BasePatternMatch {
  private EClass fEClass;
  
  private static String[] parameterNames = {"EClass"};
  
  private EClassMatch(final EClass pEClass) {
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("EClass".equals(parameterName) ) {
    	this.fEClass = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setEClass(final EClass pEClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEClass = pEClass;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClass";
    
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
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends EClassMatch {
    Mutable(final EClass pEClass) {
      super(pEClass);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends EClassMatch {
    Immutable(final EClass pEClass) {
      super(pEClass);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
