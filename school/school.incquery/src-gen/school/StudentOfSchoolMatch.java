package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.School;
import school.Student;
import school.util.StudentOfSchoolQuerySpecification;

/**
 * Pattern-specific match representation of the school.studentOfSchool pattern,
 * to be used in conjunction with {@link StudentOfSchoolMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class StudentOfSchoolMatch extends BasePatternMatch {
  private Student fS;
  
  private School fSch;
  
  private static List<String> parameterNames = makeImmutableList("S", "Sch");
  
  private StudentOfSchoolMatch(final Student pS, final School pSch) {
    this.fS = pS;
    this.fSch = pSch;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
  }
  
  public Student getS() {
    return this.fS;
  }
  
  public School getSch() {
    return this.fSch;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S".equals(parameterName) ) {
    	this.fS = (school.Student) newValue;
    	return true;
    }
    if ("Sch".equals(parameterName) ) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
  }
  
  public void setS(final Student pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
  }
  
  public void setSch(final School pSch) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSch = pSch;
  }
  
  @Override
  public String patternName() {
    return "school.studentOfSchool";
  }
  
  @Override
  public List<String> parameterNames() {
    return StudentOfSchoolMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS, fSch};
  }
  
  @Override
  public StudentOfSchoolMatch toImmutable() {
    return isMutable() ? newMatch(fS, fSch) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    
    result.append("\"Sch\"=" + prettyPrintValue(fSch)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    result = prime * result + ((fSch == null) ? 0 : fSch.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StudentOfSchoolMatch)) { // this should be infrequent
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
    StudentOfSchoolMatch other = (StudentOfSchoolMatch) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public StudentOfSchoolQuerySpecification specification() {
    try {
    	return StudentOfSchoolQuerySpecification.instance();
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
  public static StudentOfSchoolMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static StudentOfSchoolMatch newMutableMatch(final Student pS, final School pSch) {
    return new Mutable(pS, pSch);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @param pSch the fixed value of pattern parameter Sch, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static StudentOfSchoolMatch newMatch(final Student pS, final School pSch) {
    return new Immutable(pS, pSch);
  }
  
  private static final class Mutable extends StudentOfSchoolMatch {
    Mutable(final Student pS, final School pSch) {
      super(pS, pSch);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends StudentOfSchoolMatch {
    Immutable(final Student pS, final School pSch) {
      super(pS, pSch);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
