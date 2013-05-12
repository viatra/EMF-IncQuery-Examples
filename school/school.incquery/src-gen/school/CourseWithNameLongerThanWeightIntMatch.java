package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.courseWithNameLongerThanWeightInt pattern, 
 * to be used in conjunction with {@link CourseWithNameLongerThanWeightIntMatcher}.
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
public abstract class CourseWithNameLongerThanWeightIntMatch extends BasePatternMatch {
  private Integer fW;
  
  private static List<String> parameterNames = makeImmutableList("W");
  
  private CourseWithNameLongerThanWeightIntMatch(final Integer pW) {
    this.fW = pW;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("W".equals(parameterName)) return this.fW;
    return null;
    
  }
  
  public Integer getW() {
    return this.fW;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("W".equals(parameterName) ) {
    	this.fW = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setW(final Integer pW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fW = pW;
    
  }
  
  @Override
  public String patternName() {
    return "school.courseWithNameLongerThanWeightInt";
    
  }
  
  @Override
  public List<String> parameterNames() {
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
    if (!(obj instanceof CourseWithNameLongerThanWeightIntMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CourseWithNameLongerThanWeightIntMatch other = (CourseWithNameLongerThanWeightIntMatch) obj;
    if (fW == null) {if (other.fW != null) return false;}
    else if (!fW.equals(other.fW)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CourseWithNameLongerThanWeightIntMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends CourseWithNameLongerThanWeightIntMatch {
    Mutable(final Integer pW) {
      super(pW);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends CourseWithNameLongerThanWeightIntMatch {
    Immutable(final Integer pW) {
      super(pW);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
