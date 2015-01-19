package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.TeacherWithoutClassNamesQuerySpecification;

/**
 * Pattern-specific match representation of the school.teacherWithoutClassNames pattern,
 * to be used in conjunction with {@link TeacherWithoutClassNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeacherWithoutClassNamesMatcher
 * @see TeacherWithoutClassNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TeacherWithoutClassNamesMatch extends BasePatternMatch {
  private String fTNames;
  
  private static List<String> parameterNames = makeImmutableList("TNames");
  
  private TeacherWithoutClassNamesMatch(final String pTNames) {
    this.fTNames = pTNames;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TNames".equals(parameterName)) return this.fTNames;
    return null;
  }
  
  public String getTNames() {
    return this.fTNames;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TNames".equals(parameterName) ) {
    	this.fTNames = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTNames(final String pTNames) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTNames = pTNames;
  }
  
  @Override
  public String patternName() {
    return "school.teacherWithoutClassNames";
  }
  
  @Override
  public List<String> parameterNames() {
    return TeacherWithoutClassNamesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTNames};
  }
  
  @Override
  public TeacherWithoutClassNamesMatch toImmutable() {
    return isMutable() ? newMatch(fTNames) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TNames\"=" + prettyPrintValue(fTNames)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTNames == null) ? 0 : fTNames.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeacherWithoutClassNamesMatch)) { // this should be infrequent
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
    TeacherWithoutClassNamesMatch other = (TeacherWithoutClassNamesMatch) obj;
    if (fTNames == null) {if (other.fTNames != null) return false;}
    else if (!fTNames.equals(other.fTNames)) return false;
    return true;
  }
  
  @Override
  public TeacherWithoutClassNamesQuerySpecification specification() {
    try {
    	return TeacherWithoutClassNamesQuerySpecification.instance();
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
  public static TeacherWithoutClassNamesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TeacherWithoutClassNamesMatch newMutableMatch(final String pTNames) {
    return new Mutable(pTNames);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TeacherWithoutClassNamesMatch newMatch(final String pTNames) {
    return new Immutable(pTNames);
  }
  
  private static final class Mutable extends TeacherWithoutClassNamesMatch {
    Mutable(final String pTNames) {
      super(pTNames);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TeacherWithoutClassNamesMatch {
    Immutable(final String pTNames) {
      super(pTNames);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
