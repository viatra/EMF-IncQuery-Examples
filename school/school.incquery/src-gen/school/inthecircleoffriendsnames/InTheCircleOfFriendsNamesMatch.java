package school.inthecircleoffriendsnames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.inTheCircleOfFriendsNames pattern, 
 * to be used in conjunction with {@link InTheCircleOfFriendsNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see InTheCircleOfFriendsNamesMatcher
 * @see InTheCircleOfFriendsNamesProcessor
 * 
 */
public abstract class InTheCircleOfFriendsNamesMatch extends BasePatternMatch {
  private String fS1Name;
  
  private String fSomeoneName;
  
  private static String[] parameterNames = {"S1Name", "SomeoneName"};
  
  private InTheCircleOfFriendsNamesMatch(final String pS1Name, final String pSomeoneName) {
    this.fS1Name = pS1Name;
    this.fSomeoneName = pSomeoneName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S1Name".equals(parameterName)) return this.fS1Name;
    if ("SomeoneName".equals(parameterName)) return this.fSomeoneName;
    return null;
    
  }
  
  public String getS1Name() {
    return this.fS1Name;
    
  }
  
  public String getSomeoneName() {
    return this.fSomeoneName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S1Name".equals(parameterName) ) {
    	this.fS1Name = (java.lang.String) newValue;
    	return true;
    }
    if ("SomeoneName".equals(parameterName) ) {
    	this.fSomeoneName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS1Name(final String pS1Name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS1Name = pS1Name;
    
  }
  
  public void setSomeoneName(final String pSomeoneName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSomeoneName = pSomeoneName;
    
  }
  
  @Override
  public String patternName() {
    return "school.inTheCircleOfFriendsNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return InTheCircleOfFriendsNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS1Name, fSomeoneName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S1Name\"=" + prettyPrintValue(fS1Name) + ", ");
    result.append("\"SomeoneName\"=" + prettyPrintValue(fSomeoneName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS1Name == null) ? 0 : fS1Name.hashCode()); 
    result = prime * result + ((fSomeoneName == null) ? 0 : fSomeoneName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof InTheCircleOfFriendsNamesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    InTheCircleOfFriendsNamesMatch other = (InTheCircleOfFriendsNamesMatch) obj;
    if (fS1Name == null) {if (other.fS1Name != null) return false;}
    else if (!fS1Name.equals(other.fS1Name)) return false;
    if (fSomeoneName == null) {if (other.fSomeoneName != null) return false;}
    else if (!fSomeoneName.equals(other.fSomeoneName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return InTheCircleOfFriendsNamesMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends InTheCircleOfFriendsNamesMatch {
    Mutable(final String pS1Name, final String pSomeoneName) {
      super(pS1Name, pSomeoneName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends InTheCircleOfFriendsNamesMatch {
    Immutable(final String pS1Name, final String pSomeoneName) {
      super(pS1Name, pSomeoneName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
