package school.coursewithprimeweight;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.Course;

/**
 * Pattern-specific match representation of the courseWithPrimeWeight pattern, 
 * to be used in conjunction with CourseWithPrimeWeightMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CourseWithPrimeWeightMatcher
 * @see CourseWithPrimeWeightProcessor
 * 
 */
public final class CourseWithPrimeWeightMatch extends BasePatternMatch implements IPatternMatch {
  private Course fC;
  
  private static String[] parameterNames = {"C"};
  
  CourseWithPrimeWeightMatch(final Course pC) {
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("C".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public Course getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("C".equals(parameterName) && newValue instanceof school.Course) {
    	this.fC = (school.Course) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setC(final Course pC) {
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "courseWithPrimeWeight";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CourseWithPrimeWeightMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"C\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
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
    if (!CourseWithPrimeWeightMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    CourseWithPrimeWeightMatch other = (CourseWithPrimeWeightMatch) obj;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CourseWithPrimeWeightMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
