package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.TeachersOfSchoolNamesQuerySpecification;

/**
 * Pattern-specific match representation of the school.teachersOfSchoolNames pattern,
 * to be used in conjunction with {@link TeachersOfSchoolNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersOfSchoolNamesMatcher
 * @see TeachersOfSchoolNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TeachersOfSchoolNamesMatch extends BasePatternMatch {
  private String fTName;
  
  private String fSName;
  
  private static List<String> parameterNames = makeImmutableList("TName", "SName");
  
  private TeachersOfSchoolNamesMatch(final String pTName, final String pSName) {
    this.fTName = pTName;
    this.fSName = pSName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TName".equals(parameterName)) return this.fTName;
    if ("SName".equals(parameterName)) return this.fSName;
    return null;
  }
  
  public String getTName() {
    return this.fTName;
  }
  
  public String getSName() {
    return this.fSName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TName".equals(parameterName) ) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("SName".equals(parameterName) ) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTName(final String pTName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTName = pTName;
  }
  
  public void setSName(final String pSName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSName = pSName;
  }
  
  @Override
  public String patternName() {
    return "school.teachersOfSchoolNames";
  }
  
  @Override
  public List<String> parameterNames() {
    return TeachersOfSchoolNamesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTName, fSName};
  }
  
  @Override
  public TeachersOfSchoolNamesMatch toImmutable() {
    return isMutable() ? newMatch(fTName, fSName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TName\"=" + prettyPrintValue(fTName) + ", ");
    
    result.append("\"SName\"=" + prettyPrintValue(fSName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTName == null) ? 0 : fTName.hashCode());
    result = prime * result + ((fSName == null) ? 0 : fSName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TeachersOfSchoolNamesMatch)) { // this should be infrequent
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
    TeachersOfSchoolNamesMatch other = (TeachersOfSchoolNamesMatch) obj;
    if (fTName == null) {if (other.fTName != null) return false;}
    else if (!fTName.equals(other.fTName)) return false;
    if (fSName == null) {if (other.fSName != null) return false;}
    else if (!fSName.equals(other.fSName)) return false;
    return true;
  }
  
  @Override
  public TeachersOfSchoolNamesQuerySpecification specification() {
    try {
    	return TeachersOfSchoolNamesQuerySpecification.instance();
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
  public static TeachersOfSchoolNamesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TeachersOfSchoolNamesMatch newMutableMatch(final String pTName, final String pSName) {
    return new Mutable(pTName, pSName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTName the fixed value of pattern parameter TName, or null if not bound.
   * @param pSName the fixed value of pattern parameter SName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TeachersOfSchoolNamesMatch newMatch(final String pTName, final String pSName) {
    return new Immutable(pTName, pSName);
  }
  
  private static final class Mutable extends TeachersOfSchoolNamesMatch {
    Mutable(final String pTName, final String pSName) {
      super(pTName, pSName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TeachersOfSchoolNamesMatch {
    Immutable(final String pTName, final String pSName) {
      super(pTName, pSName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
