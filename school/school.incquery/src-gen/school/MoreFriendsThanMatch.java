package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;
import school.util.MoreFriendsThanQuerySpecification;

/**
 * Pattern-specific match representation of the school.moreFriendsThan pattern,
 * to be used in conjunction with {@link MoreFriendsThanMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MoreFriendsThanMatcher
 * @see MoreFriendsThanProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MoreFriendsThanMatch extends BasePatternMatch {
  private Student fS1;
  
  private Student fS2;
  
  private static List<String> parameterNames = makeImmutableList("S1", "S2");
  
  private MoreFriendsThanMatch(final Student pS1, final Student pS2) {
    this.fS1 = pS1;
    this.fS2 = pS2;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S1".equals(parameterName)) return this.fS1;
    if ("S2".equals(parameterName)) return this.fS2;
    return null;
    
  }
  
  public Student getS1() {
    return this.fS1;
    
  }
  
  public Student getS2() {
    return this.fS2;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S1".equals(parameterName) ) {
    	this.fS1 = (school.Student) newValue;
    	return true;
    }
    if ("S2".equals(parameterName) ) {
    	this.fS2 = (school.Student) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS1(final Student pS1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS1 = pS1;
    
  }
  
  public void setS2(final Student pS2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS2 = pS2;
    
  }
  
  @Override
  public String patternName() {
    return "school.moreFriendsThan";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return MoreFriendsThanMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS1, fS2};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S1\"=" + prettyPrintValue(fS1) + ", ");
    result.append("\"S2\"=" + prettyPrintValue(fS2));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS1 == null) ? 0 : fS1.hashCode());
    result = prime * result + ((fS2 == null) ? 0 : fS2.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MoreFriendsThanMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    MoreFriendsThanMatch other = (MoreFriendsThanMatch) obj;
    if (fS1 == null) {if (other.fS1 != null) return false;}
    else if (!fS1.equals(other.fS1)) return false;
    if (fS2 == null) {if (other.fS2 != null) return false;}
    else if (!fS2.equals(other.fS2)) return false;
    return true;
  }
  
  @Override
  public MoreFriendsThanQuerySpecification specification() {
    try {
    	return MoreFriendsThanQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends MoreFriendsThanMatch {
    Mutable(final Student pS1, final Student pS2) {
      super(pS1, pS2);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends MoreFriendsThanMatch {
    Immutable(final Student pS1, final Student pS2) {
      super(pS1, pS2);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
