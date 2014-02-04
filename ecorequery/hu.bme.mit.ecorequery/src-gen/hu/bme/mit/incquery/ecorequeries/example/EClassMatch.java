package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.EClassQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
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
@SuppressWarnings("all")
public abstract class EClassMatch extends BasePatternMatch {
  private EClass fEClass;
  
  private static List<String> parameterNames = makeImmutableList("EClass");
  
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
  public List<String> parameterNames() {
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
    if (!(obj instanceof EClassMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EClassMatch other = (EClassMatch) obj;
    if (fEClass == null) {if (other.fEClass != null) return false;}
    else if (!fEClass.equals(other.fEClass)) return false;
    return true;
  }
  
  @Override
  public EClassQuerySpecification specification() {
    try {
    	return EClassQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends EClassMatch {
    Mutable(final EClass pEClass) {
      super(pEClass);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
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
