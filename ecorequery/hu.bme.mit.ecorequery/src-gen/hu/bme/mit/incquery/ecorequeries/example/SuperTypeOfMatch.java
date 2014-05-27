package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.SuperTypeOfQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf pattern,
 * to be used in conjunction with {@link SuperTypeOfMatcher}.
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
@SuppressWarnings("all")
public abstract class SuperTypeOfMatch extends BasePatternMatch {
  private EClass fSuper;
  
  private EClass fSub;
  
  private static List<String> parameterNames = makeImmutableList("Super", "Sub");
  
  private SuperTypeOfMatch(final EClass pSuper, final EClass pSub) {
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
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
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSuper = pSuper;
    
  }
  
  public void setSub(final EClass pSub) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSub = pSub;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SuperTypeOfMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSuper, fSub};
    
  }
  
  @Override
  public SuperTypeOfMatch toImmutable() {
    return isMutable() ? newMatch(fSuper, fSub) : this;
    
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
    if (!(obj instanceof SuperTypeOfMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SuperTypeOfMatch other = (SuperTypeOfMatch) obj;
    if (fSuper == null) {if (other.fSuper != null) return false;}
    else if (!fSuper.equals(other.fSuper)) return false;
    if (fSub == null) {if (other.fSub != null) return false;}
    else if (!fSub.equals(other.fSub)) return false;
    return true;
  }
  
  @Override
  public SuperTypeOfQuerySpecification specification() {
    try {
    	return SuperTypeOfQuerySpecification.instance();
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
  public static SuperTypeOfMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SuperTypeOfMatch newMutableMatch(final EClass pSuper, final EClass pSub) {
    return new Mutable(pSuper, pSub);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSuper the fixed value of pattern parameter Super, or null if not bound.
   * @param pSub the fixed value of pattern parameter Sub, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SuperTypeOfMatch newMatch(final EClass pSuper, final EClass pSub) {
    return new Immutable(pSuper, pSub);
    
  }
  
  @SuppressWarnings("all")
  private static final class Mutable extends SuperTypeOfMatch {
    Mutable(final EClass pSuper, final EClass pSub) {
      super(pSuper, pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  private static final class Immutable extends SuperTypeOfMatch {
    Immutable(final EClass pSuper, final EClass pSub) {
      super(pSuper, pSub);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
