package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.IsEStringQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.IsEString pattern,
 * to be used in conjunction with {@link IsEStringMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IsEStringMatcher
 * @see IsEStringProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class IsEStringMatch extends BasePatternMatch {
  private EClassifier fElement;
  
  private static List<String> parameterNames = makeImmutableList("Element");
  
  private IsEStringMatch(final EClassifier pElement) {
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Element".equals(parameterName) ) {
    	this.fElement = (org.eclipse.emf.ecore.EClassifier) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setElement(final EClassifier pElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fElement = pElement;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.IsEString";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return IsEStringMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElement};
    
  }
  
  @Override
  public IsEStringMatch toImmutable() {
    return isMutable() ? newMatch(fElement) : this;
    
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
    if (!(obj instanceof IsEStringMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    IsEStringMatch other = (IsEStringMatch) obj;
    if (fElement == null) {if (other.fElement != null) return false;}
    else if (!fElement.equals(other.fElement)) return false;
    return true;
  }
  
  @Override
  public IsEStringQuerySpecification specification() {
    try {
    	return IsEStringQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static IsEStringMatch newEmptyMatch() {
    return new Mutable(null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static IsEStringMatch newMutableMatch(final EClassifier pElement) {
    return new Mutable(pElement);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static IsEStringMatch newMatch(final EClassifier pElement) {
    return new Immutable(pElement);
    
  }
  
  private static final class Mutable extends IsEStringMatch {
    Mutable(final EClassifier pElement) {
      super(pElement);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends IsEStringMatch {
    Immutable(final EClassifier pElement) {
      super(pElement);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
