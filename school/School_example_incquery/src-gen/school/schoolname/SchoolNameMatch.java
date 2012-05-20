package school.schoolname;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the schoolName pattern, 
 * to be used in conjunction with SchoolNameMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolNameMatcher
 * @see SchoolNameProcessor
 * 
 */
public final class SchoolNameMatch extends BasePatternMatch implements IPatternMatch {
  private Object fS;
  
  private Object fName;
  
  private static String[] parameterNames = {"S", "Name"};
  
  public SchoolNameMatch(final Object pS, final Object pName) {
    this.fS = pS;
    this.fName = pName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("Name".equals(parameterName)) return this.fName;
    return null;
    
  }
  
  public Object getS() {
    return this.fS;
    
  }
  
  public Object getName() {
    return this.fName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("S".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fS = (java.lang.Object) newValue;
    	return true;
    }
    if ("Name".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fName = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final Object pS) {
    this.fS = pS;
    
  }
  
  public void setName(final Object pName) {
    this.fName = pName;
    
  }
  
  @Override
  public String patternName() {
    return "schoolName";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SchoolNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS, fName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    
    result.append("\"Name\"=" + prettyPrintValue(fName)
    );return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode()); 
    result = prime * result + ((fName == null) ? 0 : fName.hashCode()); 
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
    if (!SchoolNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				SchoolNameMatch other = (SchoolNameMatch) obj;
    				if (fS == null) {if (other.fS != null) return false;}
    				else if (!fS.equals(other.fS)) return false;
    				if (fName == null) {if (other.fName != null) return false;}
    				else if (!fName.equals(other.fName)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return SchoolNameMatcher.FACTORY.getPattern();
  }
}
