package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.SuperTypeOfNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName pattern,
 * to be used in conjunction with {@link SuperTypeOfNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SuperTypeOfNameMatcher
 * @see SuperTypeOfNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SuperTypeOfNameMatch extends BasePatternMatch {
  private String fSuperName;
  
  private String fSubName;
  
  private static List<String> parameterNames = makeImmutableList("SuperName", "SubName");
  
  private SuperTypeOfNameMatch(final String pSuperName, final String pSubName) {
    this.fSuperName = pSuperName;
    this.fSubName = pSubName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SuperName".equals(parameterName)) return this.fSuperName;
    if ("SubName".equals(parameterName)) return this.fSubName;
    return null;
  }
  
  public String getSuperName() {
    return this.fSuperName;
  }
  
  public String getSubName() {
    return this.fSubName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("SuperName".equals(parameterName) ) {
    	this.fSuperName = (String) newValue;
    	return true;
    }
    if ("SubName".equals(parameterName) ) {
    	this.fSubName = (String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSuperName(final String pSuperName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSuperName = pSuperName;
  }
  
  public void setSubName(final String pSubName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSubName = pSubName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOfName";
  }
  
  @Override
  public List<String> parameterNames() {
    return SuperTypeOfNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSuperName, fSubName};
  }
  
  @Override
  public SuperTypeOfNameMatch toImmutable() {
    return isMutable() ? newMatch(fSuperName, fSubName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SuperName\"=" + prettyPrintValue(fSuperName) + ", ");
    
    result.append("\"SubName\"=" + prettyPrintValue(fSubName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSuperName == null) ? 0 : fSuperName.hashCode());
    result = prime * result + ((fSubName == null) ? 0 : fSubName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SuperTypeOfNameMatch)) { // this should be infrequent
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
    SuperTypeOfNameMatch other = (SuperTypeOfNameMatch) obj;
    if (fSuperName == null) {if (other.fSuperName != null) return false;}
    else if (!fSuperName.equals(other.fSuperName)) return false;
    if (fSubName == null) {if (other.fSubName != null) return false;}
    else if (!fSubName.equals(other.fSubName)) return false;
    return true;
  }
  
  @Override
  public SuperTypeOfNameQuerySpecification specification() {
    try {
    	return SuperTypeOfNameQuerySpecification.instance();
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
  public static SuperTypeOfNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SuperTypeOfNameMatch newMutableMatch(final String pSuperName, final String pSubName) {
    return new Mutable(pSuperName, pSubName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSuperName the fixed value of pattern parameter SuperName, or null if not bound.
   * @param pSubName the fixed value of pattern parameter SubName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SuperTypeOfNameMatch newMatch(final String pSuperName, final String pSubName) {
    return new Immutable(pSuperName, pSubName);
  }
  
  private static final class Mutable extends SuperTypeOfNameMatch {
    Mutable(final String pSuperName, final String pSubName) {
      super(pSuperName, pSubName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SuperTypeOfNameMatch {
    Immutable(final String pSuperName, final String pSubName) {
      super(pSuperName, pSubName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
