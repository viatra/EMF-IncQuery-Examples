package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;
import school.util.AlphabeticallyAfterFriendQuerySpecification;

/**
 * Pattern-specific match representation of the school.alphabeticallyAfterFriend pattern,
 * to be used in conjunction with {@link AlphabeticallyAfterFriendMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AlphabeticallyAfterFriendMatcher
 * @see AlphabeticallyAfterFriendProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AlphabeticallyAfterFriendMatch extends BasePatternMatch {
  private Student fS1;
  
  private Student fS2;
  
  private static List<String> parameterNames = makeImmutableList("S1", "S2");
  
  private AlphabeticallyAfterFriendMatch(final Student pS1, final Student pS2) {
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
    return "school.alphabeticallyAfterFriend";
  }
  
  @Override
  public List<String> parameterNames() {
    return AlphabeticallyAfterFriendMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS1, fS2};
  }
  
  @Override
  public AlphabeticallyAfterFriendMatch toImmutable() {
    return isMutable() ? newMatch(fS1, fS2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S1\"=" + prettyPrintValue(fS1) + ", ");
    
    result.append("\"S2\"=" + prettyPrintValue(fS2)
    );
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
    if (!(obj instanceof AlphabeticallyAfterFriendMatch)) { // this should be infrequent
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
    AlphabeticallyAfterFriendMatch other = (AlphabeticallyAfterFriendMatch) obj;
    if (fS1 == null) {if (other.fS1 != null) return false;}
    else if (!fS1.equals(other.fS1)) return false;
    if (fS2 == null) {if (other.fS2 != null) return false;}
    else if (!fS2.equals(other.fS2)) return false;
    return true;
  }
  
  @Override
  public AlphabeticallyAfterFriendQuerySpecification specification() {
    try {
    	return AlphabeticallyAfterFriendQuerySpecification.instance();
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
  public static AlphabeticallyAfterFriendMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AlphabeticallyAfterFriendMatch newMutableMatch(final Student pS1, final Student pS2) {
    return new Mutable(pS1, pS2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AlphabeticallyAfterFriendMatch newMatch(final Student pS1, final Student pS2) {
    return new Immutable(pS1, pS2);
  }
  
  private static final class Mutable extends AlphabeticallyAfterFriendMatch {
    Mutable(final Student pS1, final Student pS2) {
      super(pS1, pS2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AlphabeticallyAfterFriendMatch {
    Immutable(final Student pS1, final Student pS2) {
      super(pS1, pS2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
