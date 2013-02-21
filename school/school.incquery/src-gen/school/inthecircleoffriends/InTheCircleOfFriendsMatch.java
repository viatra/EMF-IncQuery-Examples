package school.inthecircleoffriends;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;

/**
 * Pattern-specific match representation of the school.inTheCircleOfFriends pattern, 
 * to be used in conjunction with {@link InTheCircleOfFriendsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InTheCircleOfFriendsMatcher
 * @see InTheCircleOfFriendsProcessor
 * 
 */
public abstract class InTheCircleOfFriendsMatch extends BasePatternMatch {
  private Student fS1;
  
  private Student fSomeone;
  
  private static String[] parameterNames = {"S1", "Someone"};
  
  private InTheCircleOfFriendsMatch(final Student pS1, final Student pSomeone) {
    this.fS1 = pS1;
    this.fSomeone = pSomeone;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S1".equals(parameterName)) return this.fS1;
    if ("Someone".equals(parameterName)) return this.fSomeone;
    return null;
    
  }
  
  public Student getS1() {
    return this.fS1;
    
  }
  
  public Student getSomeone() {
    return this.fSomeone;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S1".equals(parameterName) ) {
    	this.fS1 = (school.Student) newValue;
    	return true;
    }
    if ("Someone".equals(parameterName) ) {
    	this.fSomeone = (school.Student) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS1(final Student pS1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS1 = pS1;
    
  }
  
  public void setSomeone(final Student pSomeone) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSomeone = pSomeone;
    
  }
  
  @Override
  public String patternName() {
    return "school.inTheCircleOfFriends";
    
  }
  
  @Override
  public String[] parameterNames() {
    return InTheCircleOfFriendsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS1, fSomeone};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S1\"=" + prettyPrintValue(fS1) + ", ");
    result.append("\"Someone\"=" + prettyPrintValue(fSomeone));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS1 == null) ? 0 : fS1.hashCode()); 
    result = prime * result + ((fSomeone == null) ? 0 : fSomeone.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InTheCircleOfFriendsMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    InTheCircleOfFriendsMatch other = (InTheCircleOfFriendsMatch) obj;
    if (fS1 == null) {if (other.fS1 != null) return false;}
    else if (!fS1.equals(other.fS1)) return false;
    if (fSomeone == null) {if (other.fSomeone != null) return false;}
    else if (!fSomeone.equals(other.fSomeone)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return InTheCircleOfFriendsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends InTheCircleOfFriendsMatch {
    Mutable(final Student pS1, final Student pSomeone) {
      super(pS1, pSomeone);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends InTheCircleOfFriendsMatch {
    Immutable(final Student pS1, final Student pSomeone) {
      super(pS1, pSomeone);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
