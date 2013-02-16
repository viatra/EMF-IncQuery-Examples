package school.classesofschool;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.classesOfSchool pattern, 
 * to be used in conjunction with ClassesOfSchoolMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfSchoolMatcher
 * @see ClassesOfSchoolProcessor
 * 
 */
public final class ClassesOfSchoolMatch extends BasePatternMatch {
  private Object fSC;
  
  private static String[] parameterNames = {"SC"};
  
  ClassesOfSchoolMatch(final Object pSC) {
    this.fSC = pSC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SC".equals(parameterName)) return this.fSC;
    return null;
    
  }
  
  public Object getSC() {
    return this.fSC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("SC".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSC = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSC(final Object pSC) {
    this.fSC = pSC;
    
  }
  
  @Override
  public String patternName() {
    return "school.classesOfSchool";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ClassesOfSchoolMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SC\"=" + prettyPrintValue(fSC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSC == null) ? 0 : fSC.hashCode()); 
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
    if (!ClassesOfSchoolMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    ClassesOfSchoolMatch other = (ClassesOfSchoolMatch) obj;
    if (fSC == null) {if (other.fSC != null) return false;}
    else if (!fSC.equals(other.fSC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ClassesOfSchoolMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
