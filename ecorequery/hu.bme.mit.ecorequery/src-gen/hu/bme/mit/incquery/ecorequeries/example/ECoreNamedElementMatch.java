package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.ECoreNamedElementQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement pattern,
 * to be used in conjunction with {@link ECoreNamedElementMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ECoreNamedElementMatcher
 * @see ECoreNamedElementProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ECoreNamedElementMatch extends BasePatternMatch {
  private ENamedElement fElement;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("Element", "Name");
  
  private ECoreNamedElementMatch(final ENamedElement pElement, final String pName) {
    this.fElement = pElement;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Element".equals(parameterName)) return this.fElement;
    if ("Name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public ENamedElement getElement() {
    return this.fElement;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Element".equals(parameterName) ) {
    	this.fElement = (ENamedElement) newValue;
    	return true;
    }
    if ("Name".equals(parameterName) ) {
    	this.fName = (String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setElement(final ENamedElement pElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fElement = pElement;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement";
  }
  
  @Override
  public List<String> parameterNames() {
    return ECoreNamedElementMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElement, fName};
  }
  
  @Override
  public ECoreNamedElementMatch toImmutable() {
    return isMutable() ? newMatch(fElement, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
    
    result.append("\"Name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fElement == null) ? 0 : fElement.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ECoreNamedElementMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ECoreNamedElementMatch other = (ECoreNamedElementMatch) obj;
    if (fElement == null) {if (other.fElement != null) return false;}
    else if (!fElement.equals(other.fElement)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public ECoreNamedElementQuerySpecification specification() {
    try {
    	return ECoreNamedElementQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static ECoreNamedElementMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ECoreNamedElementMatch newMutableMatch(final ENamedElement pElement, final String pName) {
    return new Mutable(pElement, pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pElement the fixed value of pattern parameter Element, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ECoreNamedElementMatch newMatch(final ENamedElement pElement, final String pName) {
    return new Immutable(pElement, pName);
  }
  
  private static final class Mutable extends ECoreNamedElementMatch {
    Mutable(final ENamedElement pElement, final String pName) {
      super(pElement, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ECoreNamedElementMatch {
    Immutable(final ENamedElement pElement, final String pName) {
      super(pElement, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
