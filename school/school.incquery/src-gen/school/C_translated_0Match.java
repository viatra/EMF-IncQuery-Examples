package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;
import school.util.C_translated_0QuerySpecification;

/**
 * Pattern-specific match representation of the school.C_translated_0 pattern,
 * to be used in conjunction with {@link C_translated_0Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see C_translated_0Matcher
 * @see C_translated_0Processor
 * 
 */
@SuppressWarnings("all")
public abstract class C_translated_0Match extends BasePatternMatch {
  private Student fTemp1;
  
  private String fString_1;
  
  private static List<String> parameterNames = makeImmutableList("temp1", "string_1");
  
  private C_translated_0Match(final Student pTemp1, final String pString_1) {
    this.fTemp1 = pTemp1;
    this.fString_1 = pString_1;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("temp1".equals(parameterName)) return this.fTemp1;
    if ("string_1".equals(parameterName)) return this.fString_1;
    return null;
    
  }
  
  public Student getTemp1() {
    return this.fTemp1;
    
  }
  
  public String getString_1() {
    return this.fString_1;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("temp1".equals(parameterName) ) {
    	this.fTemp1 = (school.Student) newValue;
    	return true;
    }
    if ("string_1".equals(parameterName) ) {
    	this.fString_1 = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTemp1(final Student pTemp1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTemp1 = pTemp1;
    
  }
  
  public void setString_1(final String pString_1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fString_1 = pString_1;
    
  }
  
  @Override
  public String patternName() {
    return "school.C_translated_0";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return C_translated_0Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTemp1, fString_1};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"temp1\"=" + prettyPrintValue(fTemp1) + ", ");
    result.append("\"string_1\"=" + prettyPrintValue(fString_1));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTemp1 == null) ? 0 : fTemp1.hashCode());
    result = prime * result + ((fString_1 == null) ? 0 : fString_1.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof C_translated_0Match)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    C_translated_0Match other = (C_translated_0Match) obj;
    if (fTemp1 == null) {if (other.fTemp1 != null) return false;}
    else if (!fTemp1.equals(other.fTemp1)) return false;
    if (fString_1 == null) {if (other.fString_1 != null) return false;}
    else if (!fString_1.equals(other.fString_1)) return false;
    return true;
  }
  
  @Override
  public C_translated_0QuerySpecification specification() {
    try {
    	return C_translated_0QuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends C_translated_0Match {
    Mutable(final Student pTemp1, final String pString_1) {
      super(pTemp1, pString_1);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends C_translated_0Match {
    Immutable(final Student pTemp1, final String pString_1) {
      super(pTemp1, pString_1);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
