package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;
import school.util.A_translated_0QuerySpecification;

/**
 * Pattern-specific match representation of the school.A_translated_0 pattern,
 * to be used in conjunction with {@link A_translated_0Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see A_translated_0Matcher
 * @see A_translated_0Processor
 * 
 */
@SuppressWarnings("all")
public abstract class A_translated_0Match extends BasePatternMatch {
  private Student fS2;
  
  private Student fS1;
  
  private static List<String> parameterNames = makeImmutableList("s2", "s1");
  
  private A_translated_0Match(final Student pS2, final Student pS1) {
    this.fS2 = pS2;
    this.fS1 = pS1;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("s2".equals(parameterName)) return this.fS2;
    if ("s1".equals(parameterName)) return this.fS1;
    return null;
    
  }
  
  public Student getS2() {
    return this.fS2;
    
  }
  
  public Student getS1() {
    return this.fS1;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("s2".equals(parameterName) ) {
    	this.fS2 = (school.Student) newValue;
    	return true;
    }
    if ("s1".equals(parameterName) ) {
    	this.fS1 = (school.Student) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS2(final Student pS2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS2 = pS2;
    
  }
  
  public void setS1(final Student pS1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS1 = pS1;
    
  }
  
  @Override
  public String patternName() {
    return "school.A_translated_0";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return A_translated_0Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS2, fS1};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"s2\"=" + prettyPrintValue(fS2) + ", ");
    result.append("\"s1\"=" + prettyPrintValue(fS1));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS2 == null) ? 0 : fS2.hashCode());
    result = prime * result + ((fS1 == null) ? 0 : fS1.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof A_translated_0Match)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    A_translated_0Match other = (A_translated_0Match) obj;
    if (fS2 == null) {if (other.fS2 != null) return false;}
    else if (!fS2.equals(other.fS2)) return false;
    if (fS1 == null) {if (other.fS1 != null) return false;}
    else if (!fS1.equals(other.fS1)) return false;
    return true;
  }
  
  @Override
  public A_translated_0QuerySpecification specification() {
    try {
    	return A_translated_0QuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends A_translated_0Match {
    Mutable(final Student pS2, final Student pS1) {
      super(pS2, pS1);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends A_translated_0Match {
    Immutable(final Student pS2, final Student pS1) {
      super(pS2, pS1);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
