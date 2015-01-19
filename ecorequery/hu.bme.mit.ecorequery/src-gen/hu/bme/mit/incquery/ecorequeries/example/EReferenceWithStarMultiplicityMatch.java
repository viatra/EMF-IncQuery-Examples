package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.EReferenceWithStarMultiplicityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity pattern,
 * to be used in conjunction with {@link EReferenceWithStarMultiplicityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EReferenceWithStarMultiplicityMatcher
 * @see EReferenceWithStarMultiplicityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EReferenceWithStarMultiplicityMatch extends BasePatternMatch {
  private EReference fERef;
  
  private static List<String> parameterNames = makeImmutableList("ERef");
  
  private EReferenceWithStarMultiplicityMatch(final EReference pERef) {
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ERef".equals(parameterName) ) {
    	this.fERef = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    return false;
  }
  
  public void setERef(final EReference pERef) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fERef = pERef;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity";
  }
  
  @Override
  public List<String> parameterNames() {
    return EReferenceWithStarMultiplicityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fERef};
  }
  
  @Override
  public EReferenceWithStarMultiplicityMatch toImmutable() {
    return isMutable() ? newMatch(fERef) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ERef\"=" + prettyPrintValue(fERef)
    );
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
    if (!(obj instanceof EReferenceWithStarMultiplicityMatch)) { // this should be infrequent
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
    EReferenceWithStarMultiplicityMatch other = (EReferenceWithStarMultiplicityMatch) obj;
    if (fERef == null) {if (other.fERef != null) return false;}
    else if (!fERef.equals(other.fERef)) return false;
    return true;
  }
  
  @Override
  public EReferenceWithStarMultiplicityQuerySpecification specification() {
    try {
    	return EReferenceWithStarMultiplicityQuerySpecification.instance();
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
  public static EReferenceWithStarMultiplicityMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EReferenceWithStarMultiplicityMatch newMutableMatch(final EReference pERef) {
    return new Mutable(pERef);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pERef the fixed value of pattern parameter ERef, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EReferenceWithStarMultiplicityMatch newMatch(final EReference pERef) {
    return new Immutable(pERef);
  }
  
  private static final class Mutable extends EReferenceWithStarMultiplicityMatch {
    Mutable(final EReference pERef) {
      super(pERef);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EReferenceWithStarMultiplicityMatch {
    Immutable(final EReference pERef) {
      super(pERef);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
