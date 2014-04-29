package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.SchoolClass;
import school.util.C_translatedQuerySpecification;

/**
 * Pattern-specific match representation of the school.C_translated pattern,
 * to be used in conjunction with {@link C_translatedMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see C_translatedMatcher
 * @see C_translatedProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class C_translatedMatch extends BasePatternMatch {
  private SchoolClass fSelf;
  
  private String fString_1;
  
  private static List<String> parameterNames = makeImmutableList("self", "string_1");
  
  private C_translatedMatch(final SchoolClass pSelf, final String pString_1) {
    this.fSelf = pSelf;
    this.fString_1 = pString_1;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("self".equals(parameterName)) return this.fSelf;
    if ("string_1".equals(parameterName)) return this.fString_1;
    return null;
    
  }
  
  public SchoolClass getSelf() {
    return this.fSelf;
    
  }
  
  public String getString_1() {
    return this.fString_1;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("self".equals(parameterName) ) {
    	this.fSelf = (school.SchoolClass) newValue;
    	return true;
    }
    if ("string_1".equals(parameterName) ) {
    	this.fString_1 = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSelf(final SchoolClass pSelf) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSelf = pSelf;
    
  }
  
  public void setString_1(final String pString_1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fString_1 = pString_1;
    
  }
  
  @Override
  public String patternName() {
    return "school.C_translated";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return C_translatedMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSelf, fString_1};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"self\"=" + prettyPrintValue(fSelf) + ", ");
    result.append("\"string_1\"=" + prettyPrintValue(fString_1));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSelf == null) ? 0 : fSelf.hashCode());
    result = prime * result + ((fString_1 == null) ? 0 : fString_1.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof C_translatedMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    C_translatedMatch other = (C_translatedMatch) obj;
    if (fSelf == null) {if (other.fSelf != null) return false;}
    else if (!fSelf.equals(other.fSelf)) return false;
    if (fString_1 == null) {if (other.fString_1 != null) return false;}
    else if (!fString_1.equals(other.fString_1)) return false;
    return true;
  }
  
  @Override
  public C_translatedQuerySpecification specification() {
    try {
    	return C_translatedQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends C_translatedMatch {
    Mutable(final SchoolClass pSelf, final String pString_1) {
      super(pSelf, pString_1);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends C_translatedMatch {
    Immutable(final SchoolClass pSelf, final String pString_1) {
      super(pSelf, pString_1);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
