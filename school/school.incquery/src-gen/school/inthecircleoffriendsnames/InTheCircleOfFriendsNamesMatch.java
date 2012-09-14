package school.inthecircleoffriendsnames;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the inTheCircleOfFriendsNames pattern, 
 * to be used in conjunction with InTheCircleOfFriendsNamesMatcher.
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
public final class InTheCircleOfFriendsNamesMatch extends BasePatternMatch {
  private Object fS1Name;
  
  private Object fSomeoneName;
  
  private static String[] parameterNames = {"S1Name", "SomeoneName"};
  
  InTheCircleOfFriendsNamesMatch(final Object pS1Name, final Object pSomeoneName) {
    this.fS1Name = pS1Name;
    this.fSomeoneName = pSomeoneName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S1Name".equals(parameterName)) return this.fS1Name;
    if ("SomeoneName".equals(parameterName)) return this.fSomeoneName;
    return null;
    
  }
  
  public Object getS1Name() {
    return this.fS1Name;
    
  }
  
  public Object getSomeoneName() {
    return this.fSomeoneName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("S1Name".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fS1Name = (java.lang.Object) newValue;
    	return true;
    }
    if ("SomeoneName".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSomeoneName = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS1Name(final Object pS1Name) {
    this.fS1Name = pS1Name;
    
  }
  
  public void setSomeoneName(final Object pSomeoneName) {
    this.fSomeoneName = pSomeoneName;
    
  }
  
  @Override
  public String patternName() {
    return "inTheCircleOfFriendsNames";
    
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!InTheCircleOfFriendsNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
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
    	return InTheCircleOfFriendsNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
