package school.coursewithnamelongerthanweightint;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the courseWithNameLongerThanWeightInt pattern, 
 * to be used in conjunction with CourseWithNameLongerThanWeightIntMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CourseWithNameLongerThanWeightIntMatcher
 * @see CourseWithNameLongerThanWeightIntProcessor
 * 
 */
public final class CourseWithNameLongerThanWeightIntMatch extends BasePatternMatch {
  private Object fW;
  
  private static String[] parameterNames = {"W"};
  
  CourseWithNameLongerThanWeightIntMatch(final Object pW) {
    this.fW = pW;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("W".equals(parameterName)) return this.fW;
    return null;
    
  }
  
  public Object getW() {
    return this.fW;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("W".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fW = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setW(final Object pW) {
    this.fW = pW;
    
  }
  
  @Override
  public String patternName() {
    return "courseWithNameLongerThanWeightInt";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CourseWithNameLongerThanWeightIntMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fW};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"W\"=" + prettyPrintValue(fW));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fW == null) ? 0 : fW.hashCode()); 
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
    if (!CourseWithNameLongerThanWeightIntMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    CourseWithNameLongerThanWeightIntMatch other = (CourseWithNameLongerThanWeightIntMatch) obj;
    if (fW == null) {if (other.fW != null) return false;}
    else if (!fW.equals(other.fW)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CourseWithNameLongerThanWeightIntMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
