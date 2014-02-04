package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.CoursesOfTeacherNamesQuerySpecification;

/**
 * Pattern-specific match representation of the school.coursesOfTeacherNames pattern,
 * to be used in conjunction with {@link CoursesOfTeacherNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CoursesOfTeacherNamesMatcher
 * @see CoursesOfTeacherNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CoursesOfTeacherNamesMatch extends BasePatternMatch {
  private String fTName;
  
  private String fCName;
  
  private static List<String> parameterNames = makeImmutableList("TName", "CName");
  
  private CoursesOfTeacherNamesMatch(final String pTName, final String pCName) {
    this.fTName = pTName;
    this.fCName = pCName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TName".equals(parameterName)) return this.fTName;
    if ("CName".equals(parameterName)) return this.fCName;
    return null;
    
  }
  
  public String getTName() {
    return this.fTName;
    
  }
  
  public String getCName() {
    return this.fCName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TName".equals(parameterName) ) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("CName".equals(parameterName) ) {
    	this.fCName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTName(final String pTName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTName = pTName;
    
  }
  
  public void setCName(final String pCName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCName = pCName;
    
  }
  
  @Override
  public String patternName() {
    return "school.coursesOfTeacherNames";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CoursesOfTeacherNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTName, fCName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TName\"=" + prettyPrintValue(fTName) + ", ");
    result.append("\"CName\"=" + prettyPrintValue(fCName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTName == null) ? 0 : fTName.hashCode());
    result = prime * result + ((fCName == null) ? 0 : fCName.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CoursesOfTeacherNamesMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CoursesOfTeacherNamesMatch other = (CoursesOfTeacherNamesMatch) obj;
    if (fTName == null) {if (other.fTName != null) return false;}
    else if (!fTName.equals(other.fTName)) return false;
    if (fCName == null) {if (other.fCName != null) return false;}
    else if (!fCName.equals(other.fCName)) return false;
    return true;
  }
  
  @Override
  public CoursesOfTeacherNamesQuerySpecification specification() {
    try {
    	return CoursesOfTeacherNamesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends CoursesOfTeacherNamesMatch {
    Mutable(final String pTName, final String pCName) {
      super(pTName, pCName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends CoursesOfTeacherNamesMatch {
    Immutable(final String pTName, final String pCName) {
      super(pTName, pCName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
