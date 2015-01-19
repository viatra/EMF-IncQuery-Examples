package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.School;
import school.Teacher;
import school.util.TeachersSchoolWithNameQuerySpecification;

/**
 * Pattern-specific match representation of the school.TeachersSchoolWithName pattern,
 * to be used in conjunction with {@link TeachersSchoolWithNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersSchoolWithNameMatcher
 * @see TeachersSchoolWithNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersSchoolWithNameMatch extends BasePatternMatch {
  private Teacher fTeacher;
  
  private School fSchool;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("teacher", "school", "name");
  
  private TeachersSchoolWithNameMatch(final Teacher pTeacher, final School pSchool, final String pName) {
    this.fTeacher = pTeacher;
    this.fSchool = pSchool;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("teacher".equals(parameterName)) return this.fTeacher;
    if ("school".equals(parameterName)) return this.fSchool;
    if ("name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public Teacher getTeacher() {
    return this.fTeacher;
  }
  
  public School getSchool() {
    return this.fSchool;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("teacher".equals(parameterName) ) {
    	this.fTeacher = (school.Teacher) newValue;
    	return true;
    }
    if ("school".equals(parameterName) ) {
    	this.fSchool = (school.School) newValue;
    	return true;
    }
    if ("name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTeacher(final Teacher pTeacher) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeacher = pTeacher;
  }
  
  public void setSchool(final School pSchool) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSchool = pSchool;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "school.TeachersSchoolWithName";
  }
  
  @Override
  public List<String> parameterNames() {
    return TeachersSchoolWithNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeacher, fSchool, fName};
  }
  
  @Override
  public TeachersSchoolWithNameMatch toImmutable() {
    return isMutable() ? newMatch(fTeacher, fSchool, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"teacher\"=" + prettyPrintValue(fTeacher) + ", ");
    
    result.append("\"school\"=" + prettyPrintValue(fSchool) + ", ");
    
    result.append("\"name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeacher == null) ? 0 : fTeacher.hashCode());
    result = prime * result + ((fSchool == null) ? 0 : fSchool.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeachersSchoolWithNameMatch)) { // this should be infrequent
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
    TeachersSchoolWithNameMatch other = (TeachersSchoolWithNameMatch) obj;
    if (fTeacher == null) {if (other.fTeacher != null) return false;}
    else if (!fTeacher.equals(other.fTeacher)) return false;
    if (fSchool == null) {if (other.fSchool != null) return false;}
    else if (!fSchool.equals(other.fSchool)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public TeachersSchoolWithNameQuerySpecification specification() {
    try {
    	return TeachersSchoolWithNameQuerySpecification.instance();
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
  public static TeachersSchoolWithNameMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @param pSchool the fixed value of pattern parameter school, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TeachersSchoolWithNameMatch newMutableMatch(final Teacher pTeacher, final School pSchool, final String pName) {
    return new Mutable(pTeacher, pSchool, pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @param pSchool the fixed value of pattern parameter school, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TeachersSchoolWithNameMatch newMatch(final Teacher pTeacher, final School pSchool, final String pName) {
    return new Immutable(pTeacher, pSchool, pName);
  }
  
  private static final class Mutable extends TeachersSchoolWithNameMatch {
    Mutable(final Teacher pTeacher, final School pSchool, final String pName) {
      super(pTeacher, pSchool, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TeachersSchoolWithNameMatch {
    Immutable(final Teacher pTeacher, final School pSchool, final String pName) {
      super(pTeacher, pSchool, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
