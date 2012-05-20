package lastyear;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the lastYear pattern, 
 * to be used in conjunction with LastYearMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see LastYearMatcher
 * @see LastYearProcessor
 * 
 */
public final class LastYearMatch extends BasePatternMatch implements IPatternMatch {
  private Object fSchool;
  
  private Object fYear;
  
  private static String[] parameterNames = {"School", "Year"};
  
  public LastYearMatch(final Object pSchool, final Object pYear) {
    this.fSchool = pSchool;
    this.fYear = pYear;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("School".equals(parameterName)) return this.fSchool;
    if ("Year".equals(parameterName)) return this.fYear;
    return null;
    
  }
  
  public Object getSchool() {
    return this.fSchool;
    
  }
  
  public Object getYear() {
    return this.fYear;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("School".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSchool = (java.lang.Object) newValue;
    	return true;
    }
    if ("Year".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fYear = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSchool(final Object pSchool) {
    this.fSchool = pSchool;
    
  }
  
  public void setYear(final Object pYear) {
    this.fYear = pYear;
    
  }
  
  @Override
  public String patternName() {
    return "lastYear";
    
  }
  
  @Override
  public String[] parameterNames() {
    return LastYearMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSchool, fYear};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"School\"=" + prettyPrintValue(fSchool) + ", ");
    
    result.append("\"Year\"=" + prettyPrintValue(fYear)
    );return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSchool == null) ? 0 : fSchool.hashCode()); 
    result = prime * result + ((fYear == null) ? 0 : fYear.hashCode()); 
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
    if (!LastYearMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				LastYearMatch other = (LastYearMatch) obj;
    				if (fSchool == null) {if (other.fSchool != null) return false;}
    				else if (!fSchool.equals(other.fSchool)) return false;
    				if (fYear == null) {if (other.fYear != null) return false;}
    				else if (!fYear.equals(other.fYear)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return LastYearMatcher.FACTORY.getPattern();
  }
}
