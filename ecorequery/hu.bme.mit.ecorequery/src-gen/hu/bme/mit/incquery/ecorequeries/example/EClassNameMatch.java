package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.EClassNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EClassName pattern,
 * to be used in conjunction with {@link EClassNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassNameMatcher
 * @see EClassNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EClassNameMatch extends BasePatternMatch {
  private String fEName;
  
  private static List<String> parameterNames = makeImmutableList("EName");
  
  private EClassNameMatch(final String pEName) {
    this.fEName = pEName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("EName".equals(parameterName)) return this.fEName;
    return null;
    
  }
  
  public String getEName() {
    return this.fEName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("EName".equals(parameterName) ) {
    	this.fEName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setEName(final String pEName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEName = pEName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassName";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return EClassNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEName};
    
  }
  
  @Override
  public EClassNameMatch toImmutable() {
    return isMutable() ? newMatch(fEName) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"EName\"=" + prettyPrintValue(fEName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEName == null) ? 0 : fEName.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EClassNameMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EClassNameMatch other = (EClassNameMatch) obj;
    if (fEName == null) {if (other.fEName != null) return false;}
    else if (!fEName.equals(other.fEName)) return false;
    return true;
  }
  
  @Override
  public EClassNameQuerySpecification specification() {
    try {
    	return EClassNameQuerySpecification.instance();
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
  public static EClassNameMatch newEmptyMatch() {
    return new Mutable(null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EClassNameMatch newMutableMatch(final String pEName) {
    return new Mutable(pEName);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEName the fixed value of pattern parameter EName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EClassNameMatch newMatch(final String pEName) {
    return new Immutable(pEName);
    
  }
  
  private static final class Mutable extends EClassNameMatch {
    Mutable(final String pEName) {
      super(pEName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EClassNameMatch {
    Immutable(final String pEName) {
      super(pEName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
