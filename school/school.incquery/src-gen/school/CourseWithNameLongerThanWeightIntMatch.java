package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.CourseWithNameLongerThanWeightIntQuerySpecification;

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
@SuppressWarnings("all")
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
  public CourseWithNameLongerThanWeightIntMatch toImmutable() {
    return isMutable() ? newMatch(fW) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"W\"=" + prettyPrintValue(fW)
    );
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
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CourseWithNameLongerThanWeightIntMatch other = (CourseWithNameLongerThanWeightIntMatch) obj;
    if (fW == null) {if (other.fW != null) return false;}
    else if (!fW.equals(other.fW)) return false;
    return true;
  }
  
  @Override
  public CourseWithNameLongerThanWeightIntQuerySpecification specification() {
    try {
    	return CourseWithNameLongerThanWeightIntQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static CourseWithNameLongerThanWeightIntMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pW the fixed value of pattern parameter W, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CourseWithNameLongerThanWeightIntMatch newMutableMatch(final Integer pW) {
    return new Mutable(pW);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pW the fixed value of pattern parameter W, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CourseWithNameLongerThanWeightIntMatch newMatch(final Integer pW) {
    return new Immutable(pW);
  }
  
  private static final class Mutable extends CourseWithNameLongerThanWeightIntMatch {
    Mutable(final Integer pW) {
      super(pW);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CourseWithNameLongerThanWeightIntMatch {
    Immutable(final Integer pW) {
      super(pW);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
