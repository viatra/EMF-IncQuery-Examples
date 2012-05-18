package school.school;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the school pattern, 
 * to be used in conjunction with SchoolMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolMatcher
 * @see SchoolProcessor
 * 
 */
public final class SchoolMatch extends BasePatternMatch implements IPatternMatch {
  private Object fS;
  
  private static String[] parameterNames = {"S"};
  
  public SchoolMatch(final Object pS) {
    this.fS = pS;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    return null;
    
  }
  
  public Object getS() {
    return this.fS;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("S".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fS = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final Object pS) {
    this.fS = pS;
    
  }
  
  @Override
  public String patternName() {
    return "school";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SchoolMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode()); 
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
    if (!SchoolMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				SchoolMatch other = (SchoolMatch) obj;
    				if (fS == null) {if (other.fS != null) return false;}
    				else if (!fS.equals(other.fS)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return SchoolMatcher.FACTORY.getPattern();
  }
}
